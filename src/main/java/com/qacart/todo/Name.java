package com.qacart.todo;

public class Name {
    public static String check_name(String name){
        if (name.contains("@")||name.contains("$")){
            return "User";
        }
        else{
            return name;
        }
    }
}
