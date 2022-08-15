package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Student>studentArrayList = new ArrayList<>();
    int currentStudent = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView studentname = findViewById(R.id.studentName);
        TextView studentage = findViewById(R.id.studentAge);
        TextView studentgrade = findViewById(R.id.studentGrade);
        ImageView studentimage = findViewById(R.id.imageView2);
        Button changestudent = findViewById(R.id.button);

        Intent intent = new Intent();
        String namee = "name";
        Student student1 = new Student("xiao", 2000, 22, R.drawable.aether);
        Student student2 = new Student("aether", 500, 14, R.drawable.aether);
        Student student3 = new Student("yoimya", 21,23, R.drawable.aether);
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        studentimage.setImageResource(studentArrayList.get(currentStudent).getStudentImage());
        studentname.setText(studentArrayList.get(currentStudent).getStudentName());
        studentage.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentAge()));
        studentgrade.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentGrade()));

        changestudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentStudent++; //d
                studentimage.setImageResource(studentArrayList.get(currentStudent).getStudentImage());
                studentname.setText(studentArrayList.get(currentStudent).getStudentName());
                studentage.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentAge()));
                studentgrade.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentGrade()));

            }
        });
    }
}