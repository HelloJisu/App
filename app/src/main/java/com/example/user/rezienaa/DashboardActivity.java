package com.example.user.rezienaa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class DashboardActivity extends AppCompatActivity {

    LinearLayout moisture, wrinkles, toolbar;
    RelativeLayout skin_type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // 값 받아오기
        moisture = (LinearLayout)findViewById(R.id.moisture);
        wrinkles = (LinearLayout)findViewById(R.id.wrinkles);
        skin_type = (RelativeLayout)findViewById(R.id.skin_type);

        //  OnClickListener
        View.OnClickListener onClickListener = new View.OnClickListener() {
            Intent intent;
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.moisture:
                        intent = new Intent(getApplicationContext(), MoistureActivity.class);
                        break;
                    case R.id.wrinkles:
                        intent = new Intent(getApplicationContext(), WrinklesActivity.class);
                        break;
                    case R.id.skin_type:
                        intent = new Intent(getApplicationContext(), SkintypeActivity.class);
                        break;
                    case R.id.toolbar:
                        intent = new Intent(getApplicationContext(), MainActivity.class);
                        break;

                }
                startActivity(intent);
                if (v.getId()==R.id.toolbar) {
                    overridePendingTransition(R.anim.slide_down, R.anim.slide_up);
                    finish();
                }
            }
        };

        moisture.setOnClickListener(onClickListener);
        wrinkles.setOnClickListener(onClickListener);
        skin_type.setOnClickListener(onClickListener);
        toolbar.setOnClickListener(onClickListener);
    }
}
