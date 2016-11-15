package com.example.marthasaka.order_cc;

/**
 * Created by marthasaka on 11/11/2016.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SingleSpecificProduct extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.single_specific_product_view);

        TextView txtProduct = (TextView) findViewById(R.id.specificproduct_label);

        Intent i = getIntent();
        // getting attached intent data
        String product = i.getStringExtra("specific product");
        // displaying selected product name
        txtProduct.setText(product);

    }
}