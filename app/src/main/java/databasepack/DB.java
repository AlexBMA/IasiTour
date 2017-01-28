package databasepack;

import com.example.alexandru.iasitour.R;

import java.util.ArrayList;
import java.util.List;

import model.Landmark;

/**
 * Created by Alexandru on 1/28/2017.
 */

public class DB {


    public static List<Landmark> createInformation(int id) {
        List<Landmark> listItems = new ArrayList<>();

        if (id == 1) listItems = createLandmarks();

        if (id == 2) listItems = createMuseums();


        return listItems;
    }


    private static List<Landmark> createLandmarks() {
        List<Landmark> listLandmark = new ArrayList<>();

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

        List<Integer> idImgSmall = new ArrayList<>();

        idImgSmall.add(R.drawable.palat_img_small_1);
        idImgSmall.add(R.drawable.palat_img_small_2);
        idImgSmall.add(R.drawable.palat_img_small_3);
        idImgSmall.add(R.drawable.palat_img_small_4);

        List<Integer> idImg = new ArrayList<>();

        idImg.add(R.drawable.palat_img_1);
        idImg.add(R.drawable.palat_img_2);
        idImg.add(R.drawable.palat_img_3);
        idImg.add(R.drawable.palat_img_4);


        theLandmark.setImgList(idImg);
        theLandmark.setImgListSmall(idImgSmall);

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

    private static List<Landmark> createMuseums() {

        List<Landmark> listLandmark = new ArrayList<>();

        Landmark theLandmark = new Landmark();
        theLandmark.makeBasicLandmark("Art Museum",
                "Piata Stefan cel Mare si Sfant 1(housed in the Palace of Culture)",
                "Tue. - Sun. 10:00am - 5:00pm; closed on Mon",
                "Admission charge",
                "The Moldavian Ethnographic Museum is one of the oldest and largest in the country.\n" +
                        "        Encompassing 16 rooms, the displays cover every aspect of traditional Moldavian life,\n" +
                        "        featuring agricultural and hunting tools, woodwork, traditional pottery,\n" +
                        "        painted eggs and a good collection of textiles and dyed carpets embroidered with bird and plant motifs.\n" +
                        "        One room exhibits winter customs items, including masks representing the bear,\n" +
                        "        the goat and other characters of traditional New Year's festivities.\n" +
                        "        The collection of wooden machinery is impressive with 19th century tree-size oil and wine presses.");

        listLandmark.add(theLandmark);

        theLandmark = new Landmark();
        theLandmark.makeBasicLandmark("Moldavian Ethnographic Museum",
                "Piata Stefan cel Mare si Sfant 1(housed in the Palace of Culture)",
                "Tue. - Sun. 10:00am - 5:00pm; closed on Mon",
                "Admission charge",
                "The art collection began with a set of oil paintings purchased at a Parisian auction in 1845.\n" +
                        "        The official opening took place in 1860 at the Old University Palace and in 1955, the museum moved to its current location in the Palace of Culture.\n" +
                        "        An excellent collection of Romanian paintings from the 19th and 20th centuries vividly illustrates Moldavian rural life and its landscape.\n" +
                        "        Nicolae Grigorescu's Car cu Boi (Ox Cart),\n" +
                        "        Theodor Amann's Hora de peste Olt (The Village Dance) and Octav Bancila's Batran Croitor (Old Jewish Tailor) are some of the collection's highlights.\n" +
                        "        In the four rooms devoted to European art, there are paintings by Murillo, Philippe de Champaigne,\n" +
                        "        Paolo Veronese and a Rubens, Cezar Receiving Pompey's Head. Additionally,\n" +
                        "        you'll find works by foreign artists who lived and worked in Iasi such as Schiavonim Livaditii and Stavscki.\n" +
                        "        The sculpture collection includes pieces by national artists such as Oscar Han, Cornel Medrea, Ion Jalea and Ion Irimescu.");

        listLandmark.add(theLandmark);

        theLandmark = new Landmark();
        theLandmark.makeBasicLandmark("Moldavian History Museum",
                "Piata Stefan cel Mare si Sfant 1(housed in the Palace of Culture)",
                "Tue. - Sun. 10:00am - 5:00pm; closed on Mon",
                "Admission charge",
                "     Opened in 1955, this museum features some 35,000 objects spanning the centuries from 70,000 B.C. until 1946.\n" +
                        "        These exhibits cover 19 rooms on the ground floor of the Palace of Culture. Some of the famous Cucuteni ceramics are on display here.\n" +
                        "        The museum also houses the vaulted King's Room (Sala Voievozilor),\n" +
                        "        a gallery of medallion-shaped portraits depicting Moldavian sovereigns from 81 A.D. to the Hohenzollern kings.");

        listLandmark.add(theLandmark);

        theLandmark = new Landmark();
        theLandmark.makeBasicLandmark("Moldavian History Museum",
                "Piata Stefan cel Mare si Sfant 1(housed in the Palace of Culture)",
                "Tue. - Sun. 10:00am - 5:00pm; closed on Mon",
                "Admission charge",
                "      Radio, television, recording and broadcasting buffs will enjoy the exhibits displayed in this museum.\n" +
                        "        The last section features a superb collection of musical instruments: unique Romanian music boxes,\n" +
                        "        mechanical accordions and an automated orchestra with three violins and a piano.");

        listLandmark.add(theLandmark);



        return listLandmark;
    }
}
