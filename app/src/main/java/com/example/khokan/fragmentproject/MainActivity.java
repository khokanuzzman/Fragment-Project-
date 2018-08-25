package com.example.khokan.fragmentproject;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout my_tl;
    private ViewPager my_vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        my_tl=findViewById(R.id.mytabs);
        my_vp=findViewById(R.id.myViewPager);

        setUpMyViewPager(my_vp);
        my_tl.setupWithViewPager(my_vp);
    }

    private void setUpMyViewPager(ViewPager my_vp) {
        ViewPagerAdapter my_vpa = new ViewPagerAdapter(getSupportFragmentManager());
        my_vpa.addFragment(new FragmentOne(),"Fragment One");
        my_vpa.addFragment(new FragmentTwo(), "Fragment Two");
        my_vpa.addFragment(new FragmentTwo(), "Fragment Three");

        my_vp.setAdapter(my_vpa);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {

        private final List<Fragment> f_list= new ArrayList<Fragment>();
        private final List<String> title_list= new ArrayList<String>();

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return f_list.get(position);
        }

        @Override
        public int getCount() {
            return f_list.size();
        }

        void addFragment(Fragment f, String title){
           f_list.add(f);
           title_list.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return title_list.get(position);
        }
    }
}
