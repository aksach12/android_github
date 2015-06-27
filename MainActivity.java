package com.example.app12;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	
	EditText ed1,ed2;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ed1=(EditText)findViewById(R.id.editText1);
		ed2=(EditText)findViewById(R.id.editText2);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void sum(View v){
		showDialog(1);
		v=getWindow().getDecorView();
		v.setBackgroundResource(R.drawable.ic_launcher);
		int n1=Integer.parseInt(ed1.getText().toString());
		int n2=Integer.parseInt(ed2.getText().toString());

	   Toast.makeText(getApplicationContext(), "Sum:" + (n1 + n2),Toast.LENGTH_LONG).show();
	}

	protected Dialog onCreateDialog(int id) {
		switch (id) {
			case 1:
				AlertDialog.Builder buil = new AlertDialog.Builder(this);
				buil.setIcon(R.drawable.ic_launcher);
				buil.setTitle("Display Sum!");
				buil.setMessage("Do you want to display the Sum?");
				buil.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						{
							Toast.makeText(getApplicationContext(), "Sum Displayed", Toast.LENGTH_LONG).show();
						}
					}
				});
				return buil.create();
			default:
				break;
		}
return super.onCreateDialog(id);
	}





	public void sub(View v){
		v=getWindow().getDecorView();
		v.setBackgroundColor(Color.CYAN);
		int n1=Integer.parseInt(ed1.getText().toString());
		int n2=Integer.parseInt(ed2.getText().toString());
 
	   Toast.makeText(getApplicationContext(), "Subtract:"+ (n1-n2), Toast.LENGTH_LONG).show();
	}
	
	public void mult(View v){
		v=getWindow().getDecorView();
		v.setBackgroundResource(R.drawable.dsk2);
		int n1=Integer.parseInt(ed1.getText().toString());
		int n2=Integer.parseInt(ed2.getText().toString());
 
	   Toast.makeText(getApplicationContext(), "Product:"+ (n1*n2), Toast.LENGTH_LONG).show();
	}
	
	public void divide(View v){
		int n1=Integer.parseInt(ed1.getText().toString());
		int n2=Integer.parseInt(ed2.getText().toString());
 
	   Toast.makeText(getApplicationContext(), "Divide:"+ (n1/n2), Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
