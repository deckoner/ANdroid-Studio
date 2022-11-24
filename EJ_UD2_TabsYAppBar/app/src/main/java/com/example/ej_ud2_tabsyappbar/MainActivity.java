package com.example.ej_ud2_tabsyappbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new TabAdapter());

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.setupWithViewPager(viewPager);


    }


    class TabAdapter extends PagerAdapter {
        private ConstraintLayout pestana1;
        private ConstraintLayout pestana2;
        private ConstraintLayout pestana3;
        private final int[] pestanas = {R.string.tab1, R.string.tab2, R.string.tab3};

        @Override
        public int getCount() {
            return 3;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return getString(pestanas[position]);
        }


        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container,
                                      int position) {
            View page;
            switch (position) {
                case 0:
                    if (pestana1 == null) {
                        pestana1 = (ConstraintLayout)
                                LayoutInflater.from(MainActivity.this)
                                        .inflate(R.layout.pestana_chats, container, false);
                    }
                    page = pestana1;
                    break;
                case 1:
                    if (pestana2 == null) {
                        pestana2 = (ConstraintLayout)
                                LayoutInflater.from(MainActivity.this)
                                        .inflate(R.layout.pestana_contactos, container, false);
                    }
                    page = pestana2;
                    break;
                default:
                    if (pestana3 == null) {
                        pestana3 = (ConstraintLayout)
                                LayoutInflater.from(MainActivity.this)
                                        .inflate(R.layout.pestana_llamadas, container, false);
                    }
                    page = pestana3;
                    break;
            }
            container.addView(page, 0);
            return page;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view,
                                        @NonNull Object object) {
            //return false;
            return view == object;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container,
                                int position, @NonNull Object object) {
            container.removeView((View) object);
        }
    }
}