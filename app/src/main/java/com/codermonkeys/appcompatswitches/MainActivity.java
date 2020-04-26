package com.codermonkeys.appcompatswitches;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    //ui components
    SwitchCompat switchCompat;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchCompat = findViewById(R.id.switch_compat_id);
        layout = findViewById(R.id.main_layout);

        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked) {

                    switchCompat.setTextColor(getResources().getColor(android.R.color.white));
                    layout.setBackgroundColor(getResources().getColor(android.R.color.black));
                } else {
                    switchCompat.setTextColor(getResources().getColor(android.R.color.holo_blue_light));
                    layout.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                }
            }
        });
    }
}
