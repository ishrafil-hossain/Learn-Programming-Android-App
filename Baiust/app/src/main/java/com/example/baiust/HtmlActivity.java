package com.example.baiust;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HtmlActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html);
        this.setTitle("Html");

        listView = (ListView) findViewById(R.id.htmllistViewId);
        final String[] htmlContents = getResources().getStringArray(R.array.Html_Index);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(HtmlActivity.this,R.layout.html_sample_view,R.id.html_sampleview_textViewId,htmlContents);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(), HtmlTutorialActivity.class);
                intent.putExtra("html_key_position",position);
                startActivity(intent);

            }
        });
    }
}