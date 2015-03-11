/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infdta01.pkg1;

/**
 *
 * @author isaacdecuba
 */
public class Euclidean {
    
    /**
     * Calculates the Euclidean between PersonA and a person X
     * 
     * @param ratingPersonA
     * @param ratingPersonX
     * @return result
     */
    public double calcEuclidean(double[] ratingPersonA, double[] ratingPersonX)
    {
        // length ratingP A can differ from ratingX
        double result = 1.0;
        
        for (int i = 0; i <= ratingPersonA.length; i++) {
            result+= Math.pow(Math.abs(ratingPersonA[i] - ratingPersonX[i]),2);
        }
        result = Math.sqrt(result);
        return result;
    }
    
    public boolean ratedSameProduct(double[] ratingPersonA, double[] ratingPersonX)
    {
        double ratings[][];
        int n = ratingPersonA.length;
        double result = 0.0;
        
        for (int i = 0; i < n; i++) {
            if (ratingPersonA[i] == ratingPersonA[i]) {
                return true;
            }
        }
        return false;
    }
    
}
