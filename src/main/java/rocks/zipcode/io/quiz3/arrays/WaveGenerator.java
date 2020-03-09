package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {

    public static String[] wave(String str) {

        String strC = str.toLowerCase();
        Integer s;
        str = str.replaceAll("[^A-Za-z]", "");
        s = str.length();

        String[] strArray = new String[s];
        ArrayList<String > list = new ArrayList<>(s);

        for (int j = 0; j < strC.length(); j++) {
            list.add(StringUtils.capitalizeNthCharacter(strC, j));
        }
        for (int k = 0; k < list.size(); k++){
            if ( list.get(k).equals(strC)){
                list.remove(list.get(k));
            }
        }
//
        return list.toArray(new String[0]);
    }

}

