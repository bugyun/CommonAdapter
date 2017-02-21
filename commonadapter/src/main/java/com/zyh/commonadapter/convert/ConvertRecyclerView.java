package com.zyh.commonadapter.convert;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zyh.commonadapter.CommonAdapter;
import com.zyh.commonadapter.core.BaseHolder;

/**
 * Created by EiT on 2017/2/16.
 */

public class ConvertRecyclerView extends RecyclerView.Adapter<BaseHolder> {

    private CommonAdapter adapter;
    private LayoutInflater inflater;

    public ConvertRecyclerView(CommonAdapter adapter) {
        super();
        this.adapter = adapter;
        this.inflater = LayoutInflater.from(adapter.getContext());
    }

    @Override
    public BaseHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(adapter.getLayoutID(viewType), parent, false);
        return new BaseHolder(view, viewType);
    }

    @Override
    public void onBindViewHolder(BaseHolder holder, int position) {
        adapter.getView(holder.getViewType(), position, holder.getViewHolder(), adapter.getItem(position));
    }

    @Override
    public int getItemCount() {
        return adapter.getCount();
    }

    @Override
    public int getItemViewType(int position) {
        return adapter.getItemViewType(position);
    }
}
