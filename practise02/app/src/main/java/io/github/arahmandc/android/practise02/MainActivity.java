package io.github.arahmandc.android.practise02;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button mybutton=(Button)findViewById(R.id.button12);
        final TextView myText=(TextView)findViewById(R.id.textView2);

        mybutton.setOnClickListener(
                new Button.OnClickListener(){

                    public void onClick(View v){
                        myText.setText("You Clicked");
                    }

                }
        );

        mybutton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        myText.setText("You Long Clicked");
                        return true;
                    }
                }
        );



    }


}
