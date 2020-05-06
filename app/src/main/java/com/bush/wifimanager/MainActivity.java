package com.bush.wifimanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    Button btnWifiOn, btnwifioff;
    WifiManager wifiManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWifiOn = findViewById(R.id.btnTurnOn);
        btnwifioff = findViewById(R.id.btnTurnOff);


        btnWifiOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                if (wifiManager != null) {
                    wifiManager.setWifiEnabled(true);
                    Log.d(TAG, "onClick: Wifi enabled");
                }
                Toast.makeText(MainActivity.this, "Wifi Turn On", Toast.LENGTH_SHORT).show();

            }
        });

        btnwifioff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                if (wifiManager != null) {
                    wifiManager.setWifiEnabled(false);
                    Log.d(TAG, "onClick: Wifi disabled");
                }
                Toast.makeText(MainActivity.this, "Wifi Turn OFF", Toast.LENGTH_SHORT).show();


            }
        });


    }
}
