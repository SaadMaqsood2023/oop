package Arrays_Q;

//simport Arrays_Q.CreditCard;

public class Import_file
{
    public static void main(String args[])
    {
        CreditCard c1[] = new CreditCard[3];
        c1[0] = new CreditCard("Anni", "Habib", "5391 0375 9387 5309", 5000);
        c1[1] = new CreditCard("Faiz", "Meezan", "5391 0375 9387 5309", 3000);
        c1[2] = new CreditCard("Sara", "Summmit", "5391 0375 9387 5309", 4000);
        System.out.print("You want to check for palindrome");

        
        for(CreditCard card: c1)
        {
            CreditCard.printSummary(card);
            while(card.getBalance()>200)
                card.makePayment(200);
            System.out.println(card.getBalance());
        }
        
    }
}