package jp.mixi.practice.intent.beg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class NewActivity2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String toast_message = intent.getStringExtra("toast_message");
        Toast.makeText(this, toast_message, Toast.LENGTH_LONG).show();       
        //setContentView(R.layout.new_activity2);
    }
}
