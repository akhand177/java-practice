/*public class Main {
    public static void main (String []args){
        String [] cars ={"volvo","tata","mahindra","ford"};
        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);

        }

    }
}*/

/*public class Main {
    public static void main (String []args ){
    int [][] myNumbers = {{1,2,3},{4,5,7}} ;
    System.out.println(myNumbers[1][2]);

    }
}*/

/*public class Main{
    public static void main (String [] args ){
        int [][] myNumbers = {{1,2,3,},{5,6,7}};
        for (int i=0; i<myNumbers.length; ++i){
            for (int j=0; j<myNumbers[i].length; ++j){
                System.out.println(myNumbers[i][j]);
            }
        }

    }
}*/

/*public class Main {
    static  void myMethod(){
        System.out.println("i just got executed");
    }
    public static void main (String []args){
        myMethod();
    }
}*/

/*public class Main {
    static void myMethod(){
        System.out.println("he i am akhand pratap singh");
    }
    public static void main ( String []arga){
        myMethod();
        myMethod();
        myMethod();
    }
}*/


/*public class Main {
    static void myMethod(String fname){
        System.out.println(fname + " are friends ");
    }
    public static void main (String []args){
        myMethod("akhand" );
        myMethod("jitu");
        myMethod("aaryan");
    }
}*/

/*public class Main {
    static int myMethod(int x){
        return 5+ x;
    }
    public static void main (String []args){
        System.out.println(myMethod(3));
    }
}*/

//return the sum of a method's two parameter

/*public class Main {
    static int myMethod(int x , int y){
        return x + y;
    }
    public static void main (String args[]){
        System.out.println(myMethod(5, 04));
    }
}*/

// you can also store the return in a veriable 

/*public class Main {
    static int myMethod(int x , int y){
        return x + y;

    }
    public static void main (String args[]){
        int z = myMethod(5, 03);
    }



}*/

/*public class Main{
    static void chackAge(int age) {
        //if age is less then 18 , print(access denied )
        
        if (age < 18 ) {
            System.out.println("access denied");

            //if is age greater then 18 or equal 18 , print( access granted )


        }else {
            System.out.println("access granted");
        }
    } public static void main (String args[]){
        chackAge(30);
    }

}*/

public class Main {

    static int plusMethodInt(int x , int y){
        return x+ y;
    }
    static double plusMethodDouble( double x , double y){
        return x + y;
    }
    public static void main ( String args[]){
        int myNum1 = plusMethodInt(8, 04);
        double myNum2 = plusMethodDouble(4.3, 3.3);
        System.out.println("int: " +myNum1);
        System.out.println("double: "  +myNum2 );
    }

}


