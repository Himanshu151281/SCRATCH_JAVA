public class tac {
    public static void main(String args[]) {
        int a = 234;
        int b = 0;

        // System.out.println("a + b = " + c);
        try {
            int c = a / b;
            System.out.println("a + b = " + c);
        } catch (Exception e) {
            System.out.println("failed to divide " );
            System.out.println(e);
        }
        System.out.println("End of program");
    }
}
