package org.hejin.beginningandroid;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ListView extends ListActivity {

    private TextView mySelection;
    private static final String[] myListItems = {"To", "be", "or", "not", "to", "be"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_multiple_choice,myListItems));
        mySelection = (TextView)findViewById(R.id.mySelection);
    }

    public void onListItemClick(ListView parent, View v, int position, long id) {
        mySelection.setText(myListItems[position]);
    }
}
