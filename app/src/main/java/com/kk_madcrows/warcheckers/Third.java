package com.kk_madcrows.warcheckers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class Third extends AppCompatActivity {
    ImageView image;
    EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        image=findViewById(R.id.image);
        edit=findViewById(R.id.edit);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(edit.getText().toString()))
                {
                    edit.setError("Enter second Warrior name");
                }
             else{   Intent i=new Intent(Third.this,Spalsh.class);
               // startActivity(i);
                i.putExtra("second",edit.getText().toString());
                i.putExtra("first",getIntent().getStringExtra("first"));
                startActivity(i);}
            }
        });
    }
}
