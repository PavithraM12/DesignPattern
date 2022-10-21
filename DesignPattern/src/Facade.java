import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Facade {

	private int UserType;
	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;


	public boolean login(){
		System.out.println("Enter Login Credentials");
		Scanner s1= new Scanner(System.in);
//		File fileName= new File("src/Buyer.txt");
		System.out.println("Enter User Name");
		String userName = s1.nextLine().toLowerCase();
		System.out.println("Enter Password");
		String password = s1.nextLine().toLowerCase();
		try {
			Scanner s2 = new Scanner(new File("src/Buyer.txt"));
			Scanner s3 = new Scanner(new File("src/Seller.txt"));
			while (s2.hasNextLine()) {
				String textFileB = s2.nextLine();
				String[] textInFileB = textFileB.split(":");
				//System.out.println(textInFile[0]);
				//System.out.println(textInFile[1]);
				//s2.close();
				if (userName.equalsIgnoreCase(textInFileB[0]) && password.equals(textInFileB[1])) {
					System.out.println("Logged in as Buyer..." + "Welcome  " + userName);

				}
			}
			while (s3.hasNextLine()) {
				String textFileS = s3.nextLine();
				String[] textInFileS = textFileS.split(":");
				//System.out.println(textInFile[0]);
				//System.out.println(textInFile[1]);
				//s2.close();
				if (userName.equalsIgnoreCase(textInFileS[0]) && password.equals(textInFileS[1])) {
					System.out.println("Logged in as Seller..." + "Welcome  " + userName);

				}
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

//		Scanner s1 = new Scanner(System.in);
//		System.out.println("Enter User Name");
//		String userName = s1.nextLine().toLowerCase();
//		System.out.println("Enter Password");
//		String password = s1.nextLine().toLowerCase();
//		if(userName.equalsIgnoreCase("pepe")&&password.equals("3333")){
//			System.out.println("Logged in as Seller..." + "Welcome  " + userName);
//		}
//		else if(userName.equalsIgnoreCase("tutu")&&password.equals("1111")){
//			System.out.println("Logged in as Buyer..." + "Welcome  " + userName);
//		}
//		else if(userName.equalsIgnoreCase("mimi")&&password.equals("2222")){
//			System.out.println("Logged in as Buyer..." + "Welcome  " + userName);
//		}
//		else {
//			System.out.println("Invalid Credentials..Please try again");
//		}

return false;
	}
	public void showList() {

		System.out.println("-------------Implementation With Bridge Design Pattern Started-----------");
		MeatProductMenu mMenu = new MeatProductMenu();
		ProduceProductMenu pMenu = new ProduceProductMenu();
		System.out.println("Select 0 for MeatProductMenu and 1 for ProduceProductMenu");
		Scanner s1 = new Scanner(System.in);
		int selectNum = s1.nextInt();
		System.out.println("-------------Implementation With Factory and Iterator Design Pattern Started-----------");
		switch (selectNum) {
			case 0:
				System.out.println("---Meat Product Menu---");
				mMenu.showMenu();
				break;
			case 1:
				System.out.println("---Produce Product Menu---");
				pMenu.showMenu();
				break;
		}
	}
	public void addTrading() {

	}

	public void viewTrading() {
		System.out.println("View trading using Visitor Pattern");
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
