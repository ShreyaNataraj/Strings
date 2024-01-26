//while dealing with frequenr modifications to string better to use stringbuilder because it is mutable  meaning it can be modified withot creating new object each time//
public class Stringbuilder {
  
  
    public static void main(String args[]){
      StringBuilder sb = new StringBuilder("");
      for(char ch = 'a'; ch<='z'; ch++){
        sb.append(ch);
      }
      System.out.print(sb);

    }
  
  
}
