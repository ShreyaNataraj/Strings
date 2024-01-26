import java.util.*;
public class Vowelcount {
  public static void main(String[] args) {
    String name = "Shreya";
    int count = 0;
    for(int i = 0; i<name.length(); i++){
      char ch = name.charAt(i);
      if(ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        count++;
      }
    }
    System.out.println("count of the vowel is" +" " + count );
    
  }
}
