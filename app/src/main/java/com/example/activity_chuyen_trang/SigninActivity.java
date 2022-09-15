package com.example.activity_chuyen_trang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SigninActivity extends AppCompatActivity {
    private Button btn_sign_in;
    private EditText editName;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        btn_sign_in = findViewById(R.id.btn_sign_in);
        editName = findViewById(R.id.edit_Name);
        btn_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strName = editName.getText().toString().trim();
                Intent intent = new Intent(SigninActivity.this, LoginActivity.class);
                intent.putExtra(  "key_name", strName);

                startActivity(intent);

            }
        });
    }
}
