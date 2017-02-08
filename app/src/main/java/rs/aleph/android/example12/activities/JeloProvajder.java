package rs.aleph.android.example12.activities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by va on 2/3/2017.
 */

public class JeloProvajder {

    public static List<Jelo> getJelo() {

        Kategorijama SlanaJ = new Kategorijama(0, "SlanaJ");
        Kategorijama SlatkaJ = new Kategorijama(1, "SlatkaJ");
        Kategorijama LjutaJ = new Kategorijama(2, "LjutaJ");

        List<Jelo> jeloList = new ArrayList<>();
        jeloList.add(new Jelo(0, "jastog.jpg", "Jastog","plod mora a i ne mora","rak,majonez,so",SlanaJ));
        jeloList.add(new Jelo(1, "bananas.jpg", "Bananas","pecena banana","jaja,brasno,secer,platano", SlatkaJ));
        jeloList.add(new Jelo(2, "burito.jpg", "Burito", "sendvic u tortilji","tortilja,meso,cili", LjutaJ));
        return jeloList;
    }

    public static List<String> getJelaNames() {

        List<String> names = new ArrayList<>();
        names.add("jastog");
        names.add("Bananas");
        names.add("Burito");
        return names;
    }

    public static Jelo getJeloById(int id) {

        Kategorijama SlanaJ = new Kategorijama(0, "SlanaJ");
        Kategorijama SlatkaJ = new Kategorijama(1, "SlatkaJ");
        Kategorijama LjutaJ = new Kategorijama(2, "LjutaJ");

        switch (id) {
            case 0:
                return new Jelo(0, "jastog.jpg", "Jastog","plod mora a i ne mora","rak,majonez,so", SlanaJ);
            case 1:
                return new Jelo(1, "bananas.jpg", "Bananas","pecena banana","jaja,brasno,secer,platano", SlatkaJ);
            case 2:
                return new Jelo(2, "burito.jpg", "Burito", "sendvic u tortilji","tortilja,meso,cili", LjutaJ);
            default:
                return null;
        }
    }



}
