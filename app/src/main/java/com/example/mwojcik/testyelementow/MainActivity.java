package com.example.mwojcik.testyelementow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mwojcik.testyelementow.LoginActivity.LoginActivity;
import com.example.mwojcik.testyelementow.MasterDetail.ItemListActivity;
import com.example.mwojcik.testyelementow.NavigationDrawer.NavigationMainActivity;
import com.example.mwojcik.testyelementow.SettingsActivity.SettingsActivity;
import com.example.mwojcik.testyelementow.TabbedActivity.MainTabbedActivity;
import com.example.mwojcik.testyelementow.fullscreen.FullscreenActivity;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);

        button.setText("FullScreen");
        button1.setText("MasterDetail");
        button2.setText("TabbedActivity");
        button3.setText("LoginActivity");
        button4.setText("SettingsActivity");
        button5.setText("NavigationActivity");

        button.setOnClickListener(buttonClick);
        button1.setOnClickListener(button1Click);
        button2.setOnClickListener(button2Click);
        button3.setOnClickListener(button3Click);
        button4.setOnClickListener(button4Click);
        button5.setOnClickListener(button5Click);
    }


    private View.OnClickListener buttonClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(MainActivity.this, FullscreenActivity.class);
            startActivity(i);
        }
    };

    private View.OnClickListener button1Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(MainActivity.this, ItemListActivity.class);
            startActivity(i);
        }
    };

    private View.OnClickListener button2Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(MainActivity.this, MainTabbedActivity.class);
            startActivity(i);
        }
    };

    private View.OnClickListener button3Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(i);
        }
    };

    private View.OnClickListener button4Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(i);
        }
    };

    private View.OnClickListener button5Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(MainActivity.this, NavigationMainActivity.class);
            startActivity(i);
        }
    };
}
