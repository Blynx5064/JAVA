package exam1013;

import java.util.Scanner;

public class OrderExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Menu[]menus = new Menu[3];
        menus[0] = new Menu("아메리카노", 3000);
        menus[1] = new Menu("카페라떼", 4000);
        menus[2] = new Menu("카푸치노", 4000);

        Scanner scanner = new Scanner(System.in);

        int orderIndex = scanner.nextInt();
        int quantity = scanner.nextInt(); 

        if(orderIndex >= 0 && orderIndex < menus.length && quantity > 0) {
            OrderItem item = new OrderItem(menus[orderIndex], quantity);
            System.out.println(item.price());
        }
    }
}
