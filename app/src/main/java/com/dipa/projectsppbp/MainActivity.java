package com.dipa.projectsppbp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    ViewPager viewPager;
    ViewPagerAdapter adapter;
    ImageView iv_home, iv_portofolio, iv_contact, iv_blog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewpager);
        iv_home = findViewById(R.id.home);
        iv_portofolio = findViewById(R.id.portofolio);
        iv_contact = findViewById(R.id.contact);
        iv_blog = findViewById(R.id.blog);

        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        setupViewPager(viewPager);

        iv_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setViewPager(0);
            }
        });

        iv_blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setViewPager(1);
            }
        });

        iv_portofolio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setViewPager(2);
            }
        });

        iv_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setViewPager(3);
            }
        });
    }

    private void setupViewPager(ViewPager viewPager){
        adapter.addFragment(new FragmentHome());
        adapter.addFragment(new FragmentBlog());
        adapter.addFragment(new FragmentPortofolio());
        adapter.addFragment(new FragmentContact());
        viewPager.setAdapter(adapter);
    }

    private void setViewPager(int fragNum){
        viewPager.setCurrentItem(fragNum);
    }
}