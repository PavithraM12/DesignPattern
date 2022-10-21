public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	private ClassProductList classProductList;

	public void visitProduct(Product product) {
		System.out.println("Product Visitor");

	}

	public void visitTrading(Trading trading) {
		System.out.println("Trading Visitor");
	}

	public void visitFacade(Facade facade) {
		System.out.println("Facade Visitor");
	}

}
