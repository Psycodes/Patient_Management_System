package www.psycodes.in.patient_manegement_system;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class  AboutYou extends AppCompatActivity {
    Button aboutYouNext;
    EditText First_Name;
    EditText Last_Name;
    EditText Dob;
    EditText Speciallization;
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
    int flag=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_you);

        aboutYouNext = findViewById(R.id.about_you_next_button);
        First_Name = findViewById(R.id.about_you_first_name);
        Last_Name = findViewById(R.id.about_you_last_name);
        Dob  = findViewById(R.id.about_you_dob);
        Speciallization =findViewById(R.id.about_you_specialization);
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
        Fname = First_Name.getText().toString().trim();
        Lname = Last_Name.getText().toString().trim();
        dob = Dob.getText().toString().trim();
        Spec = Speciallization.getText().toString().trim();
        hospital = Hospital.getText().toString().trim();
        landmark = Landmark.getText().toString().trim();
        city = City.getText().toString().trim();
        pincode = Pincode.getText().toString().trim();

    }


    public void Go_Back(View view) {
        if(flag == 0) {
            Toast.makeText(AboutYou.this, "Press again to exit", Toast.LENGTH_SHORT).show();
            flag =1;
        }
//        if(flag == 1){
//            //here code to exit the app
//        }

    }
}
