package com.example.han.lab4_3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by han on 06/12/2016.
 */

public class UserRecordAdapter extends ArrayAdapter<UserRecord> {

    public UserRecordAdapter(Context context, int resource, List<UserRecord> list) {
        //context = activity hosting a listview
        //resource = ID of layout
        //list = data/record

        super(context, resource, list);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //position = index of record
        //convertVIew = layout
        //parent = layout of the hosting activity
        UserRecord userRecord = getItem(position);

        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).
                    inflate(R.layout.user_record,
                            parent,
                            false);

        }

        TextView textViewName, textViewEmail;
        textViewName = (TextView) convertView.findViewById(R.id.textViewName);
        textViewEmail = (TextView) convertView.findViewById(R.id.textViewEmail);
        textViewName.setText("Name:" + userRecord.getName());
        textViewEmail.setText("Email:" + userRecord.getEmail());
        return convertView;


        //return super.getView(position, convertView, parent);
    }
}
