public static void main(String[] args) {

AccountartosAccount =newAccount("Arto's account",100.00);

AccountartosSwissAccount =newAccount("Arto's account in Switzerland",1000000.00);

System.out.println("Initial state");

System.out.println(artosAccount.balance());

System.out.println(artosSwissAccount.balance());

artosAccount.withdraw(20);

System.out.println("The balance of Arto's account is now: "+ artosAccount.balance());

artosSwissAccount.deposit(200);

System.out.println("The balance of Arto's other account is now: "+ artosSwissAccount.balance());

System.out.println("End state");

}