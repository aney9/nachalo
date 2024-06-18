package com.example.pract1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText loginInput, passwordInput;
    private AppCompatButton loginbtn;
    private TextView vieww;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vieww = findViewById(R.id.view);
        loginInput = findViewById(R.id.login_input);
        passwordInput = findViewById(R.id.password_input);
        loginbtn = findViewById(R.id.login_btn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login = loginInput.getText().toString();
                String password = passwordInput.getText().toString();

                if (!login.isEmpty() && !password.isEmpty()) {
                    Intent intent = new Intent(MainActivity.this, Profile.class);
                    intent.putExtra("login", login);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Поля не должны быть пустыми", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}