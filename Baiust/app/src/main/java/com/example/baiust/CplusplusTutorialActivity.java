package com.example.baiust;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CplusplusTutorialActivity extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplusplus_tutorial);
        this.setTitle("C++ Programming Tutorial");

        pdfView = findViewById(R.id.cplusplusProgramPdfViewId);

        int list_position = getIntent().getIntExtra("c++_key_position",0);

        if(list_position==0){
            pdfView.fromAsset("c++home.pdf").load();
        }
        else if(list_position==1){
            pdfView.fromAsset("c++overview.pdf").load();
        }
        else if(list_position==2){
            pdfView.fromAsset("c++ Local Environment Setup.pdf").load();
        }
        else if(list_position==3){
            pdfView.fromAsset("C++ Basic Syntax.pdf").load();
        }
        else if(list_position==4){
            pdfView.fromAsset("C++ Data Types.pdf").load();
        }


        else if(list_position==2){
            pdfView.fromAsset("C++ Variable Types.pdf").load();
        }
        else if(list_position==3){
            pdfView.fromAsset("C++ ConstantsLiterals.pdf").load();
        }
        else if(list_position==4){
            pdfView.fromAsset("Operators in C++.pdf").load();
        }
    }
}