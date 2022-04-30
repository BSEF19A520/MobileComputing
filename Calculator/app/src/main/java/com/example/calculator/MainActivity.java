package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    int num,num2=0;

    String operation;
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.textView);
    }

    public void three(View view) {
        String s = txt.getText().toString();
        s = s+"3";
        txt.setText(s);
    }

    public void one(View view) {
        String s = txt.getText().toString();
        s = s+"1";
        txt.setText(s);
    }
    public void two(View view) {
        String s = txt.getText().toString();
        s =s+"2";
        txt.setText(s);
    }

    public void five(View view) {
        String s = txt.getText().toString();
        s =s+"5";
        txt.setText(s);
    }

    public void four(View view) {
        String s = txt.getText().toString();
        s =s+"4";
        txt.setText(s);
    }

    public void six(View view) {
        String s = txt.getText().toString();
        s =s+"6";
        txt.setText(s);
    }

    public void seven(View view) {
        String s = txt.getText().toString();
        s =s+"7";
        txt.setText(s);
    }

    public void eight(View view) {
        String s = txt.getText().toString();
        s =s+"8";
        txt.setText(s);
    }

    public void nine(View view) {
        String s = txt.getText().toString();
        s =s+"9";
        txt.setText(s);
    }

    public void zero(View view) {
        String s = txt.getText().toString();
        s =s+"0";
        txt.setText(s);
    }

    public void plus(View view) {
        String s = txt.getText().toString();
        s =s+"+";
        txt.setText(s);
    }

    public void minus(View view) {
        String s = txt.getText().toString();
        s =s+"-";
        txt.setText(s);
    }

    public void mul(View view) {
        String s = txt.getText().toString();
        s =s+"*";
        txt.setText(s);
    }

    public void divide(View view) {
        String s = txt.getText().toString();
        s =s+"/";
        txt.setText(s);
    }

    @SuppressLint("SetTextI18n")
    public void equal(View view) {
        String s = txt.getText().toString();
        if(s.length()>0)
        {
            StringBuilder numb= new StringBuilder();
            for(int i = 0;i<s.length();i++)
            {
                if(s.charAt(i)>='0' && s.charAt(i)<='9')
                {
                    String o = Character.toString(s.charAt(i));
                    numb.append(o);
                }
                else if(s.charAt(i)=='+' ||s.charAt(i)=='-' ||s.charAt(i)=='*' ||s.charAt(i)=='/' || s.charAt(i)=='%')
                {
                    operation = Character.toString(s.charAt(i));
                    index = i;
                    break;
                }
            }
            num = Integer.parseInt(numb.toString());
            numb = new StringBuilder();
            for(int i = index;i<s.length();i++)
            {
                if(s.charAt(i)>='0' && s.charAt(i)<='9')
                {
                    String o = Character.toString(s.charAt(i));
                    numb.append(o);
                }

            }
            num2 = Integer.parseInt(numb.toString());
            if(operation.equals("+"))
            {
                num = num + num2;
                txt.setText(Integer.toString(num));
            }
            else if(operation.equals("/"))
            {
                double d = (double)num/(double)num2;
                txt.setText(Double.toString(d));
            }
            else if(operation.equals("-"))
            {
                num = num - num2;
                txt.setText(Integer.toString(num));
            }
            else if(operation.equals("*"))
            {
                num = num * num2;
                txt.setText(Integer.toString(num));
            }
            else if(operation.equals("%"))
            {
                double d = num* 0.01;
                txt.setText(Double.toString(d));

            }
        }

    }

    public void backspace(View view) {
        String s = (String) txt.getText();
        String numb = new String();
        for(int i = 0;i<s.length()-1;i++)
        {

            String o = Character.toString(s.charAt(i));
            numb = numb + o;

        }
        txt.setText(numb);

    }

    public void clear(View view) {
        txt.setText("");
    }

    public void percent(View view) {
        String s = txt.getText().toString();
        s =s+"%";
        txt.setText(s);

    }
}