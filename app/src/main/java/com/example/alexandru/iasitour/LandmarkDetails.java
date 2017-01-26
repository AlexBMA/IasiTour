package com.example.alexandru.iasitour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class LandmarkDetails extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detailed);

        Intent i = getIntent();
        Landmark tempLandmark = (Landmark) i.getSerializableExtra("all_Infomation");

        showInfomation(tempLandmark);


    }

    private void showInfomation(Landmark theLandmark) {
        // get the text view by id
        TextView textViewName = (TextView) findViewById(R.id.landmarks_name);
        //set the text view
        textViewName.setText(theLandmark.getName());

        // get the text view by id
        TextView textViewAddress = (TextView) findViewById(R.id.landmarks_address);
        //set the text view
        textViewAddress.setText(getString(R.string.address)+" "+theLandmark.getAddress());

        // get the text view by id
        TextView textViewAdmission = (TextView) findViewById(R.id.landmarks_admission);
        textViewAdmission.setText(getString(R.string.open)+" "+theLandmark.getAdmission());

        //get the text view by id
        TextView textViewInformation = (TextView) findViewById(R.id.landmarks_text);
        textViewInformation.setText(theLandmark.getText());

    }

}
