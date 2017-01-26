package categories;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.alexandru.iasitour.R;

import java.util.ArrayList;
import java.util.List;

import adapters.LandmarkAdapter;
import categorydetails.LandmarkDetails;
import model.Landmark;


/*

 <!-- Landmark section -->
    <!-- Palace of Culture (Palatul Culturii) -->
    <string name="name_of_landmark_1">Palace of Culture (Palatul Culturii)</string>
    <string name="address_of_landmark_1">Piata Stefan cel Mare si Sfant 1</string>
    <string name="open_of_landmark_1">Tue. - Sun 10:00am - 5:00pm; closed on Mondays</string>
    <string name="admission_landmark_1">Free admission (not including museums)</string>
    <string name="information_landmark_1">This remarkable construction (1906-1925), built in flamboyant neogothic style,
        stands partly on the ruins of a medieval royal court mentioned in documents dating from 1434.
        Today, the 365-room palace houses the Gheorghe Asachi Library and four of the city's museums:
        the Moldavian History Museum, the Ethnographic Museum, the Museum of Art and the Museum of Science and Technology.
        The interior décor, with the lavish furnishings and magnificent staircase of the entrance lobby,
        can be admired free of charge, but tickets are required for entry to the museums.</string>

    <!-- St. Paraschiva Metropolitan Cathedral (Catedrala Mitropolitana Sfanta Paraschiva) -->
    <string name="name_of_landmark_2">St. Paraschiva Metropolitan Cathedral (Catedrala Mitropolitana Sfanta Paraschiva)</string>
    <string name="address_of_landmark_2">Blvd. Stefan cel Mare si Sfant 46</string>
    <string name="open_of_landmark_2">Mon. - Sun. 9:00am - 8:00pm</string>
    <string name="admission_landmark_2">Free admission</string>
    <string name="information_landmark_2">
        Built in Italian Renaissance style, the St. Paraschiva Metropolitan Cathedral is the largest Orthodox church in Romania.
        Construction began in 1833 and ended in 1839, but its cupolas fell and the church remained in ruins until 1880, when, with the help of the Foundation of King Carol I, work started again, lasting until 1888.
        The vast interior was painted in 1887 by Gheorghe Tattarescu and the stained glass windows were completed by a Bavarian factory in Munich.
        In 1639, Vasile Lupu spent Moldavia's budget for the following year and a half to acquire the relics of St. Paraschiva from Constantinopole.
        The relics were moved to the Metropolitan Cathedral in 1889 after a fire damaged the Trei Ierarchi Church where they had originally been placed.
        The cathedral still uses one of the original bells in its northeast spire.
        Inside the bell, an inscription says it was made from four cannons captured from the Turkish army in the War of 1828-1829. Nearby stands the 18th century Old Metropolitan Church of St. George (Biserica Sfantul Gheorghe).
        Every October 14, pilgrims from all corners of Romania and neighboring countries flock to Iasi to kneel before the blue and gold bier containing the relics of Saint Paraschiva, the patron saint of the cathedral.
    </string>

    <!-- Church of the Three Hierarchs (Biserica Sfantilor Trei Ierarhi) -->
    <string name="name_of_landmark_3">Church of the Three Hierarchs (Biserica Sfantilor Trei Ierarhi)</string>
    <string name="address_of_landmark_3">Str. Stefan cel Mare 62</string>
    <string name="open_of_landmark_3">Daily 9:00am - 1:00pm and 3:00pm - 7:00pm</string>
    <string name="admission_landmark_3">Admission charge</string>
    <string name="information_landmark_3">
        The Church of the Three Hierarchs (constructed 1637 - 1639) is highlighted
        as a must-see in every guidebook.
        Nothing can prepare you, though, for its stunning ornate decoration: the entire exterior of the church is covered in delicate and intricate patterns sculpted into the stone and spread over 30 friezes.
        This "stone embroidery" is a mixture of western gothic, Renaissance and Oriental motifs.
        Legend has it that the exterior was covered in gold, silver and lapis lazuli but centuries ago,
        when the Ottoman Empire tried to conquer Moldavia, the invaders sat the church on fire and melted all the gold.
        The original interior paintings were completed by Russian artists sent to Iasi by the Tsar. In 1882,
        the frescoes were removed when French architect Lecomte de Nouy set about redesigning the interior after several fires and six earthquakes damaged the structure.
        Original fragments of the frescoes are still preserved in the nearby Gothic Hall museum (Open: Tue.-Sun. 10am - 4pm. Admission charge).
        The interior boasts the tombs of a number of famous Romanians, including the founder of this church, Vasile Lupu, Prince Alexandru Ioan Cuza, and Prince Dimitrie Cantemir.
        In 1994, the church reopened as a monastery. The three patron saints (Basil the Great, Gregory of Nazianzus and John Crysostom) are celebrated here on January 30.
    </string>



 */

