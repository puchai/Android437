package com.example.puchai.cse437group.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;
import java.util.List;

/**
 * Created by puchai on 10/8/16.
 */

public class CousreEvent implements Parcelable {
    public String title;
    public Date startDate;
    public Date endDate;
    public String details;

    public CousreEvent(){

    }



    protected CousreEvent(Parcel in) {
        title = in.readString();
        details = in.readString();
    }

    public static final Creator<CousreEvent> CREATOR = new Creator<CousreEvent>() {
        @Override
        public CousreEvent createFromParcel(Parcel in) {
            return new CousreEvent(in);
        }

        @Override
        public CousreEvent[] newArray(int size) {
            return new CousreEvent[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(details);
    }
}
