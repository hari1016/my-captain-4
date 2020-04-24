package javaapplication3;
import java.lang.*;
import java.util.*;
public class JavaApplication3 
{
    public static void main(String[] args) 
    {
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choice:\n1.cofee\n2.tea\n3.green tea\n4.cappuccino");
        choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("you ordered a cofeee");
                break;
            case 2:
                System.out.println("you ordered a tea");
                break;
            case 3:
                System.out.println("you ordered a green tea");
                break;
            case 4:
                System.out.println("you ordered a cappuccino");
                break;
            default:
                System.out.println("your order is unavailable right now");
        }
    }
}
