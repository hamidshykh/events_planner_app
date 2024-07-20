package com.hrptech.marrange;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView parties,weddings,birthday,corporateEvents;

//    RecyclerView recyclerView;
//    ArrayList<String> datasource;
//    LinearLayoutManager linearLayoutManager;
//    MyRvAdapter myRvAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        parties = (CardView) findViewById(R.id.parties);
        weddings = (CardView) findViewById(R.id.weddings);
        birthday = (CardView) findViewById(R.id.birthday);
        corporateEvents = (CardView) findViewById(R.id.corporateEvents);

        parties.setOnClickListener(this);
        weddings.setOnClickListener(this);
        birthday.setOnClickListener(this);
        corporateEvents.setOnClickListener(this);




        //        MOVE ACTIVITY TO PARTIES
//        parties =(CardView) findViewById(R.id.parties);
//        parties.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),parties.class);
//                startActivity(intent);
//            }
//        });
        //        END ACTIVITY PARTIES


        //        MOVE ACTIVITY TO WEDDINGS
//        weddings =(CardView) findViewById(R.id.weddings);
//        weddings.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,wedding.class);
//                startActivity(intent);
//            }
//        });
        //        END ACTIVITY WEDDINGS


        //        MOVE ACTIVITY TO BIRTHDAY
//        birthday =(CardView) findViewById(R.id.birthday);
//        birthday.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),birthday.class);
//                startActivity(intent);
//            }
//        });
        //        END ACTIVITY BIRTHDAY

        //        MOVE ACTIVITY TO CORPORATE EVENTS
//        corporateEvents =(CardView) findViewById(R.id.corporateEvents);
//        corporateEvents.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),corporateEvents.class);
//                startActivity(intent);
//            }
//        });

        //        END ACTIVITY CORPORATES EVENTS

        //datasource of RecyclerView;

//        datasource = new ArrayList<>();
//        datasource.add("Birthday");
//        datasource.add("Parties");
//        datasource.add("Corporation Events");
//        datasource.add("Weddings");
//        linearLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
//        myRvAdapter = new MyRvAdapter(datasource);
//        recyclerView.setLayoutManager(linearLayoutManager);
//        recyclerView.setAdapter(myRvAdapter);
        //  <-------------------------------------->

    }

    @Override
    public void onClick(View view) {
        Intent i;
//            MOVE ACTIVITIES SECTION
        switch (view.getId()){
            case R.id.parties: i = new Intent(this, com.hrptech.marrange.parties.class);
            startActivity(i);
            break;
            case R.id.weddings: i = new Intent(this, com.hrptech.marrange.wedding.class);
            startActivity(i);
            break;
            case R.id.birthday: i = new Intent(this, com.hrptech.marrange.birthday.class);
            startActivity(i);
            break;
            case R.id.corporateEvents: i = new Intent(this, com.hrptech.marrange.corporateEvents.class);
            startActivity(i);
            break;
            default:break;
        }
//        END ACTIVITIES SECTION


    }
    //recyclerView adapter
//    class MyRvAdapter extends RecyclerView.Adapter<MyRvAdapter.myHolder> {
//        ArrayList<String> data;
//        public MyRvAdapter(ArrayList<String> data) {
//            this.data = data;
//        }
//
//        @NonNull
//        @Override
//        public myHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//            View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.rv_item, parent, false);
//            return new myHolder(view);
//        }
//
//        @Override
//        public void onBindViewHolder(@NonNull myHolder holder, int position) {
//            holder.textView.setText(data.get(position));
//        }
//
//        @Override
//        public int getItemCount() {
//
//            return data.size();
//        }
//
//        class myHolder extends RecyclerView.ViewHolder{
//
//            TextView textView;
//            public myHolder(@NonNull View itemView) {
//                super(itemView);
//                textView = itemView.findViewById(R.id.tvText);
//            }
//        }
//    }
}