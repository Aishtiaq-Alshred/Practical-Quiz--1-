import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.




        Scanner input=new Scanner(System.in);

       //sol-1
        System.out.println("Enter the number 1: ");
        int num1= input.nextInt();
        System.out.println("Enter the number 2: ");
        int num2= input.nextInt();
        System.out.println("Enter the number 3: ");
        int num3= input.nextInt();
        if(num1>num2 &&num1>num3){
            System.out.println("the largest number: "+num1);
        }else if(num2>num1 &&num2>num3){
            System.out.println("the largest number: "+num2);}
        else System.out.println("the largest number: "+num3);



        System.out.println("-----------------------------------------");

        //sol-2***

        System.out.println("Enter the string");
      String ch= input.nextLine();
        System.out.println("Enter the number");
      int numb= input.nextInt();
        int sizee= input.nextInt();

      ArrayList<String>character=new ArrayList();
        ArrayList<Integer>numberrs=new ArrayList();


//
        //sol-3
        System.out.println("Enter the number sum wants");
        int n= input.nextInt();
        int sum=0;
        for(int b=1;b<=n;b++){
            System.out.println("enter the number "+b);
            int numberr= input.nextInt();
            sum+=numberr;
        }
        System.out.println(sum);



        //sol-4
        int[]number={10, -21 , 30, 31, -25};
        for(int i=0;i<number.length;i++) {
            if (number[i] > 0) {
                System.out.println(number[i] + " is a positive number ");
            } else
                System.out.println(number[i] + " is a negative  number \n " + "-----------------------------------------");
        }

            //sol-5
            ArrayList<String>array=new ArrayList();
            array.add("Tuwaiq");
            array.add("Bootcamp");
            array.add("Student");
            array.add("JAVA");
        System.out.println(array.getLast());


        }



    }
