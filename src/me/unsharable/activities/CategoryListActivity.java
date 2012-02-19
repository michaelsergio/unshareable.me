package me.unsharable.activities;

import java.util.List;

import me.unsharable.models.Game;
import me.unsharable.models.Question;
import me.unshareable.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CategoryListActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.category_list);
		
		List<String> questions = Game.getAllQuestions();
		ListView lv = (ListView) findViewById(R.id.questionList);
		ArrayAdapter<String> questionAdapter = 
				new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, questions);
		lv.setAdapter(questionAdapter);
	}
}
