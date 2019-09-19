package com.example.gproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b2,b1;
EditText rid,pass;
public void init()
{
    b1=(Button)findViewById(R.id.button);
    b2=(Button)findViewById(R.id.button2);
    rid=findViewById(R.id.editText5);
    pass=findViewById(R.id.editText4);
    b2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent abc=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(abc);
        }
    });
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String r1 = rid.getText().toString();
            String e = pass.getText().toString();
            if (r1.isEmpty()) {
                rid.setError("Please enter reg-id");
            } else if (e.isEmpty()) {
                pass.setError("Please enter password");
            } else if (r1.isEmpty() && e.isEmpty()) {
                Toast.makeText(MainActivity.this, "Please enter reg-id and password", Toast.LENGTH_LONG).show();
            } else {
                char c[] = r1.toCharArray();
                if (c[0] == 'E') {
                    Intent xyz = new Intent(MainActivity.this,Main3Activity.class);
                    startActivity(xyz);
                }
                else if(c[0]=='C')
                {
                    Intent s=new Intent(MainActivity.this,Main8Activity.class);
                    startActivity(s);
                }
                else if(c[0]!='E'||c[0]!='C') {
                    rid.setError("Please enter reg-id starting with E OR C");
                }
            }
        }
    });
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
}
