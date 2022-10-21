import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MeatProductMenu implements ProductMenu {

	public void showMenu() {
		//System.out.println("-------------Implementation With Factory Design Pattern Started-----------");
		try {
			//System.out.println("try block");
			Scanner s1 = new Scanner(new File("src/ProductInfo.txt"));
			System.out.println("-------------Iterator implemented using hasNext-----------");
			while (s1.hasNext()) {
				String textFileM = s1.nextLine();
				String[] textInFileM = textFileM.split(":");
				//System.out.println("First Value:" + textInFileP[0]);
				if (textInFileM[0].contains("Meat")) {
					System.out.println(textInFileM[1]);
				}
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showComboxes() {

	}

}
