package com.example.puchai.cse437group;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;


import com.example.puchai.cse437group.models.Todo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final int REQ_CODE_TODO_EDIT = 100;
    private TodoListAdapter adapter;
    private static final String TODOS = "todos";
    private List<Todo> todos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Fab clicked", Toast.LENGTH_LONG).show();
            }
        });
        todos = mockData();
        adapter = new TodoListAdapter(this, todos);
        ((ListView) findViewById(R.id.main_list_view)).setAdapter(adapter);

    }

//    private void setupUI(@NonNull List<Todo> todos) {
//        ListView listView = (ListView) findViewById(R.id.main_list_view);
//        listView.setAdapter(new TodoListAdapter(this, todos));
//    }
//
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQ_CODE_TODO_EDIT && resultCode == Activity.RESULT_OK) {
            String todoId = data.getStringExtra(EventsEditActivity.KEY_EVENT_ID);
            if (todoId != null) {
                //deleteTodo(todoId);
            } else {
                Todo todo = data.getParcelableExtra(EventsEditActivity.KEY_EVENT);
                //updateTodo(todo);
            }
        }
    }

    @NonNull
//    private List<Todo> mockData() {
//        List<Todo> list = new ArrayList<>();
//        Todo todo1 = new Todo("CSE131");
//        Todo todo2 = new Todo("CSE132");
//        Todo todo3 = new Todo("CSE247");
//        Todo todo4 = new Todo("CSE332");
//        Todo todo5 = new Todo("CSE437");
//        list.add(todo1);
//        list.add(todo2);
//        list.add(todo3);
//        list.add(todo4);
//        list.add(todo5);
//        return list;
//    }
    //    }
    private List<Todo> mockData() {
        List<Todo> list = new ArrayList<>();
        Todo todo1 = new Todo("Lopatal 214: HW2 discussion");
        Todo todo2 = new Todo("Lopatal 222: Midterm Review");
        Todo todo3 = new Todo("DUC: Lecture Review");
        list.add(todo1);
        list.add(todo2);
        list.add(todo3);
        return list;
    }

}
