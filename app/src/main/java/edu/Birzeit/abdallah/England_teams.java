package edu.Birzeit.abdallah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import edu.Birzeit.abdallah.Teams.ArsenalActivity;
import edu.Birzeit.abdallah.Teams.BalataActivity;

public class England_teams extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_england_teams);
        Spinner spinner = findViewById(R.id.spinner);

        ArrayList<String> categories = new ArrayList<>();
        categories.add("Man City");
        categories.add("Arsenal");

        ArrayAdapter<String> dataAdapter;
        dataAdapter = new ArrayAdapter(England_teams.this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(England_teams.this, "the selected time is "+parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();

                if(parent.getItemAtPosition(position).equals("Arsenal")) {
                    Intent intent = new Intent(England_teams.this, edu.Birzeit.abdallah.Teams.ArsenalActivity.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}