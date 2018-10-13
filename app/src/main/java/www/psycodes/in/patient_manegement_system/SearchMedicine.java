package www.psycodes.in.patient_manegement_system;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SearchMedicine extends AppCompatActivity {
    FloatingActionButton addMedicineFromList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_medicine);
        addMedicineFromList=findViewById(R.id.add_medicine_from_List);
    }

    public void addMedicineFromList(View view) {
        addMedicineFromList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SearchMedicine.this,PrescriptionDetails.class ));
            }
        });

    }
}
