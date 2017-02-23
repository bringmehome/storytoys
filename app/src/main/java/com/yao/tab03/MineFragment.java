package com.yao.tab03;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mxchip.storytoys.R;
import com.mxchip.storytoys.activity.ChooseBindTypeActivity;
import com.mxchip.storytoys.activity.IndexWeexActivity;

public class MineFragment extends Fragment {

    private String TAG = "---setfrag---";
    private TextView open_login;
    private LinearLayout devbindid;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("yao", this.getClass().getName() + " onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e("yao", this.getClass().getName() + " onCreateView");

        View view = inflater.inflate(R.layout.tab04, container, false);

        initView(view);
        initOnClick();

        return view;
    }

    private void initView(View view){
        open_login = (TextView) view.findViewById(R.id.open_login);
        devbindid = (LinearLayout) view.findViewById(R.id.devbindid);
    }

    private void initOnClick(){
        open_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IndexWeexActivity.class);
                startActivity(intent);
            }
        });

        devbindid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ChooseBindTypeActivity.class);
                startActivity(intent);
            }
        });
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
