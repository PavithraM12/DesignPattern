import java.util.Scanner;

public class Facade {

	private int UserType;
	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;
	public boolean login() {
		System.out.println("Enter Login Credentials");
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter User Name");
		String userName = s1.nextLine().toLowerCase();
		System.out.println("Enter Password");
		String password = s1.nextLine().toLowerCase();
		if(userName.equalsIgnoreCase("pepe")&&password.equals("3333")){
			System.out.println("Logged in as Seller..." + "Welcome  " + userName);
		}
		else if(userName.equalsIgnoreCase("tutu")&&password.equals("1111")){
			System.out.println("Logged in as Buyer..." + "Welcome  " + userName);
		}
		else if(userName.equalsIgnoreCase("mimi")&&password.equals("2222")){
			System.out.println("Logged in as Buyer..." + "Welcome  " + userName);
		}
		else {
			System.out.println("Invalid Credentials..Please try again");
		}

		return false;
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) {

	}

	public void createProductList() {

	}

	public void AttachProductToUser() {

	}

	public void SelectProduct() {

	}

	public void productOperation() {

	}


}
