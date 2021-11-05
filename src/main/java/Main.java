import decorator.PaperDecorator;
import flowerstore.*;
import order.Order;
import users.Sender;
import users.User;

public class Main {
    public static void main(String[] args) {
        Sender user = new Sender();
        System.out.println(user.getId());
        Sender user1 = new Sender();
        System.out.println(user1.getId());
    }
}
