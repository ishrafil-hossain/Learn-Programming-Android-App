package com.example.baiust;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class StudyActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView cCardView, cplusplusCardView, javaCardView, htmlCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);

        cCardView = findViewById(R.id.cCardViewId);
        cplusplusCardView = findViewById(R.id.cplusplusCardViewId);
        javaCardView = findViewById(R.id.javaCardViewId);
        htmlCardView = findViewById(R.id.htmlCardViewId);

        cCardView.setOnClickListener(this);
        cplusplusCardView.setOnClickListener(this);
        javaCardView.setOnClickListener(this);
        htmlCardView.setOnClickListener(this);

    }

    // alert button
    public void onBackPressed(){
        final AlertDialog.Builder builder = new AlertDialog.Builder(StudyActivity.this);
        builder.setMessage("Do you want to exit this app?");
        builder.setCancelable(false);
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

            }
        });
        builder.setPositiveButton("Yes ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()== R.id.shareId)
        {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/type");
            String subject = "Programmin Language";
            String body = "It will be helped to learn C,C++,Java,HTML. com.example.baiust";
            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,body);
            startActivity(Intent.createChooser(intent,"share with"));
        }
        else if(item.getItemId()== R.id.feedbackId)
        {
            Intent intent = new Intent(getApplicationContext(),FeedBackActivity.class);
            startActivity(intent);
        }
        else if(item.getItemId()== R.id.aboutusId)
        {
            Intent intent = new Intent(getApplicationContext(),AboutUsActivity.class);
            startActivity(intent);
        }
        else if(item.getItemId()==R.id.logoutId){
            FirebaseAuth.getInstance().signOut();
            Intent intent = new Intent(getApplicationContext(),SignInActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.cCardViewId)
        {
            Intent intent = new Intent(getApplicationContext(),CActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.cplusplusCardViewId)
        {
            Intent intent = new Intent(getApplicationContext(),CplusplusActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.javaCardViewId)
        {
            Intent intent = new Intent(getApplicationContext(),JavaActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.htmlCardViewId)
        {
            Intent intent = new Intent(getApplicationContext(),HtmlActivity.class);
            startActivity(intent);
        }

    }
}