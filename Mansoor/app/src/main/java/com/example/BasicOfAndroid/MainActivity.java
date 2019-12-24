package com.example.BasicOfAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mButton=findViewById(R.id.login);
//        mButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                clickFunction(mButton);
//            }
//        });
    }

    public void clickFunction(View view) {

        //now we will return the string text from the text view
        // firt we have to creat a EditText variable

        EditText myName=(EditText) findViewById(R.id.name_view);
        String name=myName.getText().toString();
        //now we can show to the logcat through the log.d() function and also through the Toast function
        Log.d("Name:","Your Name is : "+name);
        Toast.makeText(this,"You enter :"+name,Toast.LENGTH_SHORT).show();


        //now we show the password on the logcat
        EditText myPassword=findViewById(R.id.password_view);
        String password=myPassword.getText().toString();
        Log.d("Password","Your password is:"+password);




       /* These the different message function we can show to the user on the logcat
       Log.d("LogD","This is the log.d() function.");
        Log.i("LogI","This is the log.i() function.");
        Log.e("LogE","This is the log.e() function.");
        Toast.makeText(this,"This will not login",Toast.LENGTH_SHORT).show();*/
    }

    public void registerHere(View view)
    {
        Intent intent=new Intent(this,Registration.class);
        finish();
        startActivity(intent);
    }


    //now we will create seelogo function here to jump to the logo activity
    public void seeLogo(View view){
        Intent myIntent=new Intent(MainActivity.this,SeeLogo.class);
        finish();
        startActivity(myIntent);
    }
}
