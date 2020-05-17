package com.tinuade.timepicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Handles the button click to create a new time picker fragment and
     * show it.
     *
     * @param view View that was clicked
     */
    public void showTimePicker(View view) {
        DialogFragment newFragment= new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(),"timePicker");

    }
    /**
     * Process the time picker result into strings that can be displayed in
     * a Toast.
     *
     * @param hour Chosen hour
     * @param minute Chosen minute
     */
    public void processTimePicker(int hour,int minute){
        String hourText=Integer.toString(hour);
        String minuteText=Integer.toString(minute);
        String timeMessage=(hourText+": "+minuteText);

        Toast.makeText(this,timeMessage,Toast.LENGTH_SHORT).show();
    }
}
