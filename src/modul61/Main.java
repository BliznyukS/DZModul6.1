package modul61;

public class Main {
    public static void main(String[] args) {
        double total = 0;
        Rouse ros1 = new Rouse(36.5, Color.Red);
        Rouse ros2 = new Rouse(20, Color.Green);
        Violet vio1 = new Violet(55.56, Color.Yellow);
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(ros1).addFlower(ros2).addFlower(vio1);
        System.out.println(bouquet.getPrice());
    }

}
