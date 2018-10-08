package com.example.android.calculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    EditText editText1;
    DecimalFormat decimalFormat;
    static Double valueOne,valueTwo;
    private  static final char ADDITION='+';
    private static final char SUBSTRACTION='-';
    private static final char MULTIPLICATION='*';
    private static final char DIVISION ='/';
    private static char Action;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valueOne=Double.NaN;
        decimalFormat = new DecimalFormat("#.########");
        textView1 = (TextView) findViewById(R.id.textView);
        editText1 = (EditText) findViewById(R.id.editText);
        Button Button_1 = (Button) findViewById(R.id.button_1);
        Button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText1.getText().toString();
                editText1.setText(s + 1);
            }
        });

        editText1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        Button Button_2 = (Button) findViewById(R.id.button_2);
        Button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText1.getText().toString();
                editText1.setText(s + 2);
            }
        });
        Button Button_3 = (Button) findViewById(R.id.button_3);
        Button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText1.getText().toString();
                editText1.setText(s + 3);
            }
        });

        Button Button_4 = (Button) findViewById(R.id.button_4);
        Button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText1.getText().toString();
                editText1.setText(s + 4);
            }
        });
        Button Button_5 = (Button) findViewById(R.id.button_5);
        Button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText1.getText().toString();
                editText1.setText(s + 5);
            }
        });
        Button Button_6 = (Button) findViewById(R.id.button_6);
        Button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText1.getText().toString();
                editText1.setText(s + 6);
            }
        });
        Button Button_7 = (Button) findViewById(R.id.button_7);
        Button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText1.getText().toString();
                editText1.setText(s + 7);
            }
        });
        Button Button_8 = (Button) findViewById(R.id.button_8);
        Button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText1.getText().toString();
                editText1.setText(s + 8);
            }
        });
        Button Button_9 = (Button) findViewById(R.id.button_9);
        Button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText1.getText().toString();
                editText1.setText(s + 9);
            }
        });
        Button Button_0 = (Button) findViewById(R.id.button_0);
        Button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText1.getText().toString();
                editText1.setText(s + 0);
            }
        });
        Button Button_clear = (Button) findViewById(R.id.button_clear);
        Button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText("");
                textView1.setText("");
                Action=0;
                valueOne=Double.NaN;
            }
        });
        Button Button_back = (Button) findViewById(R.id.button_backspace);
        Button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText1.getText().toString();
                if(s.length()>0){
                editText1.setText(s.substring(0, s.length() - 1));}
            }
        });

        Button Button_add = (Button) findViewById(R.id.button_plus);
        Button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int k=0;
                String st  =textView1.getText().toString();
                if(st.length()>0){
                char c=st.charAt((st.length())-1);
                Log.i(Activity.class.getName(), "this is  ");
                if(c=='='||c=='+'||c=='-'||c=='*'||c=='/'){}
                else{k=1;}}
                 if(st.length()==0){k=1;}
                 if(editText1.getText().toString().length()!=0){k=1;}
                if(k==1){
                Calculate();
                if(editText1.getText().toString().isEmpty()||editText1.getText().toString().equals("+")){
                    editText1.setText("+");
                    }
                else{
                    Action=ADDITION;
                textView1.setText(decimalFormat.format(valueOne)+'+');
                editText1.setText(null);}
            }}
        });
        Button Button_substract = (Button) findViewById(R.id.button_minus);
        Button_substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int k=0;
                String st  =textView1.getText().toString();
                if(st.length()>0){
                    char c=st.charAt((st.length())-1);
                    if(c=='='||c=='+'||c=='-'||c=='*'||c=='/'){}
                    else{k=1;}}
                 if(st.length()==0){k=1;}
                 if(editText1.getText().toString().length()!=0){k=1;}
                if(k==1){
                Calculate();
                if(editText1.getText().toString().isEmpty()||editText1.getText().toString().equals("-")){
                    editText1.setText("-");
                    Log.i(MainActivity.class.getName(), "Calculate:HELLO2 ");}
                else{
                    Action=SUBSTRACTION;
                    textView1.setText(decimalFormat.format(valueOne)+'-');
                    editText1.setText(null);}
            }}
        });
        Button Button_multiply = (Button) findViewById(R.id.button_multiply);
        Button_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int k=0;
                String st  =textView1.getText().toString();
                if(st.length()>0){
                    char c=st.charAt((st.length())-1);
                    Log.i(Activity.class.getName(), "this is  ");
                    if(c=='='||c=='+'||c=='-'||c=='*'||c=='/'){}
                    else{k=1;}}
                 if(st.length()==0){k=1;}
                 if(editText1.getText().toString().length()!=0){k=1;}
                if(k==1){
                Calculate();
                if(editText1.getText().toString().isEmpty()) {
                }
                else{
                    Action=MULTIPLICATION;
                    textView1.setText(decimalFormat.format(valueOne)+'*');
                    editText1.setText(null);}
            }}
        });
        Button Button_divi = (Button) findViewById(R.id.divison);
        Button_divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int k=0;
                String st  =textView1.getText().toString();
                if(st.length()>0){
                    char c=st.charAt((st.length())-1);
                    Log.i(Activity.class.getName(), "this is  ");
                    if(c=='='||c=='+'||c=='-'||c=='*'||c=='/'){}
                    else{k=1;}}
                 if(st.length()==0){k=1;}
                 if(editText1.getText().toString().length()!=0){k=1;}
                if(k==1){
                Calculate();
                if(editText1.getText().toString().isEmpty()) {
                }
                else{
                    Action=DIVISION;
                    textView1.setText(decimalFormat.format(valueOne)+'/');
                    editText1.setText(null);}
            }}
        });
        Button button_equ = (Button)findViewById(R.id.button_equal);
        button_equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int k=0;
                String st  =textView1.getText().toString();
                if(st.length()>0){
                    char c=st.charAt((st.length())-1);
                    Log.i(Activity.class.getName(), "this is  ");
                    if(c=='='||c=='+'||c=='-'||c=='*'||c=='/'){}
                    else{k=1;}}
                 if(st.length()==0){k=1;}
                if(editText1.getText().toString().length()!=0){k=1;}
                if(k==1){
                if(!Double.isNaN(valueOne)){
                Calculate();
                if(editText1.getText().toString().isEmpty()) {
                }
                else{
                    textView1.setText(textView1.getText().toString()+decimalFormat.format(valueTwo)+"="+decimalFormat.format(valueOne));
                    editText1.setText(decimalFormat.format(valueOne));
                    valueOne=Double.NaN;
                    Action=0;}

            }}}
        });
        Button button_point=(Button)findViewById(R.id.button_dot);
        button_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editText1.getText().toString();
                if(s.indexOf('.')==-1){
                editText1.setText(s+".");}
            }
        });
    }

    public void Calculate(){
        if(!Double.isNaN(valueOne)){
            valueTwo=Double.parseDouble(editText1.getText().toString());
            if(Action==ADDITION){
                valueOne=this.valueOne+valueTwo;
            }
            else if(Action==SUBSTRACTION){
                valueOne=this.valueOne-valueTwo;
            }
            else if(Action==MULTIPLICATION){
                valueOne=this.valueOne*valueTwo;
            }
            else if(Action==DIVISION){
                valueOne=this.valueOne/valueTwo;
            }
        }
        else{try {
            if(editText1.getText().toString().isEmpty()||editText1.getText().toString().equals("+")||editText1.getText().toString().equals("-")){

            }
            else{
            valueOne=Double.parseDouble(editText1.getText().toString());}
        }
        catch (Exception e){}
        }
    }
}
