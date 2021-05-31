package com.example.baiust;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class JavaTutorialActivity extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_tutorial);
        this.setTitle("Java Programming Tutorial");

        pdfView = findViewById(R.id.javaprogramPdfViewId);

        int list_position = getIntent().getIntExtra("java_key_position",0);

        if(list_position==0){
            pdfView.fromAsset("java home.pdf").load();
        }
        else if(list_position==1){
            pdfView.fromAsset("Java- Overview.pdf").load();
        }
        else if(list_position==2){
            pdfView.fromAsset("Java - Environment Setup.pdf").load();
        }
       
    }
}