/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author:Joseph T. McQuigg
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {

    // WRITE YOUR CODE HERE
        double[] copy1 = new double[array.length];
        for(int i = 0; i < array.length; i++)
            copy1[i] = array[i];

        return copy1;
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {

    // WRITE YOUR CODE HERE
    for(int i = 0; i < x.length; i++)
        x[i] = x[i] * alpha;

    for(int i = 0; i < y.length; i++)
        y[i] = y[i] * alpha;

    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {

    // WRITE YOUR CODE HERE
    for(int i = 0; i < x.length; i++)
        x[i] = x[i] + dx;

    for(int i = 0; i < y.length; i++)
        y[i] = y[i] + dy;
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {

    // WRITE YOUR CODE HERE
    double oldX[] = new double[x.length];
    double oldY[] = new double[y.length];
    theta = (theta * (Math.PI/180));

    for(int i = 0; i < x.length; i++)
        oldX[i] = x[i];

    for(int i = 0; i < y.length; i++)
        oldY[i] = y[i];


    for(int i = 0; i < x.length; i++)
        x[i] = (oldX[i] * Math.cos(theta))-(oldY[i] * Math.sin(theta)); 

    for(int i = 0; i < y.length; i++)
        y[i] = (oldY[i] * Math.cos(theta))+(oldX[i] * Math.sin(theta)); 
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {

    // WRITE YOUR CODE HERE

    }
}
