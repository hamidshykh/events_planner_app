package com.hrptech.marrange;

import static com.hrptech.marrange.R.id.spinner1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class wedding extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner1,spinner2,spinner3,spinner4,spinner5,spinner6,spinner7,spinner8;
    ImageView imageButton1,imageButton2,imageButton3;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wedding);
        getSupportActionBar().hide();

        //       <----- SPINNER START ----->

       setContentView(R.layout.activity_wedding);
        spinner1=findViewById(R.id.spinner1);
        spinner2=findViewById(R.id.spinner2);
        spinner3=findViewById(R.id.spinner3);
        spinner4=findViewById(R.id.spinner4);
        spinner5=findViewById(R.id.spinner5);
        spinner6=findViewById(R.id.spinner6);
        spinner7=findViewById(R.id.spinner7);
        spinner8=findViewById(R.id.spinner8);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(wedding.this,R.array.weddingList, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.guestCount, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,R.array.estimatedBudget, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);

        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,R.array.selectWeddingPlace, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);

        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,R.array.stageShape, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter5);

        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(this,R.array.themeOfStageFurniture, android.R.layout.simple_spinner_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(adapter6);

        ArrayAdapter<CharSequence> adapter7 = ArrayAdapter.createFromResource(this,R.array.selectStageFlowers, android.R.layout.simple_spinner_item);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner7.setAdapter(adapter7);

        ArrayAdapter<CharSequence> adapter8 = ArrayAdapter.createFromResource(this,R.array.guestTableFlowers, android.R.layout.simple_spinner_item);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner8.setAdapter(adapter8);

        spinner1.setOnItemSelectedListener(this);


        //      <----- SPINNER END ----->

        //        <----- GALLERY START ----->

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

//        <----- GALLERY END ----->

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = i.getItemPosition(i).toString();
        Toast.makeText(i.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}