import java.util.*;
public class Anagrams {
  public static void main(String[] args) {
    String str1= "Race";
    String str2 ="Care";
    if(str1.length()==str2.length()){
      char[] str1chararray = str1.toCharArray();
      char[] str2chararray = str2.toCharArray();
      //sorting the char array;

      Arrays.sort(str1chararray);
      Arrays.sort(str2chararray);
      //if the char arrays are same or identical then the string are anagram
      boolean result = Arrays.equals(str1chararray,str1chararray);
      if(result){ 
        System.out.print(str1 +" " +str2 +" "+ "are anagram to each other");
      }
      else{
        System.out.print("they are not anagram to each other");
      }
    }
    else{
      System.out.print("they are not anagram to each other");
    }
  }
  
}
      