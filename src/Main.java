public class Main {

    public static void main(String[] args) {
        HelloJna.INSTANTCE.test();
        int add = HelloJna.INSTANTCE.add(1, 2);
        System.out.println(add);
    }
}
