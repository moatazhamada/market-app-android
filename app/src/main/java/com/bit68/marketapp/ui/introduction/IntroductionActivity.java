package com.bit68.marketapp.ui.introduction;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bit68.marketapp.R;
import com.bit68.marketapp.ui.home.CategoriesActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class IntroductionActivity extends AppCompatActivity {

    private ViewPager viewpager;
    private LinearLayout liner;
    private SlideAdapter myadapter;

    private TextView[] mdots;
    private Button next, back;

    private int mCureentPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        viewpager = findViewById(R.id.viewpager);
        liner = findViewById(R.id.dots);

        next = findViewById(R.id.nextBtn);
        back = findViewById(R.id.backBtn);

        myadapter = new SlideAdapter(this);
        viewpager.setAdapter(myadapter);
        addDots(0);

        viewpager.addOnPageChangeListener(pageChangeListener);

        next.setOnClickListener(view -> {
            if (mCureentPage == myadapter.getCount() - 1) {
                Intent intent = new Intent(this, CategoriesActivity.class);
                startActivity(intent);
                finish();
            } else {
                viewpager.setCurrentItem(mCureentPage + 1);
            }
        });

        back.setOnClickListener(view -> viewpager.setCurrentItem(mCureentPage - 1));
    }

    public void addDots(int i) {

        mdots = new TextView[myadapter.getCount()];
        liner.removeAllViews();

        for (int x = 0; x < mdots.length; x++) {

            mdots[x] = new TextView(this);
            mdots[x].setText(Html.fromHtml("&#8226;"));
            mdots[x].setTextSize(35);
            mdots[x].setTextColor(getResources().getColor(R.color.dark_slate_gray));

            liner.addView(mdots[x]);
        }
        if (mdots.length > 0) {

            mdots[i].setTextColor(getResources().getColor(R.color.white));

        }

    }

    ViewPager.OnPageChangeListener pageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

            addDots(position);
            mCureentPage = position;

            if (position == 0) {
                next.setEnabled(true);
                back.setEnabled(false);
                back.setVisibility(View.INVISIBLE);

                next.setText("NEXT");
                back.setText("");
            } else if (position == mdots.length - 1) {

                next.setEnabled(true);
                back.setEnabled(true);
                back.setVisibility(View.VISIBLE);

                next.setText("FINISH");
                back.setText("BACK");

            } else {
                next.setEnabled(true);
                back.setEnabled(true);
                back.setVisibility(View.VISIBLE);

                next.setText("NEXT");
                back.setText("BACK");
            }

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}
