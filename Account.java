public class Account {
    private int accountID;
    private String holderName;
    private String accountType;
    {
        accountID=100;
        holderName="JornAnderson";
        accountType="Saving";
    }
    public void displayAccountDetails(){
        System.out.println("Account Details");
        System.out.println("===============");
        System.out.println("Account ID: "+ accountID +"\nAccount Type: "+accountType);
    }
}
