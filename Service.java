import java.util.Scanner;

class Service{

	Scanner ip = new Scanner(System.in);

	static Account ac;

	public void createAccount(){
		System.out.println("```````````` New Account ````````````");
		System.out.println();
		System.out.print("Enter your name : ");
		String name = ip.next();
		System.out.println();
		System.out.print("Enter your Address : ");
		String add = ip.next();
		System.out.println();
		System.out.print("Enter your contact : ");
		long contact = ip.nextLong();
		System.out.println();
		System.out.print("Enter your pan no. : ");
		String pan = ip.next();
		System.out.println();
		System.out.print("Enter your UID no. : ");
		long uid = ip.nextLong();
		System.out.println();
		System.out.print("Enter your pin : ");
		int pin = ip.nextInt();
		System.out.println();
		System.out.print("Enter your amt : ");
		double amt = ip.nextDouble();

		ac = new Account(name,add,contact,pan,uid,pin,amt);

	}

	public boolean checkPin(){
		int count = 0;
		boolean ans = false;
		do{
			if(count>2){break;}
			System.out.print("Enter Your pin : ");
			int vpin = ip.nextInt();
			System.out.println();

			if(ac.getPin() == vpin){
				ans = true;
			}
			else{
				System.out.println("\t Incorrect Pin! Try Again.");
			}
			count++;
		}
		while(ans == false);
		return ans;
	}

	public void displayBal(){

		if(checkPin()){
			System.out.print("Your Account Balance : ");
			System.out.println(ac.getBal());
		}
		else{
			System.out.println("\t Enter Correct Pin! Try Again.");
		}
	}

	public void changePin(){

		if(checkPin()){
			System.out.print("Enter New Pin : ");
			int newPin = ip.nextInt();
			ac.setPin(newPin);
			System.out.println("\t Pin has been Changed Succesfully");
		}
		else{
			System.out.println("\t Enter Correct Pin! Try Again.");
		}
	}


	public void displayAcountDetails(){
		if(checkPin()){
			ac.displayDetails();
		}
	}


	public void withdraw(){
		System.out.print("Enter the amount : ");
		double amt = ip.nextDouble();
		System.out.println();
		if(ac.getBal()>amt){
			if(checkPin()){
				double newBal = ac.getBal()-amt;
				ac.setBal(newBal);
				System.out.println("\t WITHDRAWL SUCCESFULL !! \n\t COLLECT CASH !!");
				System.out.println("``````````````````````````````````````````````");
				System.out.println("\n\n\n");
			}
		}
		else{
			System.out.println("```` INSUFICIENT FUNDS ````");
			System.out.println("``````````````````````````````````````````````");
			System.out.println("\n\n\n");
		}
	}


	public void deposit(){
		System.out.print("Enter the amount : ");
		double amt = ip.nextDouble();
		System.out.println();
		if(checkPin()){
			double newBal = ac.getBal()+amt;
			ac.setBal(newBal);
			System.out.println("\tDEPOSITION SUCCESFULL !! \n\tBALANCE UPDATED !!");
			System.out.println("``````````````````````````````````````````````");
			System.out.println("\n\n\n");
		}
	}


	public void updateDetails(){
		int op;
		do{
			System.out.println("\t Choose Option To Update");
			System.out.println("\t 1.Name \n\t 2.Adress \n\t 3.Contact \n\t 0.Back");

			System.out.print("enter you option : ");
			op = ip.nextInt();
			
			switch(op){
				case 1:{
					System.out.print("Enter Your Name : ");
					String name = ip.nextLine();
					ip.nextLine();
					if(checkPin()){
						ac.setName(name);
						System.out.println("\t`````` NAME UPDATED ``````");
						System.out.println("``````````````````````````````````````````````");
						System.out.println("\n\n\n");
					}
				}
				break;
				case 2:{
					System.out.print("Enter Your Address : ");
					String add = ip.nextLine();
					ip.nextLine();
					if(checkPin()){
						ac.setAddress(add);
						System.out.println("\t`````` ADDRESS UPDATED ``````");
						System.out.println("``````````````````````````````````````````````");
						System.out.println("\n\n\n");
					}
				}
				break;
				case 3:{
					System.out.print("Enter Your Contact : ");
					long contact = ip.nextLong();
					// ip.nextLong();
					if(checkPin()){
						ac.setContact(contact);
						System.out.println("\t`````` CONTACT UPDATED ``````");
						System.out.println("``````````````````````````````````````````````");
						System.out.println("\n\n\n");
					}
				}
				break;
				case 0:{

				}
				break;
				default:{
					System.out.println("Enter Correct Option! Try Again.");
				}
			}
		}
		while(op!=0);	
	}
}
