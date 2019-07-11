package ru.svd.personalfinancehelper.Login;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import ru.svd.personalfinancehelper.Finance.application.FinanceActivity;
import ru.svd.personalfinancehelper.R;

public class LoginActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button = findViewById(R.id.btnLogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button btn = findViewById(R.id.btnLogin);
                Intent intent = new Intent(LoginActivity.this, FinanceActivity.class);
                startActivity(intent);
            }
        });

        
    }



}
