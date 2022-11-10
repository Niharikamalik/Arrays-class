import java.util.*;

class Main
{
  public static void main (String[]args)
  {
    /* code */
    int a[] = {10,20,34};
    int b[] = {10,20,34};
    int c[] = {10,20,34,30};
    
    System.out.println(Arrays.mismatch(a,b));
    System.out.println(Arrays.mismatch(a,c));
    System.out.println(Arrays.mismatch(a,0,2,c,0,2));
  }
}
