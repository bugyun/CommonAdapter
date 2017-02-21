package com.zyh.baseadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import com.zyh.commonadapter.CommonAdapter;
import com.zyh.commonadapter.convert.ConvertListView;
import com.zyh.commonadapter.convert.ConvertRecyclerView;
import com.zyh.commonadapter.core.HolderHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //创建一个通用的commonAdapter，适配器模式
        CommonAdapter<String> commonAdapter = new CommonAdapter<String>(this) {
            @Override
            public void getView(int type, int position, HolderHelper.ViewHolder holder, String s) {

            }

            @Override
            public int getLayoutID(int type) {
                return 0;
            }

            @Override
            public int getViewTypeCount() {
                return 2;
            }

            @Override
            public int getItemViewType(int position) {
                return 0;
            }


        };

        //ListView的方法
        ListView mListView = (ListView) findViewById(R.id.mListView);
        mListView.setAdapter(new ConvertListView(commonAdapter));

        //RecyclerView的方法
        RecyclerView recyclerView = new RecyclerView(this);
        recyclerView.setAdapter(new ConvertRecyclerView(commonAdapter));


    }
}
