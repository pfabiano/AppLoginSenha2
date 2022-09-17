package com.example.apploginsenha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btLogin = (Button) findViewById(R.id.btLogin);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tLogin = (TextView) findViewById(R.id.tLogin);
                TextView tSenha = (TextView) findViewById(R.id.tSenha);
                String Login = tLogin.getText().toString();
                String Senha = tSenha.getText().toString();

                //Intent intentLoginCorreto = new Intent(getApplicationContext(), MainActivity2.class);

                /*EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
                intentLoginCorreto.putExtra(EXTRA_MESSAGE, message);

                 */
                //Intent intentLoginIncorreto = new Intent(getApplicationContext(), MainActivity3.class);

                if(Login.equals("Fabiano") || Senha.equals("1234")){

                    alert("Login e senha correto");
                }else {
                    alert("Login ou senha incorreto");
                }

            }
        });
    }
    private void alert(String s){
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}