package www.psycodes.in.patient_manegement_system;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class SearchMedicine extends AppCompatActivity {
    FloatingActionButton addMedicineFromList;
    RecyclerView recyclerView;
    public String medi[]={"medi_1","medi_2","medi_3","medi_4","medi_5","medi_8","medi_9","medi_10","medi_11","medi_12"};
    //the above data is added for testing
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_medicine);
        addMedicineFromList=findViewById(R.id.add_medicine_from_List);
        recyclerView = findViewById(R.id.List);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new SearchAdapter(medi));
    }
    public void addMedicineFromList(View view) {
                startActivity(new Intent(SearchMedicine.this,PrescriptionDetails.class ));
    }
}