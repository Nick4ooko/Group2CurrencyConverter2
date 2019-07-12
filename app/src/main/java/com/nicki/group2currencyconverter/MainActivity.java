package com.nicki.group2currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView myTextView;
    private EditText myEditText;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView myTextview = (TextView) findViewById(R.id.tv_1_id);
        final EditText myEditText = (EditText) findViewById(R.id.et_2_id);
        final Button button1 = (Button) findViewById(R.id.bt_dollarstoshilling_id);
       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Double dollartoshilling =Double.parseDouble(myEditText.getText().toString());
               Double shillings =dollartoshilling *100;

               myTextview.setText(shillings +"");
           }
       });
        final Button button2 = (Button) findViewById(R.id.bt_shillingtodollar);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double shillingtodollar =Double.parseDouble(myEditText.getText().toString());
                Double dollar=shillingtodollar /100;

                myTextview.setText(dollar  +"");
            }
        });

        final Button button3 = (Button) findViewById(R.id.bt_eurotoshilling_id);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double eurotoshilling =Double.parseDouble(myEditText.getText().toString());
                Double euro=eurotoshilling * 115.87;

                myTextview.setText(euro +"");
            }
        });

        final Button button4 = (Button) findViewById(R.id.bt_shillingtoeuro_id);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double shillingtoeuro =Double.parseDouble(myEditText.getText().toString());
                Double euro=shillingtoeuro /115.87;

                myTextview.setText(euro +"");
            }
        });
        final Button button5 = (Button) findViewById(R.id.bt_dollartoeuro);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double dollartoeuro =Double.parseDouble(myEditText.getText().toString());
                Double dollar=dollartoeuro /1.13;

                myTextview.setText(dollar  +"");
            }
        });



    }







}