public class LandmarksCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);

        List<Landmark> listLandmark = new ArrayList<>();

        listLandmark = createInformation(listLandmark);

        showInformation(listLandmark);

    }

    private void showInformation(final List<Landmark> landmarkList) {


        ListView listView = (ListView) findViewById(R.id.list);

        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(this, landmarkList);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                                Intent detailsForLandmark = new Intent(LandmarksCategory.this, LandmarkDetails.class);

                                                /* get the current landmark */
                                                Landmark theLandmark = landmarkList.get(position);

                                                detailsForLandmark.putExtra("all_Infomation",theLandmark);
                                                startActivity(detailsForLandmark);

                                            }
                                        }

        );

        listView.setAdapter(landmarkAdapter);
    }


    private List<Landmark> createInformation(List<Landmark> listLandmark) {

        Landmark theLandmark = new Landmark();
        theLandmark.makeBasicLandmark("Palace of Culture ",
                "Piata Stefan cel Mare si Sfant 1",
                "Tue. - Sun 10:00am - 5:00pm; closed on Mondays",
                "Free admission (not including museums)",
                "This remarkable construction (1906-1925), built in flamboyant neogothic style,\n" +
                        "        stands partly on the ruins of a medieval royal court mentioned in documents dating from 1434.\n" +
                        "        Today, the 365-room palace houses the Gheorghe Asachi Library and four of the city's museums:\n" +
                        "        the Moldavian History Museum, the Ethnographic Museum, the Museum of Art and the Museum of Science and Technology.\n" +
                        "        The interior décor, with the lavish furnishings and magnificent staircase of the entrance lobby,\n" +
                        "        can be admired free of charge, but tickets are required for entry to the museums.");
        listLandmark.add(theLandmark);
        theLandmark = new Landmark();
        theLandmark.makeBasicLandmark("St. Paraschiva Metropolitan Cathedral",
                "Blvd. Stefan cel Mare si Sfant 46",
                "Mon. - Sun. 9:00am - 8:00pm",
                "Free admission",
                "Built in Italian Renaissance style, the St. Paraschiva Metropolitan Cathedral is the largest Orthodox church in Romania.\n" +
                        "        Construction began in 1833 and ended in 1839, but its cupolas fell and the church remained in ruins until 1880, when, with the help of the Foundation of King Carol I, work started again, lasting until 1888.\n" +
                        "        The vast interior was painted in 1887 by Gheorghe Tattarescu and the stained glass windows were completed by a Bavarian factory in Munich.\n" +
                        "        In 1639, Vasile Lupu spent Moldavia's budget for the following year and a half to acquire the relics of St. Paraschiva from Constantinopole.\n" +
                        "        The relics were moved to the Metropolitan Cathedral in 1889 after a fire damaged the Trei Ierarchi Church where they had originally been placed.\n" +
                        "        The cathedral still uses one of the original bells in its northeast spire.\n" +
                        "        Inside the bell, an inscription says it was made from four cannons captured from the Turkish army in the War of 1828-1829. Nearby stands the 18th century Old Metropolitan Church of St. George (Biserica Sfantul Gheorghe).\n" +
                        "        Every October 14, pilgrims from all corners of Romania and neighboring countries flock to Iasi to kneel before the blue and gold bier containing the relics of Saint Paraschiva, the patron saint of the cathedral.");
        listLandmark.add(theLandmark);
        theLandmark = new Landmark();
        theLandmark.makeBasicLandmark("Church of the Three Hierarchs",
                "Str. Stefan cel Mare 62",
                "Daily 9:00am - 1:00pm and 3:00pm - 7:00pm",
                "Admission charge",
                " The Church of the Three Hierarchs (constructed 1637 - 1639) is highlighted\n" +
                        "        as a must-see in every guidebook.\n" +
                        "        Nothing can prepare you, though, for its stunning ornate decoration: the entire exterior of the church is covered in delicate and intricate patterns sculpted into the stone and spread over 30 friezes.\n" +
                        "        This \"stone embroidery\" is a mixture of western gothic, Renaissance and Oriental motifs.\n" +
                        "        Legend has it that the exterior was covered in gold, silver and lapis lazuli but centuries ago,\n" +
                        "        when the Ottoman Empire tried to conquer Moldavia, the invaders sat the church on fire and melted all the gold.\n" +
                        "        The original interior paintings were completed by Russian artists sent to Iasi by the Tsar. In 1882,\n" +
                        "        the frescoes were removed when French architect Lecomte de Nouy set about redesigning the interior after several fires and six earthquakes damaged the structure.\n" +
                        "        Original fragments of the frescoes are still preserved in the nearby Gothic Hall museum (Open: Tue.-Sun. 10am - 4pm. Admission charge).\n" +
                        "        The interior boasts the tombs of a number of famous Romanians, including the founder of this church, Vasile Lupu, Prince Alexandru Ioan Cuza, and Prince Dimitrie Cantemir.\n" +
                        "        In 1994, the church reopened as a monastery. The three patron saints (Basil the Great, Gregory of Nazianzus and John Crysostom) are celebrated here on January 30.");

        listLandmark.add(theLandmark);
        return listLandmark;
    }
}
