package com.example.drawernavigation;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Calculator extends MainActivity implements View.OnClickListener {

    // define views for Txt
    EditText first_txt;
    EditText second_txt;
    TextView result;

    // define views for button
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button clear;
    Button delete;

    // define views for arithmetic operation
    Button plus;
    Button subtraction;
    Button multiply;
    Button divide;
    Button dot;
    Button equal;

    Boolean variable = false;
    Boolean opPressed = false;
    String operator = "";
    String var;
    int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_calculator);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //inflate your activity layout here!
        View contentView = inflater.inflate(R.layout.activity_calculator, null, false);
        drawerLayout.addView(contentView, 0);

        // connect txt views in java
        first_txt = findViewById(R.id.first_txt);
        second_txt = findViewById(R.id.second_txt);
        result = findViewById(R.id.result);

        // connect button views in java
        one = findViewById(R.id.btn_one);
        two = findViewById(R.id.btn_two);
        three = findViewById(R.id.btn_three);
        four = findViewById(R.id.btn_four);
        five = findViewById(R.id.btn_five);
        six = findViewById(R.id.btn_six);
        seven = findViewById(R.id.btn_seven);
        eight = findViewById(R.id.btn_eight);
        nine = findViewById(R.id.btn_nine);
        zero = findViewById(R.id.btn_zero);

        // connect arithmetic operation vies in java
        dot = findViewById(R.id.btn_dot);
        equal = findViewById(R.id.btn_equal);
        clear = findViewById(R.id.btn_clear);
        delete = findViewById(R.id.btn_delete);

        divide = findViewById(R.id.btn_divide);
        multiply = findViewById(R.id.btn_multiply);
        plus = findViewById(R.id.btn_plus);
        subtraction = findViewById(R.id.btn_subtraction);

        // click method for all buttons
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        first_txt.setOnClickListener(this);
        second_txt.setOnClickListener(this);

        dot.setOnClickListener(this);
        equal.setOnClickListener(this);

        divide.setOnClickListener(this);
        multiply.setOnClickListener(this);
        plus.setOnClickListener(this);
        subtraction.setOnClickListener(this);

        clear.setOnClickListener(this);
        delete.setOnClickListener(this);

        colors = new int[]{Color.BLUE, Color.CYAN, Color.DKGRAY, Color.GRAY, Color.GREEN, Color.LTGRAY, Color.MAGENTA};


    }

    @Override
    public void onClick(View v) {
        v.getId();
        switch (v.getId()) {
            case R.id.first_txt: {
                variable = true;
                operator = "first_txt_dell";
            }
            break;
            case R.id.second_txt: {

                variable = false;
                operator = "second_txt_dell";
            }
            break;
            case R.id.btn_one: {
                if (variable == true) {
                    var = first_txt.getText().toString();
                    first_txt.setText(var + "1");
                }
                if (variable == false) {
                    var = second_txt.getText().toString();
                    second_txt.setText(var + "1");
                }

            }
            break;
            case R.id.btn_two: {

                if (variable == true) {
                    var = first_txt.getText().toString();
                    first_txt.setText(var + "2");
                }
                if (variable == false) {
                    var = second_txt.getText().toString();
                    second_txt.setText(var + "2");
                }
            }
            break;
            case R.id.btn_three: {
                if (variable == true) {
                    var = first_txt.getText().toString();
                    first_txt.setText(var + "3");
                }
                if (variable == false) {
                    var = second_txt.getText().toString();
                    second_txt.setText(var + "3");
                }
            }
            break;
            case R.id.btn_four: {
                if (variable == true) {
                    var = first_txt.getText().toString();
                    first_txt.setText(var + "4");
                }
                if (variable == false) {
                    var = second_txt.getText().toString();
                    second_txt.setText(var + "4");
                }
            }
            break;
            case R.id.btn_five: {
                if (variable == true) {
                    var = first_txt.getText().toString();
                    first_txt.setText(var + "5");
                }
                if (variable == false) {
                    var = second_txt.getText().toString();
                    second_txt.setText(var + "5");
                }
            }
            break;
            case R.id.btn_six: {
                if (variable == true) {
                    var = first_txt.getText().toString();
                    first_txt.setText(var + "6");
                }
                if (variable == false) {
                    var = second_txt.getText().toString();
                    second_txt.setText(var + "6");
                }
            }
            break;
            case R.id.btn_seven: {
                if (variable == true) {
                    var = first_txt.getText().toString();
                    first_txt.setText(var + "7");
                }
                if (variable == false) {
                    var = second_txt.getText().toString();
                    second_txt.setText(var + "7");
                }
            }
            break;
            case R.id.btn_eight: {
                if (variable == true) {
                    var = first_txt.getText().toString();
                    first_txt.setText(var + "8");
                }
                if (variable == false) {
                    var = second_txt.getText().toString();
                    second_txt.setText(var + "8");
                }
            }
            break;
            case R.id.btn_nine: {
                if (variable == true) {
                    var = first_txt.getText().toString();
                    first_txt.setText(var + "9");
                }
                if (variable == false) {
                    var = second_txt.getText().toString();
                    second_txt.setText(var + "9");
                }
            }
            break;
            case R.id.btn_zero: {
                if (variable == true) {
                    var = first_txt.getText().toString();
                    first_txt.setText(var + "0");
                }
                if (variable == false) {
                    var = second_txt.getText().toString();
                    second_txt.setText(var + "0");
                }
            }
            break;
            case R.id.btn_divide: {

                operator = "/";
            }
            break;
            case R.id.btn_multiply: {

                operator = "*";
            }
            break;
            case R.id.btn_plus: {

                operator = "+";
            }
            break;
            case R.id.btn_subtraction: {

                operator = "-";
            }
            break;
            case R.id.btn_dot: {
                first_txt.append(".");
            }
            break;
            case R.id.btn_equal: {

                int length = colors.length;
                // create random class that will help us to create color
                Random random = new Random();
                // now we creating int number that will get all color in int values
                int randomNumber = random.nextInt(length);
                // that our final step
                result.setBackgroundColor(colors[randomNumber]);

                switch (operator) {
                    case "+": {
                        calculator("+");
                    }
                    break;
                    case "-": {
                        calculator("-");
                    }
                    break;
                    case "*": {
                        calculator("*");
                    }
                    break;
                    case "/": {
                        calculator("/");
                    }
                    break;

                    default:
                        break;
                }


            }
            break;

            case R.id.btn_clear: {

                first_txt.setText("");
                second_txt.setText("");
                result.setText("");

            }
            break;
            case R.id.btn_delete: {

                switch (operator) {
                    case "first_txt_dell": {

                        String var1 = first_txt.getText().toString();
                        int length1 = var1.length();
                        if (length1 > 0) {
                            var1 = var1.substring(0, length1 - 1);
                            first_txt.setText(var1);

                        }
                    }
                    break;
                    case "second_txt_dell": {

                        String var2 = second_txt.getText().toString();
                        int length2 = var2.length();
                        if (length2 > 0) {
                            var2 = var2.substring(0, length2 - 1);
                            second_txt.setText(var2);
                        }
                    }
                    break;

                    default:
                        break;
                }
            }
            break;

            default:
                break;
        }

    }

    public void calculator(String symbol) {

        // here we r actually getting values from our txt_fields
        String numberone = first_txt.getText().toString();
        int firstnumber = Integer.parseInt(numberone);
        String numbertwo = second_txt.getText().toString();
        int secondnumber = Integer.parseInt(numbertwo);


        switch (symbol) {

            case "+":

                int resultans = firstnumber + secondnumber;
                result.setText(String.valueOf(resultans));


                break;
            case "-":

                resultans = firstnumber - secondnumber;
                result.setText(String.valueOf(resultans));


                break;
            case "*":

                resultans = firstnumber * secondnumber;
                result.setText(String.valueOf(resultans));


                break;
            case "/":

                resultans = firstnumber / secondnumber;
                result.setText(String.valueOf(resultans));
                break;

            default:
                break;

        }

    }
}