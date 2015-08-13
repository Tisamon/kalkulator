package com.example.admin.kalkualator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class PoleTrojkataActivity extends ActionBarActivity {

    Button guzik;
    EditText bok, wysokosc;
    TextView wynik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pole_trojkata);

        guzik = (Button) findViewById(R.id.button4);
        bok = (EditText) findViewById(R.id.editText5);
        wysokosc = (EditText) findViewById(R.id.editText6);
        wynik = (TextView) findViewById(R.id.textView17);

        bok.setHint("Bok trójkąta");
        wysokosc.setHint("Wysokość trójkąta");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pole_trojkata, menu);
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
        wynik.setText(Double.parseDouble(bok.getText().toString()) * Double.parseDouble(wysokosc.getText().toString()) / 2 + "");
    }
}
