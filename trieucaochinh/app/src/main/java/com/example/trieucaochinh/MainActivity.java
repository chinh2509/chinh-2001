package com.example.trieucaochinh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.trieucaochinh.activity.ListUserAct;
import com.example.trieucaochinh.database.DBHelper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edName;
    private EditText edQuantity;
    private Button btName;
    private DBHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DBHelper(this);
        db.getReadableDatabase();
    }
    private void initView(){
        edName = (EditText) findViewById(R.id.edName);
        edQuantity = (EditText) findViewById(R.id.edQuantity);
        btName = (Button) findViewById(R.id.btName);
        btName.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v == btName) {
            onName();
        }
    }
    private void onName(){
        if (edName.getText().toString().isEmpty()) {
            Toast.makeText(this,"Please enter name", Toast.LENGTH_LONG).show();
            return;
        }
        Intent intent = new Intent(MainActivity.this, ListUserAct.class);
        startActivity(intent);
    }
}