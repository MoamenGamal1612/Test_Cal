package com.example.test_cal;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int num1 = 0, num2 = 0, num4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txv_1 = findViewById(R.id.txv_1);


        EditText txe_1 = findViewById(R.id.txe_1);
        EditText txe_2 = findViewById(R.id.txe_2);
        EditText txe_3 = findViewById(R.id.txe_3);


        findViewById(R.id.btn_1).setOnClickListener(v -> {


            num1 = Integer.parseInt(txe_1.getText().toString());
            num2 = Integer.parseInt(txe_2.getText().toString());
            num4 = Integer.parseInt(txe_3.getText().toString());

            int num3 = num1 + num2;
            txv_1.setText(String.valueOf(num3));
            if (num1 == 0 || num2 == 0) {
                if (num3 == num4) {
                    Toast.makeText(this, "You are Good", Toast.LENGTH_SHORT).show();
                    Toast.makeText(this, "ThQ to Calculate with us ", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(this, "The Same result" + num3, Toast.LENGTH_SHORT).show();
            } else {
                if (num3 == num4) {
                    Toast.makeText(this, "You are Good", Toast.LENGTH_SHORT).show();
                    Toast.makeText(this, "ThQ to Calculate with us ", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(this, "Are You Sure!! Try again ", Toast.LENGTH_SHORT).show();
                txe_3.requestFocus();
            }
        });

        findViewById(R.id.btn_2).setOnClickListener(v -> {
            int num1, num2;
            num1 = Integer.parseInt(txe_1.getText().toString());
            num2 = Integer.parseInt(txe_2.getText().toString());
            num4 = Integer.parseInt(txe_3.getText().toString());
            int num3 = num1 - num2;
            txv_1.setText(String.valueOf(num3));
            if (num1 == 0) {
                if (num3 == num4) {
                    Toast.makeText(this, "This Number is minus", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Are You Sure!! Try again ", Toast.LENGTH_SHORT).show();
                    txe_3.requestFocus();
                }


            } else if (num2 == 0) {
                if (num3 == num4) {
                    Toast.makeText(this, "ThQ to Calculate with us", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Are You Sure!! Try again ", Toast.LENGTH_SHORT).show();
                    txe_3.requestFocus();
                }

            } else {
                if (num3 == num4) {
                    Toast.makeText(this, "ThQ to Calculate with us", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Are You Sure!! Try again ", Toast.LENGTH_SHORT).show();
                    txe_3.requestFocus();
                }
            }


        });


        findViewById(R.id.btn_3).setOnClickListener(v -> {
            int num1, num2, num4;
            num1 = Integer.parseInt(txe_1.getText().toString());
            num2 = Integer.parseInt(txe_2.getText().toString());
            num4 = Integer.parseInt(txe_3.getText().toString());
            int num3 = num1 * num2;
            txv_1.setText(String.valueOf(num3));
            if (num4 == num3) {
                Toast.makeText(this, "ThQ to Calculate with us ", Toast.LENGTH_SHORT).show();

            } else {
                Toast.makeText(this, "Are You Sure!! Try again ", Toast.LENGTH_SHORT).show();
                txe_3.requestFocus();
            }


        });

        findViewById(R.id.btn_4).setOnClickListener(v -> {

//            if (txe_1.getText().toString().trim().equals("0")) {
//                Toast.makeText(MainActivity.this, "0", Toast.LENGTH_SHORT).show();
//
//            }
            //else
            {

                if (txe_1.getText().toString().trim().isEmpty()) {
                    Toast.makeText(this, "Please enter number 1", Toast.LENGTH_SHORT).show();
                    txe_1.requestFocus();
                } else if (txe_2.getText().toString().trim().isEmpty()) {
                    Toast.makeText(this, "Please enter number 2", Toast.LENGTH_SHORT).show();
                    txe_2.requestFocus();

                } else {
                    int num1, num2;
                    num1 = Integer.parseInt(txe_1.getText().toString());
                    num2 = Integer.parseInt(txe_2.getText().toString());
                    int num3 = num1 / num2;
                    txv_1.setText(String.valueOf(num3));
                    if (num3 == num4) {
                        Toast.makeText(this, "ThQ to Calculate with us ", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "Are You Sure!! Try again ", Toast.LENGTH_SHORT).show();
                        txe_3.requestFocus();
                    }

                }

            }


        });


    }

}