package com.example.calculate;

import static com.example.calculate.R.id.btn_next;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Integer first, second;
    private Boolean isOperationClick;
    private String operation;
    private Integer result;
    private String text ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
        Log.d("koko", "onCreate: ");

        //обработка клика
        findViewById(btn_next).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("result",result.toString());
            startActivity(intent);

           // text = (String) ((TextView) findViewById(R.id.btn_equal)).getText().toString();

            //  finish();
        });
    }

    public void OnNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_one:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("1");
                }else{
                    textView.append("1");
                }
                break;

            case R.id.btn_two:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("2");
                }else{
                    textView.append("2");
                }
                break;


            case R.id.btn_three:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("3");
                }else{
                    textView.append("3");
                }
                break;

            case R.id.btn_four:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("4");
                }else{
                    textView.append("5");
                }
                break;

            case R.id.btn_five:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("5");
                }else{
                    textView.append("5");
                }
                break;

            case R.id.btn_six:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("6");
                }else{
                    textView.append("6");
                }
                break;

            case R.id.btn_seven:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("7");
                }else{
                    textView.append("7");
                }
                break;

            case R.id.btn_eight:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("8");
                }else{
                    textView.append("8");
                }
                break;

            case R.id.btn_nine:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("9");
                }else{
                    textView.append("9");
                }
                break;

            case R.id.btn_clear:
                textView.setText("0");
                first = 0;
                second = 0;
                break;

            case R.id.btn_zero:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("0");
                }else{
                    textView.append("0");
                }
                break;

            case R.id.btn_dot:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText(".");
                }else{
                    textView.append(".");
                }
                break;
        }
        isOperationClick = false;
    }

    public void onOperationClick(View view) {
        switch (view.getId()){
            case R.id.btn_plus:
                first = Integer.valueOf(textView.getText().toString());
                operation="+";
                break;

            case R.id.btn_minus:
                first = Integer.valueOf(textView.getText().toString());
                operation = "-";
                break;

            case R.id.btn_division:
                first = Integer.valueOf(textView.getText().toString());
                operation = "/";
                break;

            case R.id.btn_generation:
                first = Integer.valueOf(textView.getText().toString());
                operation = "*";
                break;

            case R.id.btn_equal:
                second = Integer.valueOf(textView.getText().toString());
                switch (operation){
                    case "+":
                        result = first+second;
                        textView.setText(result.toString());
                        break;
                    case "-":
                        result = first-second;
                        textView.setText(result.toString());
                        break;
                    case "/"  :
                        result= first / second;
                        textView.setText(result.toString());
                        break;
                    case "*":
                        result = first*second;
                        textView.setText(result.toString());
                        break;


                }




        }
        isOperationClick = true;
    }
}