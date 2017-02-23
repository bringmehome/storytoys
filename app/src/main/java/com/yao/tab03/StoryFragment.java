package com.yao.tab03;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mxchip.storytoys.R;

public class StoryFragment extends Fragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.e("yao", this.getClass().getName() + " onCreate");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		Log.e("yao", this.getClass().getName() + " onCreateView");
		return inflater.inflate(R.layout.tab01, container, false);
	}

	@Override
	public void onPause() {
		super.onPause();
		Log.e("yao", this.getClass().getName() + " onPause");
	}

	@Override
	public void onStop() {
		super.onStop();
		Log.e("yao", this.getClass().getName() + " onStop");
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.e("yao", this.getClass().getName() + " onDestroy");
	}
	
	@Override
	public void onDestroyView() {
		super.onDestroyView();
		Log.e("yao", this.getClass().getName() + " onDestroyView");
	}
}
