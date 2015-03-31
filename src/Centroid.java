/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adriel
 */
public class Centroid {
    
    private double mX = 0.0;
    private double mY = 0.0;

    public Centroid() {
    }

    public Centroid(double newX, double newY) {
        this.mX = newX;
        this.mY = newY;
    }

    public void x(double newX) {
        this.mX = newX;
    }

    public double x() {
        return this.mX;
    }

    public void y(double newY) {
        this.mY = newY;
    }

    public double y() {
        return this.mY;
    }

    public double getmX() {
        return mX;
    }

    public double getmY() {
        return mY;
    }
    
}
