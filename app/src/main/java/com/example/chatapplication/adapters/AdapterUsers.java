package com.example.chatapplication.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chatapplication.ChatActivity;
import com.example.chatapplication.moduls.ModulUser;

import java.util.List;

public class AdapterUsers extends RecyclerView.Adapter<AdapterUsers.MyHolder> {

    Context context;
    List<ModulUser> userList;

    //constructor
    public AdapterUsers(List<ModulUser> userList){
        this.userList=userList;
    }
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        //get data
        String hisUID=userList.get(i).getUid();
        
        //handle item click
        myHolder.itemView.setOnClickListener((v)->{
            /*click user from user list to start messaging
             *start activity by putting UID of receiver
             * we will use the UID to identify the user we are gonna chat with
             */
            Intent intent= new Intent(context, ChatActivity.class);
            intent.putExtra("hisUid", hisUID);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    //view holder class
    class MyHolder extends RecyclerView.ViewHolder{
        public MyHolder (@NonNull View itemView){
            super(itemView);
        }
    }
}
