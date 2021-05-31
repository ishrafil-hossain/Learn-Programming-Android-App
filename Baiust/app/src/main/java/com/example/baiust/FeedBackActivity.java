package com.example.baiust;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FeedBackActivity extends AppCompatActivity implements View.OnClickListener {

    private Button sendButton, clearButton;
    private EditText nameEditText, messageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);

        sendButton = findViewById(R.id.feedbackSendButtonId);
        clearButton = findViewById(R.id.feedbackclearButtonId);

        nameEditText = findViewById(R.id.feedbackNameEditTextId);
        messageEditText = findViewById(R.id.feedbackMessageEditTextId);

        sendButton.setOnClickListener(this);
        clearButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        try {

            String name = nameEditText.getText().toString();
            String message = messageEditText.getText().toString();

            if(v.getId()==R.id.feedbackSendButtonId){

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");

                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"ishrafil2233@gmail.com"});

                intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback from app");
                intent.putExtra(Intent.EXTRA_TEXT,"Name : "+name + "\n Message : "+message);
                startActivity(Intent.createChooser(intent,"Feedback with"));
            }
            if(v.getId()==R.id.feedbackclearButtonId){
                nameEditText.setText("");
                messageEditText.setText("");
            }
        }catch (Exception e){

            Toast.makeText(getApplicationContext(),"Exception :"+e, Toast.LENGTH_SHORT).show();
        }


    }
}