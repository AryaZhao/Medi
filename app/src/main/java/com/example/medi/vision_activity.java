package com.example.medi;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class vision_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vision_activity);
    }
    public void login_act(View view){
        Intent i = new Intent(this, login_activity.class);
        startActivity(i);
    }
}
