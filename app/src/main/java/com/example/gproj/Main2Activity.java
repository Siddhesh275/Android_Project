package com.example.gproj;


import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {
Button b;
EditText a,g;

    public void init()
    {
        a=findViewById(R.id.editText10);
        g=findViewById(R.id.editText12);
      b=(Button)findViewById(R.id.button3)  ;
      b.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String pass = a.getText().toString();
              String pass1 = g.getText().toString();
              if (pass.equals(pass1)) {
                  Intent c = new Intent(Main2Activity.this, Main3Activity.class);
                  startActivity(c);
              }
              else
              {
                  g.setError("Please enter correct password");
              }
          }
      });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
    }
}
