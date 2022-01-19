class User{
int amount=15000;
synchronized void withdrawal(int amount){
System.out.println("will withdraw");
if(this.amount<amount){
System.out.println("Low balance; waiting for deposit");
try{wait();}catch(Exception e){}
}
this.amount-=amount;
System.out.println("withdrawal completed");
}
synchronized void deposit(int amount){
System.out.println(“to be deposited");
this.amount+=amount;
System.out.println("depositing completed");
notify();
}
}
class Test{
public static void main(String args[]){
final User U=new User();
new Thread(){
public void run(){u.withdrawal(20000);}
}.start();
new Thread(){
public void run(){u.deposit(15000);}
}.start();
}}