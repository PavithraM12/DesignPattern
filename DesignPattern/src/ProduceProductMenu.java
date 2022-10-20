import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProduceProductMenu implements ProductMenu {

	public void showMenu() {
		try {
			//System.out.println("try block");
			Scanner s1 = new Scanner(new File("src/ProductInfo.txt"));
			while (s1.hasNextLine()) {
				String textFileP = s1.nextLine();
				String[] textInFileP = textFileP.split(":");
				//System.out.println("First Value:" + textInFileP[0]);
				if (textInFileP[0].contains("Produce")) {
					System.out.println(textInFileP[1]);
				}
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
		public void showAddButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showViewButton() {

	}

	public void showComboxes() {

	}

}
