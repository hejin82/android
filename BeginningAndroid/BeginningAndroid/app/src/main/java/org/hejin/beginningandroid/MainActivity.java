package org.hejin.beginningandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button;
    private Integer myInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        button = new Button(this);
        button.setOnClickListener(this);
        myInt = 0;
        updateClickCounter();
        setContentView(button);
        //setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        updateClickCounter();
    }

    private void updateClickCounter() {
        myInt++;
        button.setText(myInt.toString());
    }
}
