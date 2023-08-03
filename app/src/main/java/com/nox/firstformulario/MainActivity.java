package com.nox.firstformulario;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.Nombre);
        EditText address = findViewById(R.id.Direccion);
        EditText phone = findViewById(R.id.Phone);
        EditText email = findViewById(R.id.Email);
        Button buttonSubmit = findViewById(R.id.buttonSubmit);


        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = "Nombre: "+ name.getText().toString() + "\n" +
                        "Address: " + address.getText().toString() + "\n"+
                        "Phone: "+ phone.getText().toString()+"\n"+
                        "Email: "+email.getText().toString();
                Toast.makeText(MainActivity.this,message,Toast.LENGTH_SHORT).show();
            }
        });



    }
}