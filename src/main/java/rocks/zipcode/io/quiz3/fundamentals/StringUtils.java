package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {

    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String [] strArray = str.split("");
        strArray[indexToCapitalize] = strArray[indexToCapitalize].toUpperCase();
        return String.join("", strArray);

    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString)==(characterToCheckFor);
    }

    public static String[] getAllSubStrings(String string) {
        // Put all distinct substring in a HashSet
        Set<String> result = new HashSet<String>();

        // List All Substrings
        for (int i = 0; i <= string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {

                // Add each substring in Set
                result.add(string.substring(i, j));
            }
        }
        String [] toReturn = new String[result.size()];
        // Return size of the HashSet
        return result.toArray(toReturn);
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
