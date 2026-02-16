public class scope {
    static int a = 90;
    public static void main(String[] args) {
        System.out.println(a);
        //Scope tester
            int a =80;
            System.out.println(a);
        gn();
    }
    static void gn(){
        int a =25;
        System.out.println(a);
    }
}
