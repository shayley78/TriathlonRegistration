package net.androidbootcamp.triathlonregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    int costPerAthlete = 725;
    int numberOfAthletes;
    double totalCost;
    String locationChoice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText athletes = (EditText)findViewById(R.id.txtAthletes);
        final Spinner location = (Spinner)findViewById(R.id.txtLocation);
        Button cost = (Button)findViewById(R.id.btnCost);
        cost.setOnClickListener(new View.OnClickListener() {
            final TextView result = ((TextView)findViewById(R.id.txtResult));
            public void onClick(View v) {
                numberOfAthletes = Integer.parseInt(athletes.getText().toString());
                totalCost = costPerAthlete * numberOfAthletes;
                DecimalFormat currency = new DecimalFormat("$###,###");
                locationChoice = location.getSelectedItem().toString();
                result.setText(locationChoice + " race team fee is " + currency.format(totalCost));
            }
        });
    }
}
