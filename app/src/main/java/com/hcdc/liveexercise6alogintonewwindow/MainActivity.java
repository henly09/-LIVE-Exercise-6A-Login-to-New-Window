package com.hcdc.liveexercise6alogintonewwindow;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user,pass;
    Button loginbuttonmain;
    Spinner position;

   /* String[] useracc = {"henz","dong","qwerty"};
    String[] passacc = {"awtsgege","123123","gege"};
    String[] positionacc = {"Admin","Staff","Client"};*/

    /* String[][][] useracc3d = {{{"henz","awtsgege","Admin"}},{{"dong","123123","Staff"}},{{"qwerty","gege","Client"}}}; */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

         String[] useracc = getResources().getStringArray(R.array.usernameArray);
         String[] passacc = getResources().getStringArray(R.array.passwordArray);
         String[] positionacc = getResources().getStringArray(R.array.positionArray);

        user = findViewById(R.id.username);
        pass = findViewById(R.id.password);
        loginbuttonmain = findViewById(R.id.loginbutton);
        position = findViewById(R.id.SpinnerPosition);

        loginbuttonmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for(int i = 0; i < useracc.length; i++) {
                    if (useracc[i].equals(user.getText().toString()) && passacc[i].equals(pass.getText().toString()) && positionacc[i].equals(position.getSelectedItem().toString())) {
                        login(user.getText().toString(),position.getSelectedItem().toString());
                        break;
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                    }
                }

              /*  if (user.getText().toString().equals(useracc[0]) && pass.getText().toString().equals(passacc[0]) && position.getSelectedItem().toString().equals(positionacc[0])){
                        login(user.getText().toString(),position.getSelectedItem().toString());
                }
                else if (user.getText().toString().equals(useracc[1]) && pass.getText().toString().equals(passacc[1]) && position.getSelectedItem().toString().equals(positionacc[1])){
                        login(user.getText().toString(),position.getSelectedItem().toString());
                }
                else if (user.getText().toString().equals(useracc[2]) && pass.getText().toString().equals(passacc[2]) && position.getSelectedItem().toString().equals(positionacc[2])){
                        login(user.getText().toString(),position.getSelectedItem().toString());
                }
                else {
                    Toast.makeText(MainActivity.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                }*/
            }
        });

    }

    public void login(String username, String position){

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("username", username);
        intent.putExtra("position", position);
        startActivity(intent);
        Toast.makeText(this, "Login Successfully!", Toast.LENGTH_SHORT).show();

    }
}