package com.example.hp.form;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2,et3,et4;
    CheckBox cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);
        et4=(EditText)findViewById(R.id.et4);
        cb=(CheckBox)findViewById(R.id.cb);
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    String a=et1.getText().toString();
                    String b=et2.getText().toString();
                    et3.setText(a);
                    et4.setText(b);
                }
                else if (isChecked==false){
                    et3.setText(" ");
                    et4.setText(" ");
                }
            }
        });
    }
}
