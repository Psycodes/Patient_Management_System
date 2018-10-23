package www.psycodes.in.patient_manegement_system;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class AddPatient extends AppCompatActivity {
   ImageView addPatientDoneButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_patient);
        addPatientDoneButton=findViewById(R.id.add_patient_add_button);
    }

    public void successfulAddPatient(View view) {
        addPatientDoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AddPatient.this, "Patient Added Successfully", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(AddPatient.this,PatientDetails.class));
            }
        });
    }
}
