package classFan;

public class MainFan {
    public static void main(String[] args) {
        ClassFan fan1 = new ClassFan();
        fan1.setSpeed(ClassFan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        ClassFan fan2 = new ClassFan();
        fan2.setSpeed(ClassFan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("Thong tin quat 1: ");
        System.out.println(fan1.toString());
        System.out.println("Thong tin quat 2: ");
        System.out.println(fan2.toString());
    }
}
