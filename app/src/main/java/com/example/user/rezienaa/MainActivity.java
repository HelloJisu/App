package com.example.user.rezienaa;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
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
import android.widget.TextView;

import java.lang.annotation.Annotation;

public class MainActivity extends AppCompatActivity {

    RelativeLayout card, skin_type, design_bottom_sheet, dashboard, toolbar;
    LinearLayout moisture, wrinkles, toolbar_dash;
    ImageView image, layer1, layer2, arrow;
    Button treatbtn;
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
        card = (RelativeLayout) findViewById(R.id.sdcond);
        design_bottom_sheet = (RelativeLayout)findViewById(R.id.design_bottom_sheet);
        dashboard = (RelativeLayout)findViewById(R.id.dashboard);
        toolbar = (RelativeLayout)findViewById(R.id.toolbar);
        image = (ImageView)findViewById(R.id.image);
        layer1 = (ImageView)findViewById(R.id.layer1);
        layer2 = (ImageView)findViewById(R.id.layer2);
        arrow = (ImageView)findViewById(R.id.arrow_dash);
        treatbtn = (Button)findViewById(R.id.treatBtn);

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
                    case R.id.treatBtn:
                        intent = new Intent(getApplicationContext(), TreatActivity.class);
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
                    case R.id.arrow_dash:
                    case R.id.toolbar_dash:
                        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                        dashboard.startAnimation(alpha2);
                        layer1.setVisibility(View.INVISIBLE);
                        layer2.setVisibility(View.INVISIBLE);
                        layer1.startAnimation(alpha2);
                        layer2.startAnimation(alpha2);
                        image.startAnimation(scaletranslate2);
                        break;

                }
            }
        };

        moisture.setOnClickListener(onClickListener);
        wrinkles.setOnClickListener(onClickListener);
        skin_type.setOnClickListener(onClickListener);
        toolbar.setOnClickListener(onClickListener);
        toolbar_dash.setOnClickListener(onClickListener);
        arrow.setOnClickListener(onClickListener);
        treatbtn.setOnClickListener(onClickListener);

    }

    //블러처리
    public class BlurDrawable extends Drawable {

        private View bgView;
        private View view;

        private int size = 6;
        private int squal = size*size;
        private int[] pixels = new int[squal];
        Bitmap viewBitmap;

        @Override
        public void draw(Canvas canvas) {
            bgView.setDrawingCacheEnabled(true);
            Bitmap bm = bgView.getDrawingCache();
            if(bm == null){
                return;
            }

            if(viewBitmap == null){
                viewBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            }

            Rect pRect = new Rect();
            Rect cRect = new Rect();

            bgView.getGlobalVisibleRect(pRect);
            view.getGlobalVisibleRect(cRect);

            int sumR = 0, sumG = 0, sumB = 0;
            int red = 0, green = 0, blue = 0;

            for(int i = cRect.left - pRect.left; i < cRect.right - pRect.left; i++){
                for(int j = cRect.top - pRect.top; j < cRect.bottom - pRect.top; j++){
                    bm.getPixels(pixels , 0, size, i - size/2, j - size/2, size, size);
                    for(int k = 0; k < squal; k++){
                        sumR += (pixels[k] >> 16) & 0xFF ;
                        sumG += (pixels[k] >> 8) & 0xFF ;
                        sumB += pixels[k] & 0xFF ;
                    }
                    red = (sumR / squal);
                    green = (sumG / squal);
                    blue = (sumB / squal);
                    int pixel = 0xFF000000 + (red << 16) + (green << 8) + blue;
                    viewBitmap.setPixel(i - (cRect.left - pRect.left), j - (cRect.top - pRect.top), pixel );
                    sumR = sumG = sumB = 0;
                    red = green = blue = 0;
                }
            }

            canvas.drawBitmap(viewBitmap, null, getBounds(), null);
        }

        public View getView() { return view; }
        public void setView(View view) { this.view = view; }
        public View getParentView() { return bgView; }
        public void setBGView(View parentView) { this.bgView = parentView; }

        @SuppressLint("WrongConstant")
        @Override public int getOpacity() { return 0; }
        @Override public void setAlpha(int alpha) { }
        @Override public void setColorFilter(ColorFilter cf) { }
    }

}