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
        editUsername = {EditText} findViewById(R.id.editUsername);
        editEmail = {EditText} findViewById(R.id.editEmail);
        editPass = {EditText} findViewById(R.id.editPass);
        editConfPass = {EditText} findViewById(R.id.editConfPass);
        signUp = (Button) findViewById(R.id.signUp);
        addData();
    }
    public void addData(){
        signUp.setOnClickListener(){
            new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    boolean isInserted = myDb.insertData(editUsername.getText().toString(),
                            editEmail.getText().toString(),
                            editPass.getText().toString());
                    if(isInserted =true)
                        Toast.makeText(CreateAccount.this,"Data Inserted",Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(CreateAccount.this,"Data NOT Inserted",Toast.LENGTH_LONG).show();
                }
            }
        }
    }

}
