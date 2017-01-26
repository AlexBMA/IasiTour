package com.example.alexandru.iasitour;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.landmarks);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, LandmarksCategory.class);

                startActivity(intent);
            }
        });

        textView = (TextView) findViewById(R.id.museums);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MuseumCategory.class);

                startActivity(intent);
            }
        });



    }


    public void basicFragment() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


        Configuration configuration = getResources().getConfiguration();

        if (configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {

            Fragment_landscape fragmentLandscape = new Fragment_landscape();
            fragmentTransaction.replace(android.R.id.content, fragmentLandscape);

        } else {

            Fragment_portrait fragment_portrait = new Fragment_portrait();
            fragmentTransaction.replace(android.R.id.content, fragment_portrait);
        }

        fragmentTransaction.commit();
    }
}
