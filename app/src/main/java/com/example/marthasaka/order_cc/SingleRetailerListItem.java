package com.example.marthasaka.order_cc;

/**
 * Created by marthasaka on 15/11/2016.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class SingleRetailerListItem extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.retailer_single_list_item_view);

        TextView txtProduct = (TextView) findViewById(R.id.retailer_label);

        Intent i = getIntent();
        // getting attached intent data
        String retailer = i.getStringExtra("retailer");
        // displaying selected product name
        txtProduct.setText(retailer);

    }
}