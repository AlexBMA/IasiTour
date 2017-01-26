package categorydetails;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import com.example.alexandru.iasitour.ImageFullScrenActivity;
import com.example.alexandru.iasitour.R;

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

    private void showInformation(final Landmark theLandmark) {
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


        List<Integer> idImgSmall = theLandmark.getImgListSmall();

        idImgSmall.add(R.drawable.palat_img_small_1);
        idImgSmall.add(R.drawable.palat_img_small_2);
        idImgSmall.add(R.drawable.palat_img_small_3);
        idImgSmall.add(R.drawable.palat_img_small_4);

        List<Integer> idImag = theLandmark.getImgList();
        idImag.add(R.drawable.palat_img_1);
        idImag.add(R.drawable.palat_img_2);
        idImag.add(R.drawable.palat_img_3);
        idImag.add(R.drawable.palat_img_4);


        ImageAdapter imageAdapter = new ImageAdapter(this, idImgSmall);

        GridView gridView = (GridView) findViewById(R.id.img_grid);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //create teh intent
                Intent intent = new Intent(LandmarkDetails.this, ImageFullScrenActivity.class);
                //get the right img id
                int idImage = theLandmark.getImgList().get(position);
                // put the id in the intent
                intent.putExtra("idimg", idImage);
                //start the intent
                startActivity(intent);

            }
        });
        //set the adapter for the grid view
        gridView.setAdapter(imageAdapter);

    }

}
