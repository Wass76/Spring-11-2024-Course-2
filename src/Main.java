import java.util.Arrays;
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


    }
}