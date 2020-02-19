package io.github.arahmandc.Android.practise01;



import android.app.Activity;
import android.os.Bundle;

import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;

import android.content.res.Resources;
import android.util.TypedValue;

public class MainActivity extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        RelativeLayout myLayout= new RelativeLayout(this);
        Button myButton= new Button(this);
        EditText editText = new EditText(this);



        myLayout.setBackgroundColor(Color.BLUE);
        myButton.setBackgroundColor(Color.GREEN);
        myButton.setText("Click Me");


        RelativeLayout.LayoutParams Battondetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        Battondetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        Battondetails.addRule(RelativeLayout.CENTER_VERTICAL);

        myButton.setId(1);
        editText.setId(2);

        RelativeLayout.LayoutParams editdetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        editdetails.addRule(RelativeLayout.ABOVE,myButton.getId());
        editdetails.addRule(RelativeLayout.CENTER_HORIZONTAL);

        editdetails.setMargins(0,0,0,50);

        Resources r=getResources();
        int px= (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,r.getDisplayMetrics());
        editText.setWidth(px);



        myLayout.addView(editText,editdetails);
        myLayout.addView(myButton,Battondetails);

        setContentView(myLayout);


    }



}
