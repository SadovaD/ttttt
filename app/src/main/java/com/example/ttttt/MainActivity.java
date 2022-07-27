package com.example.ttttt;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
    public int l = 0;
    Text text1 = new Text();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_layout);

        TextView text = findViewById(R.id.textView);
        TextView text2 = findViewById(R.id.textView2);
        TextView text3 = findViewById(R.id.textView3);
        TextView text4 = findViewById(R.id.textView4);
        TextView text5 = findViewById(R.id.textView5);
        TextView text6 = findViewById(R.id.textView6);
        TextView text7 = findViewById(R.id.textView7);
        TextView text8 = findViewById(R.id.textView8);
        Button button = findViewById(R.id.button);

        text.setText(text1.text_s[0]);
        text2.setText(text1.text_s2[0]);
        text3.setText(text1.text_s3[0]);
        text4.setText(text1.text_s4[0]);
        text5.setText(text1.text_s5[0]);
        text6.setText(text1.text_s6[0]);
        text7.setText(text1.text_s7[0]);
        text8.setText(text1.text_s8[0]);

        text.setVisibility(View.INVISIBLE);
        text2.setVisibility(View.INVISIBLE);
        text3.setVisibility(View.INVISIBLE);
        text4.setVisibility(View.INVISIBLE);
        text5.setVisibility(View.INVISIBLE);
        text6.setVisibility(View.INVISIBLE);
        text7.setVisibility(View.INVISIBLE);
        text8.setVisibility(View.INVISIBLE);
        button.setVisibility(View.INVISIBLE);

        Thread thread = new Thread(new AnotherRunnable());
        thread.start();
        init();

    }

    class AnotherRunnable implements Runnable {
        @Override
        public void run() {
            for (int l = 0; l < 10; l++) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
            private void init () {
                Animation textAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                TextView text = findViewById(R.id.textView);
                TextView text2 = findViewById(R.id.textView2);
                TextView text3 = findViewById(R.id.textView3);
                TextView text4 = findViewById(R.id.textView4);
                TextView text5 = findViewById(R.id.textView5);
                TextView text6 = findViewById(R.id.textView6);
                TextView text7 = findViewById(R.id.textView7);
                TextView text8 = findViewById(R.id.textView8);
                Button button = findViewById(R.id.button);
                switch (l) {
                    case 1:
                        text.setVisibility(View.VISIBLE);
                        text.startAnimation(textAnim);
                        break;
                    case 2:
                        text2.setVisibility(View.VISIBLE);
                        text2.startAnimation(textAnim);
                        break;
                    case 3:
                        text3.setVisibility(View.VISIBLE);
                        text3.startAnimation(textAnim);
                        break;
                    case 4:
                        text4.setVisibility(View.VISIBLE);
                        text4.startAnimation(textAnim);
                        break;
                    case 5:
                        text5.setVisibility(View.VISIBLE);
                        text5.startAnimation(textAnim);
                        break;
                    case 6:
                        text6.setVisibility(View.VISIBLE);
                        text6.startAnimation(textAnim);
                        break;
                    case 7:
                        text7.setVisibility(View.VISIBLE);
                        text7.startAnimation(textAnim);
                        break;
                    case 8:
                        text8.setVisibility(View.VISIBLE);
                        text8.startAnimation(textAnim);
                        break;
                    case 9:
                        button.setVisibility(View.VISIBLE);
                        button.startAnimation(textAnim);
                        break;

                }
            }
        }




