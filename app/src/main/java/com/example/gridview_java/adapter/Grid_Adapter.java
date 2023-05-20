package com.example.gridview_java.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.gridview_java.databinding.MemberListQolipBinding;
import com.example.gridview_java.model.Member;

import java.util.ArrayList;







public class Grid_Adapter extends BaseAdapter {
    ArrayList<Member> members;
    LayoutInflater inflater;
    Context contex;

    MemberListQolipBinding binding;

    public Grid_Adapter(Context contex, ArrayList<Member> members){
        this.members=members;
        this.contex=contex;
        this.inflater=LayoutInflater.from(contex);
    }

    @Override
    public int getCount() {
        return members.size();
    }

    @Override
    public Member getItem(int position) {
        return members.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            MemberListQolipBinding binding = MemberListQolipBinding.inflate(inflater, parent, false);
            convertView = binding.getRoot();
            convertView.setTag(binding);
        }


        Member member = members.get(position);
        MemberListQolipBinding binding = (MemberListQolipBinding) convertView.getTag();
        binding.name.setText(member.getName());

        return binding.getRoot();
    }
}
