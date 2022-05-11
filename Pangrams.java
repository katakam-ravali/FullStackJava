/*A pangram is a string that contains every letter of the alphabet.
 Given a sentence determine whether it is a pangram in the English alphabet.
 Ignore case. Return either pangram or not pangram as appropriate.*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static String pangrams(String s) {
    s=s.replaceAll("","").toLowerCase();
    String str="";
        for(char i='a';i<='z';i++)
        {
            if(s.indexOf(i)!=-1)
            {
                str=str+i;
            }
        }
    if(str.length()==26)
        return "pangram";
    else
    return "not pangram";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
