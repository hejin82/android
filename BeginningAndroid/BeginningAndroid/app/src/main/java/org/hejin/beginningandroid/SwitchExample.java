package org.hejin.beginningandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

public class SwitchExample extends AppCompatActivity {

    private Switch mySwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_example);

        mySwitch = (Switch)findViewById(R.id.switchDemo);
        mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    mySwitch.setText("The switch is on");
                } else {
                    mySwitch.setText("The switch is off");
                }
            }
        });
    }
}
