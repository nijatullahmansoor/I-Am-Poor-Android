package com.example.BasicOfAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

    }

    public void registerData(View view){

        //first we are creating a variables to hold the enter data by the user
        EditText myName=findViewById(R.id.name_register_view);
        EditText myPassword=findViewById(R.id.password_register_view);
        EditText myPhoneNumber=findViewById(R.id.phone_number);
        EditText myEmail=findViewById(R.id.email_view);

        //now we are simply displying the data to the logcat.
        Log.d("reg-Name:",myName.getText().toString());
        Log.d("reg-Password:",myPassword.getText().toString());
        Log.d("reg-Phone :",myPhoneNumber.getText().toString());
        Log.d("reg-Email:",myEmail.getText().toString());

        //here we are calling back to the returnToMainActivity
        returnToMainActivity();


    }

    //this function to go back to main activity
    public void returnToMainActivity()
    {
        Intent intent=new Intent(this,MainActivity.class);
        finish();
        startActivity(intent);
    }


}
