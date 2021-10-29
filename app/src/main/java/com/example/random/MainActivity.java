package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.random.utils.MyUtils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private MyUtils utils;
    private List<int[]> list_num = new ArrayList<>();
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init(){
    tv = findViewById(R.id.tv);
    utils = new MyUtils();
    }

    public void onGetList(View view) {
        for (int i = 0; i < 2; i++) {
            int[] arr = utils.getArr(5, 35);
            int[] arr1 = utils.getArr(2, 12);
            int[] arrs = new int[7];
            for (int i1 = 0; i1 < arr.length; i1++) {
                arrs[i1] = arr[i1];
            }
            arrs[5] = arr1[0];
            arrs[6] = arr1[1];
            list_num.add(arrs);
        }
        String nubers = "";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <list_num.get(i).length ; j++) {
                nubers =nubers+ " "+list_num.get(i)[j];
            }
            nubers = nubers + "\n";
        }
        tv.setText(nubers);
    }
}