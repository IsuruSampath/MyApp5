package com.isuru.learntv.myapp5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {


    ViewGroup issaLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        issaLayout = (ViewGroup) findViewById(R.id.main_layout);

        //when touch the screen button animate
        issaLayout.setOnTouchListener(
                new RelativeLayout.OnTouchListener(){
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        moveButton();
                        return true;
                    }
                }


        );

        //when click the button it animate
        Button btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        moveButton();
                    }
                }
        );

    }

    public void moveButton(){
        View issaBtn = findViewById(R.id.btn);

        //change the position of the button
        RelativeLayout.LayoutParams positionRu = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        positionRu.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM,RelativeLayout.TRUE);
        positionRu.addRule(RelativeLayout.ALIGN_PARENT_RIGHT,RelativeLayout.TRUE);
        issaBtn.setLayoutParams(positionRu);

        //change the size of the button
        ViewGroup.LayoutParams sizeRu = issaBtn.getLayoutParams();
        sizeRu.height = 300;
        sizeRu.width = 450;
        issaBtn.setLayoutParams(sizeRu);

    }



}
