package me.unsharable.activities;

import me.unshareable.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DashboardActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard);
		Button btnAnswer = (Button) findViewById(R.id.dashboard_answer);
		Button btnAsk = (Button) findViewById(R.id.dashboard_ask);
		
		btnAnswer.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(DashboardActivity.this, QuestionResponsesActivity.class);
				startActivity(i);
			}
		});

		btnAsk.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(DashboardActivity.this, AskQuestionActivity.class);
				startActivity(i);
			}
		});
				
	}
	
}
