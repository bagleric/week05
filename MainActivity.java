package com.example.assign05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    String book  = String.valueOf(findViewById(R.id.book));
    String chapter = String.valueOf(findViewById(R.id.chapter));
    String verse= String.valueOf((findViewById(R.id.verse)));

    public static final String Mymessage = "Your favorite scripture is: " + book + " " + chapter + ":" + verse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        EditText editText = (EditText) findViewById(R.id.display);
        String message = editText.getText().toString();
        intent.putExtra(Mymessage, message);
        startActivity(intent);
    }
};
