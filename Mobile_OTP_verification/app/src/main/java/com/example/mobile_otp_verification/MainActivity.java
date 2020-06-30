package com.example.mobile_otp_verification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mob_no;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mob_no = (EditText) findViewById(R.id.editTextPhone);
        submit = (Button) findViewById(R.id.button);
        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String phoneNo = mob_no.getText().toString();

        Intent intent = new Intent(getApplicationContext(),VerifyPhone.class);
        intent.putExtra("phoneNo",phoneNo);
        startActivity(intent);

    }
}