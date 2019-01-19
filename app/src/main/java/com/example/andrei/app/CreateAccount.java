package com.example.andrei.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateAccount extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText editUsername,editEmail,editPass,editConfPass;
    Button signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        myDb = new DatabaseHelper(this);
        editUsername = (EditText) findViewById(R.id.editUsername);
        editEmail = (EditText) findViewById(R.id.editEmail);
        editPass = (EditText) findViewById(R.id.editPass);
        editConfPass = (EditText) findViewById(R.id.editConfPass);
        signUp = (Button) findViewById(R.id.signUp);
        addData();
        //TODO: add hide keyboard event on project!
    }
    public void addData(){
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: validate text fields with proper requirements (pass contain @ and .)
                long idUSerAddedOnDatabase = myDb.insertUser(editUsername.getText().toString(),
                        editEmail.getText().toString(),
                        editPass.getText().toString());

/*
                UserModel existingUserOnDatabase = myDb.getUser(idUSerAddedOnDatabase);

                if (existingUserOnDatabase != null) {
                    Toast.makeText(CreateAccount.this, "Data Inserted", Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(CreateAccount.this,"Data NOT Inserted",Toast.LENGTH_LONG).show();
*/
            }
        });


    }

}
