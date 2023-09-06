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
            System.out.print("COFFEE");
            for (int i = 0; i < (34 - coffee.length()); i++)
            {
                System.out.print(" ");
            }
            System.out.println(String.format("%.2f", cof));
        }

        if (bac != 0)
        {
            System.out.print("BACON");
            for (int i = 0; i < (35 - bacon.length()); i++)
            {
                System.out.print(" ");
            }
            System.out.println(String.format("%.2f", bac));
        }

        if (waf != 0)
        {
            System.out.print("WAFFLES");
            for (int i = 0; i < (33 - waffles.length()); i++)
            {
                System.out.print(" ");
            }
            System.out.println(String.format("%.2f", waf));
        }

        if (cer != 0)
        {
           System.out.print("CEREAL");
            for (int i = 0; i < (33 - cereal.length()); i++)
            {
                System.out.print(" ");
            }
            System.out.println(String.format("%.2f", cer));
        }

        if (fru != 0)
        {
            
        }

        if (eggy != 0)
        {
            
        }

        double tot = eggy + fru + cof + bac + waf + cer;
        String total = String.valueOf(tot);

        System.out.println("                      Subtotal: " + total);
        System.out.println("                      Total: " + (total * 1.025));
        System.out.println();
        System.out.println("     THANK YOU FOR SHOPPING WITH US     ");
        System.out.println("****************************************");

        input.close();
    }

}