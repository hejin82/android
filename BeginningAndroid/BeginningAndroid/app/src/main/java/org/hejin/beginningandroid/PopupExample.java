package org.hejin.beginningandroid;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PopupExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_example);
    }

    public void showAlertDialog(View view) {
        new AlertDialog.Builder(this)
                .setTitle("AlertDialog Example")
                .setMessage("This is the example AlertDialog. press the button to see the toast notification")
                .setPositiveButton("Show Toast", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(PopupExample.this, "The Toast Message", Toast.LENGTH_LONG)
                                .show();
                    }
                }).show();
    }
}
