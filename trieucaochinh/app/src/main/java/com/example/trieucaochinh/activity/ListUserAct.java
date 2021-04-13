package com.example.trieucaochinh.activity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import androidx.appcompat.app.AppCompatActivity;

import com.example.trieucaochinh.R;
import com.example.trieucaochinh.database.DBHelper;

import java.util.SimpleTimeZone;

public class ListUserAct extends AppCompatActivity {
    private DBHelper db;
    private Cursor c;
    private SimpleCursorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceSate) {
        super.onCreate(savedInstanceSate);
        setContentView(R.layout.activity_list_user);

        db =  new DBHelper(this);
        ListView lvName = (ListView) findViewById(R.id.lvName);

        c = db.getAllUser();

        adapter = new SimpleCursorAdapter(this,R.layout.item_user,c , new String[]{ DBHelper.ID,DBHelper.NAME, DBHelper.QUANTITY},
                new int[]{R.id.tvId,R.id.tvName,R.id.tvQuantity}, CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER);


        lvName.setAdapter(adapter);

        lvName.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Cursor cursor = (Cursor) adapter.getItem(position);
                int _id = cursor.getInt(cursor.getColumnIndex(DBHelper.ID));
                String name = cursor.getString(cursor.getColumnIndex(DBHelper.NAME));
                String quantity = cursor.getString(cursor.getColumnIndex(DBHelper.QUANTITY));


            }
        });

    }

    @Override
    protected void onStart(){
        super.onStart();
        c = db.getAllUser();
        adapter.changeCursor(c);
        adapter.notifyDataSetChanged();
        db.close();
    }
}
