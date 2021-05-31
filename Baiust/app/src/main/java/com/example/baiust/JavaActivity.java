package com.example.baiust;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class JavaActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
        this.setTitle("Java Programming");

        listView = (ListView) findViewById(R.id.javalistViewId);
        final String[] javaContents = getResources().getStringArray(R.array.Java_Index);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(JavaActivity.this,R.layout.java_sample_view,R.id.java_sampleview_textViewId,javaContents);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(), JavaTutorialActivity.class);
                intent.putExtra("java_key_position",position);
                startActivity(intent);

            }
        });
    }
}