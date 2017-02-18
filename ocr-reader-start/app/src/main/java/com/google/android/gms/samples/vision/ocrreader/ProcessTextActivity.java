package com.google.android.gms.samples.vision.ocrreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProcessTextActivity extends AppCompatActivity {
    /*Displays text from previous activity*/
    private TextView dispalyText;
    private String[] textBlocks;
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_text);

        this.dispalyText = (TextView) findViewById(R.id.dispalyText);

        Intent intent = getIntent();
        String[] vals = intent.getStringArrayExtra(OcrCaptureActivity.TextKey);
        text = "";
        for(int i = 0; i < vals.length; i++) {
            text += vals[i] + " ";
        }
        this.dispalyText.setText(text);
    }
}
