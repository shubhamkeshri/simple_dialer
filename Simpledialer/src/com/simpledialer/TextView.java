package com.simpledialer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

public class TextView extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.textview);
		
		Button button=(Button) findViewById(R.id.button1);
		android.widget.TextView textView=(android.widget.TextView) findViewById(R.id.textView1);
		ToggleButton toggleButton=(ToggleButton) findViewById(R.id.toggleButton1);
		EditText editText=(EditText) findViewById(R.id.editText1);

		toggleButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}

	
	
	
}
