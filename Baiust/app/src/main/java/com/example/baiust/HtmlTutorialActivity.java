package com.example.baiust;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class HtmlTutorialActivity extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html_tutorial);
        this.setTitle("HTML Tutorial");

        pdfView = findViewById(R.id.htmlprogramPdfViewId);

        int list_position = getIntent().getIntExtra("html_key_position",0);

        if(list_position==0){
            pdfView.fromAsset("home.pdf").load();
        }
        else if(list_position==1){
            pdfView.fromAsset("overview.pdf").load();
        }
        else if(list_position==2){
            pdfView.fromAsset("environment_setup.pdf").load();
        }
        else if(list_position==3){
            pdfView.fromAsset("program_structure.pdf").load();
        }
        else if(list_position==4){
            pdfView.fromAsset("basic_syntax.pdf").load();
        }
    }
}