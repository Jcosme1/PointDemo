public class NamedMultipointTester extends SixPointTester{


    public static  NamedPoint[] enterPoints(){
        NamedPoint[] a = new NamedPoint[6];
        System.out.println("Enter 6 points of x and y coordinates: ");

        String[] letters = new String[]{"a:","b:","c:","d:","e:","f:"};// i think i could have added to the sixpointtester class but this makes more sense to em
        for(int i = 0; i < a.length; i++ ){

            String name = letters[i];
            double x = input.nextDouble();
            double y = input.nextDouble();
            a [i] = new NamedPoint(x,y,name);
            // points[i] = new Point(input.nextDouble(),input.nextDouble());
        }

        return a;
    }
    public static void main(String[] args) {
        //changing enterpoints to add an array of letters but inherited the computeshorteset distance
        computeShortestDistance(enterPoints());
    }
}
