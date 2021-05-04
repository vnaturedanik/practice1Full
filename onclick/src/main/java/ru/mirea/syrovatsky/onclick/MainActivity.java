package ru.mirea.syrovatsky.onclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button buttonOk;
    private Button buttonCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView) findViewById(R.id.tvOut);
        buttonOk = (Button)findViewById(R.id.btnOk);
        buttonCancel = (Button)findViewById(R.id.btnCancel);
        View.OnClickListener oclBtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Нажата кнопка cancel");
                        };
        };
        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("нажата кнопка ок");
            }};
        buttonCancel.setOnClickListener(oclBtnCancel);
        buttonOk.setOnClickListener(oclBtnOk);

    }}
