package com.example.sharanya.MyPassbook;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Created by Sharanya on 14/04/2018.
 */

public class TipsActivity extends AppCompatActivity  {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        appBarLayout = (AppBarLayout) findViewById(R.id.appbarid);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //ADDING FRAGMENTS
        adapter.AddFragment(new FragmentCareer(),"Studying Tips");
        adapter.AddFragment(new FragmentQuiz(), "Setting Goals");
        adapter.AddFragment(new FragmentExplore(), "Career Preparation");

        //ADAPTER SETUP
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


    }
}
