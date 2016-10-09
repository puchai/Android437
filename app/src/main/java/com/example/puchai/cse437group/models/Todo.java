package com.example.puchai.cse437group.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;
import java.util.UUID;
public class Todo implements Parcelable {
    public String id;
    public String text;


    public Todo(String text) {
        this.id = UUID.randomUUID().toString();
        this.text = text;

    }

    protected Todo(Parcel in) {
        text = in.readString();
        text = in.readString();

    }

    public static final Creator<Todo> CREATOR = new Creator<Todo>() {
        @Override
        public Todo createFromParcel(Parcel in) {
            return new Todo(in);
        }

        @Override
        public Todo[] newArray(int size) {
            return new Todo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(text);

    }
}
