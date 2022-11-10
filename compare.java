import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    int a[] = { 32, 43, 231 };
    int b[] = { 32, 43, 55 };

    int res = Arrays.compare (a, b);
    if (res == 0)
      System.out.println ("a same as b");
    else if (res > 0)
      System.out.println ("a is greater than b");
    else
      System.out.println ("a is smaller than b");
      
    int c[] = { 32, 43, 231 };
    int d[] = { 32, 43, 321 };

    int result = Arrays.compare (c, d);
    if (result == 0)
      System.out.println ("c same as d");
    else if (result > 0)
      System.out.println ("c is greater than d");
    else
      System.out.println ("c is smaller than d");
      
    int e[] = { 32, 43 };
    int f[] = { 32, 43, -55 };

    int r = Arrays.compare (e, f);
    if (r == 0)
      System.out.println ("e same as f");
    else if (r > 0)
      System.out.println ("e is greater than f");
    else
      System.out.println ("e is smaller than f");  


  }
}
