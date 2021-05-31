package com.example.baiust;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.github.barteksc.pdfviewer.PDFView;

public class AboutUsActivity extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        this.setTitle("Details Developer");

        pdfView = findViewById(R.id.aboutUsPdfViewId);
        pdfView.fromAsset("about_us.pdf").load();
    }
}