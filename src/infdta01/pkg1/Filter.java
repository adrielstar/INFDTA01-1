package infdta01.pkg1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author isaacdecuba
 */
public class Filter {
    
    private final double[] ratingPersonA;
    private final double[] ratingPersonB;

    /**
     * Filters the two HashMaps and put the same rated items into array
     * 
     * @param personARatedItems
     * @param personBRatedItems 
     */
    public Filter(HashMap<Integer, Double> personARatedItems, HashMap<Integer, Double> personBRatedItems) {

        int count = 0;
        int pos = 0;
        if (personARatedItems.size() < personBRatedItems.size()) {
            for (HashMap.Entry<Integer, Double> entry : personARatedItems.entrySet()) {
                if (personBRatedItems.containsKey(entry.getKey())) {
                    count++;
                }
            }
            this.ratingPersonA = new double[count];
            this.ratingPersonB = new double[count];
            
            for (HashMap.Entry<Integer, Double> entry : personARatedItems.entrySet()) {
                if (personBRatedItems.containsKey(entry.getKey())) {
                    this.ratingPersonA[pos] = (double) personARatedItems.get(entry.getKey());
                    this.ratingPersonB[pos] = (double) personBRatedItems.get(entry.getKey());
                    pos++;
                }
            }
        } else {
            for (HashMap.Entry<Integer, Double> entry : personARatedItems.entrySet()) {
                if (personBRatedItems.containsKey(entry.getKey())) {
                    count++;
                }
            }
            this.ratingPersonA = new double[count];
            this.ratingPersonB = new double[count];
            
            for (HashMap.Entry<Integer, Double> entry : personBRatedItems.entrySet()) {
                if (personARatedItems.containsKey(entry.getKey())) {
                    this.ratingPersonA[pos] = (double) personBRatedItems.get(entry.getKey());
                    this.ratingPersonB[pos] = (double) personARatedItems.get(entry.getKey());
                    pos++;
                }
            }
        }
    }
    
    public double[] getPersonA() {
        return this.ratingPersonA;
    }
    
    public double[] getPersonB() {
        return this.ratingPersonB;
    }
}
