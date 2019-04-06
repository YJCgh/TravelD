package com.example.traveld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editTextZhangHu;
    private EditText editTextMiMa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);

        editTextZhangHu = (EditText) findViewById(R.id.edit_zhanghu);
        editTextMiMa = (EditText) findViewById(R.id.edit_mima);


        Button logbutton = (Button) findViewById(R.id.loginButton);
        logbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.loginButton:
                String ZhanghuText = editTextZhangHu.getText().toString();
                String MimaText = editTextMiMa.getText().toString();
                if (ZhanghuText.equals("Travel") && MimaText.equals("123456")) {
                    /*Intent intent = new Intent(MainActivity.this,WorkActivity.class);
                    startActivity(intent);
                    finish();*/
                    Intent intent = new Intent("com.example.traveld.ACTION_START");
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "账户或密码错误", Toast.LENGTH_SHORT).show();

                }
        }
    }
}
