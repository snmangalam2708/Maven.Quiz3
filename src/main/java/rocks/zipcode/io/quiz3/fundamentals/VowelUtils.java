package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {

    public static Boolean hasVowels(String word) {

        String[] vowels = {"a", "e", "i", "o", "u"};
        String[] wordArray = word.toLowerCase().split("");
        for (int i = 0; i < vowels.length; i++) {
            for (int j = 0; j < wordArray.length; j++) {
                if (vowels[i].equals(wordArray[j])) {
                    return true;
                }
            }
        }
        return false;
    }


    public static Integer getIndexOfFirstVowel(String word) {

        String[] vowels = {"a", "e", "i", "o", "u"};
        String[] wordArray = word.toLowerCase().split("");
        for (int i = 0; i < wordArray.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (vowels[j].equals(wordArray[i])) {
                    return i;
                }
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {

        int i = 0;
        String[] vowels = {"a", "e", "i", "o", "u"};
        String[] wordArray = word.toLowerCase().split("");
        for (i = 0; i < vowels.length; i++) {
            if (vowels[i].equals(wordArray[0])) {
                return true;
            }
        }
        return false;
    }


    public static Boolean isVowel(Character character) {

        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            return true;
        }
        return false;
    }
}



