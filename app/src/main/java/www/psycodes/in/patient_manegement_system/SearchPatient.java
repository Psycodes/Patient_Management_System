package www.psycodes.in.patient_manegement_system;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SearchPatient extends AppCompatActivity {
    FloatingActionButton addPatientlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_patient);
        addPatientlist = findViewById(R.id.add_patient_list);
    }
    public void addPatientFromList(View view) {
                startActivity(new Intent(SearchPatient.this, PatientDetails.class));
    }
}

