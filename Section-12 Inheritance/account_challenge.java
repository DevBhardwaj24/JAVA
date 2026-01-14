public class account_challenge {
    public static void main(String[] args) {
        Account ac=new SavingAcc(2345,"ramu","12-10-2015");
        ac.getAccount();

        SavingAcc sv=new SavingAcc(234,"bsdk","chutiya");
        sv.deposit();

        LoanAcc lv=new LoanAcc(1234,"dev","23-01-2005");
        lv.payEMI();

    }
}

class Account{
    private final int accNo;
    private final String name;
    private final String dob;


    // making a constructor-- Parameterised constructor
    public Account(int accNo , String name , String dob){
        this.accNo=accNo;
        this.name=name;
        this.dob=dob;
    }

    //get method
    public void getAccount(){
        System.out.println(accNo+" "+name+" "+dob);
    }

}

class SavingAcc extends Account{
    

    public SavingAcc(int accNo, String name, String dob){
        super(accNo, name, dob);

    }
    public void deposit(){
        System.out.println("add the fuckin money bitch");
    }


}

class LoanAcc extends Account{
    
    public LoanAcc(int accNo, String name, String dob){
        super(accNo, name, dob);

    }
    public void payEMI(){
        System.out.println("Pay the emi market rat");
    }    
}    