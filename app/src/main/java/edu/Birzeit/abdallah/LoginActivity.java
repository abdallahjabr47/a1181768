package edu.Birzeit.abdallah;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    public static final String NAME = "NAME";
    public static final String PASS = "PASS";
    public static final String FLAG = "FLAG";

    private EditText editTextTextPassword;
    private EditText editTextTextPersonName2;
    private SharedPreferences shp;
    private SharedPreferences.Editor shpEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView textView2 = findViewById(R.id.textView2);
        Button button = findViewById(R.id.button);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);

    }

    private void setUpSharedPreferences() {
        shp = PreferenceManager.getDefaultSharedPreferences(this);
        shpEditor = shp.edit();
    }

    private void setUpViews() {
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);
    }

    private void checkPreferences() {
        boolean flag = shp.getBoolean(FLAG,false);

        if(flag) {
            String name = shp.getString(NAME,"");
            String pass = shp.getString(PASS,"");
            editTextTextPersonName2.setText(name);
            editTextTextPassword.setText(pass);
        }
    }

    public void onClickSend(View view) {

        Toast.makeText(this,"Successful ",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);

        
        String name = editTextTextPersonName2.getText().toString();
        String pass = editTextTextPassword.getText().toString();

        shpEditor.putString(NAME,name);
        shpEditor.putString(PASS,pass);
        shpEditor.commit();
    }
}