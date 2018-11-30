package com.example.user.rezienaa;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.lang.annotation.Annotation;

public class MainActivity extends AppCompatActivity {

    RelativeLayout card, skin_type, design_bottom_sheet, dashboard, toolbar;
    LinearLayout moisture, wrinkles, toolbar_dash;
    ImageView image, layer1, layer2;

    BottomSheetBehavior bottomSheetBehavior;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 값 받아오기
        moisture = (LinearLayout)findViewById(R.id.moisture);
        wrinkles = (LinearLayout)findViewById(R.id.wrinkles);
        toolbar_dash = (LinearLayout)findViewById(R.id.toolbar_dash);
        skin_type = (RelativeLayout)findViewById(R.id.skin_type);
        card = (RelativeLayout)findViewById(R.id.card);
        design_bottom_sheet = (RelativeLayout)findViewById(R.id.design_bottom_sheet);
        dashboard = (RelativeLayout)findViewById(R.id.dashboard);
        toolbar = (RelativeLayout)findViewById(R.id.toolbar);
        image = (ImageView)findViewById(R.id.image);
        layer1 = (ImageView)findViewById(R.id.layer1);
        layer2 = (ImageView)findViewById(R.id.layer2);

        // init the Bottom Sheet Behavior
        bottomSheetBehavior = BottomSheetBehavior.from(design_bottom_sheet);

        // change the state of the bottom sheet
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);

        // 시작할 때 DashBoard와 기계 이미지 안보이게 하기
        dashboard.setVisibility(View.INVISIBLE);
        image.setVisibility(View.INVISIBLE);
        layer1.setVisibility(View.INVISIBLE);
        layer2.setVisibility(View.INVISIBLE);

        // set hideable or not
        bottomSheetBehavior.setHideable(false);

        //animation
        final Animation scaletranslate =AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim_scaletranslate);
        final Animation alpha =AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim_alpha);
        final Animation alpha2 =AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim_alpha2);
        final Animation scaletranslate2 =AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim_scaletranslate2);

        // set callback for changes
        bottomSheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {

            @Override
            public void onStateChanged(@NonNull View view, int i) {
                dashboard.setVisibility(View.INVISIBLE);
                image.setVisibility(View.INVISIBLE);
                card.setVisibility(View.VISIBLE);
                layer1.setVisibility(View.INVISIBLE);
                layer2.setVisibility(View.INVISIBLE);

                // Dash -> Home으로 Dragging 해도 화면 전환이 되지 않게 함
                if(i==1) {      //STATE_DRAGGING
                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                }

                // Dash 화면
                if(i==3) {      //STATE_EXPANDED
                    dashboard.setVisibility(View.VISIBLE);
                    image.setVisibility(View.VISIBLE);
                    card.setVisibility(View.INVISIBLE);
                    layer1.setVisibility(View.VISIBLE);
                    layer2.setVisibility(View.VISIBLE);
                }

            }

            // 슬라이드시 화면 보이게
            @Override
            public void onSlide(@NonNull View view, float v) {
            }

        });

        View.OnClickListener onClickListener = new View.OnClickListener() {
            Intent intent;

            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.card:
                        intent = new Intent(getApplicationContext(), Card.class);
                        startActivity(intent);
                        break;
                    case R.id.moisture:
                        intent = new Intent(getApplicationContext(), MoistureActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.wrinkles:
                        intent = new Intent(getApplicationContext(), WrinklesActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.skin_type:
                        intent = new Intent(getApplicationContext(), SkintypeActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.toolbar:
                        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                        dashboard.setVisibility(View.VISIBLE);
                        dashboard.startAnimation(alpha);
                        layer1.setVisibility(View.VISIBLE);
                        layer2.setVisibility(View.VISIBLE);
                        layer1.startAnimation(alpha);
                        layer2.startAnimation(alpha);
                        image.startAnimation(scaletranslate);
                        break;
                    case R.id.toolbar_dash:
                        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                        dashboard.startAnimation(alpha2);
                        layer1.setVisibility(View.INVISIBLE);
                        layer2.setVisibility(View.INVISIBLE);
                        layer1.startAnimation(alpha2);
                        layer2.startAnimation(alpha2);
                        image.startAnimation(scaletranslate2);
                }
            }
        };

        moisture.setOnClickListener(onClickListener);
        wrinkles.setOnClickListener(onClickListener);
        skin_type.setOnClickListener(onClickListener);
        card.setOnClickListener(onClickListener);
        toolbar.setOnClickListener(onClickListener);
        toolbar_dash.setOnClickListener(onClickListener);
    }
}