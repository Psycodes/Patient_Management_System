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

    public   final static String EXTRA_TEXT="WWW.PSYCODES.IN";
    public   final static String EXTRA_TEX1="WWW.PSYCODES.IN1";
    public   final static String EXTRA_TE2="WWW.PSYCODES.IN2";
    public   final static String EXTRA_T3="WWW.PSYCODES.IN3";
    public   final static String EXTRA_4="WWW.PSYCODES.IN4";
    public   final static String EXTRA_EXT5="WWW.PSYCODES.IN5";
    public   final static String EXTRA_XT6="WWW.PSYCODES.IN6";

import android.widget.ImageView;
import android.widget.Toast;

public class AddPatient extends AppCompatActivity {
   ImageView addPatientDoneButton;
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
                if(Fname.trim().length() != 0 && disease.trim().length()!= 0 ){
                   Toast.makeText(AddPatient.this, "Patient Added Successfully", Toast.LENGTH_SHORT).show();
                   Intent intent= new Intent(AddPatient.this,PatientDetails.class);
                    intent.putExtra(EXTRA_TEXT,Fname);
                    intent.putExtra(EXTRA_TEX1,Lname);
                    intent.putExtra(EXTRA_TE2,symptom);
                    intent.putExtra(EXTRA_T3,disease);
                    intent.putExtra(EXTRA_4,landmark);
                    intent.putExtra(EXTRA_EXT5,city);
                    intent.putExtra(EXTRA_XT6,pincode);
                   startActivity(intent);
                }
            }

        });
    }

    private void data() {
        Fname = First_Name.getText().toString();
        Lname = Last_Name.getText().toString();
        dob = Dob.getText().toString().trim();
        symptom = Symptom.getText().toString();
        disease = Disease.getText().toString();
        landmark = Landmark.getText().toString();
        city = City.getText().toString();
        pincode = Pincode.getText().toString();
    }

}
