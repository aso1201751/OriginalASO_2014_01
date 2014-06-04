package jp.ac.st.originalaso_2014_001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DaikyoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.daikyo_activity);

		//渡ってきたintentを取得
		Intent intent = getIntent();
		//intentに混入していたExtraから、キーワードを元に値を」取得
		String name= intent.getStringExtra("name");

		TextView tv = (TextView)findViewById(R.id.daikyoMsg);
		tv.setText(name+"さんの今日の運勢は");
	}

}
