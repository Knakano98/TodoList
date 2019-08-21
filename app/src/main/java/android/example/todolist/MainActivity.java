package android.example.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //things to do:
    //3. Need to change to dynamically add a checkbox/ textview too scrollview, creating method would be best
    //4. Add delete function(Checkbox) next to each item
    //5. JSON/Rest shit




    private TextView tasksTextView;
    private EditText taskInput;
    private Button confirmButton;
    private String task;
    private TaskList taskList1=new TaskList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        tasksTextView= (TextView) findViewById(R.id.task_list);
        confirmButton= (Button) findViewById(R.id.enterButton);




        confirmButton.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){

                taskInput= (EditText) findViewById(R.id.tasks_input);
                task=taskInput.getText().toString();
                taskList1.appendTask(task);

                tasksTextView.setText("");
                for(String task: taskList1.getTaskList()){
                    tasksTextView.append(task +"\n\n\n");
                }


            }
        });


    }


}
