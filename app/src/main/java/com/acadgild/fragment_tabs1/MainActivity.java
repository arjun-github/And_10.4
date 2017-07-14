package com.acadgild.fragment_tabs1;


import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {
    // Declare Tab Variable
    ActionBar.Tab Tab1, Tab2;
    Fragment fragmentTab1 = new FragmentTab1();
    Fragment fragmentTab2 = new FragmentTab2();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);// Loading Main Layout


        ActionBar actionBar = getActionBar();


        // Create Actionbar Tabs
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // Set Tab Titles
        //Tab1 = actionBar.newTab().setIcon(R.drawable.tab1);
        Tab1 = actionBar.newTab().setText("Audio");
        Tab2 = actionBar.newTab().setText("Video");


        // Set Tab Listeners
        Tab1.setTabListener(new TabListener(fragmentTab1));
        Tab2.setTabListener(new TabListener(fragmentTab2));


        // Add tabs to actionbar
        actionBar.addTab(Tab1);
        actionBar.addTab(Tab2);
    }
}
