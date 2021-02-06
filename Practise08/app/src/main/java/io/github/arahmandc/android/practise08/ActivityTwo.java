package io.github.arahmandc.android.practise08;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);


        Bundle firstData=getIntent().getExtras();

        if (firstData==null)
        {
            return;
        }

        String firstMassage=firstData.getString("FirstInput");

        final TextView secondText=(TextView)findViewById(R.id.secondText);

        secondText.setText(firstMassage);


    }

}
