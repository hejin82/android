package org.hejin.beginningandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class GridView extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private TextView mySelection;
    private static final String[] myListItems = {"To", "be", "or", "not", "to", "be"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        android.widget.GridView myGrid = (android.widget.GridView)findViewById(R.id.grid);
        myGrid.setAdapter(new ArrayAdapter<String>(this, R.layout.activity_grid_view, myListItems));
        myGrid.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        mySelection.setText(myListItems[position]);
    }

    public void onNothingSelected(AdapterView<?> parent) {

    }
}
