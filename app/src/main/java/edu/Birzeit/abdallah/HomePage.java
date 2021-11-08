package edu.Birzeit.abdallah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormatSymbols;
import java.util.ArrayList;

import edu.Birzeit.abdallah.models.TeamD;

public class HomePage extends AppCompatActivity {

    ListView listViewTeams;
    TeamD teamD = new TeamD();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        listViewTeams = findViewById(R.id.listViewTeams);

        Intent intent = getIntent();
        String msg = intent.getStringExtra("data");

        String[] teams = new String[]{
        };

        teams = teamD.getTeamsNames();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, teams
                );

        listViewTeams.setAdapter(arrayAdapter);
        listViewTeams.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    Intent intent = new Intent(view.getContext(), Palestine_teams.class);
                    startActivity(intent);
                }

                if(position == 1) {
                    Intent intent = new Intent(view.getContext(), Spain_teams.class);
                    startActivity(intent);
                }

                if(position == 2) {
                    Intent intent = new Intent(view.getContext(), England_teams.class);
                    startActivity(intent);
                }

                if(position == 3) {
                    Intent intent = new Intent(view.getContext(), Italy_teams.class);
                    startActivity(intent);
                }
            }
        });
    }
}