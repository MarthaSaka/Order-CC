package com.example.marthasaka.order_cc;

/**
 * Created by marthasaka on 11/11/2016.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;



public class SingleWholesaleListItem extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.wholesale_single_list_item_view);

        TextView txtwholesale = (TextView) findViewById(R.id.wholesale_label);

        Intent i = getIntent();
        // getting attached intent data
        String wholesale = i.getStringExtra("wholesale");
        // displaying selected product name
        txtwholesale.setText(wholesale);

    }
}