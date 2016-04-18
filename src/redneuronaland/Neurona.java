/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redneuronaland;

/**
 *
 * @author FRK
 */
public class Neurona {
   private double w1;
   private double w2;
   private double umbral;
   private double alpha;
   private double a;
   private double y;
   private int target;
   private double alphaTY;
   private double incrementoW1;
   private double incrementoW2;
   private double incrementoUmbral;
   

    public Neurona(double w1, double w2, double umbral, double alpha) {
        this.w1 = w1;
        this.w2 = w2;
        this.umbral = umbral;
        this.alpha = alpha;
        alphaTY = 0;
        incrementoW1 = 0;
        incrementoW2 = 0;
        incrementoUmbral = 0;
    }
    
    public void epoca (int x1, int x2, int t){
        double [] array = new double[4];
        w1 += incrementoW1;
        w2 += incrementoW2;
        umbral += incrementoUmbral;
        this.target = t;
        this.a = (x1 * w1) + (x2 * w2);
        if(a>=umbral)y = 1;
        else y = 0;
        if(y != target){
            this.alphaTY = this.alpha*(target - y);
            this.incrementoW1 = alphaTY * x1;
            this.incrementoW1 = alphaTY * x2;
            this.incrementoUmbral = -1 *alphaTY;
        }
    }

    public double getW1() {
        return w1;
    }

    public double getW2() {
        return w2;
    }

    public double getUmbral() {
        return umbral;
    }

    public double getAlpha() {
        return alpha;
    }
    public double getA() {
        return a;
    }       
    public double getY() {
        return y;
    }
    public int getTarget() {
        return target;
    }

    public double getAlphaTY() {
        return alphaTY;
    }

    public double getIncrementoW1() {
        return incrementoW1;
    }

    public double getIncrementoW2() {
        return incrementoW2;
    }

    public double getIncrementoUmbral() {
        return incrementoUmbral;
    }
    
   
           
   
          
}
