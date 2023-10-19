import java.util.Scanner; 

public class Receipt 
{

    
    /** 
     * @param args
     */
    public static void main (String[] args)
    { 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to my store! I sell breakfast items.");
        System.out.println("Please type the quantity that you want of an item"); 
        System.out.println();

        System.out.print("Coffee (2.99 per cup):");
        double cof = input.nextInt() * 2.99;
        int COF = (int) cof;
        String coffee = String.valueOf(COF);

        System.out.print("Bacon (0.99 per bacon slice): ");
        double bac = input.nextInt() * 0.99; 
        int BAC = (int) bac;
        String bacon = String.valueOf(BAC);

        System.out.print("Waffles (3.99 for two): ");
        double waf = input.nextInt() * 3.99;
        int WAF = (int) waf;
        String waffles = String.valueOf(WAF);

        System.out.print("Cereal (1.99 per cup): ");
        double cer = input.nextInt() * 1.99;
        int CER = (int) cer;
        String cereal = String.valueOf(CER);

        System.out.print("Fruit (1.99 per cup):");
        double fru = input.nextInt() * 1.99;
        int FRU = (int) fru;
        String fruit = String.valueOf(FRU);

        System.out.print("Omelets (1.99 per two eggs):");
        double eggy = input.nextInt() * 1.99;
        int EGGY = (int) eggy;
        String eggs = String.valueOf(EGGY);

        //print receipt time
        System.out.println();
        System.out.println();

        System.out.println("****************************************");
        System.out.println("ITEMS                              PRICE");
        System.out.println();
        
        if (cof != 0)
        {   
            System.out.print("COFFEE");
            for (int i = 0; i < (31 - coffee.length()); i++)
            {
                System.out.print(" ");
            }
            System.out.println(String.format("%.2f", cof));
        }

        if (bac != 0)
        {
            System.out.print("BACON");
            for (int i = 0; i < (32 - bacon.length()); i++)
            {
                System.out.print(" ");
            }
            System.out.println(String.format("%.2f", bac));
        }

        if (waf != 0)
        {
            System.out.print("WAFFLES");
            for (int i = 0; i < (30 - waffles.length()); i++)
            {
                System.out.print(" ");
            }
            System.out.println(String.format("%.2f", waf));
        }

        if (cer != 0)
        {
           System.out.print("CEREAL");
            for (int i = 0; i < (31 - cereal.length()); i++)
            {
                System.out.print(" ");
            }
            System.out.println(String.format("%.2f", cer));
        }

        if (fru != 0)
        {
            System.out.print("FRUIT");
            for (int i = 0; i < (32 - fruit.length()); i++)
            {
                System.out.print(" ");
            }
            System.out.println(String.format("%.2f", fru));
        }

        if (eggy != 0)
        {
            System.out.print("EGGS");
            for (int i = 0; i < (33 - eggs.length()); i++)
            {
                System.out.print(" ");
            }
            System.out.println(String.format("%.2f", eggy));
        }

        System.out.println("****************************************");

        double tot = eggy + fru + cof + bac + waf + cer;
        int inTot = (int) tot;
        String total = String.valueOf(inTot); 

        System.out.print("SUBTOTAL:");
        for (int i = 0; i < (28 - total.length()); i++)
        {
            System.out.print(" ");
        }
        System.out.println(String.format("%.2f", tot));
        
        tot *= 1.025;
        inTot = (int) tot;
        total = String.valueOf(inTot); // length of numbers before the decimal. d

        System.out.print("TOTAL:");
        for (int i = 0; i < (31 - total.length()); i++)
        {
            System.out.print(" ");
        }
        System.out.println(String.format("%.2f", tot));

        System.out.println();
        System.out.println("     THANK YOU FOR SHOPPING WITH US     ");
        System.out.println("****************************************");

        input.close();
    }

}