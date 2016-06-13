package com.example.pankajkatiyar.phonenumber;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Pankaj Katiyar on 10/6/2016.
 */
class CustomAdapter extends ArrayAdapter<String> {

    private Activity context;
    private String[] name,phone;
    public CustomAdapter(Activity context, String [] name, String[] phone) {
        super(context, R.layout.layout, name);
        this.name=name;
        this.phone=phone;
        this.context=context;
    }

    @Override
    public View getView(int position,View view,ViewGroup parent) {

            LayoutInflater myinflate = context.getLayoutInflater();
            View cusView = myinflate.inflate(R.layout.layout,parent,false);

            TextView txtName = (TextView) cusView.findViewById(R.id.txtname);
            TextView txtPhone = (TextView) cusView.findViewById(R.id.txtPhone);

            txtName.setText(name[position]);
            txtPhone.setText(phone[position]);


        return cusView;
    }
}
