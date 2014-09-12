package com.example.serialobj;

import com.pcs.helper.Constants;
import com.pcs.model.Customer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;



public class SecondActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);

		Customer cust = (Customer) getIntent().getSerializableExtra(Constants.Extras.DETAILS);
		TextView txt = (TextView) findViewById(R.id.data);
		
		
		if(cust != null)
		{
			txt.setText(cust.toString());
		}
	}
}
