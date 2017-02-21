package com.zyh.commonadapter.core;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by EiT on 2017/2/18.
 */

public class BaseHolder extends RecyclerView.ViewHolder {

    private HolderHelper.ViewHolder viewHolder;
    private int viewType;


    public BaseHolder(View itemView, int viewType) {
        super(itemView);
        viewHolder = HolderHelper.get(itemView);
        this.viewType = viewType;
    }

    public HolderHelper.ViewHolder getViewHolder() {
        return viewHolder;
    }

    public int getViewType() {
        return viewType;
    }
}
