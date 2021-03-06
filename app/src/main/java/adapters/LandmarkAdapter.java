package adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alexandru.iasitour.R;

import java.util.List;

import model.Landmark;

/**
 * Created by Alexandru on 1/26/2017.
 */

public class LandmarkAdapter extends ArrayAdapter<Landmark> {

    public LandmarkAdapter(Context context, List<Landmark> list) {


        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        // Check if the existing view is being reused, otherwise inflate the view
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item, parent, false);
        }



        //get the current landmark
        Landmark theLandmark = getItem(position);

        //get the Text view
        TextView textViewName = (TextView)listItemView.findViewById(R.id.item_name);

        //set the text in the Text view
        textViewName.setText(theLandmark.getName());

        //get the Text view
        TextView textViewAddress = (TextView)listItemView.findViewById(R.id.item_address);

        //set the text in the Text view
        textViewAddress.setText(theLandmark.getAddress());


        if (theLandmark.getImgList().size() > 0) {
            // get the image
            ImageView imageView = (ImageView) listItemView.findViewById(R.id.img);
            //set the img
            imageView.setImageResource(theLandmark.getImgListSmall().get(0));
        }

        return listItemView;
    }
}
