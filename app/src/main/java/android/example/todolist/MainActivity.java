package android.example.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //things to do:
    //3. Need to change to dynamically add a checkbox/ textview too scrollview, creating method would be best
    //4. Add delete function(Checkbox) next to each item
    //5. JSON/Rest shit





    private EditText taskInput;
    private Button confirmButton;
    private ScrollView scrollView;
    private String task;
    private TaskList taskList1=new TaskList();
    private LinearLayout containerLinearLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        confirmButton= findViewById(R.id.enterButton);
        scrollView= findViewById(R.id.scrollView);
        containerLinearLayout=  findViewById(R.id.containerLinLayout);







        confirmButton.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){


                taskInput= findViewById(R.id.tasks_input);
                task=taskInput.getText().toString();
                taskList1.appendTask(task);



                LinearLayout newLinLayout= new LinearLayout(MainActivity.this);
                CheckBox checkBox= new CheckBox(MainActivity.this);
                TextView taskText= new TextView(MainActivity.this);
                taskText.append(task +"\n\n"); //Text is in textview
                newLinLayout.addView(checkBox);
                newLinLayout.addView(taskText); //TextView is in linear layout testLin


                containerLinearLayout.addView(newLinLayout);




            }
        });


    }


}
