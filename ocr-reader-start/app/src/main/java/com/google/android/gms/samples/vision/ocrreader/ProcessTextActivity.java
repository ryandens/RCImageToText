package com.google.android.gms.samples.vision.ocrreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProcessTextActivity extends AppCompatActivity {

    //Displays text from previous activity
    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_text);

        //connects view component to TextView variable
        this.displayText = (TextView) findViewById(R.id.displayText);


        Intent intent = getIntent();
        String text = intent.getStringExtra(OcrCaptureActivity.textKey);
        this.displayText.setText(text);
    }
}
