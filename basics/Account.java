package java1;

import java.util.Scanner;

public class Account {
    long account_number,contact_number;
    String account_holder_name,address;
    double amount;
    void Account (long accNo,String name,String add,long phNo,double amt)
    {
        account_number=accNo;
        account_holder_name=name;
        address=add;
        contact_number=phNo;
        amount=amt;
    }
    void print()
    {
        System.out.println(account_number+"\t"+account_holder_name+"\t"+contact_number+"\t"+address+"\t"+amount);
    }
    void deposit(double a){
    amount=amount+a;
    }
    void withdraw(double w){
    amount=amount-w;
    }
}
class bankaccount
{
    public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
    int n;
    do{
    System.out.println("1. Enter account information\n 2. Print account information\n 3. Deposit amount in account\n 4. Withdraw amount from account \n 5.Exit");
    n=in.nextInt();
    Long accNo,phNo;
    double amt,a,w;
    String name,add;
    switch(n)
    {
        case 1:
            System.out.println("Enter account number: ");
            accNo=in.nextLong();
            System.out.println("Enter account holder's name: ");
            name=in.next();
            System.out.println("Enter account holder's address: ");
            add=in.next();
            System.out.println("Enter account holder's phone number: ");
            phNo=in.nextLong();
            System.out.println("Enter amount: ");
            amt=in.nextDouble();
            Account ob1=new Account();
            ob1.Account(accNo, name, add, phNo, amt);
            break;
        case 2:
            System.out.println("Account number \t Account holder's name \t Aaddress \t Phone number \t Amount");
            Account ob2=new Account();
            ob2.print();
            break;
        case 3:
            System.out.println("Enter the amount you want to deposit");
            a=in.nextInt();
            Account ob3=new Account();
            ob3.deposit(a);
            break;
        case 4:
            System.out.println("Enter the amount you want to withdraw");
            w=in.nextInt();
            Account ob4=new Account();
            ob4.withdraw(w);
            break;
    }
    }
    while(n!=5);
    }
}
    

