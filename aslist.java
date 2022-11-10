import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    String arr[] = { "avina", "maya", "shivi" };
    String arr1[] = { "avina", "maya", "shivi" };


    HashSet < String > s = new HashSet < String >(Arrays.asList(arr1));
    System.out.println(s);
      Collections.reverse (Arrays.asList (arr));
    System.out.println (Arrays.toString (arr));

  }
}
