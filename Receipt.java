import java.util.Scanner; 

public class Receipt 
{

    public static void main (String[] args)
    { 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to my store! I sell breakfast items.");
        System.out.println("Please type the quantity that you want of an item"); 
        System.out.print("Coffee:");
        double coffee = input.nextInt() * 2.99;

        System.out.print("Bacon: ");
        double bacon = input.nextInt() * 0.99;

        System.out.print("Waffles: ");
        double waffles = input.nextInt() * 2.99;

        System.out.print("Cereal: ");
        double waffles = input.nextInt() * 1.99;

        System.out.print(s:"Fruit:");
        double waffles = input.nextInt() * 1.99;

        System.out.print("Omelets:");
        double eggs = input.nextInt() * 1.99;

        System.out.println("*");
        
    }

}