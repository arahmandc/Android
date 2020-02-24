package io.github.arahmandc.android.practise05;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;


public class MainActivity extends Activity {

    private WorkoutExpert expert =new WorkoutExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void onClickFind(View view) {

        TextView textView = (TextView) findViewById(R.id.textView);
        Spinner spinner = (Spinner) findViewById(R.id.workouttype);
        String string = String.valueOf(spinner.getSelectedItem());

//        textView.setText("Your are select "+string);

        List<String> workoutList=expert.getworkout(string);

        StringBuilder workoutFormates=new StringBuilder();

        for (String work: workoutList)
        {
            workoutFormates.append(work).append('\n');
        }
        textView.setText(workoutFormates);

    }
}
