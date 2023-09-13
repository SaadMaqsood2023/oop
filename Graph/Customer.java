import java.util.ArrayList;
import java.util.Scanner;

public class Customer {

    Scanner obj = new Scanner(System.in);

    public static void addProduct(ArrayList<Inventory.Edge> mGraph[], String product)
    {
        // Inventory myinInventory = new Inventory();

        // for(int i=0; i<mGraph.length; ++i)
        // {
        //     mGraph[i] = new ArrayList<Inventory.Edge>();
        // }
        Inventory.createGraph(mGraph, product);
        System.out.println("Product has been successfully added");
    }

    public static int saveProductEntered(ArrayList<String> saveproduct)
    {
        int j = 0;
        for(String i : saveproduct)
        {
            ++j;
            System.out.print(j + ", " + i + "  ");
        }
        System.out.println();
        return j;
    }

    static ArrayList<String> myproducts;



    static int buyproductnumber;

    // It will show all the products which owner has entered
    public int showProducts()
    {
        ArrayList<String> mylist = myproducts;

        int j = 0;
        for(String i : mylist)
        {
            ++j;
            System.out.print(j + ", " + i + "  ");
        }
        System.out.println();
        
        System.out.println("You want to buy product which product.");
        for(int i=1; i<=j; ++i)
        {
            System.out.println(i);
        }
        
        int cust_buy = obj.nextInt();

        buyproductnumber = cust_buy;
        return j;
    }


    public void buyProduct()
    {
        int b_pro = buyproductnumber;
        System.out.println("You want to buy " + b_pro+" number product.");
        System.out.println("Press Y to buy it.");
        System.out.println("Press N to buy again");
        System.out.println("Press any thing else to exit");
        char permit;
        permit = obj.next().charAt(0);
        if(permit == 'y' || permit == 'Y')
        {
            System.out.println("Thank you for buying "+b_pro + " number product");
        }
        else if(permit == 'n' || permit == 'N')
        {
            showProducts();
            buyProduct();
        }
        else
        {
            System.out.println("You have Exited");
        }

    }

    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        myproducts = new ArrayList<>();

        char permit = 'y';
        do
        {
            ArrayList<Inventory.Edge> mGraph[] = new ArrayList[33];
            System.out.println("Enter the product in the inventory");
            String producString = obj.next();
            
            addProduct(mGraph, producString);
            Inventory.Edge e = mGraph[0].get(0);
            String EnteredProduct = e.src;
            myproducts.add(EnteredProduct);
            System.out.println(e.src);

            System.out.println("You want to enter another product");
            permit = obj.next().charAt(0);
            // obj.nextLine();

        }while(permit == 'y' || permit == 'Y');
        saveProductEntered(myproducts);
        

        Customer customer = new Customer();

        int j =customer.showProducts();
        // System.out.println("You want to buy product which product.");
        // for(int i=1; i<=j; ++i)
        // {
        //     System.out.println(i);
        // }
    
        // int cust_buy;
        // cust_buy = obj.nextInt();
    

        // buyproductnumber = cust_buy;
        customer.buyProduct();
        obj.close();
    }

    
}
