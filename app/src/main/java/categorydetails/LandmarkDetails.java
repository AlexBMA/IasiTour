package categorydetails;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.TextView;

import com.example.alexandru.iasitour.R;

import java.util.ArrayList;
import java.util.List;

import adapters.ImageAdapter;
import model.Landmark;

public class LandmarkDetails extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detailed);

        Intent i = getIntent();
        Landmark tempLandmark = (Landmark) i.getSerializableExtra("all_Infomation");

        showInformation(tempLandmark);


    }

    private void showInformation(Landmark theLandmark) {
        // get the text view by id
        TextView textViewName = (TextView) findViewById(R.id.landmarks_name);
        //set the text view
        textViewName.setText(theLandmark.getName());

        // get the text view by id
        TextView textViewAddress = (TextView) findViewById(R.id.landmarks_address);
        //set the text view
        textViewAddress.setText(getString(R.string.address) + " " + theLandmark.getAddress());

        // get the text view by id
        TextView textViewAdmission = (TextView) findViewById(R.id.landmarks_admission);
        textViewAdmission.setText(getString(R.string.open) + " " + theLandmark.getAdmission());

        //get the text view by id
        TextView textViewInformation = (TextView) findViewById(R.id.landmarks_text);
        textViewInformation.setText(theLandmark.getText());


        List<Integer> idImg = new ArrayList<>();

        idImg.add(R.drawable.palat_img_1);
        idImg.add(R.drawable.palat_img_2);
        idImg.add(R.drawable.palat_img_3);
        idImg.add(R.drawable.palat_img_4);


        ImageAdapter imageAdapter = new ImageAdapter(this, idImg);

        GridView gridView = (GridView) findViewById(R.id.img_grid);

        gridView.setAdapter(imageAdapter);

    }

}
