import java.io.IOException;
import java.util.Scanner;

public class PTBSMain {

    public static void main(String[] args){
       System.out.println("Product  Trading  and  Bidding System Application");
        Facade facade = new Facade();
        System.out.println("-------------Implementation With Facade Design Pattern Started-----------");
        facade.login();
        facade.showList();
        facade.viewTrading();
    }

}
