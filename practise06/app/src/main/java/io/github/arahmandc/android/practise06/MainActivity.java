package io.github.arahmandc.android.practise06;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.main_View);

        switch (item.getItemId())
        {
            case R.id.red_menu:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                relativeLayout.setBackgroundColor(Color.RED);
                return true;

            case R.id.blue_menu:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                relativeLayout.setBackgroundColor(Color.BLUE);
                return true;

            case R.id.green_menu:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                relativeLayout.setBackgroundColor(Color.GREEN);
                return true;

                default:return super.onOptionsItemSelected(item);

        }

    }
}
