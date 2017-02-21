import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

				Scanner scanner = new Scanner(System.in);
				
				int c500=0;
				int c200=0;
				int c100=0;
				int c50=0;
				int c20=0;
				int c10=0;
				int c5=0;
				int c2=0;
				int c1=0;
				int pass = 12345678;
				int balance = 1000;
				
				
				
				
				while(true){
					System.out.println("enter the password");
					int p = scanner.nextInt();
					
					if(p!=pass){
						System.out.println("Invalid password! Please try again.");
						System.out.println("__________________________");
						break;
					}
					else if(p==pass){
						System.out.println("the password is correct");
						System.out.println("__________________________");
						while(true){
							System.out.println("enter 1 for check balance");
							System.out.println("enter 2 for a credit");
							System.out.println("enter 3 for add into a balance");
							System.out.println("enter 2 for Exit");
							int choise = scanner.nextInt();
						switch (choise) {
						case 1:{
							System.out.println("__________________________");
							System.out.println("your current balance = "+balance);
							System.out.println("Enter 0 - Exit  1 - Continue");
							System.out.println("__________________________");
							
							int or = scanner.nextInt();
							if(or==0){
								System.out.println("__________________________");
								System.out.println("Good bye!");
								return;
							}
							else if(or==1){
								
							}
							break;
						
						}case 2:{
							System.out.println("__________________________");
							System.out.println("How much you want to take off?");
							int credit = scanner.nextInt();
							if(credit<0){
								System.out.println(" ");
								System.out.println("sum can not be negative");
							}
							else if(balance<credit){
								System.out.println("__________________________");
								System.out.println("insufficient funds");
							}
							else if(balance>=credit){
							balance = balance - credit;
							}
							
							if(credit >= 500){
								c500 = credit / 500;
								System.out.println("number of bills of 500 = "+c500);
								credit = credit - (c500*500);
							}
							if(credit >= 200){
								c200 = credit / 200;
								System.out.println("number of bills of 200 = "+c200);
								credit = credit - (c200*200);
							}
							if(credit >= 100){
								c100 = credit / 100;
								System.out.println("number of bills of 100 = "+c100);
								credit = credit - (c100*100);
							}
							if(credit >= 50){
								c50 = credit / 50;
								System.out.println("number of bills of 50 = "+c50);
								credit = credit - (c50*50);
							}
							
							if(credit >= 20){
								c20 = credit / 20;
								System.out.println("number of bills of 20 = "+c20);
								credit = credit - (c20*20);
							}
							
							if(credit >= 10){
								c10 = credit / 10;
								System.out.println("number of bills of 10 = "+c10);
								credit = credit - (c10*10);
							}
							
							if(credit >= 5){
								c5 = credit / 5;
								System.out.println("number of bills of 5 = "+c5);
								credit = credit - (c5*5);
							}
							if(credit >= 2){
								c2 = credit / 2;
								System.out.println("number of bills of 2 = "+c2);
								credit = credit - (c2*2);
							}
							if(credit >= 1){
								c1 = credit / 1;
								System.out.println("number of bills of 1 = "+c1);
								credit = credit - (c1*1);
							}
							
							
							
							
							
							System.out.println("__________________________");
							System.out.println("your current balance = "+balance);
							System.out.println("Enter 0 - Exit  1 - Continue");
							System.out.println("__________________________");
							int or = scanner.nextInt();
							
							
							if(or==0){
								System.out.println("__________________________");
								System.out.println("Good bye!");
								return;
							}
							else if(or==1){
							break;
							}
						
						
						}case 3:{
							System.out.println("__________________________");
							System.out.println("Do you want to replenish your balance?");
							int add = scanner.nextInt();
							if(add<0){
								System.out.println(" ");
								System.out.println("sum can not be negative");
								System.out.println("__________________________");
							}else
							balance = balance + add;
							System.out.println("__________________________");
							System.out.println("your current balance = "+balance);
							System.out.println("Enter 0 - Exit  1 - Continue");
							System.out.println("__________________________");
							int or = scanner.nextInt();
							if(or==0){
								System.out.println("__________________________");
								System.out.println("Good bye!");
								return;
							}
							else if(or==1){
							break;
							}
						}case 4:{
							if(choise==4){
								System.out.println("__________________________");
							System.out.println("Exit");
							System.out.println("Enter 0 - Exit  1 - Continue");
							int or = scanner.nextInt();
							
							if(or==0){
								System.out.println("__________________________");
								System.out.println("Good bye!");
								return;
							}
							else if(or==1){
							break;
							}
							}
						}
						default:{
							System.out.println("__________________________");
							System.out.println("Not right !, try again");
							System.out.println("__________________________");
							break;
						}
						}
						}			
					}		
					scanner.close();
				}

	}

}
