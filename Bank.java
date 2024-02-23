import java.util.Scanner;

class Bank{

	static Service s = new Service();
	static Scanner ip = new Scanner(System.in);
	{
		System.out.println(" ```````````` BANK OF BHAROSA ```````````` ");
		System.out.println(" ```````````````` welcome ```````````````` ");
		System.out.println();
	}
	public static void main(String[] args) {	
		Bank b = new Bank();
		while(true){
		b.displayMenu();
		}
		
		
	}


	public void displayMenu(){
		System.out.println("`````` Choose Option ``````");
		System.out.println("\t 1.New User \n\t 2.Existing User \n\t 0.Exit");
		System.out.print("Enter option : ");
		int op = ip.nextInt();
		System.out.println();

		switch(op){
			case 1:{
				s.createAccount();
			}
			break;
			case 2:{
				displayOption();
			}
			break;
			case 0:{
				System.exit(0);
			}
			default:{
				System.out.println("Enter Correct Option! Try Again.");
			}
			break;
		}
	}


	public void displayOption(){
		int op;
		do{ 
			System.out.println("``````````````````````````````````````````````");
			System.out.println("`````` HELLO CUSTOMER ``````");
			System.out.println("Choose Option");
			System.out.println("\t 1.WITHDRAW \n\t 2.DEPOSIT \n\t 3.CHECK BALANCE \n\t 4.CHANGE PIN \n\t 5.DISPLAY DETAILS \n\t 6.UPDATE DETAILS \n\t 0.Back");
			System.out.print("Enter option : ");
			op = ip.nextInt();
			System.out.println();

			switch(op){
				case 1:{
					//withdraw	
					s.withdraw();
					System.out.println("\n\n\n");

				}
				break;
				case 2:{
					//deposit	
					s.deposit();
					System.out.println("\n\n\n");
				}
				break;
				case 3:{
					//check bal	
					s.displayBal();
					System.out.println("\n\n\n");
				}
				break;
				case 4:{
					//change pin
					s.changePin();	
					System.out.println("\n\n\n");
				}
				break;
				case 5:{
					//display details
					s.displayAcountDetails();	
				}
				break;
				case 6:{
					//update details
					s.updateDetails();	
					System.out.println("\n\n\n");
				}
				break;
				case 0:{
					System.out.println("\n\n\n");
				}
				break;
				default:{
					System.out.println("Enter Correct Option! Try Again.");
					System.out.println("``````````````````````````````````````````````");
					System.out.println("\n\n\n");

				}
				break;
			}
		}
		while(op!=0);
	}
}