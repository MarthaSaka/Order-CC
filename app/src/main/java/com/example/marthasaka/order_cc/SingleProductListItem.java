package com.example.marthasaka.order_cc;

/**
 * Created by marthasaka on 11/11/2016.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SingleProductListItem extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.single_product_list_item_view);

        TextView txtProduct = (TextView) findViewById(R.id.product_label);

        Intent i = getIntent();
        // getting attached intent data
        String product = i.getStringExtra("product");
        // displaying selected product name
        txtProduct.setText(product);

    }
}