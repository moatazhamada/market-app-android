package com.bit68.marketapp.ui.introduction;


import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bit68.marketapp.R;

import org.jetbrains.annotations.NotNull;

import androidx.viewpager.widget.PagerAdapter;


public class SlideAdapter extends PagerAdapter {

    Context context;
    LayoutInflater inflater;

    public SlideAdapter(Context context){
        this.context=context;
    }

    //Array
    public int[] list_background={

            R.drawable.background_gradient_blue,
            R.drawable.background_gradient_orange,
            R.drawable.background_gradient_green
    };

    public String[] list_title={

            "First Screen",
            "Second Screen",
            "Third Screen"
    };

    public String[] list_description={

            "Categories",
            "Products",
            "Product Details"
    };

    @Override
    public int getCount() {
        return list_title.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object obj) {
        return view== obj;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_slide,container,false);

        LinearLayout linearLayout = view.findViewById(R.id.linear_layout_slide);
        TextView txtTitle = view.findViewById(R.id.text_slide_title);
        TextView txtDescription = view.findViewById(R.id.text_slide_description);

        txtTitle.setText(list_title[position]);
        txtDescription.setText(list_description[position]);
        linearLayout.setBackgroundResource(list_background[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, @NotNull Object object) {
        container.removeView((LinearLayout)object);
    }
}