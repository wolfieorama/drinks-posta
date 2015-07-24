package com.jjh.drinksposta;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class one extends ActionBarActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one);

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.listView);

        // Defined Array values to show in ListView
        String[] values = new String[]{"product",
                "this is Sample stories 1",
                "this is sample story 2",
                "sample 3 baby!!!",
                "and yes you just hit 4",
                "fist bump for number 5",
                "sita ndio hiyo boss",
                "chora saba if needed",
                "chora nane if needed",
                "chora tisa if needed",
                "chora kumi if needed",
                "chora kumi namoja if needed",
                "chora 12 if needed"
        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition = position;

                // ListView Clicked item value
                String itemValue = (String) listView.getItemAtPosition(position);

                // Show Alert
//                Toast.makeText(getApplicationContext(),
//                        "Story :" + " " + itemValue, Toast.LENGTH_LONG)
//                        .show();

                if (position == 0) {
                    Intent myIntent = new Intent(getApplicationContext(), story1.class);
                    startActivity(myIntent);
                }

            }

        });
//        listView.OnItemClickListener(new AdapterView.OnItemClickListener() {
//            public void onItemClick(AdapterView<?> arg 0, View v, int position, long id) {
//                if (position == 0) {
//                    Intent myIntent = new Intent(getApplicationContext(), story1.class);
//                    startActivity(myIntent);
//                }
//            }
//        });

    }
}