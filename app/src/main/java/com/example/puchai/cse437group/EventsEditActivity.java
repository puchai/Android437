package com.example.puchai.cse437group;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

/**
 * Created by puchai on 10/8/16.
 */
import com.example.puchai.cse437group.models.CousreEvent;

public class EventsEditActivity extends AppCompatActivity{

    public static final String KEY_EVENT = "event";
    private CousreEvent event;

    public static final String KEY_EVENT_ID = "envent_id";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        event = getIntent().getParcelableExtra(KEY_EVENT);
        event = getIntent().getParcelableExtra(KEY_EVENT);
        if (event != null) {
            setupUI();
        }

        setTitle(event == null ? "New Event" : "Edit Event");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_edit, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            case R.id.ic_save:
                saveAndExit();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void setupUI() {
        ((EditText) findViewById(R.id.event_edit_title))
                .setText(event.title);
        ((EditText) findViewById(R.id.event_edit_details))
                .setText(event.details);

    }

    public void saveAndExit() {

    }

}

