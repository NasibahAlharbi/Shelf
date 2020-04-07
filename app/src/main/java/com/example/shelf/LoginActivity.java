package com.example.shelf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    Button L_login_button;
    EditText L_Email_txt;
    EditText L_password_txt;
    ImageView L_shelf_image;
    TextView L_gotoSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState); // load the layout
       setContentView(R.layout.activity_login);

        L_login_button = (Button) findViewById(R.id.login_button);
        L_Email_txt = (EditText) findViewById(R.id.email_txt);
        L_password_txt = (EditText) findViewById(R.id.password_txt);
        L_shelf_image = (ImageView) findViewById(R.id.shelf_image);
        L_gotoSignup = (TextView) findViewById(R.id.gotoSignup);
        L_gotoSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent SingUpIntent = new Intent(LoginActivity.this,SingUpActivity.class);
                 startActivity(SingUpIntent);
            }
        });
    }




}