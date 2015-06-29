package com.example.akashsachdeva.speed_dialer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dom(View v)
    {
        Intent i= new Intent();
        i.setData(Uri.parse("tel:123"));
        i.setAction(Intent.ACTION_CALL);
        startActivity(i);
    }

    public void pizza(View v)
    {
        Intent i= new Intent();
        i.setData(Uri.parse("tel:456"));
        i.setAction(Intent.ACTION_CALL);
        startActivity(i);

    }

    public void kfc(View v)
    {
        Intent i= new Intent();
        i.setData(Uri.parse("tel:789"));
        i.setAction(Intent.ACTION_CALL);
        startActivity(i);
    }

    public void mcd(View v)
    {
        Intent i= new Intent();
        i.setData(Uri.parse("tel:147"));
        i.setAction(Intent.ACTION_CALL);
        startActivity(i);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
