package www.psycodes.in.patient_manegement_system;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomePage extends AppCompatActivity {
    Button viewPatient,addpatient,quckPrint;
    ImageView backFromHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        viewPatient=findViewById(R.id.view_patient);
        addpatient=findViewById(R.id.add_patient);
        backFromHome=findViewById(R.id.home_screen_back_button);
        quckPrint=findViewById(R.id.quick_print_details);
    }

    public void viewPatient(View view) {
        viewPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePage.this,SearchPatient.class));
            }
        });
    }

    public void addPatient(View view) {
        addpatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePage.this,AddPatient.class));
            }
        });
    }

    public void backFromHome(View view) {
        backFromHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePage.this,AboutYou.class));
            }
        });
    }

    public void printDetails(View view) {
        quckPrint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePage.this,SearchMedicine.class));
            }
        });
    }
}
