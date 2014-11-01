package com.example.locateme;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

import android.view.View.OnClickListener;

import java.util.Locale;


public class NewEvent extends Activity
{
    private Button Create;
    private EditText eventTitle;
    private EditText eventDescription;
    private EditText date;
    private EditText time;
    

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// To connect the Button in the layout with the Button in the code
		Create = (Button) findViewById (R.id.create);
		Create.setOnClickListener (new OnClickListener ()
		    {
			/** Responds to the clicking of the Button
			 * @param view the View that was clicked on
			 */
			public void onClick (View view)
			{
				Intent i = new Intent(NewEvent.this, StartPage.class);
		         startActivity(i);
		         createEvent();
			}
		    }
		    );
		
		eventTitle = (EditText) findViewById (R.id.typeeventtitle);
		eventDescription = (EditText) findViewById (R.id.typedescription);
		date = (EditText) findViewById (R.id.typeeventdate);
		time = (EditText) findViewById (R.id.typeeventtime);

		


	}
	
	
	private void createEvent ()
    {
		Event newEvent = new Event (eventTitle, eventDescription, date, time);
    }




	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
