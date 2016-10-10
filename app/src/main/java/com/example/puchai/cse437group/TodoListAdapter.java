package com.example.puchai.cse437group;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.CompoundButton;

import com.example.puchai.cse437group.models.Todo;

import java.util.List;

public class TodoListAdapter extends BaseAdapter {

    private MainActivity activity;
    private List<Todo> data;

    public TodoListAdapter(MainActivity activity, List<Todo> data) {
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
        // using viewHolder to improve efficiency
//        ViewHolder vh;
//        if (convertView == null) {
//            convertView = activity.getLayoutInflater().inflate(R.layout.main_list_item, parent, false);
//
//            vh = new ViewHolder();
//            vh.todoText = (TextView) convertView.findViewById(R.id.main_list_item_text);
//            vh.doneCheckbox = (CheckBox) convertView.findViewById(R.id.main_list_item_check);
//            convertView.setTag(vh);
//        } else {
//            vh = (ViewHolder) convertView.getTag();
//        }
//
//        final Todo todo = (Todo) getItem(position);
//        vh.todoText.setText(todo.text);

//        UIUtils.setTextViewStrikeThrough(vh.todoText, todo.done);
//        View view = LayoutInflater.from(context).inflate(R.layout.main_list_item, parent, false);
//        Todo todo = data.get(position);

//        ((TextView) view.findViewById(R.id.main_list_item_text)).setText(todo.text);
//        vh.doneCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                activity.updateTodo(position, isChecked);
//            }
//        });
        // comment back again
//        convertView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(activity, EventsEditActivity.class);
//                intent.putExtra(EventsEditActivity.KEY_EVENT, todo);
//                activity.startActivityForResult(intent, MainActivity.REQ_CODE_TODO_EDIT);
//            }
//        });
        if (convertView == null) {
            convertView = activity.getLayoutInflater().inflate(R.layout.main_list_item, parent, false);
        }
        Todo todo = data.get(position);
        ((TextView) convertView.findViewById(R.id.main_list_item_text)).setText(todo.text);
        return convertView;
    }
    private static class ViewHolder {
        TextView todoText;
        CheckBox doneCheckbox;
    }
}
