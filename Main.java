import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    ArrayList<String> foo = new ArrayList<String>();
    foo.add("A");
    foo.add("B");
    foo.add("C");
    foo.add("D");
    foo.add("E");
    foo.add("F");
    System.out.println("main - ArrayList beofre shiftleft: " + foo);
    shiftLeft(foo);
    System.out.println("main - ArrayList after shiftLeft " + foo);
  }

  public static void shiftLeft(ArrayList<String> arr)
  {
    System.out.println("func - ArrayList before doing anything: " + arr);
    String front = arr.remove(0); //this will shift everything 1 index over to the left
    System.out.println("ArrayList after removing element at index 0: " + arr);
    arr.add(front);
    System.out.println("funcs - ArrayList after appending the front element: " + arr);
  }

  //public static printStatistics(final ArrayList<Integer> arr)
  {
    
  }
}
