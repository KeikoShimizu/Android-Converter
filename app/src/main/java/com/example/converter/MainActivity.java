package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Convert(View view) {
//        edit text ...object of edit text is created
        //get id name editText from input field
        //put memory location into editText
        //everytime we access to ui component which has id, we use R.id.___
        EditText editText = findViewById(R.id.editText);
        TextView textView = findViewById(R.id.textView);

        String dollar = editText.getText().toString() ;

//        if string dollar is not empty ...
        //[doller != ""] this style (!= ) doesn't work in Java so be careful!
        if (!dollar.equals("")){
            Float euro = Float.valueOf(dollar) * 0.85f ;
            //convert "euro" to string
            textView.setText(euro.toString());
        }
        else {
            textView.setText("You didn't enter any value!");
        }
    }
}