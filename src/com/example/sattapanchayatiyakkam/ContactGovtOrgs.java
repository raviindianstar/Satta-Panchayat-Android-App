package com.example.sattapanchayatiyakkam;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class ContactGovtOrgs extends Activity
{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.contactgovtorgs);
		initUI();
	}

	private void initUI() {
		
	}
}
