package com.gmail.touchmynoob7410;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	int amendmentNumber;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		switch (amendmentNumber){
		case 0:
			setContentView(R.layout.activity_main);
			break;
		case 1:
			setContentView(R.layout.first);
			break;
		case 2:
			setContentView(R.layout.second);
			break;
		case 3:
			setContentView(R.layout.third);
			break;
		case 4:
			setContentView(R.layout.fourth);
			break;
		case 5:
			setContentView(R.layout.fifth);
			break;
		case 6:
			setContentView(R.layout.sixth);
			break;
		case 7:
			setContentView(R.layout.seventh);
			break;
		case 8:
			setContentView(R.layout.eigth);
			break;
		case 9:
			setContentView(R.layout.nine);
			break;
		case 10:
			setContentView(R.layout.tenth);
			break;
		case 11:
			setContentView(R.layout.eleven);
			break;
		case 12:
			setContentView(R.layout.twelve);
			break;
		case 13:
			setContentView(R.layout.thirteen);
			break;
		case 14:
			setContentView(R.layout.fourteenth);
			break;
		case 15:
			setContentView(R.layout.fifteenth);
			break;
		case 16:
			setContentView(R.layout.sixteen);
			break;
		case 17:
			setContentView(R.layout.seventeen);
			break;
		case 18:
			setContentView(R.layout.eighteen);
			break;
		case 19:
			setContentView(R.layout.nineteen);
			break;
		case 20:
			setContentView(R.layout.twenty);
			break;
		case 21:
			setContentView(R.layout.twentyone);
			break;
		case 22:
			setContentView(R.layout.twentytwo);
			break;
		case 23:
			setContentView(R.layout.twentythree);
			break;
		case 24:
			setContentView(R.layout.twentyfour);
			break;
		case 25:
			setContentView(R.layout.twentyfive);
			break;
		case 26:
			setContentView(R.layout.twentysix);
			break;
		case 27:
			setContentView(R.layout.twentyseven);
			break;
	}
		Button submit = (Button) findViewById(R.id.button1);
		OnClickListener listener = new OnClickListener() {
					
				@Override
				public void onClick(View v) {
				amendmentNumber++;
				onCreate(new Bundle());
			}
		};
		
		submit.setOnClickListener(listener);
		
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
