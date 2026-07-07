public class accessSpecifiers {
    private int balance;

    public void setBalance(int amount) {
        if(amount>0) {
            balance += amount;
        }
        else
            System.out.println("invalid balance");
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        accessSpecifiers acc=new accessSpecifiers();
        acc.setBalance(2000);
        System.out.println(acc.getBalance());
    }
}
//class test{
//    test t=new test();
//    acc.deposit(100);//it cannot be accessed by the other class
//}

