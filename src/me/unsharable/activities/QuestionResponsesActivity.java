package me.unsharable.activities;

import me.unshareable.R;
import android.app.Activity;
import android.os.Bundle;

public class QuestionResponsesActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.question_responses);
/*		
		ListView lv = (ListView) findViewById(R.id.questionList);
		ArrayAdapter<Question> questions = 
				new ListAdapter<Question>(this, android.R.layout.simple_list_item_1);
		lv.setAdapter(questions);
*/	}
}
