package android.example.todolist;

import java.util.ArrayList;

class TaskList {
    private ArrayList<String> taskList=new ArrayList<String>();

    public void appendTask(String task){
        taskList.add(task);
    }

    public ArrayList<String> getTaskList(){
        return taskList;
    }




}
