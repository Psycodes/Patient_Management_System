package www.psycodes.in.patient_manegement_system;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PatientDetails extends AppCompatActivity {
    FloatingActionButton addMedicineButton;
    ImageView backFromPatientDetails;

    TextView NAME;
    TextView First_Name;
    TextView Last_Name;
    TextView Landmark;
    TextView City;
    TextView Pincode;
    TextView Disease;
    TextView Symptom;

    String Fname;
    String Lname;
    String dob;
    String symptom;
    String disease;
    String landmark;
    String city;
    String pincode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_details);
        addMedicineButton = findViewById(R.id.search_medicine);
        backFromPatientDetails = findViewById(R.id.patient_details_back_button);

        NAME = findViewById(R.id.patient_name);
        First_Name = findViewById(R.id.patient_Fname);
        Last_Name = findViewById(R.id.patient_Lname);
        Landmark = findViewById(R.id.patient_landmark);
        City = findViewById(R.id.patient_city);
        Pincode = findViewById(R.id.patient_pincode);
        Disease = findViewById(R.id.patient_disease);
        Symptom = findViewById(R.id.patient_symptom);

        Intent intent = getIntent();
        Fname = intent.getStringExtra(AddPatient.EXTRA_TEXT);
        Lname = intent.getStringExtra(AddPatient.EXTRA_TEX1);
        symptom = intent.getStringExtra(AddPatient.EXTRA_TE2);
        disease = intent.getStringExtra(AddPatient.EXTRA_T3);
        landmark = intent.getStringExtra(AddPatient.EXTRA_4);
        city = intent.getStringExtra(AddPatient.EXTRA_EXT5);
        pincode = intent.getStringExtra(AddPatient.EXTRA_XT6);

        NAME.setText(Fname.toUpperCase());
        First_Name.setText(Fname.toUpperCase());
        Last_Name.setText(Lname.toUpperCase());
        Symptom.setText(symptom);
        Landmark.setText(landmark.toUpperCase());
        City.setText(city.toUpperCase());
        Pincode.setText(pincode);
        Disease.setText(disease);

    }
    public void searchMedicine(View view) {
                startActivity(new Intent(PatientDetails.this,SearchMedicine.class));
    }
    public void backFromPatientDetails(View view) {
                startActivity(new Intent(PatientDetails.this,HomePage.class));
    }
}
