package com.weterings.ikpmd;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");
        myRef.setValue("Eat shit");


//
//        Button summonbutton = (Button) findViewById(R.id.summonButton);
//        summonbutton.setOnClickListener( new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                Log.d("Gacha time", "Start SummonActivity");
//                startActivity(new Intent(MainActivity.this, SummonActivity.class));
//            }
//        });
//        Button collectionbutton = (Button) findViewById(R.id.collectionButton);
//        collectionbutton.setOnClickListener( new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                Log.d("Gacha time", "Start SummonActivity");
//                startActivity(new Intent(MainActivity.this, Collection.class));
//            }
//        });
    }


}
