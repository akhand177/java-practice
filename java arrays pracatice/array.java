/*public class array{
    public static void main( String [] args){

        int[][] myNumbers={{1,2,3,4},{5,6,7}};
        System.out.println(myNumbers[1] [2]);
    }
}*/

/*public class array{
    public static void main(String []args){
        int[][] myNumbers = {{1,2,3,4},{5,6,7}};
        for(int i=0; i<myNumbers.length; ++i){
            for(int j=0; j< myNumbers[i].length;++j){
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}*/

//java methods

/*public class array{
    static void myMethod(){
        System.out.println("i just go to executed");

    }public static void main (String [] args){
        
        myMethod();
                   myMethod();      
   myMethod();

    }
}*/

//multiple Parameters

/*public class array{
    static void myMethod(String fname, int age){
        System.out.println(fname +"is" +age);
    }
    public static void main(String[] args) {
        myMethod("Liam",  50);
        myMethod("jenny", 8);
        myMethod("Anja", 31);
    }
}*/

//return values in java method
/*public class array {
  static int myMethod(int x) {
    return 5 + x;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(3));
  }
}*/

// Create a checkAge() method with an integer variable called age



/*public class array{
    static int plusMethodInt(int x, int y) {
        return x + y;
      }
      
      static double plusMethodDouble(double x, double y) {
        return x + y;
      }
      
      public static void main(String[] args) {
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
      }
}*/

//Q1 Write a Java program that reads a number in inches and converts it to meters.

/*import java.util.Scanner;

public class array {
    public static void main (String []args ){

        Scanner s = new Scanner(System.in);
        System.out.println("input a value for meter :");
        double meter = s .nextDouble ();
        double inch = meter * 39.3701;
        System.out.println(inch + "is inch value");


    }
}*/

//write a java program to convert minutes into year and days 

/*import java.util.Scanner;

public class array{
    public static void main (String []args){

        double minutesInYear=60*24*365;
        Scanner input = new Scanner (System.in);
        System.out.println("Input the number of mintues:");
        double min = input.nextDouble();

        long years = (long) (min/ minutesInYear );
        int days = (int ) (min/60/24)%365;

        System.out.println((int) min +"mintues is approximately" +years+ "years and " +days+"days");
    }
    }*/

/*import java.util.Scanner;

public class array{
        public static void main ( String []args ){

            Scanner input = new Scanner(System .in );

            System .out.println( "enter the year :");

            double year = input.nextDouble ();

            double min =year*525960;

            System.out.println(min+"is mint ");

        }
    }*/

    
