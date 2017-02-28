import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

				Scanner scanner = new Scanner(System.in);
				
				int a [] = {500,200,100,50,20,10,5,2,1};
				int pass = 12345678;
				int balance = 1000;
				int p;
				
				
				while(true){
					System.out.println("enter the password");
					
					if(scanner.hasNextInt()){
						p = scanner.nextInt();
					
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
							
							
							
							
//							if(!scanner.hasNextInt()){
//								System.out.println("incorrect");
//								break;
//							}
//							else if(scanner.hasNextInt()){
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
							
							for (int i = 0; i < a.length; i++) {
								if(credit>=a[i]){
									System.out.println("number of "+a[i]+" - "+credit/a[i]);
									credit = credit % a[i];
								}
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
				}
					scanner.close();

					
				}

	}

}
