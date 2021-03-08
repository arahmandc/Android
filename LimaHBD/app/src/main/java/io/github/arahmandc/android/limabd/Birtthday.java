package io.github.arahmandc.android.limabd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Birtthday extends AppCompatActivity {

    TextView picciText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birtthday);

        picciText = (TextView)findViewById(R.id.picciText);






    }
}
