package com.example.baiust;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CplusplusActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplusplus);
        this.setTitle("C++ Programming");

        listView = (ListView) findViewById(R.id.cplusplus_listViewId);
        String[] cplusplusContents = getResources().getStringArray(R.array.Cplusplus_Index);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(CplusplusActivity.this,R.layout.cplusplus_simpleview,R.id.cplusplus_simpleview_textViewId,cplusplusContents);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(), CplusplusTutorialActivity.class);

                intent.putExtra("c++_key_position",position);
                startActivity(intent);

            }
        });
    }
}