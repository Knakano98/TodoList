package android.example.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {
    //things to do:
    //5. JSON/Rest stuff





    private EditText taskInput;
    private Button confirmButton;
    private Button deleteButton;
    private ScrollView scrollView;
    private String task;
    private TaskList taskList1=new TaskList();
    private LinearLayout containerLinearLayout;
    private ArrayList<LinearLayout> LinLays=new ArrayList<>();
    private ArrayList<CheckBox> checkBoxes=new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        confirmButton= findViewById(R.id.enterButton);
        deleteButton=findViewById(R.id.deleteButton);
        scrollView= findViewById(R.id.scrollView);
        containerLinearLayout=  findViewById(R.id.containerLinLayout);

        deleteButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                Iterator<CheckBox> iter=checkBoxes.iterator();
                while(iter.hasNext()){
                    CheckBox item=iter.next();
                    if(item.isChecked()){
                        containerLinearLayout.removeView(LinLays.get(checkBoxes.indexOf(item)));
                        LinLays.remove(checkBoxes.indexOf(item));
                        iter.remove();
                    }
                }



            }
        });






        confirmButton.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){

                //Gets input from editText
                taskInput= findViewById(R.id.tasks_input);
                task=taskInput.getText().toString();
                taskList1.appendTask(task);

                //Generates new LinLayout containing checkbox and new task
                LinearLayout newLinLayout= new LinearLayout(MainActivity.this);
                CheckBox checkBox= new CheckBox(MainActivity.this);
                TextView taskText= new TextView(MainActivity.this);
                taskText.append(task +"\n\n"); //Text is in textview
                newLinLayout.addView(checkBox);
                newLinLayout.addView(taskText); //TextView is in linear layout testLin

                //Generating IDs for newly created Views
                int newLinLayoutID=View.generateViewId();
                newLinLayout.setId(newLinLayoutID);
                LinLays.add(newLinLayout);

                int newCheckboxID=View.generateViewId();
                checkBox.setId(newCheckboxID);
                checkBoxes.add(checkBox);

                //Adds new linlayout to container LinLayout in Scrollview
                containerLinearLayout.addView(newLinLayout);




            }
        });


    }


}
