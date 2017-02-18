package com.google.android.gms.samples.vision.ocrreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProcessTextActivity extends AppCompatActivity {

    //Displays text from previous activity
    private TextView displayText;

    private String[] textBlocks;
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_text);

        //connects view component to TextView variable
        this.displayText = (TextView) findViewById(R.id.displayText);


        Intent intent = getIntent();
        String[] vals = intent.getStringArrayExtra(OcrCaptureActivity.textKey);
        text = "";
        for (int i = 0; i < vals.length; i++) {
            text += vals[i] + " ";
        }
        
        this.displayText.setText(text);
    }
}
