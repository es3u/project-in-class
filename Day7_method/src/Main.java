import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //  System.out.println("Hello world!");

        Scanner in = new Scanner(System.in);
//
//        String n ="essa";
//        print();
//        print(n);

//        System.out.println(" enter your  number");
//        int num1 = in.nextInt();
//        System.out.println(" enter your  number");
//        int num2 = in.nextInt();


//        sum(num1, num2);
//        min(num1,num2);
//        dvid(num1,num2);
//        dis(num1,num2);

//        int avr = (sum2(num1,num2)/2);
//
//        System.out.println("avarege is "+avr);

      //  int[] arr = {1,2,3,4,5,};
            //printarr(arr);


        //System.out.println(printarr2(arr));

//        ArrayList arrlist = new ArrayList<>();
//
//        arrlist.add("Sara");
//        arrlist.add("Asma");
//        arrlist.add("MAjd");
//        arrlist.add("Ahmed");
//
//        System.out.println(printA(arrlist));


        ArrayList <String> Essa = new ArrayList<>();

        System.out.println("pleas enter your note or out");
        String no = in.nextLine();
        do{
            Essa.add(no);


            System.out.println("pleas enter your note or out");
             no = in.nextLine();
        }while(!no.equals("out"));

      //  System.out.println(Essa);
        int no1 ;
        for (int i = 0; i <Essa.size() ;i++ ) {
            System.out.println("enter number of note ");
             no1 = in.nextInt();

           printNotes(Essa,no1);
        }

        System.out.println("Press zero to view how many observations you have ");
        int no2 = in.nextInt();

        if(no2==0)
            System.out.println(arrcount(Essa));
        else
        System.out.println("**end**");



    }

        public static void printNotes(ArrayList<String>arr , int no1){
       // ArrayList<String> newArr =new ArrayList<>();

            System.out.println(arr.get(no1));



        }

        public static int arrcount(ArrayList<String> arr){


        int a =  arr.size();
        return a;
        }






















//    public static ArrayList<String> printA(ArrayList <String> arrlist){
//
//        ArrayList <String> ar = new ArrayList();
//
//
//        for(String a : arrlist){
//            if (a.startsWith("A")){
//                    ar.add(a);
//            }
//        }
//        return ar;
//        }




//    }

//    public static void printarr (int [] arr){
//
//        for(int n : arr){
//            System.out.println(n);
//        }
//
//    }
//
//
//    public static int[] printarr2(int [] arr){
//
//        return arr;
//    }












//    public static void print(){
//        String name = "Essa";
//        System.out.println("hello my method 1:" + name);
//    }


//    public static void print(String name ){
//        System.out.println("hello my method 2:"+ name);
//    }


//    public static void sum (int num1 , int num2){
//
//        System.out.println(" + is : "+ num1+num2);
//
//    }

//    public static int sum2(int num1 ,int num2){
//
//        return num1+num2;
//
//    }


//    public static void min (int num1 , int num2){
//        int min = num1-num2;
//        System.out.println(" - is "+min);
//    }

//
//    public static void dvid (int num1 , int num2){
//
//        System.out.println("  /"+" is : "+ (num2/num1));
//    }

//
//    public static void dis (int num1 , int num2){
//
//        System.out.println(" * is : "+ (num1*num2));
//    }






}