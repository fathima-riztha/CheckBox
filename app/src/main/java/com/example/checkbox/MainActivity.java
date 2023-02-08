package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox burger,submarine,shawarma;
    Button buttonOrder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }
    public void addListenerOnButtonClick(){
        burger=(CheckBox) findViewById(R.id.ch1);
        submarine=(CheckBox) findViewById(R.id.ch2);
        shawarma=(CheckBox) findViewById(R.id.ch3);
        buttonOrder=(Button) findViewById(R.id.button);

        buttonOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int totalamount=0;
                StringBuilder result=new StringBuilder();
                result.append("Selected Items:");
                if(burger.isChecked()){
                    result.append("\n Burger 1,000.00Rs");
                    totalamount+=1000;
                }
                if(submarine.isChecked()){
                    result.append("\n Submarine 1,190.00");
                    totalamount+=1190;
                }
                if(shawarma.isChecked()){
                    result.append("\n Submarine 1,220.00");
                    totalamount+=1220;
                }
                result.append("\nTotal: "+totalamount+"Rs");
                //Displaying the message on the toast
                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();

            }
        });
    }
}