package com.xstudio.lovequotes;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class LoveQuotesActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void sendQuote(View view) {
		Uri smsUri = Uri.parse("tel:9980141980");
		Intent intent = new Intent(Intent.ACTION_VIEW, smsUri);
		intent.putExtra("sms_body", "shenrenkui");
		intent.setType("vnd.android-dir/mms-sms");
		startActivity(intent);
	}
}