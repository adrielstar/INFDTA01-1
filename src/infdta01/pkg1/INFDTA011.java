package infdta01.pkg1;
 
import java.io.FileNotFoundException;
import java.util.Arrays;

public class INFDTA011 {
 
  public static void main(String[] args) throws FileNotFoundException {
      UserPreference dummy = new UserPreference();
//      dummy.vul(101, 2.5);
//      dummy.vul(102, 3.0);
//      dummy.vul(102, 2.5);
      
      dummy.autoFill("UserItem.txt");
      System.out.println("Userid: " + Arrays.toString(dummy.userId));
      System.out.println("Itemid: " + Arrays.toString(dummy.itemId)); 
      System.out.println("Rating: " + Arrays.toString(dummy.rating));
//      dummy.vul(102, 2.5);
  }
}
