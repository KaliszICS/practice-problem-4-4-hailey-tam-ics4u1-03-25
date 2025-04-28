/**
 * Campbell Class that contains the followings methods
 * 1.Converting an integer or double or character or boolean into a String value.
 * 2.Converting an integer or double of meters into centimeters.
 * 3.Taking in a String that removes all non-leter characters,
 *   may also take in a boolean to return the letters all lowercase or uppercase
 * @author Hailey Tam
 */
public final class CampbellClass{

    private CampbellClass(){
    }

   /**
    * Takes in an integer and converts the integer into a String
    * @param num a integer that represents a whole number
    * @return returns the String value of the integer
    */

    public static String convertString(int num){
        return Integer.toString(num);
    }

    /**
     * Takes in a double and converts the double into a String
     * @param num a double that represents a number that has decimal places
     * @return returns the String value of the double
     */

    public static String convertString(double num){
         return Double.toString(num);
    }

    /**
     * Takes in a char and coverts the char into a String
     * @param character a char that represents a character
     * @return returns the String value of the char
     */

    public static String convertString(char character){
        return Character.toString(character);
    }

    /**
     * Takes in a boolean and coverts the boolean into a String
     * @param a a boolean that represents a boolean value either true or false
     * @return returns the String value of the boolean
     */
    public static String convertString(boolean a){
        return Boolean.toString(a);
    }

    /**
     * Converts an integer number that is in meters into centimeters
     * @param num a integer that represents a number
     * @return returns the integer of centimeters
     */
    public static int convertMetersToCenti(int num){
        return num*100;
    }

    /**
     * Converts a double  of meters into centimers
     * @param num a double that represents a number
     * @return returns the double of centimeters
     */

     public static double convertMetersToCenti(double num){
        return num*100;
    }

    /**
     * Removes all non-letter characters from a String
     * as well as a boolean to determine letter casing
     * @param letters a String that represents letters
     * @param a a boolean that if true, all letters become uppercase otherwise they become lowercase
     * @return returns a string with only letters as either all uppercase or all lowercase
     */

    public static String removeNonAlpha(String letters, boolean a){

        String result = "";
        for (int i = 0; i < letters.length(); i++){
            char c = letters.charAt(i);
            if (Character.isLetter(c) == true){
                result += c;
            }
        }
        
        if (a == true){
            return result.toUpperCase();
        }
        else {
            return result.toLowerCase();
        }
    }

    /**
     * Only removes all non-letter characters from a String
     * @param letters a String that represents letters
     * @return returns a String that only contains letters
     */
    
    public static String removeNonAlpha(String letters){
        String result = "";
        for (int i = 0; i < letters.length(); i++){
            char c = letters.charAt(i);
            if (Character.isLetter(c) == true){
                result += c;
            }
        }
        return result;
    }
}