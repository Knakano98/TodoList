package android.example.todolist;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;


public class Json {
    public static String arrayListToJSON(ArrayList<String> input){
        String json=new Gson().toJson(input);
        return json;
    }

    public static ArrayList<String> JSONToArrayList(String json){
        ArrayList<String> arrayList=new Gson().fromJson(json, new TypeToken<ArrayList<String>>(){}.getType());
        return arrayList;
    }
}
