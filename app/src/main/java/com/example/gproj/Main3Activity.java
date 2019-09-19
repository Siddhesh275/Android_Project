package com.example.gproj;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    Button b;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    public void init()
    {
        b=(Button)findViewById(R.id.button4);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent xyz=new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(xyz);
            }
        });
    }
    public void init1()
    {
        b1=(Button)findViewById(R.id.button5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc=new Intent(Main3Activity.this,Main5Activity.class);
            startActivity(abc);
            }
        });
    }
    public void init2()
    {
        b2=(Button)findViewById(R.id.button6);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d=new Intent(Main3Activity.this,Main6Activity.class);
                startActivity(d);
            }
        });
    }
    public void init3()
    {
        b3=(Button)findViewById(R.id.button7);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder a_builder=new AlertDialog.Builder(Main3Activity.this);
                a_builder.setMessage("Do u want to close this app!!").setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent h=new Intent(Main3Activity.this,Main7Activity.class);
                                startActivity(h);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                AlertDialog alert=a_builder.create();
                alert.setTitle("Alert!!!");
                alert.show();
            }
        });
    }
    public void init4()
    {
        b4= (Button)findViewById(R.id.button11);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent (Main3Activity.this, Main10Activity.class);
                startActivity(l);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        init();
        init1();
        init2();
        init3();
    }
}
