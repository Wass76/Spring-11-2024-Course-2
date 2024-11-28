import peace.Elephent;
import peace.Stone;

import java.util.Scanner;

public class Main {

    public static void printName(String s){
        System.out.println(s);
    }

    public static int add(int a, int b){
        return a + b;
    }
    public static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
    public static double getSalary(double salary){
        return salary*10;
    }
    // @Overload
    public static double getSalary(double salary , double mark){
        return salary*100;
    }

    public static double getSalary(int salary ){
        return salary*1000;
    }

    // Wrong case
//    public static int getSalary(int salary){
//        return salary*10000;
//    }

    public static void main(String[] args) {


//        Stone stone  = new Stone("0","",true);
//        Stone stone = new Stone();
//        stone.setColor("Red");
//        stone.getColor();
//        System.out.println(stone);
//
//        Elephent e1 = new Elephent("0","red",true,1);
//        e1.setColor("blue");
//        System.out.println(e1);
//        e1.getColor();
//
//        e1.move("0");
//


//        Elephent e2 = new Elephent();
//        e2.setPosition("0");
//        e2.setColor("red");
//        e2.setAlive(true);
//        e2.setAge(1);
//        System.out.println(e2);

        Elephent e = new Elephent("0","red",true,1);
        e.move("0");
        e.getColor();







        String s1 = "Khalil";
//        String s2 = "Obada";
//        String s3 = "Zain";
//
        // Declare
//        double d [];

        // Create
//        String[] s = new String[3];

//        int ss [] = new int[5];
//
//        int[] i = {134,2,30,4,5,3,7,8,22,10};

//        System.out.println(i.length);


        // default value of int array elements is zero
        // default value of string array elements is null

//        for(int j=0;j<3;j++){
//            System.out.println(s[j]);
//        }

        Scanner sc = new Scanner(System.in);
//        int num_of_elements  = sc.nextInt();
////        num_of_elements = ;
//
//        int[] arr = new int[num_of_elements];
////        System.out.println("Enter the size of array");
//        for(int j = 0; j< num_of_elements; j++)
//        {
//            arr[j] = j;
//        }
//
//        for(int j = 0; j< num_of_elements; j++){
//            System.out.println(arr[j]);
//        }
//        System.out.println("length: " +
//                arr.length);


        // foreach
//        int init = 10;
//        for(int l : ss){
//            init = sc.nextInt();
//        }

//        String[] str = new String[4];
//        Arrays.fill(str, "a");

//        Arrays.sort(i);
//        for(int integer : i){
//            System.out.println(integer);
//        }

//        int[] ii= {1 , 2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};
//
//        System.out.println(Arrays.equals(i , ii));



        // Functions:
        // 1- code reuse
        // 2- modularity (clean code)
        // 3- readability
        // access_modified - returnType - methodName - (parameters) - {body}

//        printName("Ahmad");
//
//
////        int i = add(4,3);
//
//        System.out.println( add(4,3) );
//        System.out.println(fullName("Khalil" , "Ma'louli"));
//
//        System.out.println(getSalary(3));


        // Find the largest element of int array

//        int[] a = {1 , 3 ,5 ,2 ,6, 88, 23, 83, 89, 10, 22};
//
//        System.out.println(largestItem(a));






//  Session 4

//      1-
        // call function in another function
//        System.out.println("Square of the sum is: " + squareOfSum(4,2));

//      2 - recursion (Fib)



//        int result = fib(5);
//        System.out.println(result);



//        System.out.println(fib(5));


//        OOP

//        Elephent elephent = new Elephent("5:4" , "Black" , true);
//        System.out.println(elephent.getColor());
//        System.out.println(elephent.isAlive());


//        System.out.println(elephent);

//        System.out.println();

    }


    public static int fib(int n){
        if(n==1 ||  n == 0)
            return n;

        return fib(n-1) + fib(n-2);
    }




    // access modified - return Type - name - attr (param) -  {body}
    public static int largestItem(int[] array){
        int max = array[0];

        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int squareOfSum(int n1 , int n2){
        int sum1 = sum(n1 , n2);
//        System.out.println("sum in squareOfSum: " + sum1);
        return sum1 * sum1;
    }

    public static  int sum(int n1 , int n2){
        return n1 + n2;
    }





//    public static int square(int number) {
//        return number * number;
//    }
//
//    public static int squareOfSum(int a, int b) {
//        int sum = a + b;
//        return square(sum);
//    }
}