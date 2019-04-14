package com.tj.hj_java_xml_0414;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView contentTextView;
    EditText inputEditText;
    Button okBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("메인 -e로그", "어떻게 나오나");

        contentTextView = findViewById(R.id.contentTextView);
        inputEditText = findViewById(R.id.inputEditText);
        okBtn = findViewById(R.id.okBtn);

    }
}
