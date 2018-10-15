package www.psycodes.in.patient_manegement_system;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PatientDetails extends AppCompatActivity {
    FloatingActionButton addMedicineButton;
    ImageView backFromPatientDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_details);
        addMedicineButton=findViewById(R.id.search_medicine);
        backFromPatientDetails=findViewById(R.id.patient_details_back_button);
    }

    public void searchMedicine(View view) {
        addMedicineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PatientDetails.this,SearchMedicine.class));
            }
        });
    }

    public void backFromPatientDetails(View view) {
        backFromPatientDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PatientDetails.this,HomePage.class));
            }
        });
    }
}
