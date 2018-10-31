package www.psycodes.in.patient_manegement_system;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HomePage extends AppCompatActivity {

   ImageView viewPatient, addpatient, quckPrint, backFromHome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        viewPatient = findViewById(R.id.view_patient);
        addpatient = findViewById(R.id.add_patient);
        backFromHome = findViewById(R.id.home_screen_back_button);
        quckPrint = findViewById(R.id.quick_print_details);
    }
    public void viewPatient(View view) {
                startActivity(new Intent(HomePage.this,SearchPatient.class));
    }
    public void addPatient(View view) {
                startActivity(new Intent(HomePage.this,AddPatient.class));
    }
    public void backFromHome(View view) {
                startActivity(new Intent(HomePage.this,AboutYou.class));
    }
    public void printDetails(View view) { startActivity(new Intent(HomePage.this,SearchMedicine.class));}
}
