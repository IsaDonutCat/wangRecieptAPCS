import java.util.Scanner; 

public class Receipt 
{

    public static void main (String[] args)
    { 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to my store! I sell breakfast items.");
        System.out.println("Please type the quantity that you want of an item"); 
        System.out.println();
        
        System.out.print("Coffee (2.99 per cup):");
        double coffee = input.nextInt() * 2.99;

        System.out.print("Bacon (0.99 per bacon slice): ");
        double bacon = input.nextInt() * 0.99;

        System.out.print("Waffles (2.99 for two): ");
        double waffles = input.nextInt() * 2.99;

        System.out.print("Cereal (1.99 per cup): ");
        double cereal = input.nextInt() * 1.99;

        System.out.print("Fruit (1.99 per cup):");
        double fruit = input.nextInt() * 1.99;

        System.out.print("Omelets (1.99 per two eggs):");
        double eggs = input.nextInt() * 1.99;

        System.out.println("****************************************");
        System.out.println("ITEMS                              PRICE");

        if (coffee != 0)
        {
            System.out.print("COFFEE");
            if (coffee > 9.99)
            {
                System.out.println("*****************************" + coffee);
            }
            else
            {
                System.out.println("******************************" + coffee);
            }
        }

        if (bacon != 0)
        {
            System.out.print("BACON");
            if (bacon > 9.99)
            {
                System.out.println("******************************" + bacon);
            }
            else
            {
                System.out.println("*******************************" + bacon);
            }
        }

        if (waffles != 0)
        {
            System.out.print("WAFFLES");
            if (waffles > 9.99)
            {
                System.out.println("****************************" + waffles);
            }
            else
            {
                System.out.println("*****************************" + waffles);
            }
        }

        if (cereal != 0)
        {
            System.out.print("CEREAL");
            if (cereal > 9.99)
            {
                System.out.println("*****************************" + cereal);
            }
            else
            {
                System.out.println("******************************" + cereal);
            }
        }

        if (fruit != 0)
        {
            System.out.print("FRUIT");
            if (fruit > 9.99)
            {
                System.out.println("******************************" + fruit);
            }
            else
            {
                System.out.println("*******************************" + fruit);
            }
        }

        if (eggs != 0)
        {
            System.out.print("OMELET");
            if (eggs > 9.99)
            {
                System.out.println("*****************************" + eggs);
            }
            else
            {
                System.out.println("******************************" + eggs);
            }
        }
    }

}