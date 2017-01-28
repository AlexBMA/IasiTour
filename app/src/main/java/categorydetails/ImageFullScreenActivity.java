package categorydetails;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;

import com.example.alexandru.iasitour.R;

import model.Landmark;

public class ImageFullScreenActivity extends AppCompatActivity {

    Landmark theLandmark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo_view);

        ImageView imageView = (ImageView) findViewById(R.id.photo_big);

        Intent i = getIntent();
        Landmark tempLandmark = (Landmark) i.getSerializableExtra("all_Infomation");
        theLandmark = tempLandmark;
        int id = i.getIntExtra("img_id", 0);
        imageView.setImageResource(id);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }

        return (super.onOptionsItemSelected(item));
    }
}
