/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author:Joseph T. McQuigg
 *
 *************************************************************************/

public class Sierpinski {

    // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) {

    // WRITE YOUR CODE HERE
    return ((length * Math.sqrt(3))/2);
    }

    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length. 
    public static void filledTriangle(double x, double y, double length) {

    // WRITE YOUR CODE HERE
    double x1[] = new double[3];
    double y1[] = new double[3];
    x1[0] = x;
    y1[0] = y;
    y1[1] = y + height(length);
    y1[2] = y1[1];
    x1[1] = (x1[0] + (length/2));
    x1[2] = (x1[0] - (length/2));

    StdDraw.filledPolygon(x1, y1);
        
    }

    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length) {

    // WRITE YOUR CODE HERE


    filledTriangle(x, y, length);
    if(n == 1){
        filledTriangle(x, y, length);
        
     }else if (n != 1){
         double[] x2  = {x, x+(length/2), x-(length/2)};
         double[] y2 = {y, y + (height(length)), y + (height(length))};
         sierpinski(n-1, x2[2], y2[0], length/2);
         sierpinski(n-1, x2[1], y2[0], length/2);
         sierpinski(n-1, x2[0], y2[2], length/2);
     }
    
    }

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) {
    
 
    // WRITE YOUR CODE HERE
    double[] x =  {0.0, 1.0, .5};
    double[] y =  {0.0, 0.0, (Math.sqrt(3)/2)};
    StdDraw.polygon(x, y);
   sierpinski(Integer.parseInt(args[0]), 0.5, 0.0, .5);
    
 


    
    


    }
}
