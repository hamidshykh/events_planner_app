package com.hrptech.marrange;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class corporateEvents extends AppCompatActivity {

    Spinner spinner1,spinner2,spinner3,spinner4,spinner5;
    ImageView imageButton1,imageButton2,imageButton3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corporate_events);
        getSupportActionBar().hide();

        //       <----- SPINNER START ----->

        setContentView(R.layout.activity_corporate_events);
        spinner1=findViewById(R.id.spinner1);
        spinner2=findViewById(R.id.spinner2);
        spinner3=findViewById(R.id.spinner3);
        spinner4=findViewById(R.id.spinner4);
        spinner5=findViewById(R.id.spinner5);


        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.partiesList, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner1.setAdapter(adapter1);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.guestCount, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner2.setAdapter(adapter2);

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,R.array.estimatedBudget, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner3.setAdapter(adapter3);

        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,R.array.selectPartyPlace, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner4.setAdapter(adapter4);

        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,R.array.themes, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner5.setAdapter(adapter5);

        //      <----- SPINNER END ----->


        //        <----- CAPTURE IMAGE START ----->

        imageButton1 = findViewById(R.id.img1);
        imageButton2 = findViewById(R.id.img2);
        imageButton3 = findViewById(R.id.img3);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj1= new Intent(Intent.ACTION_PICK);
                obj1.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(obj1,1);
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj2 = new Intent(Intent.ACTION_PICK);
                obj2.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(obj2 , 2);
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj3 = new Intent(Intent.ACTION_PICK);
                obj3.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(obj3 , 3);
            }
        });

//        <----- CAPTURE IMAGE END ----->
    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode==RESULT_OK){
            switch (requestCode) {
                case 1:
                    imageButton1.setImageURI(data.getData());
                case 2:
                    imageButton2.setImageURI(data.getData());
                case 3:
                    imageButton3.setImageURI(data.getData());
            }

        }
    }
    //        <----- CAPTURE IMAGE END ----->
}