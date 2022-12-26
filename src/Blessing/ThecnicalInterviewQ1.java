package Blessing;

import java.util.ArrayList;
import java.util.List;

public class ThecnicalInterviewQ1{
    // print element on a string present on odd position along with the count of those elmt
            public static void main(String[] args){
                String words = "abbloscckc";
                char [] words2 = words.toCharArray();
                int len = words.length();
                for(int i = 0 ;i<len;i++)
                {
                    if(i%2==0){
                        String s1= Character.toString(words2[i]);
                       int lenAfterRemoving_i= words.replace(s1, "").length();
                       int count =len - lenAfterRemoving_i;
                 System.out.print(" "+words2[i]+" : "+ count+";");
                }
            }



            }

}
