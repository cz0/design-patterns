package cz.steman.structural.flyweight;

public class FlyweightInventoryDemo {
    public static void main(String[] args) {
        InventorySystem is = new InventorySystem();

        is.takeOrder("Roomba", 123);
        is.takeOrder("Хачапурі", 234);
        is.takeOrder("Рогалик з маком", 345);
        is.takeOrder("Модна кепка", 456);
        is.takeOrder("Кулькова ручка", 567);
        is.takeOrder("Ряба кобила", 678);
        is.takeOrder("Кривенька качечка", 789);
        is.takeOrder("Roomba", 1123);
        is.takeOrder("Хачапурі", 1234);
        is.takeOrder("Рогалик з маком", 1345);
        is.takeOrder("Модна кепка", 1456);
        is.takeOrder("Кулькова ручка", 1567);
        is.takeOrder("Ряба кобила", 1678);
        is.takeOrder("Кривенька качечка", 1789);
        is.takeOrder("Roomba", 2123);
        is.takeOrder("Хачапурі", 2234);
        is.takeOrder("Рогалик з маком", 2345);
        is.takeOrder("Модна кепка", 2456);
        is.takeOrder("Кулькова ручка", 2567);
        is.takeOrder("Ряба кобила", 2678);
        is.takeOrder("Кривенька качечка", 2789);

        is.process();

        System.out.println(is.report());
    }
}
