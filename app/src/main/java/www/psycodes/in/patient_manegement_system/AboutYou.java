package www.psycodes.in.patient_manegement_system;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class  AboutYou extends AppCompatActivity {
    Button aboutYouNext;

    EditText First_Name;
    EditText Last_Name;
    EditText Dob;
    EditText Specialization;
    EditText Hospital;
    EditText Landmark;
    EditText City;
    EditText Pincode;

    String Fname;
    String Lname;
    String dob;
    String Spec;
    String hospital;
    String landmark;
    String city;
    String pincode;
    String text;

    int flag=0;

    private static final String FILE_NAME = "DOCTOR_INFO.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_you);

        aboutYouNext = findViewById(R.id.about_you_next_button);
        First_Name = findViewById(R.id.about_you_first_name);
        Last_Name = findViewById(R.id.about_you_last_name);
        Dob  = findViewById(R.id.about_you_dob);
        Specialization =findViewById(R.id.about_you_specialization);
        Hospital = findViewById(R.id.about_you_hospital_name);
        Landmark = findViewById(R.id.about_you_land_mark);
        City = findViewById(R.id.about_you_city);
        Pincode = findViewById(R.id.about_you_pincode);

        aboutYouNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data();
                if(Fname.length() != 0 && hospital.length() != 0 && city.length() != 0 && pincode.length() != 0 ){
                startActivity(new Intent(AboutYou.this,HomePage.class));
                }
            }
        });
    }

    private void data() {
        Fname = First_Name.getText().toString();
        Lname = Last_Name.getText().toString();
        dob = Dob.getText().toString();
        Spec = Specialization.getText().toString();
        hospital = Hospital.getText().toString();
        landmark = Landmark.getText().toString();
        city = City.getText().toString();
        pincode = Pincode.getText().toString();

        text = "       ABOUT_YOU          \n---------------------------------\nFIRST NAME:"+ Arrays.toString(Fname.toUpperCase().getBytes()) +"\nLAST NAME:"+ Arrays.toString(Lname.toUpperCase().getBytes()) + "\nDATE-OF-BIRTH:"+ Arrays.toString(dob.toUpperCase().getBytes()) +"\n"+
               "SPECIALIZATION:"+ Arrays.toString(Spec.toUpperCase().getBytes()) +"\nHOSPITAL:"+ Arrays.toString(hospital.toUpperCase().getBytes()) + "\nLANDMARK:"+ Arrays.toString(landmark.toUpperCase().getBytes()) +"\n"+
               "CITY:"+ Arrays.toString(city.toUpperCase().getBytes()) +"\nPINCODE:"+ Arrays.toString(pincode.toUpperCase().getBytes()) +"\n";

        try {
            FileOutputStream fileOutputStream;
            fileOutputStream = openFileOutput(FILE_NAME,MODE_PRIVATE);
            fileOutputStream.write(text.getBytes());
            Toast.makeText(this, "saved", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void Go_Back(View view) {
        if(flag == 0) {
            Toast.makeText(AboutYou.this, "Press again to exit", Toast.LENGTH_SHORT).show();
            flag =1;
        }
        if(flag == 1){
            finish();
        }
    }
}
