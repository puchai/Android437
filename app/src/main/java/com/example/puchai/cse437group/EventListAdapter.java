package com.example.puchai.cse437group;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.puchai.cse437group.models.Todo;

import java.util.List;
/**
 * Created by puchai on 10/17/16.
 */

public class EventListAdapter extends BaseAdapter {
    private MainActivity activity;
    private List<Todo> data;

    public EventListAdapter(MainActivity activity, List<Todo> data) {
        this.activity = activity;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(activity).inflate(R.layout.main_list_item, parent, false);
        }

        Todo todo = data.get(position);

        ((TextView) convertView.findViewById(R.id.main_list_item_text)).setText(todo.text);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(activity, EventsEditActivity.class);
//                intent.putExtra(EventsEditActivity.KEY_EVENT, todo);
//                activity.startActivityForResult(intent, MainActivity.REQ_CODE_TODO_EDIT);
                Toast.makeText(activity, "Course clicked", Toast.LENGTH_LONG).show();
            }
        });


        return convertView;
    }

}


