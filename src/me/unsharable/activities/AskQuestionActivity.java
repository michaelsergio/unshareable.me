package me.unsharable.activities;

import me.unsharable.models.Game;
import me.unshareable.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewDebug.FlagToString;
import android.widget.Button;

public class AskQuestionActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ask_question);
		
		Button random = (Button) findViewById(R.id.random_question);
		random.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Game.askQuestion(Game.getRandomQuestion());
				Intent i = new Intent(AskQuestionActivity.this, DashboardActivity.class);
				i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
			}
		});
		
		Button categories = (Button) findViewById(R.id.choose_question);
		categories.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(AskQuestionActivity.this, CategoryListActivity.class);
				startActivity(i);
			}
		});
	}
}
