
package jp.mixi.practice.interaction.beg;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(Menu.NONE, 0, Menu.NONE, "Login");
        menu.add(Menu.NONE, 1, Menu.NONE, "Refresh");
        return true;
    }
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        // ここで、状態に応じてメニューの有効・無効を切り替えたりなどの処理をする
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // 選択されたメニューに対応するイベント処理をここで実行する
    	Toast.makeText(this, item.getTitle(),Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);
    }
}
