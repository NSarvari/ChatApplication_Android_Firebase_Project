package com.example.chatapplication.moduls;

public class ModulUser {
    //use same name as in firebase database
    String name, email,uid;
    public ModulUser(){

    }

    public ModulUser(String name,String email,String uid){
        this.name=name;
        this.email=email;
        this.uid=uid;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUid(){
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

}
