package www.psycodes.in.patient_manegement_system;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SplashScreen extends AppCompatActivity {

    private static final String FILE_NAME = "DOCTOR_INFO.txt";
    FileInputStream fileInputStream = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                try {
                  fileInputStream = openFileInput(FILE_NAME);
                    }catch(FileNotFoundException e){
                    startActivity(new Intent(SplashScreen.this, AboutYou.class));
                    finish();
                    }
                    finally {
                    if(fileInputStream != null){
                        startActivity(new Intent(SplashScreen.this, HomePage.class));
                        finish();
                    }
                  }
                }
        },2000);
    }
}
