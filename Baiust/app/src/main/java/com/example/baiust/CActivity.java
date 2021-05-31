package com.example.baiust;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        this.setTitle("C Programming");

        listView = (ListView) findViewById(R.id.clistViewId);
        final String[] cContents = getResources().getStringArray(R.array.C_Index);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(CActivity.this,R.layout.c_sampleview,R.id.c_sampleview_textViewId,cContents);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(), CprogramTutorialActivity.class);
                    intent.putExtra("c_key_position",position);
                    startActivity(intent);

            }
        });
    }
}