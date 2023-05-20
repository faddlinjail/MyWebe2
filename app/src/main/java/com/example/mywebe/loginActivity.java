package com.example.mywebe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {

    private EditText email, pass, Passwordcok;
    private Button btnLogin;

    private String mail = " HERO";
    private String passwo="Deku";
    private String poswo= "Deku";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        Passwordcok= findViewById(R.id.PasswordCo);

        btnLogin =findViewById(R.id.button3);;

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mail = email.getText().toString();

                Intent menu = new Intent(loginActivity.this,MenuActivity.class);
                menu.putExtra("Hamba", email.getText().toString());
                startActivity(menu);
//                sendData();

            }
//            public void sendData() {
//                mail = email.getText().toString().trim();
//
//                Intent login = new Intent(loginActivity.this,MenuActivity.class);
//
//                login.putExtra(MenuActivity.Username, mail);
//
//                startActivity(login);
//            }
        });
    }
}