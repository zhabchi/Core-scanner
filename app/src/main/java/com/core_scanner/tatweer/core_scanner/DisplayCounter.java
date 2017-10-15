package com.core_scanner.tatweer.core_scanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Typeface;

public class DisplayCounter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_counter);

        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("message");

        Typeface myTypeface = Typeface.createFromAsset(this.getAssets(), "led_real.ttf");
        TextView digital= (TextView) findViewById(R.id.txtDisplayCounter);
        digital.setTypeface(myTypeface);

        TextView txtView = (TextView) findViewById(R.id.txtDisplayCounter);
        txtView.setText(message);
    }
}
