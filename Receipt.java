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
        double cof = input.nextInt() * 2.99;
        String coffee = String.valueOf(cof);

        System.out.print("Bacon (0.99 per bacon slice): ");
        double bac = input.nextInt() * 0.99;
        String bacon = String.valueOf(bac);

        System.out.print("Waffles (2.99 for two): ");
        double waf = input.nextInt() * 2.99;
        String waffles = String.valueOf(waf);

        System.out.print("Cereal (1.99 per cup): ");
        double cer = input.nextInt() * 1.99;
        String cereal = String.valueOf(cer);

        System.out.print("Fruit (1.99 per cup):");
        double fru = input.nextInt() * 1.99;
        String fruit = String.valueOf(fru);

        System.out.print("Omelets (1.99 per two eggs):");
        double eggy = input.nextInt() * 1.99;
        String eggs = String.valueOf(eggy);

        //print receipt time
        System.out.println("****************************************");
        System.out.println("ITEMS                              PRICE");

        if (cof != 0)
        {
            
        }

        if (bac != 0)
        {
            
        }

        if (waf != 0)
        {
            
        }

        if (cer != 0)
        {
           
        }

        if (fru != 0)
        {
            
        }

        if (eggy != 0)
        {
            
        }
        double total = eggy + fru + cof + bac + waf + cer;

        System.out.println("                      Subtotal: " + total);
        System.out.println("                      Total: " + (total * 1.025));
        System.out.println();
        System.out.println("THANK YOU FOR SHOPPING WITH US");
        System.out.println("****************************************");

        input.close();
    }

}