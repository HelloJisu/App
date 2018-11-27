package com.example.user.rezienaa;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout card, toolbar;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card = (RelativeLayout)findViewById(R.id.card);
        toolbar = (RelativeLayout)findViewById(R.id.toolbar);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            Intent intent;

            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.card:
                        intent = new Intent(getApplicationContext(), Card.class);
                        break;
                    case R.id.toolbar:
                        intent = new Intent(getApplicationContext(), DashboardActivity.class);
                        break;
                }

                startActivity(intent);
                if (v.getId() == R.id.toolbar) {
                    overridePendingTransition(R.anim.slide_up_home, R.anim.slide_down_home);
                    finish();
                }
            }
        };

        card.setOnClickListener(onClickListener);
        toolbar.setOnClickListener(onClickListener);
    }
}