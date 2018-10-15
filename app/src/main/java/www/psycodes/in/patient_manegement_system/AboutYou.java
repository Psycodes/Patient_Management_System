package www.psycodes.in.patient_manegement_system;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class  AboutYou extends AppCompatActivity {
    Button aboutYouNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_you);
        aboutYouNext=findViewById(R.id.about_you_next_button);
    }

    public void homePage(View view) {
        aboutYouNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AboutYou.this,HomePage.class));
            }
        });
    }
}
