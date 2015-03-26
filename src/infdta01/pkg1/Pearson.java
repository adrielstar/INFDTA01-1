package infdta01.pkg1;

import java.util.HashMap;

/**
 *
 * @author isaacdecuba
 */
public class Pearson {

    public double pearson;
    
    // persons to compare
    public double[] personA;
    public double[] personB;
    
    public HashMap<Integer,Double> filteredPersonA; 
    public HashMap<Integer,Double> filteredPersonB;
    
    public Pearson() {
        this.filteredPersonA = new HashMap<>();
        this.filteredPersonB = new HashMap<>();
    }
    
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
     * @param personARatedItems
     * @param personBRatedItems
     * @return double result
     * 
     * object userA, object userB
     * 
     * Make array for same rated items
     * 
     * make array ratingPersonA
     * make array ratingPersonB
     */
    public double calcPearson(HashMap<Integer,Double> personARatedItems, HashMap<Integer,Double> personBRatedItems) {
        //double[] ratingPersonA, double[] ratingPersonB
        double[] ratingPersonA;
        double[] ratingPersonB;
        
        int position = 0;
        if (personARatedItems.size() < personBRatedItems.size()) {
            ratingPersonA = new double[personARatedItems.size()];
            ratingPersonB = new double[personARatedItems.size()];
            
            // scan through PersonARatedItems
            for (HashMap.Entry<Integer,Double> entry : personARatedItems.entrySet()) {
                if (personBRatedItems.containsKey(entry.getKey())) {
                    double ratingB = (double) personBRatedItems.get(entry.getKey());
                    double ratingA = (double) personARatedItems.get(entry.getKey());
                    ratingPersonA[position] = ratingA;
                    ratingPersonB[position] = ratingB;
                    position++;
                }
            }
        } else {
            ratingPersonA = new double[personBRatedItems.size()];
            ratingPersonB = new double[personBRatedItems.size()];
            
            // scan through PersonBRatedItems
            for (HashMap.Entry<Integer,Double> entry : personBRatedItems.entrySet()) {
                if (personARatedItems.containsKey(entry.getKey())) {
                    double ratingB = (double) personBRatedItems.get(entry.getKey());
                    double ratingA = (double) personARatedItems.get(entry.getKey());
                    ratingPersonA[position] = ratingA;
                    ratingPersonB[position] = ratingB;
                    position++;
                }
            }
        }
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
