/**
 * class: SixPointTester
 * description
 * @author:
 */
import java.util.Scanner;
public class SixPointTester {

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

         computeShortestDistance(enterPoints());
    }

    public static  Point[] enterPoints(){
        Point[] points = new Point[6];
        System.out.println("Enter 6 points of x and y coordinates: ");


        for(int i = 0; i < points.length; i++ ){

            //complete here.
            double x = input.nextDouble();
            double y = input.nextDouble();
            points[i] = new Point(x,y);
            // points[i] = new Point(input.nextDouble(),input.nextDouble());
        }

        return points;
    }


    public static void computeShortestDistance(Point[] points){
        double shortestDistance = Double.MAX_VALUE;
        Point p1 = null;//initialize with default value. make it to point to the null
        // p1 = new Point[index];
        Point p2 = null;
        for (int i = 0; i < points.length; i++){
            for(int j = i + 1; j < points.length ; j++ ){
               double dist =  Point.distance(points[i],points[j]);
               if(dist < shortestDistance){
                   shortestDistance = dist;
                   p1 = points[i]; //complete
                   p2 = points[j]; //complete
               }
            }
        }

        System.out.printf("The shortest distance of two points are " +p1 + " and " + p2 + " and their distance is (%.2f)" ,shortestDistance );
    }
}
