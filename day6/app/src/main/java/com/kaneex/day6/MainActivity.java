package com.kaneex.day6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText text;
    TextView countext;
    Button count;
    int val=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countext=(TextView)findViewById(R.id.countext);
        text=(EditText)findViewById(R.id.text);

        if (savedInstanceState!=null)
        {
            String t=savedInstanceState.getString("text");
            if(text!=null)
                text.setText(t);
        }
        count=(Button)findViewById(R.id.count);
        count.setOnClickListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"On start",Toast.LENGTH_SHORT).show();
        Log.d("MainActivity", "onStart: app started");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"On destroy",Toast.LENGTH_SHORT).show();
        Log.d("MainActivity", "onDestroy:");
    }

    @Override
    public void onClick(View v) {
        //String value=countext.getText().toString();
        val++;
        countext.setText(String.valueOf(val));
    }
}


