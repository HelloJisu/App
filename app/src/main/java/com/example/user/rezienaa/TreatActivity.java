package com.example.user.rezienaa;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class TreatActivity extends AppCompatActivity {

    ImageView forehead, underleft, underright, eyeleft, eyeright, cheekl, cheekr, mouth, back;
    LinearLayout component;
    TextView component_txt;
    RelativeLayout treatback, underright_layout, underleft_layout,treat_default,cheekright_layout,cheekleft_layout;
    int cheekcount=0, undercount=0, foreheadcount=0, level=0, timer_sec, count=0;
    ImageView u_tright_line1,u_tright_line2,u_tright_line3,u_tright_line4,u_tright_line5,u_tright_line6,
            u_tright_line7,u_tright_line8,u_tright_line9,u_tright_line10,u_tright_line11,u_tright_line12,u_tright_line13,
            u_tleft_line1,u_tleft_line2,u_tleft_line3,u_tleft_line4,u_tleft_line5,u_tleft_line6,
            u_tleft_line7,u_tleft_line8,u_tleft_line9,u_tleft_line10,u_tleft_line11,u_tleft_line12,u_tleft_line13
            ,c_tright_line1,c_tright_line2,c_tright_line3,c_tright_line4,c_tright_line5,c_tright_line6,c_tright_line7,c_tright_line8
            ,c_tright_line9,c_tright_line10,c_tright_line11,c_tright_line12,c_tright_line13,c_tright_line14,c_tright_line15,c_tright_line16,c_tright_line17
            ,c_tright_line18,c_tright_line19,c_tright_line20,c_tright_line21,c_tright_line22,c_tleft_line1,c_tleft_line2,c_tleft_line3,c_tleft_line4,c_tleft_line5,c_tleft_line6,c_tleft_line7,c_tleft_line8
            ,c_tleft_line9,c_tleft_line10,c_tleft_line11,c_tleft_line12,c_tleft_line13,c_tleft_line14,c_tleft_line15,c_tleft_line16,c_tleft_line17
            ,c_tleft_line18,c_tleft_line19,c_tleft_line20,c_tleft_line21,c_tleft_line22;
    TimerTask second;
    String part;
    AnimationDrawable utrani1,utrani2,utrani3,utrani4,utrani5,utrani6,utrani7,utrani8,utrani9,utrani10,utrani11,utrani12,utrani13,
            utlani1,utlani2,utlani3,utlani4,utlani5,utlani6,utlani7,utlani8,utlani9,utlani10,utlani11,utlani12,utlani13
            ,ctrani1,ctrani2,ctrani3,ctrani4,ctrani5,ctrani6,ctrani7,ctrani8,ctrani9,ctrani10,ctrani11,ctrani12,ctrani13,ctrani14,ctrani15
            ,ctrani16,ctrani17,ctrani18,ctrani19,ctrani20,ctrani21,ctrani22,ctlani1,ctlani2,ctlani3,ctlani4,ctlani5,ctlani6,ctlani7,ctlani8,ctlani9,ctlani10,ctlani11,ctlani12,ctlani13,ctlani14,ctlani15
            ,ctlani16,ctlani17,ctlani18,ctlani19,ctlani20,ctlani21,ctlani22;


    public void animation() {
        second = new TimerTask() {
            @Override
            public void run() {
                Log.e("카운터",String.valueOf(count));
                count++;
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if(part=="underright") {
                            if (count == 1) {
                                u_tright_line8.setBackgroundResource(R.drawable.underrightanim1);
                                utrani8 = (AnimationDrawable) u_tright_line8.getBackground();
                                utrani8.start();
                            }
                            if (count == 2) {
                                utrani8.stop();
                                u_tright_line8.setBackgroundResource(R.drawable.line8finish);
                                u_tright_line9.setBackgroundResource(R.drawable.underrightanim1);
                                utrani9 = (AnimationDrawable) u_tright_line9.getBackground();
                                utrani9.start();
                            }
                            if (count == 3) {
                                utrani9.stop();
                                u_tright_line9.setBackgroundResource(R.drawable.line8finish);
                                u_tright_line10.setBackgroundResource(R.drawable.underrightanim1);
                                utrani10 = (AnimationDrawable) u_tright_line10.getBackground();
                                utrani10.start();
                            }
                            if (count == 4) {
                                utrani10.stop();
                                u_tright_line10.setBackgroundResource(R.drawable.line8finish);
                                u_tright_line11.setBackgroundResource(R.drawable.underrightanim1);
                                utrani11 = (AnimationDrawable) u_tright_line11.getBackground();
                                utrani11.start();
                            }
                            if (count == 5) {
                                utrani11.stop();
                                u_tright_line11.setBackgroundResource(R.drawable.line8finish);
                                u_tright_line12.setBackgroundResource(R.drawable.underrightanim1);
                                utrani12 = (AnimationDrawable) u_tright_line12.getBackground();
                                utrani12.start();
                            }
                            if (count == 6) {
                                utrani12.stop();
                                u_tright_line12.setBackgroundResource(R.drawable.line8finish);
                                u_tright_line13.setBackgroundResource(R.drawable.underrightanim1);
                                utrani13 = (AnimationDrawable) u_tright_line13.getBackground();
                                utrani13.start();
                            }
                            if (count == 7) {
                                utrani13.stop();
                                u_tright_line13.setBackgroundResource(R.drawable.line8finish);
                                u_tright_line1.setBackgroundResource(R.drawable.underrightanim2);
                                utrani1 = (AnimationDrawable) u_tright_line1.getBackground();
                                utrani1.start();
                            }
                            if (count == 8) {
                                utrani1.stop();
                                u_tright_line1.setBackgroundResource(R.drawable.line1finish);
                                u_tright_line2.setBackgroundResource(R.drawable.underrightanim2);
                                utrani2 = (AnimationDrawable) u_tright_line2.getBackground();
                                utrani2.start();
                            }
                            if (count == 9) {
                                utrani2.stop();
                                u_tright_line2.setBackgroundResource(R.drawable.line1finish);
                                u_tright_line3.setBackgroundResource(R.drawable.underrightanim2);
                                utrani3 = (AnimationDrawable) u_tright_line3.getBackground();
                                utrani3.start();
                            }
                            if (count == 10) {
                                utrani3.stop();
                                u_tright_line3.setBackgroundResource(R.drawable.line1finish);
                                u_tright_line4.setBackgroundResource(R.drawable.underrightanim2);
                                utrani4 = (AnimationDrawable) u_tright_line4.getBackground();
                                utrani4.start();
                            }
                            if (count == 11) {
                                utrani4.stop();
                                u_tright_line4.setBackgroundResource(R.drawable.line1finish);
                                u_tright_line5.setBackgroundResource(R.drawable.underrightanim2);
                                utrani5 = (AnimationDrawable) u_tright_line5.getBackground();
                                utrani5.start();
                            }
                            if (count == 12) {
                                utrani5.stop();
                                u_tright_line5.setBackgroundResource(R.drawable.line1finish);
                                u_tright_line6.setBackgroundResource(R.drawable.underrightanim2);
                                utrani6 = (AnimationDrawable) u_tright_line6.getBackground();
                                utrani6.start();
                            }
                            if (count == 13) {
                                utrani6.stop();
                                u_tright_line6.setBackgroundResource(R.drawable.line1finish);
                                u_tright_line7.setBackgroundResource(R.drawable.underrightanim2);
                                utrani7 = (AnimationDrawable) u_tright_line7.getBackground();
                                utrani7.start();
                            } else if (count >= 14) {
                                u_tright_line8.setBackgroundResource(R.drawable.line8color);
                                u_tright_line9.setBackgroundResource(R.drawable.line8color);
                                u_tright_line10.setBackgroundResource(R.drawable.line8color);
                                u_tright_line11.setBackgroundResource(R.drawable.line8color);
                                u_tright_line12.setBackgroundResource(R.drawable.line8color);
                                u_tright_line13.setBackgroundResource(R.drawable.line8color);
                                u_tright_line1.setBackgroundResource(R.drawable.line1color);
                                u_tright_line2.setBackgroundResource(R.drawable.line1color);
                                u_tright_line3.setBackgroundResource(R.drawable.line1color);
                                u_tright_line4.setBackgroundResource(R.drawable.line1color);
                                u_tright_line5.setBackgroundResource(R.drawable.line1color);
                                u_tright_line6.setBackgroundResource(R.drawable.line1color);
                                u_tright_line7.setBackgroundResource(R.drawable.line1color);
                                component_txt.setText("GOOD JOB");
                            }
                        }
                        if(part=="underleft"){
                            if (count == 1) {
                                u_tleft_line8.setBackgroundResource(R.drawable.underleftanim1);
                                utlani8 = (AnimationDrawable) u_tleft_line8.getBackground();
                                utlani8.start();
                            }
                            if (count == 2) {
                                utlani8.stop();
                                u_tleft_line8.setBackgroundResource(R.drawable.line9finish);
                                u_tleft_line9.setBackgroundResource(R.drawable.underleftanim1);
                                utlani9 = (AnimationDrawable) u_tleft_line9.getBackground();
                                utlani9.start();
                            }
                            if (count == 3) {
                                utlani9.stop();
                                u_tleft_line9.setBackgroundResource(R.drawable.line9finish);
                                u_tleft_line10.setBackgroundResource(R.drawable.underleftanim1);
                                utlani10 = (AnimationDrawable) u_tleft_line10.getBackground();
                                utlani10.start();
                            }
                            if (count == 4) {
                                utlani10.stop();
                                u_tleft_line10.setBackgroundResource(R.drawable.line9finish);
                                u_tleft_line11.setBackgroundResource(R.drawable.underleftanim1);
                                utlani11 = (AnimationDrawable) u_tleft_line11.getBackground();
                                utlani11.start();
                            }
                            if (count == 5) {
                                utlani11.stop();
                                u_tleft_line11.setBackgroundResource(R.drawable.line9finish);
                                u_tleft_line12.setBackgroundResource(R.drawable.underleftanim1);
                                utlani12 = (AnimationDrawable) u_tleft_line12.getBackground();
                                utlani12.start();
                            }
                            if (count == 6) {
                                utlani12.stop();
                                u_tleft_line12.setBackgroundResource(R.drawable.line9finish);
                                u_tleft_line13.setBackgroundResource(R.drawable.underleftanim1);
                                utlani13 = (AnimationDrawable) u_tleft_line13.getBackground();
                                utlani13.start();
                            }
                            if (count == 7) {
                                utlani13.stop();
                                u_tleft_line13.setBackgroundResource(R.drawable.line9finish);
                                u_tleft_line1.setBackgroundResource(R.drawable.underleftanim2);
                                utlani1 = (AnimationDrawable) u_tleft_line1.getBackground();
                                utlani1.start();
                            }
                            if (count == 8) {
                                utlani1.stop();
                                u_tleft_line1.setBackgroundResource(R.drawable.line5finish);
                                u_tleft_line2.setBackgroundResource(R.drawable.underleftanim2);
                                utlani2 = (AnimationDrawable) u_tleft_line2.getBackground();
                                utlani2.start();
                            }
                            if (count == 9) {
                                utlani2.stop();
                                u_tleft_line2.setBackgroundResource(R.drawable.line5finish);
                                u_tleft_line3.setBackgroundResource(R.drawable.underleftanim2);
                                utlani3 = (AnimationDrawable) u_tleft_line3.getBackground();
                                utlani3.start();
                            }
                            if (count == 10) {
                                utlani3.stop();
                                u_tleft_line3.setBackgroundResource(R.drawable.line5finish);
                                u_tleft_line4.setBackgroundResource(R.drawable.underleftanim2);
                                utlani4 = (AnimationDrawable) u_tleft_line4.getBackground();
                                utlani4.start();
                            }
                            if (count == 11) {
                                utlani4.stop();
                                u_tleft_line4.setBackgroundResource(R.drawable.line5finish);
                                u_tleft_line5.setBackgroundResource(R.drawable.underleftanim2);
                                utlani5 = (AnimationDrawable) u_tleft_line5.getBackground();
                                utlani5.start();
                            }
                            if (count == 12) {
                                utlani5.stop();
                                u_tleft_line5.setBackgroundResource(R.drawable.line5finish);
                                u_tleft_line6.setBackgroundResource(R.drawable.underleftanim2);
                                utlani6 = (AnimationDrawable) u_tleft_line6.getBackground();
                                utlani6.start();
                            }
                            if (count == 13) {
                                utlani6.stop();
                                u_tleft_line6.setBackgroundResource(R.drawable.line5finish);
                                u_tleft_line7.setBackgroundResource(R.drawable.underleftanim2);
                                utlani7 = (AnimationDrawable) u_tleft_line7.getBackground();
                                utlani7.start();
                            } else if (count >= 14) {
                                u_tleft_line8.setBackgroundResource(R.drawable.line9color);
                                u_tleft_line9.setBackgroundResource(R.drawable.line9color);
                                u_tleft_line10.setBackgroundResource(R.drawable.line9color);
                                u_tleft_line11.setBackgroundResource(R.drawable.line9color);
                                u_tleft_line12.setBackgroundResource(R.drawable.line9color);
                                u_tleft_line13.setBackgroundResource(R.drawable.line9color);
                                u_tleft_line1.setBackgroundResource(R.drawable.line5color);
                                u_tleft_line2.setBackgroundResource(R.drawable.line5color);
                                u_tleft_line3.setBackgroundResource(R.drawable.line5color);
                                u_tleft_line4.setBackgroundResource(R.drawable.line5color);
                                u_tleft_line5.setBackgroundResource(R.drawable.line5color);
                                u_tleft_line6.setBackgroundResource(R.drawable.line5color);
                                u_tleft_line7.setBackgroundResource(R.drawable.line5finish);
                                component_txt.setText("GOOD JOB");
                            }
                        }
                        if(part=="cheekright") {
                            if (count == 1) {
                                c_tright_line15.setBackgroundResource(R.drawable.cheekrightanim1);
                                ctrani15 = (AnimationDrawable) c_tright_line15.getBackground();
                                ctrani15.start();
                            }
                            if (count == 2) {
                                ctrani15.stop();
                                c_tright_line15.setBackgroundResource(R.drawable.line123finish);
                                c_tright_line16.setBackgroundResource(R.drawable.cheekrightanim1);
                                ctrani16 = (AnimationDrawable) c_tright_line16.getBackground();
                                ctrani16.start();
                            }
                            if (count == 3) {
                                ctrani16.stop();
                                c_tright_line16.setBackgroundResource(R.drawable.line123finish);
                                c_tright_line17.setBackgroundResource(R.drawable.cheekrightanim1);
                                ctrani17 = (AnimationDrawable) c_tright_line17.getBackground();
                                ctrani17.start();
                            }
                            if (count == 4) {
                                ctrani17.stop();
                                c_tright_line17.setBackgroundResource(R.drawable.line123finish);
                                c_tright_line18.setBackgroundResource(R.drawable.cheekrightanim1);
                                ctrani18 = (AnimationDrawable) c_tright_line18.getBackground();
                                ctrani18.start();
                            }
                            if (count == 5) {
                                ctrani18.stop();
                                c_tright_line18.setBackgroundResource(R.drawable.line123finish);
                                c_tright_line19.setBackgroundResource(R.drawable.cheekrightanim1);
                                ctrani19 = (AnimationDrawable) c_tright_line19.getBackground();
                                ctrani19.start();
                            }
                            if (count == 6) {
                                ctrani19.stop();
                                c_tright_line19.setBackgroundResource(R.drawable.line123finish);
                                c_tright_line20.setBackgroundResource(R.drawable.cheekrightanim1);
                                ctrani20 = (AnimationDrawable) c_tright_line20.getBackground();
                                ctrani20.start();
                            }
                            if (count == 7) {
                                ctrani20.stop();
                                c_tright_line20.setBackgroundResource(R.drawable.line123finish);
                                c_tright_line21.setBackgroundResource(R.drawable.cheekrightanim1);
                                ctrani21 = (AnimationDrawable) c_tright_line21.getBackground();
                                ctrani21.start();
                            }
                            if (count == 8) {
                                ctrani21.stop();
                                c_tright_line21.setBackgroundResource(R.drawable.line123finish);
                                c_tright_line22.setBackgroundResource(R.drawable.cheekrightanim1);
                                ctrani22 = (AnimationDrawable) c_tright_line22.getBackground();
                                ctrani22.start();
                            }
                            if (count == 9) {
                                ctrani22.stop();
                                c_tright_line22.setBackgroundResource(R.drawable.line123finish);
                                c_tright_line1.setBackgroundResource(R.drawable.cheekrightanim1);
                                ctrani1 = (AnimationDrawable) c_tright_line1.getBackground();
                                ctrani1.start();
                            }
                            if (count == 10) {
                                ctrani1.stop();
                                c_tright_line1.setBackgroundResource(R.drawable.line1finish);
                                c_tright_line2.setBackgroundResource(R.drawable.cheekrightanim2);
                                ctrani2 = (AnimationDrawable) c_tright_line2.getBackground();
                                ctrani2.start();
                            }
                            if (count == 11) {
                                ctrani2.stop();
                                c_tright_line2.setBackgroundResource(R.drawable.line1finish);
                                c_tright_line3.setBackgroundResource(R.drawable.cheekrightanim2);
                                ctrani3 = (AnimationDrawable) c_tright_line3.getBackground();
                                ctrani3.start();
                            }
                            if (count == 12) {
                                ctrani3.stop();
                                c_tright_line3.setBackgroundResource(R.drawable.line1finish);
                                c_tright_line4.setBackgroundResource(R.drawable.cheekrightanim2);
                                ctrani4 = (AnimationDrawable) c_tright_line4.getBackground();
                                ctrani4.start();
                            }
                            if (count == 13) {
                                ctrani4.stop();
                                c_tright_line4.setBackgroundResource(R.drawable.line1finish);
                                c_tright_line5.setBackgroundResource(R.drawable.cheekrightanim2);
                                ctrani5 = (AnimationDrawable) c_tright_line5.getBackground();
                                ctrani5.start();
                            }
                            if (count == 14) {
                                ctrani5.stop();
                                c_tright_line5.setBackgroundResource(R.drawable.line1finish);
                                c_tright_line6.setBackgroundResource(R.drawable.cheekrightanim2);
                                ctrani6 = (AnimationDrawable) c_tright_line6.getBackground();
                                ctrani6.start();
                            }
                            if (count == 15) {
                                ctrani6.stop();
                                c_tright_line6.setBackgroundResource(R.drawable.line1finish);
                                c_tright_line7.setBackgroundResource(R.drawable.cheekrightanim2);
                                ctrani7 = (AnimationDrawable) c_tright_line7.getBackground();
                                ctrani7.start();
                            }
                            if (count == 16) {
                                ctrani7.stop();
                                c_tright_line7.setBackgroundResource(R.drawable.line1finish);
                                c_tright_line8.setBackgroundResource(R.drawable.cheekrightanim2);
                                ctrani8 = (AnimationDrawable) c_tright_line8.getBackground();
                                ctrani8.start();
                            }
                            if (count == 17) {
                                ctrani8.stop();
                                c_tright_line8.setBackgroundResource(R.drawable.line1finish);
                                c_tright_line9.setBackgroundResource(R.drawable.cheekrightanim2);
                                ctrani9 = (AnimationDrawable) c_tright_line9.getBackground();
                                ctrani9.start();
                            }
                            if (count == 18) {
                                ctrani9.stop();
                                c_tright_line9.setBackgroundResource(R.drawable.line1finish);
                                c_tright_line10.setBackgroundResource(R.drawable.cheekrightanim2);
                                ctrani10 = (AnimationDrawable) c_tright_line10.getBackground();
                                ctrani10.start();
                            }
                            if (count == 19) {
                                ctrani10.stop();
                                c_tright_line10.setBackgroundResource(R.drawable.line1finish);
                                c_tright_line11.setBackgroundResource(R.drawable.cheekrightanim2);
                                ctrani11 = (AnimationDrawable) c_tright_line11.getBackground();
                                ctrani11.start();
                            }
                            if (count == 20) {
                                ctrani11.stop();
                                c_tright_line11.setBackgroundResource(R.drawable.line1finish);
                                c_tright_line12.setBackgroundResource(R.drawable.cheekrightanim2);
                                ctrani12 = (AnimationDrawable) c_tright_line12.getBackground();
                                ctrani12.start();
                            }
                            if (count == 21) {
                                ctrani12.stop();
                                c_tright_line12.setBackgroundResource(R.drawable.line1finish);
                                c_tright_line13.setBackgroundResource(R.drawable.cheekrightanim2);
                                ctrani13 = (AnimationDrawable) c_tright_line13.getBackground();
                                ctrani13.start();
                            }
                            if (count == 22) {
                                ctrani13.stop();
                                c_tright_line13.setBackgroundResource(R.drawable.line1finish);
                                c_tright_line14.setBackgroundResource(R.drawable.cheekrightanim2);
                                ctrani14 = (AnimationDrawable) c_tright_line14.getBackground();
                                ctrani14.start();
                            }else if (count >= 22) {
                                c_tright_line15.setBackgroundResource(R.drawable.line123color);
                                c_tright_line16.setBackgroundResource(R.drawable.line123color);
                                c_tright_line17.setBackgroundResource(R.drawable.line123color);
                                c_tright_line18.setBackgroundResource(R.drawable.line123color);
                                c_tright_line19.setBackgroundResource(R.drawable.line123color);
                                c_tright_line20.setBackgroundResource(R.drawable.line123color);
                                c_tright_line21.setBackgroundResource(R.drawable.line123color);
                                c_tright_line22.setBackgroundResource(R.drawable.line123color);
                                c_tright_line1.setBackgroundResource(R.drawable.line1color);
                                c_tright_line2.setBackgroundResource(R.drawable.line1color);
                                c_tright_line3.setBackgroundResource(R.drawable.line1color);
                                c_tright_line4.setBackgroundResource(R.drawable.line1color);
                                c_tright_line5.setBackgroundResource(R.drawable.line1color);
                                c_tright_line6.setBackgroundResource(R.drawable.line1color);
                                c_tright_line7.setBackgroundResource(R.drawable.line1color);
                                c_tright_line8.setBackgroundResource(R.drawable.line1color);
                                c_tright_line9.setBackgroundResource(R.drawable.line1color);
                                c_tright_line10.setBackgroundResource(R.drawable.line1color);
                                c_tright_line11.setBackgroundResource(R.drawable.line1color);
                                c_tright_line12.setBackgroundResource(R.drawable.line1color);
                                c_tright_line13.setBackgroundResource(R.drawable.line1color);
                                c_tright_line14.setBackgroundResource(R.drawable.line1color);
                                component_txt.setText("GOOD JOB");
                            }
                        }
                        if(part=="cheekleft") {
                            if (count == 1) {
                                c_tleft_line15.setBackgroundResource(R.drawable.cheekleftanim1);
                                ctlani15 = (AnimationDrawable) c_tleft_line15.getBackground();
                                ctlani15.start();
                            }
                            if (count == 2) {
                                ctlani15.stop();
                                c_tleft_line15.setBackgroundResource(R.drawable.line123finish);
                                c_tleft_line16.setBackgroundResource(R.drawable.cheekleftanim1);
                                ctlani16 = (AnimationDrawable) c_tleft_line16.getBackground();
                                ctlani16.start();
                            }
                            if (count == 3) {
                                ctlani16.stop();
                                c_tleft_line16.setBackgroundResource(R.drawable.line123finish);
                                c_tleft_line17.setBackgroundResource(R.drawable.cheekleftanim1);
                                ctlani17 = (AnimationDrawable) c_tleft_line17.getBackground();
                                ctlani17.start();
                            }
                            if (count == 4) {
                                ctlani17.stop();
                                c_tleft_line17.setBackgroundResource(R.drawable.line123finish);
                                c_tleft_line18.setBackgroundResource(R.drawable.cheekleftanim1);
                                ctlani18 = (AnimationDrawable) c_tleft_line18.getBackground();
                                ctlani18.start();
                            }
                            if (count == 5) {
                                ctlani18.stop();
                                c_tleft_line18.setBackgroundResource(R.drawable.line123finish);
                                c_tleft_line19.setBackgroundResource(R.drawable.cheekleftanim1);
                                ctlani19 = (AnimationDrawable) c_tleft_line19.getBackground();
                                ctlani19.start();
                            }
                            if (count == 6) {
                                ctlani19.stop();
                                c_tleft_line19.setBackgroundResource(R.drawable.line123finish);
                                c_tleft_line20.setBackgroundResource(R.drawable.cheekleftanim1);
                                ctlani20 = (AnimationDrawable) c_tleft_line20.getBackground();
                                ctlani20.start();
                            }
                            if (count == 7) {
                                ctlani20.stop();
                                c_tleft_line20.setBackgroundResource(R.drawable.line123finish);
                                c_tleft_line21.setBackgroundResource(R.drawable.cheekleftanim1);
                                ctlani21 = (AnimationDrawable) c_tleft_line21.getBackground();
                                ctlani21.start();
                            }
                            if (count == 8) {
                                ctlani21.stop();
                                c_tleft_line21.setBackgroundResource(R.drawable.line123finish);
                                c_tleft_line22.setBackgroundResource(R.drawable.cheekleftanim1);
                                ctlani22 = (AnimationDrawable) c_tleft_line22.getBackground();
                                ctlani22.start();
                            }
                            if (count == 9) {
                                ctlani22.stop();
                                c_tleft_line22.setBackgroundResource(R.drawable.line123finish);
                                c_tleft_line1.setBackgroundResource(R.drawable.cheekleftanim1);
                                ctlani1 = (AnimationDrawable) c_tleft_line1.getBackground();
                                ctlani1.start();
                            }
                            if (count == 10) {
                                ctlani1.stop();
                                c_tleft_line1.setBackgroundResource(R.drawable.line5finish);
                                c_tleft_line2.setBackgroundResource(R.drawable.cheekleftanim2);
                                ctlani2 = (AnimationDrawable) c_tleft_line2.getBackground();
                                ctlani2.start();
                            }
                            if (count == 11) {
                                ctlani2.stop();
                                c_tleft_line2.setBackgroundResource(R.drawable.line5finish);
                                c_tleft_line3.setBackgroundResource(R.drawable.cheekleftanim2);
                                ctlani3 = (AnimationDrawable) c_tleft_line3.getBackground();
                                ctlani3.start();
                            }
                            if (count == 12) {
                                ctlani3.stop();
                                c_tleft_line3.setBackgroundResource(R.drawable.line5finish);
                                c_tleft_line4.setBackgroundResource(R.drawable.cheekleftanim2);
                                ctlani4 = (AnimationDrawable) c_tleft_line4.getBackground();
                                ctlani4.start();
                            }
                            if (count == 13) {
                                ctlani4.stop();
                                c_tleft_line4.setBackgroundResource(R.drawable.line5finish);
                                c_tleft_line5.setBackgroundResource(R.drawable.cheekleftanim2);
                                ctlani5 = (AnimationDrawable) c_tleft_line5.getBackground();
                                ctlani5.start();
                            }
                            if (count == 14) {
                                ctlani5.stop();
                                c_tleft_line5.setBackgroundResource(R.drawable.line5finish);
                                c_tleft_line6.setBackgroundResource(R.drawable.cheekleftanim2);
                                ctlani6 = (AnimationDrawable) c_tleft_line6.getBackground();
                                ctlani6.start();
                            }
                            if (count == 15) {
                                ctlani6.stop();
                                c_tleft_line6.setBackgroundResource(R.drawable.line5finish);
                                c_tleft_line7.setBackgroundResource(R.drawable.cheekleftanim2);
                                ctlani7 = (AnimationDrawable) c_tleft_line7.getBackground();
                                ctlani7.start();
                            }
                            if (count == 16) {
                                ctlani7.stop();
                                c_tleft_line7.setBackgroundResource(R.drawable.line5finish);
                                c_tleft_line8.setBackgroundResource(R.drawable.cheekleftanim2);
                                ctlani8 = (AnimationDrawable) c_tleft_line8.getBackground();
                                ctlani8.start();
                            }
                            if (count == 17) {
                                ctlani8.stop();
                                c_tleft_line8.setBackgroundResource(R.drawable.line5finish);
                                c_tleft_line9.setBackgroundResource(R.drawable.cheekleftanim2);
                                ctlani9 = (AnimationDrawable) c_tleft_line9.getBackground();
                                ctlani9.start();
                            }
                            if (count == 18) {
                                ctlani9.stop();
                                c_tleft_line9.setBackgroundResource(R.drawable.line5finish);
                                c_tleft_line10.setBackgroundResource(R.drawable.cheekleftanim2);
                                ctlani10 = (AnimationDrawable) c_tleft_line10.getBackground();
                                ctlani10.start();
                            }
                            if (count == 19) {
                                ctlani10.stop();
                                c_tleft_line10.setBackgroundResource(R.drawable.line5finish);
                                c_tleft_line11.setBackgroundResource(R.drawable.cheekleftanim2);
                                ctlani11 = (AnimationDrawable) c_tleft_line11.getBackground();
                                ctlani11.start();
                            }
                            if (count == 20) {
                                ctlani11.stop();
                                c_tleft_line11.setBackgroundResource(R.drawable.line5finish);
                                c_tleft_line12.setBackgroundResource(R.drawable.cheekleftanim2);
                                ctlani12 = (AnimationDrawable) c_tleft_line12.getBackground();
                                ctlani12.start();
                            }
                            if (count == 21) {
                                ctlani12.stop();
                                c_tleft_line12.setBackgroundResource(R.drawable.line5finish);
                                c_tleft_line13.setBackgroundResource(R.drawable.cheekleftanim2);
                                ctlani13 = (AnimationDrawable) c_tleft_line13.getBackground();
                                ctlani13.start();
                            }
                            if (count == 22) {
                                ctlani13.stop();
                                c_tleft_line13.setBackgroundResource(R.drawable.line5finish);
                                c_tleft_line14.setBackgroundResource(R.drawable.cheekleftanim2);
                                ctlani14 = (AnimationDrawable) c_tleft_line14.getBackground();
                                ctlani14.start();
                            }else if (count >= 22) {
                                c_tleft_line15.setBackgroundResource(R.drawable.line321color);
                                c_tleft_line16.setBackgroundResource(R.drawable.line321color);
                                c_tleft_line17.setBackgroundResource(R.drawable.line321color);
                                c_tleft_line18.setBackgroundResource(R.drawable.line321color);
                                c_tleft_line19.setBackgroundResource(R.drawable.line321color);
                                c_tleft_line20.setBackgroundResource(R.drawable.line321color);
                                c_tleft_line21.setBackgroundResource(R.drawable.line321color);
                                c_tleft_line22.setBackgroundResource(R.drawable.line321color);
                                c_tleft_line1.setBackgroundResource(R.drawable.line5color);
                                c_tleft_line2.setBackgroundResource(R.drawable.line5color);
                                c_tleft_line3.setBackgroundResource(R.drawable.line5color);
                                c_tleft_line4.setBackgroundResource(R.drawable.line5color);
                                c_tleft_line5.setBackgroundResource(R.drawable.line5color);
                                c_tleft_line6.setBackgroundResource(R.drawable.line5color);
                                c_tleft_line7.setBackgroundResource(R.drawable.line5color);
                                c_tleft_line8.setBackgroundResource(R.drawable.line5color);
                                c_tleft_line9.setBackgroundResource(R.drawable.line5color);
                                c_tleft_line10.setBackgroundResource(R.drawable.line5color);
                                c_tleft_line11.setBackgroundResource(R.drawable.line5color);
                                c_tleft_line12.setBackgroundResource(R.drawable.line5color);
                                c_tleft_line13.setBackgroundResource(R.drawable.line5color);
                                c_tleft_line14.setBackgroundResource(R.drawable.line5color);
                                component_txt.setText("GOOD JOB");
                            }
                        }
                    }
                });
            }
        };
        Timer timer = new Timer();
        timer.schedule(second, 0, 3000);
    }

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treat);

        Resources res = getResources();
        final Drawable  cheekrightimg= res.getDrawable(R.drawable.cheekrightimg);
        final Drawable  cheekleftimg= res.getDrawable(R.drawable.cheekleftimg);
        final Drawable  cheekunderrightimg= res.getDrawable(R.drawable.cheekunderimg);
        final Drawable  cheekunderleftimg= res.getDrawable(R.drawable.cheekunderleft);
        //값 받아오기

        forehead =  (ImageView)findViewById(R.id.forehead);
        underleft =  (ImageView)findViewById(R.id.underleft);
        underright =  (ImageView)findViewById(R.id.underright);
        cheekl =  (ImageView)findViewById(R.id.cheek_left);
        cheekr =  (ImageView)findViewById(R.id.cheek_right);
        mouth =  (ImageView)findViewById(R.id.mouth);
        eyeleft = (ImageView)findViewById(R.id.eyeleft);
        eyeright=(ImageView)findViewById(R.id.eyeright);
        component_txt=(TextView)findViewById(R.id.componenttxt);
        treatback = (RelativeLayout)findViewById(R.id.treatayout);
        underright_layout=(RelativeLayout)findViewById(R.id.u_trigh_layout);
        underleft_layout=(RelativeLayout)findViewById(R.id.u_tleft_layout);
        treat_default=(RelativeLayout)findViewById(R.id.treat_default);
        cheekright_layout=(RelativeLayout)findViewById(R.id.c_tright_layout);
        cheekleft_layout=(RelativeLayout)findViewById(R.id.c_tleft_layout);
        back=(ImageView)findViewById(R.id.backw);
        u_tright_line1=(ImageView)findViewById(R.id.u_tright_line1);
        u_tright_line2=(ImageView)findViewById(R.id.u_tright_line2);
        u_tright_line3=(ImageView)findViewById(R.id.u_tright_line3);
        u_tright_line4=(ImageView)findViewById(R.id.u_tright_line4);
        u_tright_line5=(ImageView)findViewById(R.id.u_tright_line5);
        u_tright_line6=(ImageView)findViewById(R.id.u_tright_line6);
        u_tright_line7=(ImageView)findViewById(R.id.u_tright_line7);
        u_tright_line8=(ImageView)findViewById(R.id.u_tright_line8);
        u_tright_line9=(ImageView)findViewById(R.id.u_tright_line9);
        u_tright_line10=(ImageView)findViewById(R.id.u_tright_line10);
        u_tright_line11=(ImageView)findViewById(R.id.u_tright_line11);
        u_tright_line12=(ImageView)findViewById(R.id.u_tright_line12);
        u_tright_line13=(ImageView)findViewById(R.id.u_tright_line13);
        u_tleft_line1=(ImageView)findViewById(R.id.u_tleft_line1);
        u_tleft_line2=(ImageView)findViewById(R.id.u_tleft_line2);
        u_tleft_line3=(ImageView)findViewById(R.id.u_tleft_line3);
        u_tleft_line4=(ImageView)findViewById(R.id.u_tleft_line4);
        u_tleft_line5=(ImageView)findViewById(R.id.u_tleft_line5);
        u_tleft_line6=(ImageView)findViewById(R.id.u_tleft_line6);
        u_tleft_line7=(ImageView)findViewById(R.id.u_tleft_line7);
        u_tleft_line8=(ImageView)findViewById(R.id.u_tleft_line8);
        u_tleft_line9=(ImageView)findViewById(R.id.u_tleft_line9);
        u_tleft_line10=(ImageView)findViewById(R.id.u_tleft_line10);
        u_tleft_line11=(ImageView)findViewById(R.id.u_tleft_line11);
        u_tleft_line12=(ImageView)findViewById(R.id.u_tleft_line12);
        u_tleft_line13=(ImageView)findViewById(R.id.u_tleft_line13);
        c_tright_line1=(ImageView)findViewById(R.id.c_tright_line1);
        c_tright_line2=(ImageView)findViewById(R.id.c_tright_line2);
        c_tright_line3=(ImageView)findViewById(R.id.c_tright_line3);
        c_tright_line4=(ImageView)findViewById(R.id.c_tright_line4);
        c_tright_line5=(ImageView)findViewById(R.id.c_tright_line5);
        c_tright_line6=(ImageView)findViewById(R.id.c_tright_line6);
        c_tright_line7=(ImageView)findViewById(R.id.c_tright_line7);
        c_tright_line8=(ImageView)findViewById(R.id.c_tright_line8);
        c_tright_line9=(ImageView)findViewById(R.id.c_tright_line9);
        c_tright_line10=(ImageView)findViewById(R.id.c_tright_line10);
        c_tright_line11=(ImageView)findViewById(R.id.c_tright_line11);
        c_tright_line12=(ImageView)findViewById(R.id.c_tright_line12);
        c_tright_line13=(ImageView)findViewById(R.id.c_tright_line13);
        c_tright_line14=(ImageView)findViewById(R.id.c_tright_line14);
        c_tright_line15=(ImageView)findViewById(R.id.c_tright_line15);
        c_tright_line16=(ImageView)findViewById(R.id.c_tright_line16);
        c_tright_line17=(ImageView)findViewById(R.id.c_tright_line17);
        c_tright_line18=(ImageView)findViewById(R.id.c_tright_line18);
        c_tright_line19=(ImageView)findViewById(R.id.c_tright_line19);
        c_tright_line20=(ImageView)findViewById(R.id.c_tright_line20);
        c_tright_line21=(ImageView)findViewById(R.id.c_tright_line21);
        c_tright_line22=(ImageView)findViewById(R.id.c_tright_line22);
        c_tleft_line1=(ImageView)findViewById(R.id.c_tleft_line1);
        c_tleft_line2=(ImageView)findViewById(R.id.c_tleft_line2);
        c_tleft_line3=(ImageView)findViewById(R.id.c_tleft_line3);
        c_tleft_line4=(ImageView)findViewById(R.id.c_tleft_line4);
        c_tleft_line5=(ImageView)findViewById(R.id.c_tleft_line5);
        c_tleft_line6=(ImageView)findViewById(R.id.c_tleft_line6);
        c_tleft_line7=(ImageView)findViewById(R.id.c_tleft_line7);
        c_tleft_line8=(ImageView)findViewById(R.id.c_tleft_line8);
        c_tleft_line9=(ImageView)findViewById(R.id.c_tleft_line9);
        c_tleft_line10=(ImageView)findViewById(R.id.c_tleft_line10);
        c_tleft_line11=(ImageView)findViewById(R.id.c_tleft_line11);
        c_tleft_line12=(ImageView)findViewById(R.id.c_tleft_line12);
        c_tleft_line13=(ImageView)findViewById(R.id.c_tleft_line13);
        c_tleft_line14=(ImageView)findViewById(R.id.c_tleft_line14);
        c_tleft_line15=(ImageView)findViewById(R.id.c_tleft_line15);
        c_tleft_line16=(ImageView)findViewById(R.id.c_tleft_line16);
        c_tleft_line17=(ImageView)findViewById(R.id.c_tleft_line17);
        c_tleft_line18=(ImageView)findViewById(R.id.c_tleft_line18);
        c_tleft_line19=(ImageView)findViewById(R.id.c_tleft_line19);
        c_tleft_line20=(ImageView)findViewById(R.id.c_tleft_line20);
        c_tleft_line21=(ImageView)findViewById(R.id.c_tleft_line21);
        c_tleft_line22=(ImageView)findViewById(R.id.c_tleft_line22);

        underright_layout.setVisibility(View.INVISIBLE);
        underleft_layout.setVisibility(View.INVISIBLE);
        cheekright_layout.setVisibility(View.INVISIBLE);
        cheekleft_layout.setVisibility(View.INVISIBLE);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            Intent intent;

            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            public void onClick(View v) {

                level=1;

                switch (v.getId()) {
                    case R.id.backw:
                        intent = new Intent(getApplicationContext(), TreatActivity.class);
                        startActivity(intent);
                        cheekcount=0;
                        undercount=0;
                        foreheadcount=0;
                        finish();
                        break;
                    case R.id.underright:
                        part="underright";
                        undercount++;
                        eyeleft.setClickable(false);
                        eyeright.setClickable(false);
                        cheekl.setClickable(false);
                        cheekr.setClickable(false);
                        forehead.setClickable(false);
                        eyeleft.setImageResource(R.drawable.noneyeleft);
                        eyeright.setImageResource(R.drawable.noneyeright);
                        cheekl.setImageResource(R.drawable.noncheekleft);
                        cheekr.setImageResource(R.drawable.noncheekright);
                        forehead.setImageResource(R.drawable.nonforehead);
                        mouth.setImageResource(R.drawable.nonmouth);
                        if(level==1){
                            underleft.setImageResource(R.drawable.underrightlevel1);
                            underright.setImageResource(R.drawable.underleftlevel1);
                            component_txt.setText("PLEASE SET THE DEVICE\nON LEVEL 1,\nAND SELECT STARTIG AREA");
                        }
                        if(level==2){
                            underleft.setImageResource(R.drawable.underrightlevel2);
                            underright.setImageResource(R.drawable.underleftlevel2);
                            component_txt.setText("PLEASE SET THE DEVICE\nON LEVEL 2,\nAND SELECT STARTIG AREA");
                        }
                        if(level==3){
                            underleft.setImageResource(R.drawable.underrightlevel3);
                            underright.setImageResource(R.drawable.underleftlevel3);
                            component_txt.setText("PLEASE SET THE DEVICE\nON LEVEL 3,\nAND SELECT STARTIG AREA");
                        }

                        if(undercount==2){
                            animation();
                            treatback.setBackground(cheekrightimg);
                            treat_default.setVisibility(View.INVISIBLE);
                            underright_layout.setVisibility(View.VISIBLE);
                            component_txt.setText("THIS COLUMN HAS 7 LINES.\nPLAE THE DEVICE TO THE COLORED LINE AS\nSHOWN. AND PRESS THE CENTER BUTTON TO\nSTART TREATIG ONE LINE.");
                            undercount=0;
                            back.setVisibility(View.INVISIBLE);
                        }

                        break;

                    case R.id.underleft:
                        part="underleft";
                        undercount++;
                        eyeleft.setClickable(false);
                        eyeright.setClickable(false);
                        cheekl.setClickable(false);
                        cheekr.setClickable(false);
                        forehead.setClickable(false);
                        eyeleft.setImageResource(R.drawable.noneyeleft);
                        eyeright.setImageResource(R.drawable.noneyeright);
                        cheekl.setImageResource(R.drawable.noncheekleft);
                        cheekr.setImageResource(R.drawable.noncheekright);
                        forehead.setImageResource(R.drawable.nonforehead);
                        mouth.setImageResource(R.drawable.nonmouth);
                        if(level==1){
                            underleft.setImageResource(R.drawable.underrightlevel1);
                            underright.setImageResource(R.drawable.underleftlevel1);
                            component_txt.setText("PLEASE SET THE DEVICE\nON LEVEL 1,\nAND SELECT STARTIG AREA");
                        }
                        if(level==2){
                            underleft.setImageResource(R.drawable.underrightlevel2);
                            underright.setImageResource(R.drawable.underleftlevel2);
                            component_txt.setText("PLEASE SET THE DEVICE\nON LEVEL 2,\nAND SELECT STARTIG AREA");
                        }
                        if(level==3){
                            underleft.setImageResource(R.drawable.underrightlevel3);
                            underright.setImageResource(R.drawable.underleftlevel3);
                            component_txt.setText("PLEASE SET THE DEVICE\nON LEVEL 3,\nAND SELECT STARTIG AREA");
                        }

                        if(undercount==2){
                            animation();
                            treatback.setBackground(cheekleftimg);
                            treat_default.setVisibility(View.INVISIBLE);
                            underleft_layout.setVisibility(View.VISIBLE);
                            component_txt.setText("THIS COLUMN HAS 7 LINES.\nPLAE THE DEVICE TO THE COLORED LINE AS\nSHOWN. AND PRESS THE CENTER BUTTON TO\nSTART TREATIG ONE LINE.");
                            undercount=0;
                            back.setVisibility(View.INVISIBLE);
                        }
                        break;

                    case R.id.cheek_right:
                        part="cheekright";
                        cheekcount++;
                        eyeleft.setClickable(false);
                        eyeright.setClickable(false);
                        underleft.setClickable(false);
                        underright.setClickable(false);
                        forehead.setClickable(false);
                        eyeleft.setImageResource(R.drawable.noneyeleft);
                        eyeright.setImageResource(R.drawable.noneyeright);
                        forehead.setImageResource(R.drawable.nonforehead);
                        underleft.setImageResource(R.drawable.nonunderleft);
                        underright.setImageResource(R.drawable.nonunderright);
                        mouth.setImageResource(R.drawable.nonmouth);
                        if(level==1){
                            cheekl.setImageResource(R.drawable.cheekleftlevel1);
                            cheekr.setImageResource(R.drawable.cheekrightlevel1);
                            component_txt.setText("PLEASE SET THE DEVICE\nON LEVEL 1,\nAND SELECT STARTIG AREA");
                        }
                        if(level==2){
                            cheekl.setImageResource(R.drawable.cheekleftlevel2);
                            cheekr.setImageResource(R.drawable.cheekrightlevel2);
                            component_txt.setText("PLEASE SET THE DEVICE\nON LEVEL 2,\nAND SELECT STARTIG AREA");
                        }
                        if(level==3){
                            cheekl.setImageResource(R.drawable.cheekleftlevel3);
                            cheekr.setImageResource(R.drawable.cheekrightlevel3);
                            component_txt.setText("PLEASE SET THE DEVICE\nON LEVEL 3,\nAND SELECT STARTIG AREA");
                        }

                        if(cheekcount==2){
                            animation();
                            treatback.setBackground(cheekunderrightimg);
                            treat_default.setVisibility(View.INVISIBLE);
                            cheekright_layout.setVisibility(View.VISIBLE);
                            component_txt.setText("THIS COLUMN HAS 7 LINES.\nPLAE THE DEVICE TO THE COLORED LINE AS\nSHOWN. AND PRESS THE CENTER BUTTON TO\nSTART TREATIG ONE LINE.");
                            cheekcount=0;
                            back.setVisibility(View.INVISIBLE);
                        }
                        break;

                    case R.id.cheek_left:
                        part="cheekleft";
                        cheekcount++;
                        eyeleft.setClickable(false);
                        eyeright.setClickable(false);
                        underleft.setClickable(false);
                        underright.setClickable(false);
                        forehead.setClickable(false);
                        eyeleft.setImageResource(R.drawable.noneyeleft);
                        eyeright.setImageResource(R.drawable.noneyeright);
                        cheekl.setImageResource(R.drawable.noncheekleft);
                        cheekr.setImageResource(R.drawable.noncheekright);
                        forehead.setImageResource(R.drawable.nonforehead);
                        underleft.setImageResource(R.drawable.nonunderleft);
                        underright.setImageResource(R.drawable.nonunderright);
                        mouth.setImageResource(R.drawable.nonmouth);
                        if(level==1){
                            cheekl.setImageResource(R.drawable.cheekleftlevel1);
                            cheekr.setImageResource(R.drawable.cheekrightlevel1);
                            component_txt.setText("PLEASE SET THE DEVICE\nON LEVEL 1,\nAND SELECT STARTIG AREA");
                        }
                        if(level==2){
                            cheekl.setImageResource(R.drawable.cheekleftlevel2);
                            cheekr.setImageResource(R.drawable.cheekrightlevel2);
                            component_txt.setText("PLEASE SET THE DEVICE\nON LEVEL 2,\nAND SELECT STARTIG AREA");
                        }
                        if(level==3){
                            cheekl.setImageResource(R.drawable.cheekleftlevel3);
                            cheekr.setImageResource(R.drawable.cheekrightlevel3);
                            component_txt.setText("PLEASE SET THE DEVICE\nON LEVEL 3,\nAND SELECT STARTIG AREA");
                        }

                        if(cheekcount==2){
                            animation();
                            treatback.setBackground(cheekunderleftimg);
                            treat_default.setVisibility(View.INVISIBLE);
                            cheekleft_layout.setVisibility(View.VISIBLE);
                            component_txt.setText("THIS COLUMN HAS 7 LINES.\nPLAE THE DEVICE TO THE COLORED LINE AS\nSHOWN. AND PRESS THE CENTER BUTTON TO\nSTART TREATIG ONE LINE.");
                            cheekcount=0;
                            back.setVisibility(View.INVISIBLE);
                        }
                        break;
                }
            }
        };
        back.setOnClickListener(onClickListener);
        forehead.setOnClickListener(onClickListener);
        underleft.setOnClickListener(onClickListener);
        underright.setOnClickListener(onClickListener);
        cheekl.setOnClickListener(onClickListener);
        cheekr.setOnClickListener(onClickListener);
        mouth.setOnClickListener(onClickListener);
        eyeleft.setOnClickListener(onClickListener);
        eyeright.setOnClickListener(onClickListener);
    }
}
