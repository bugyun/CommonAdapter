package com.zyh.commonadapter;

import android.content.Context;

import com.zyh.commonadapter.core.HolderHelper;

import java.util.ArrayList;

/**
 * Created by EiT on 2017/2/16.
 * 通用的adapter
 */
public abstract class CommonAdapter<T> {

    protected Context context;
    private ArrayList<T> mList;

    public CommonAdapter(Context context) {
        this.context = context;
        this.mList = new ArrayList<>();
    }


    public int getCount() {
        return mList.size();
    }

    public T getItem(int position) {
        return mList.get(position);
    }

    public abstract void getView(int type, int position, HolderHelper.ViewHolder holder, T t);

    public Context getContext() {
        return context;
    }

    public abstract int getLayoutID(int type);

    /**
     * 默认为1
     */
    public int getViewTypeCount() {
        return 1;
    }


    public int getItemViewType(int position) {
        return 0;
    }
}
