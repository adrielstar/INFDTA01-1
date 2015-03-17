package infdta01.pkg1;

/**
 *
 * @author isaacdecuba
 */
public class Pearson {

    public double pearson;
    
    /**
     * Calculates the first part of the numeration
     * 
     * @param array ratingPersonA
     * @param array ratingPersonB
     * @return double result
     */
    private double calcNumeratorOne(double[] ratingPersonA, double[] ratingPersonB) 
    {
        int n = ratingPersonA.length;
        double result = 0.0;
        
        for (int i = 0; i < n; i++) {
            result+= ratingPersonA[i] * ratingPersonB[i];
        }
        
        return result;
    }
    
    /**
     * Calculates the second part of the numeration
     * 
     * @param array ratingPersonA
     * @param array ratingPersonB
     * @return double result
     */
    private double calcNumeratorTwo(double[] ratingPersonA, double[] ratingPersonB) 
    {
        int n = ratingPersonA.length;
        double result;
        double sumA = this.calcSumArray(ratingPersonA);
        double sumB = this.calcSumArray(ratingPersonB);
        
        result = ( sumA * sumB ) / n;
        return result;
    }
    
    /**
     * Calculates numeration
     * 
     * @param array ratingPersonA
     * @param array ratingPersonB
     * @return double result
     */
    private double calcNumeration(double[] ratingPersonA, double[] ratingPersonB) 
    {
        double result;
        double numeratorOne = this.calcNumeratorOne(ratingPersonA, ratingPersonB);
        double numeratorTwo = this.calcNumeratorTwo(ratingPersonA, ratingPersonB);
        
        result = numeratorOne - numeratorTwo;
        
        return result;
    }
    
    /**
     * Calculates the denominator of a specific array
     * 
     * @param array ratingPerson
     * @return double result
     */
    private double calcDenominator(double[] ratingPerson) 
    {
        int n = ratingPerson.length;
        double result = 0.0;
        double sumA = 0.0;     
        
        for (int i = 0; i < n; i++) {
            sumA+= Math.pow(ratingPerson[i], 2);
        }
        
        result = Math.sqrt(sumA - (Math.pow(this.calcSumArray(ratingPerson),2)/n));
        return result;
    }
    
    /**
     * Calculates the sum of a specific array
     * 
     * @param array ratingPerson
     * @return double sum
     */
    private double calcSumArray(double[] ratingPerson) {
        double sum = 0.0;     
        
        for (int i = 0; i < ratingPerson.length; i++) {
            sum+= ratingPerson[i];
        }
        
        return sum;
    }
    
    /**
     * Calculates the Pearson between 2 arrays
     * 
     * @param ratingPersonA
     * @param ratingPersonB
     * @return double result
     */
    public double calcPearson(double[] ratingPersonA, double[] ratingPersonB) {
        double result;
        double numeration = this.calcNumeration(ratingPersonA, ratingPersonB);
        double denominator = this.calcDenominator(ratingPersonA) * this.calcDenominator(ratingPersonB);
        
        result = this.pearson = numeration / denominator;
        return result;
    }
    
    /**
     * Prints the Pearson of this class
     */
    public void printPearson() {
        System.out.println("Pearson: " + this.pearson);
    }
}
