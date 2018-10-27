package www.psycodes.in.patient_manegement_system;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HomePage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
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
    public void printDetails(View view) {
                startActivity(new Intent(HomePage.this,SearchMedicine.class));
    }
}
