package com.kk_madcrows.warcheckers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class Second extends AppCompatActivity {
    ImageView image;
    EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        image=findViewById(R.id.image);
       edit=findViewById(R.id.edit);
       image.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(TextUtils.isEmpty(edit.getText().toString()))
               {
                   edit.setError("Enter First Warrior name");
               }
              else{ Intent i=new Intent(Second.this,Third.class);
               i.putExtra("first",edit.getText().toString());
               startActivity(i);}
           }
       });
    }
}
