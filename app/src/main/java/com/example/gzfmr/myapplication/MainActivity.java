package com.example.gzfmr.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView textView;
    private Button bth_daHuang;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initShowBth();
        initListView();
    }



    private void initListView() {
        listView = (ListView) findViewById(R.id.list_view);
        fetchData();
        ArrayAdapter adaper = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,pers);
        listView.setAdapter(adaper);
    }
//    method ：1 使用实现View.OnClickListener
    private void initShowBth() {
        bth_daHuang = (Button) findViewById(R.id.button);
        bth_daHuang.setOnClickListener(this);
    }

    ArrayList pers = new ArrayList();
    private void fetchData() {
        for(int i = 0;i<10;i++){
            pers.add("黄三爷" + i);
			
			
			
			
			
        }
    }
//        method 2: 使用匿名内部类
//    private void initShowBth() {
//        bth_daHuang = (Button) findViewById(R.id.button);
//        bth_daHuang.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this,"握",Toast.LENGTH_LONG).show();
//            }
//        });
//    }

    @Override
    public void onClick(View view) {
        //然后将method ： 1 中需要的东西写入这个onClick方法中
        Toast.makeText(MainActivity.this,"UI",Toast.LENGTH_LONG).show();
    }
}
