package com.android.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    CourseAdapter adapter;
    ArrayList<Course> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        list = new ArrayList<>();

        list.add(new Course("Java",R.drawable.java));
        list.add(new Course("C++",R.drawable.ic_baseline_account_circle_24));
        list.add(new Course("C#",R.drawable.ic_baseline_account_circle_24));
        list.add(new Course("Javascript",R.drawable.ic_baseline_account_circle_24));
        list.add(new Course("Flutter",R.drawable.ic_baseline_account_circle_24));
        list.add(new Course("HTML",R.drawable.ic_baseline_account_circle_24));
        list.add(new Course("KOTLIN",R.drawable.ic_baseline_account_circle_24));

        adapter = new CourseAdapter(this,list);
        LinearLayoutManager llm = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(adapter);

    }
}