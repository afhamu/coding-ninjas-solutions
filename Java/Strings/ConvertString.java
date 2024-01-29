import java.util.* ;
import java.io.*;
public class Solution{
	public static String convertString(String str) {
        String result = "";
        String[] splittedStr = str.split(" ");

        for(String splitted: splittedStr){
            if(str.indexOf(' ') >= 0){
                convertString(splitted);
            }

            str = splitted.substring(0,1).toUpperCase()+splitted.substring(1)+" ";
            result += str;
        }
       return result;
    }

}