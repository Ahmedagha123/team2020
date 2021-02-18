package team.pkg2020;
import java.util.Scanner;
public class Team2020 {

    public static void main(String[] args) {
       Scanner scan=new Scanner (System.in);
       int j;
        System.out.println("number of particpants");
       j=scan.nextInt();
       String[] str=new String [j];
       int [] input=new int [j];
       int sum=0;
       for (int i=0; i<j;i++){
           
       System.out.print("Enter  name:  ");
        str[i]=scan.next();
        System.out.println(str[i]);
        System.out.print("Enter year:  ");
        input[i]=scan.nextInt();
        System.out.println(input[i]);
        sum=sum+input[i];
    }
       sum=sum/j;
        System.out.print("Avrage year ->");
        System.out.println(sum);
    }
    
}
