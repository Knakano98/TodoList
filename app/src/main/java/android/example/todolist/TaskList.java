package android.example.todolist;

import java.util.ArrayList;

class TaskList {
    //Contain arraylist containing list of tasks
    //Add methods to  2. Remove item,
    private ArrayList<String> taskList=new ArrayList<String>();

    public void appendTask(String task){
        //Maybe add code to dynamically add lin view of check mark and text view here?
        //How can I store the ID's/indexes of the tasks so i can delete/move them around though

        taskList.add(task);

    }

    public ArrayList<String> getTaskList(){
        return taskList;
    }




}
