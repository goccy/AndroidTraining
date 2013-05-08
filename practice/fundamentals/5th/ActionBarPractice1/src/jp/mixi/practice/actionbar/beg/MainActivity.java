package jp.mixi.practice.actionbar.beg;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.widget.Toast;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.ActionBar.TabListener;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;

public class MainActivity extends SherlockActivity implements TabListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_Sherlock);
        setContentView(R.layout.activity_main);
        ActionBar bar = getSupportActionBar();
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        // タブを作成して追加。タブの選択・解除・再選択をハンドリングするコールバックの TabListener をセットしないと実行時例外でクラッシュする
        bar.addTab(bar.newTab().setText("Tab1").setTabListener(this));
        bar.addTab(bar.newTab().setText("Tab2").setTabListener(this));
        bar.addTab(bar.newTab().setText("Tab3").setTabListener(this));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getSupportMenuInflater().inflate(R.menu.main, menu);
        menu.add(Menu.NONE, 0, Menu.NONE, "Login");
        menu.add(Menu.NONE, 1, Menu.NONE, "Refresh");
        return true;
    }

	@Override
	public void onTabSelected(Tab tab,
			FragmentTransaction ft) {
		// TODO Auto-generated method stub
		Toast.makeText(this, tab.getText(), Toast.LENGTH_LONG).show();
	}

	@Override
	public void onTabUnselected(Tab tab,
			FragmentTransaction ft) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTabReselected(Tab tab,
			FragmentTransaction ft) {
		// TODO Auto-generated method stub
		//Toast.makeText(this, tab.getText(), Toast.LENGTH_LONG).show();
	}
}
