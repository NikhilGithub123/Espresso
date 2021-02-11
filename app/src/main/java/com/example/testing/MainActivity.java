package com.example.testing;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnChange ;
    private Button btnChangee ;
    private EditText etTextToChange;
    private EditText etTextToChangee;
    private TextView tvChangedTextt;
    private TextView tvChangedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnChange = (Button) findViewById(R.id.btnChange);
        btnChangee = (Button) findViewById(R.id.btnChangee);

        etTextToChangee = (EditText) findViewById(R.id.etTextToChangee);

        etTextToChange = (EditText) findViewById(R.id.etTextToChange);

        tvChangedText = (TextView) findViewById(R.id.tvChangedText);
        tvChangedTextt = (TextView) findViewById(R.id.tvChangedTextt);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvChangedText.setText(etTextToChange.getText());
            }
        });

        btnChangee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvChangedTextt.setText(etTextToChangee.getText());
            }
        });
    }
}