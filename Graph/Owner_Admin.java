// import java.util.ArrayList;
// import java.util.Scanner;

// public class Owner_Admin 
// {

//     public static void addProduct(ArrayList<Inventory.Edge> mGraph[], String product)
//     {
//         // Inventory myinInventory = new Inventory();

//         // for(int i=0; i<mGraph.length; ++i)
//         // {
//         //     mGraph[i] = new ArrayList<Inventory.Edge>();
//         // }
//         Inventory.createGraph(mGraph, product);
//         System.out.println("Product has been successfully added");
//     }

//     public static int saveProductEntered(ArrayList<String> saveproduct)
//     {
//         int j = 0;
//         for(String i : saveproduct)
//         {
//             ++j;
//             System.out.print(j + ", " + i + "  ");
//         }
//         System.out.println();
//         return j;
//     }

// static ArrayList<String> myproducts;

//     public static void main(String[] args) {
        
//         Scanner obj = new Scanner(System.in);
//         myproducts = new ArrayList<>();

//         char permit = 'y';
//         do
//         {
//             ArrayList<Inventory.Edge> mGraph[] = new ArrayList[33];
//             System.out.println("Enter the products in the inventory");
//             String producString = obj.nextLine();
            
//             addProduct(mGraph, producString);
//             Inventory.Edge e = mGraph[0].get(0);
//             String EnteredProduct = e.src;
//             myproducts.add(EnteredProduct);
//             System.out.println(e.src);

//             System.out.println("You want to enter another project");
//             permit = obj.next().charAt(0);
//             obj.nextLine();

//         }while(permit == 'y' || permit == 'Y');
//         saveProductEntered(myproducts);


//         obj.close();

//     }


    
// }
