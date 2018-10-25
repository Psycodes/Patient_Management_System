package www.psycodes.in.patient_manegement_system;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddPatient extends AppCompatActivity {
    Button addPatientDoneButton;

    EditText First_Name;
    EditText Last_Name;
    EditText Dob;
    EditText Landmark;
    EditText City;
    EditText Pincode;
    EditText Disease;
    EditText Symptom;

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
        setContentView(R.layout.activity_add_patient);
        addPatientDoneButton=findViewById(R.id.add_patient_add_button);

        First_Name = findViewById(R.id.add_patient_first_name);
        Last_Name = findViewById(R.id.add_patient_last_name);
        Dob  = findViewById(R.id.add_patient_dob);
        Landmark = findViewById(R.id.add_patient_landmark);
        City = findViewById(R.id.add_patient_city);
        Pincode = findViewById(R.id.add_patient_pincode);
        Disease = findViewById(R.id.add_patient_disease);
        Symptom = findViewById(R.id.add_patient_symptom);



        addPatientDoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data();
                if(Fname.length() != 0 && Disease.length()!= 0 ){
                    Toast.makeText(AddPatient.this, "Patient Added Successfully", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(AddPatient.this,PatientDetails.class));
                }
            }

        });
    }

    private void data() {
        Fname = First_Name.getText().toString().trim();
        Lname = Last_Name.getText().toString().trim();
        dob = Dob.getText().toString().trim();
        symptom = Symptom.getText().toString().trim();
        disease = Disease.getText().toString().trim();
        landmark = Landmark.getText().toString().trim();
        city = City.getText().toString().trim();
        pincode = Pincode.getText().toString().trim();
    }

}
