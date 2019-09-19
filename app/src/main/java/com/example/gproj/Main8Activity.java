package com.example.gproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main8Activity extends AppCompatActivity {
Button b1;

public void init()
{
    b1=(Button)findViewById(R.id.button9);
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent r=new Intent(Main8Activity.this,Main9Activity.class);
            startActivity(r);
        }
    });
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        init();
    }
}
