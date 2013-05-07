
package jp.mixi.practice.intent.beg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View button1 = findViewById(R.id.CallActivity1);
        View button2 = findViewById(R.id.CallActivity2);
        View button3 = findViewById(R.id.CallActivity3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO ここに、NewActivity1 を呼び出す処理を書く
            	Intent intent = new Intent(v.getContext(), NewActivity1.class);
            	startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO ここに、NewActivity2 を呼び出す処理を書く
                // TODO NewActivity2 は、toast_message をキーとした Extra のデータを必要としているので、適宜 Intent に含めること
            	Intent intent = new Intent(v.getContext(), NewActivity2.class);
            	intent.putExtra("toast_message", "NewActivity2");
            	startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO ここに、NewActivity3 を呼び出す処理を書く
                // TODO Intent に、Intent.FLAG_ACTIVITY_NO_HISTORY という flag をセットするとどうなるかレポートすること
            	// 表示履歴に残さないでActivityを表示するという挙動になる。例えば、複数画面遷移を経た先で戻るときに、途中の状態を経由せずに
            	// 最初に戻るというような挙動を実現したいときは、これを用いて画面遷移していけばいいのかなと思いました。
            	Intent intent = new Intent(v.getContext(), NewActivity3.class);
            	intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            	startActivity(intent);
            }
        });
    }
}