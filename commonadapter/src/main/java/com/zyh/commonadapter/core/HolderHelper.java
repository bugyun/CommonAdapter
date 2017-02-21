package com.zyh.commonadapter.core;

import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by EiT on 2017/2/18.
 */

public class HolderHelper {

    /**
     * 得到视图为 view 的 ViewHolder
     *
     * @param view
     * @return
     */
    public static ViewHolder get(View view) {
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder == null) {
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }
        return viewHolder;
    }

    /**
     * ViewHolder 存储 view的子 view 的索引
     *
     * @author ruoyun
     */
    public static class ViewHolder {
        private SparseArray<View> viewHolder;
        private View view;

        public ViewHolder(View view) {
            this.view = view;
            viewHolder = new SparseArray<View>();
        }

        @SuppressWarnings("unchecked")
        public <T extends View> T getView(int id) {
            View childView = viewHolder.get(id);
            if (childView == null) {
                childView = view.findViewById(id);
                viewHolder.put(id, childView);
            }
            return (T) childView;
        }

        public TextView getTextView(int id) {
            return getView(id);
        }

        public void setText(int id, String text) {
            getTextView(id).setText(text);
        }

        public ImageView getImageView(int id) {
            return getView(id);
        }

        /**
         * 在这里可以用imageloader来异步的加载图片，传入option来控制图片的显示
         *
         * @param id
         */
        //        public View setImageView(int id, String url, DisplayImageOptions options) {
        //            ImageView view = getView(id);
        //            // 操作图片
        //            ImageLoader.getInstance().displayImage(url, view, options);
        //            return view;
        //        }
    }


}
