package Arrays_Q;

public class CreditCard {
        //Instance variables:
        private String customer;
        private String bank;
        private String account;
        private int limit;
        protected double balance;

        //Constructors:
        public CreditCard(String cust, String bk, String acnt, int lim, double initialBal)
        {
            customer = cust;
            bank = bk;
            account = acnt;
            limit = lim;
            balance = initialBal;
        }

        public CreditCard(String cust, String bk, String acnt, int lim)
        {
            this(cust,bk,acnt,lim,0.0);
        }

        //Accerssor methods;
        public String getCustomer(){ return customer;}
        public String getBank(){ return bank;}
        public String getAccount() { return account;}
        public int getLimit() { return limit;}
        public double getBalance() { return balance;}

        //Update methods:
        public boolean charge(double price)
        {
            if(price+balance > limit)
            return false;
            //at this point the charge is successful
            balance += price;
            return true;
        }
        public void makePayment(double amount){
            balance -= amount;
        }

        //Utility method to print a card's information
        public static void printSummary(CreditCard card){
            System.out.println("Customer = " + card.customer);
            System.out.println("Bank = "+ card.bank);
            System.out.println("Account = " + card.account);
            System.out.println("Balance = "+ card.balance);
            System.out.println("Limit = "+ card.limit);
        }

        //main method shown on next page...
        public static void main(String args[])
        {
            CreditCard[] wallet = new CreditCard[3];
            wallet[0] = new CreditCard("John Bowman","California Savings",
                        "5391 0375 9387 5309",5000);
            wallet[1] = new CreditCard("John Bowman","California Savings",
                        "5391 0375 9387 5309",3500);
            wallet[2] = new CreditCard("John Bowman","California Savings",
                        "5391 0375 9387 5309",2500);
            
            for(int val=1; val <= 16; val++)
            {
                wallet[0].charge(3*val);
                wallet[1].charge(2*val);
                wallet[2].charge(val);
            }

            for(CreditCard card : wallet)
            {
                CreditCard.printSummary(card);
                while(card.getBalance()>200.0){
                    card.makePayment(200);
                    System.out.println("New balance = " + card.getBalance());
                }
            }



        }
        






    
}
