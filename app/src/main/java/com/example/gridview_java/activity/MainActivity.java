package com.example.gridview_java.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.example.gridview_java.R;
import com.example.gridview_java.adapter.Grid_Adapter;
import com.example.gridview_java.databinding.ActivityMainBinding;
import com.example.gridview_java.model.Member;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);

     initViews();
    }
        void initViews(){
        context=this;
        refreshAdapter(perapreList());
        }


        ArrayList<Member> perapreList(){
        ArrayList<Member> members=new ArrayList<>();
        for(int i=0; i<=30; i++){
            members.add(new Member("Shaxzod Aliyev"+i));
        }
        return members;
        }





    void refreshAdapter(ArrayList<Member> members){
        Grid_Adapter adapter=new Grid_Adapter(context,perapreList());
        binding.gridView.setAdapter(adapter);
    }

//        void refreshAdapter(Context context, ArrayList<Member> members){
//            Grid_Adapter adapter= new Grid_Adapter(this,members);
//            binding.gridView.setAdapter(adapter);
//        }

}