package jp.mixi.practice.fragment.beg;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment {
	public MainFragment() {
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		System.out.println("hello fragment world");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// LayoutInflater を利用して、レイアウトをリソースとして読み込む
		View view = inflater.inflate(R.layout.fragment_main, container, false);
		return view;
	}
}
