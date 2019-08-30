package android.example.todolist;

import java.util.ArrayList;

class TaskList {
    private ArrayList<String> taskList=new ArrayList<String>();

    public void appendTask(String task){
        taskList.add(task);
    }

    public void removeTask(int index){
        taskList.remove(index);
    }

    public ArrayList<String> getTaskList(){
        return taskList;
    }


    //Test function to print out all tasks
    public void testList(){
        for(String item: taskList){
            System.out.println(item);
        }
    }



}
