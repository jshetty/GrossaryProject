package com.example.grossary;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Pranav on 18/10/13.
 */
public class Adapter extends BaseAdapter {

    private LayoutInflater layoutInflater;
    private ArrayList<String> listItems;
    public Adapter(MainActivity mainActivity, ArrayList<String> listItems){
        layoutInflater = LayoutInflater.from(mainActivity);
        this.listItems = listItems;
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int i) {
        return listItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        view = layoutInflater.inflate(R.layout.item_name,null);
        textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(listItems.get(i));
        return view;
    }
}
