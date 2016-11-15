package com.example.marthasaka.order_cc;

import android.os.Bundle;
import android.app.ListActivity;
import android.widget.ArrayAdapter;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

public class WholesalersScreen2Activity extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // storing string resources into Array
        String[] wholesale_stores = getResources().getStringArray(R.array.wholesale_stores);

        // Binding resources Array to ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.wholesalelist_item, R.id.label, wholesale_stores));

        ListView lv = getListView();

        // listening to single list item on click
        lv.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // selected item
                String store = ((TextView) view).getText().toString();

                // Launching new Activity on selecting single List Item
                Intent i = new Intent(getApplicationContext(), SingleWholesaleListItem.class);
                // sending data to new activity
                i.putExtra("store", store);
                startActivity(i);

            }
        });

    }


}
