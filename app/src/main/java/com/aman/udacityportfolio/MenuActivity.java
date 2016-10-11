package com.aman.udacityportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MenuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(view -> Snackbar.make(view, "Will add soon. About me.", Snackbar.LENGTH_LONG)
                .setAction("Close", null).show());
        AppCompatButton movies = (AppCompatButton) findViewById(R.id.button_movies);
        AppCompatButton stock = (AppCompatButton) findViewById(R.id.button_stock);
        AppCompatButton bigger = (AppCompatButton) findViewById(R.id.button_bigger);
        AppCompatButton material = (AppCompatButton) findViewById(R.id.button_material);
        AppCompatButton ubi = (AppCompatButton) findViewById(R.id.button_ubiquitous);
        AppCompatButton capstone = (AppCompatButton) findViewById(R.id.button_capstone);
        setListenerToButtons(movies);
        setListenerToButtons(stock);
        setListenerToButtons(bigger);
        setListenerToButtons(material);
        setListenerToButtons(ubi);
        setListenerToButtons(capstone);

    }

    private void setListenerToButtons(AppCompatButton button) {
        button.setOnClickListener(v -> Snackbar.make(v, "This button will launch " + ((Button) v).getText().toString() + " app",
                Snackbar.LENGTH_LONG).show());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
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
}
