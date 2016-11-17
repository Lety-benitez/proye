package com.example.sandraleticia.chig;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sandra Leticia on 17/11/2016.
 */

public class UserAdactar extends BaseAdapter {
    private Context context;
    private List<User> users;
    public UserAdactar(Context context, List<User> users){
        this.context=context;
        this.users =users;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int position) {
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View viewconvert, ViewGroup parent) {
        View v = viewconvert;
        if (v==null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v=inflater.inflate(R.layout.item,null);
        }
        User u=users.get(position);
        TextView textView2 = (TextView) v.findViewById(R.id.textView2);
        TextView textView3 = (TextView) v.findViewById(R.id.textView3);
        TextView textView4 = (TextView) v.findViewById(R.id.textView4);
        TextView textView5 = (TextView) v.findViewById(R.id.textView5);

        textView2.setText(u.getLogin()+"");
        textView2.setText(u.getName()+"");
        textView4.setText(u.getAvatar_url()+"");
        textView5.setText(u.getEmail()+"");
        return null;
    }
}
