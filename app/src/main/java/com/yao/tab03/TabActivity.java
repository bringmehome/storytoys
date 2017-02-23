package com.yao.tab03;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.mxchip.storytoys.R;

public class TabActivity extends Activity {

    private LinearLayout llChat, llFriends, llContacts, llSettings;
    private ImageView ivChat, ivFriends, ivContacts, ivSettings;
    private TextView tvChat, tvFriends, tvContacts, tvSettings;
    private FragmentSwitchTool tool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        initView();
        tool = new FragmentSwitchTool(getFragmentManager(), R.id.flContainer);
        tool.setClickableViews(llChat, llFriends, llContacts, llSettings);

        tool.addSelectedViews(new View[]{ivChat, tvChat})
            .addSelectedViews(new View[]{ivFriends, tvFriends})
            .addSelectedViews(new View[]{ivContacts, tvContacts})
            .addSelectedViews(new View[]{ivSettings, tvSettings});
        tool.setFragments(StoryFragment.class, FriendsFragment.class, ContactsFragment.class, MineFragment.class);

        tool.changeTag(llChat);
    }

    private void initView() {
        llChat = (LinearLayout) findViewById(R.id.llChat);
        llFriends = (LinearLayout) findViewById(R.id.llFriends);
        llContacts = (LinearLayout) findViewById(R.id.llContacts);
        llSettings = (LinearLayout) findViewById(R.id.llSettings);

        ivChat = (ImageView) findViewById(R.id.ivChat);
        ivFriends = (ImageView) findViewById(R.id.ivFriends);
        ivContacts = (ImageView) findViewById(R.id.ivContacts);
        ivSettings = (ImageView) findViewById(R.id.ivSettings);

        tvChat = (TextView) findViewById(R.id.tvChat);
        tvFriends = (TextView) findViewById(R.id.tvFriends);
        tvContacts = (TextView) findViewById(R.id.tvContacts);
        tvSettings = (TextView) findViewById(R.id.tvSettings);
    }
}
