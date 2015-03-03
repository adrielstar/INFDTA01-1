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
      
      Pearson calculator = new Pearson();
      double[] ratingPersonA = new double[5];
      ratingPersonA[0] = 4.75;
      ratingPersonA[1] = 4.50;
      ratingPersonA[2] = 5.0;
      ratingPersonA[3] = 4.25;
      ratingPersonA[4] = 4.0;
      double[] ratingPersonB = new double[5];
      ratingPersonB[0] = 4.0;
      ratingPersonB[1] = 3.0;
      ratingPersonB[2] = 5.0;
      ratingPersonB[3] = 2.0;
      ratingPersonB[4] = 1.0;
      calculator.calcPearson(ratingPersonA, ratingPersonB);
      calculator.printPearson();
  }
}
