package com.example.room_rent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class BHK extends AppCompatActivity {

    private Button bhk1;
    private Button bhk2;
    private Button bhk3;
    private Button bhk4;

    private DatabaseReference database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_h_k);

        database = FirebaseDatabase.getInstance().getReference();

        bhk1 = (Button) findViewById(R.id.button1);
        bhk2 = (Button) findViewById(R.id.button2);
        bhk3 = (Button) findViewById(R.id.button3);
        bhk4 = (Button) findViewById(R.id.button4);

        bhk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // create the child in root object
                //Assign some value to thr child

                database.child("type").setValue("1 BHK");

                // shifting to next page using intent

                Intent a = new Intent(BHK.this,upimages.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);

            }
        });

        bhk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // create the child in root object
                //Assign some value to thr child

                database.child("type").setValue("2 BHK");

                // shifting to next page using intent

                Intent a = new Intent(BHK.this,upimages.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);

            }
        });

        bhk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // create the child in root object
                //Assign some value to thr child

                database.child("type").setValue("3 BHK");

                // shifting to next page using intent

                Intent a = new Intent(BHK.this,upimages.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);

            }
        });

        bhk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // create the child in root object
                //Assign some value to thr child

                database.child("type").setValue("4 BHK");

                // shifting to next page using intent

                Intent a = new Intent(BHK.this,upimages.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);

            }
        });

    }
}
