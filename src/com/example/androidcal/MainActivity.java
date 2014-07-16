package com.example.androidcal;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
 
public class MainActivity extends Activity {
       EditText edit1, edit2;
       Button btnA, btnS, btnM, btnD;
       TextView textResult;
       int num1, num2;
       Integer Result;
      
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Android Calculator");
       
        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnA = (Button) findViewById(R.id.BtnA);
        btnS = (Button) findViewById(R.id.BtnS);
        btnM = (Button) findViewById(R.id.BtnM);
        btnD = (Button) findViewById(R.id.BtnD);
        textResult = (TextView) findViewById(R.id.Result);
       
        View.OnClickListener clisten = new View.OnClickListener() {             
                  public void onClick(View v) {
                         num1 = Integer.parseInt(edit1.getText().toString());
                         num2 = Integer.parseInt(edit2.getText().toString());
                         switch(v.getId()){
                         case R.id.BtnA :
                               Result = num1 + num2;
                               break;
                              
                         case R.id.BtnS :
                               Result = num1 - num2;
                               break;
                                
                         case R.id.BtnM :
                               Result = num1 * num2;
                               break;
                          
                         case R.id.BtnD :
                               Result = num1 / num2;
                               break;
                           }
                          
                         textResult.setText("CalResult : "+Result);                 
                           }
             };
             btnA.setOnClickListener(clisten);
             btnS.setOnClickListener(clisten);
             btnM.setOnClickListener(clisten);
             btnD.setOnClickListener(clisten);
    }
} 