package io.github.arahmandc.android.practise05;

import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert {

    List<String> getworkout (String workouttype)
    {
        List<String> workout=new ArrayList<String>();

        if(workouttype.equals("chest"))
        {
            workout.add("Bench Press");
            workout.add("Cable Flys");
        }
        else if(workouttype.equals("Triceps"))
        {
            workout.add("Triceps Ext");
            workout.add("Triceps PushDowns");
        }
        else if (workouttype.equals("Shoulder"))
        {
            workout.add("Shoulder Press");
        }
        else if (workouttype.equals("Biceps"))
        {
            workout.add("Biceps Curls");
        }
        return workout;
    }
}
