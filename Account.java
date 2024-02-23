class Account{

	int acc = 987654;

	String name;
	int accno;
	private long contact;
	private String address;
	private String pan;
	private long uid;
	private int pin = 0000;
	private double bal;

	Account(String name,String address,long contact,String pan,long uid,int pin,double bal){
		this.name = name;
		this.contact = contact;
		this.address = address;
		this.pan = pan;
		this.uid = uid;
		this.pin = pin;
		this.bal = bal;
		this.accno = acc++;
		System.out.println("\n\n```Account Created Succesfully```");
		System.out.println("``````````````````````````````````````````````");
	}

	// Setter Methods
	public void setName(String newName){
		this.name = newName;
	}

	public void setContact(long newContact){
		this.contact = newContact;
	}

	public void setAddress(String newAdd){
		this.address = newAdd;
	}

	public void setPin(int newPin){
		this.pin = newPin;
	}

	public void setBal(double newBal){
		this.bal = newBal;
	}

	//Getter Methods
	public int getPin(){
		return this.pin;
	}

	public double getBal(){
		return this.bal;
	}


	//Display Account Details
	public void displayDetails(){
		System.out.println("\n\n\n");
		System.out.println();
		System.out.println();
		System.out.println(" ```````````` Acoount Details ```````````` ");
		System.out.println("Name         : "+this.name);
		System.out.println("Account No.  : "+this.accno);
		System.out.println("Address      : "+this.address);
		System.out.println("Contact      : "+this.contact);
		System.out.println("Pan No.      : "+this.pan);
		System.out.println("Uid No.      : "+this.uid);
		System.out.println();
		System.out.println("``````````````````````````````````````````````");
		System.out.println("\n\n\n");
	} 

}