package com.zyh.commonadapter.convert;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.zyh.commonadapter.CommonAdapter;
import com.zyh.commonadapter.core.HolderHelper;

/**
 * Created by EiT on 2017/2/16.
 */

public class ConvertListView extends BaseAdapter {

    private CommonAdapter adapter;
    private LayoutInflater inflater;


    public ConvertListView(CommonAdapter adapter) {
        super();
        this.adapter = adapter;
        this.inflater = LayoutInflater.from(adapter.getContext());
    }

    @Override
    public int getCount() {
        return adapter.getCount();
    }

    @Override
    public Object getItem(int position) {
        return adapter.getItem(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        int type = getItemViewType(position);
        if (convertView == null) {
            convertView = inflater.inflate(adapter.getLayoutID(type), parent, false);
        }
        adapter.getView(type, position, HolderHelper.get(convertView), adapter.getItem(position));
        return convertView;
    }

    @Override
    public int getItemViewType(int position) {
        return adapter.getItemViewType(position);
    }

    @Override
    public int getViewTypeCount() {
        return adapter.getViewTypeCount();
    }
}
