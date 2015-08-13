package com.example.admin.kalkualator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class PoleKolaActivity extends ActionBarActivity {

    Button guzik;
    EditText promien;
    TextView wynik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pole_kola);

        guzik = (Button) findViewById(R.id.button3);
        promien = (EditText) findViewById(R.id.editText4);
        wynik = (TextView) findViewById(R.id.textView15);

        promien.setHint("Długość promienia");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pole_kola, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void oblicz(View view) {

        wynik.setText(Double.parseDouble(promien.getText().toString()) * 3.14 + "");
    }
}
