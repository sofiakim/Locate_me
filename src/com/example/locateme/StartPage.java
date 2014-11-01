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


public class StartPage extends Activity
{
    private Button Map;
    private Button NewEvent;
    private Button CurrentEvent;
    private Button Friends;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.startpage);
		// To connect the Button in the layout with the Button in the code
		Map = (Button) findViewById (R.id.map);
		Map.setOnClickListener (new OnClickListener ()
		    {
			/** Responds to the clicking of the Button
			 * @param view the View that was clicked on
			 */
			public void onClick (View view)
			{
				Intent i = new Intent(StartPage.this, StartPage.class);
		         startActivity(i);
			}
		    }
		    );
		
		NewEvent = (Button) findViewById (R.id.newevent);
		NewEvent.setOnClickListener (new OnClickListener ()
		    {
			/** Responds to the clicking of the Button
			 * @param view the View that was clicked on
			 */
			public void onClick (View view)
			{
				Intent i = new Intent(StartPage.this, NewEvent.class);
		         startActivity(i);
			}
		    }
		    );
		
		CurrentEvent = (Button) findViewById (R.id.currentevent);
		CurrentEvent.setOnClickListener (new OnClickListener ()
		    {
			/** Responds to the clicking of the Button
			 * @param view the View that was clicked on
			 */
			public void onClick (View view)
			{
				Intent i = new Intent(StartPage.this, StartPage.class);
		         startActivity(i);
			}
		    }
		    );

	}




	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
