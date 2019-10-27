package com.example.medi;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class database_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_activity);
    }

    public void vision2_act(View view){
        Intent i = new Intent(this, vision2_activity.class);
        startActivity(i);
    }
}
