public class Hello {
    public static void main(String[] args) {

            var x =1;
            var y =0;
            if (y == 0) {
                System.out.println("\nDivision by zero is not allowed");
            } else {
                int z = divede(x, y);
                System.out.println("Hello World!");
            }
        }

    private static int divede(int x, int y) {
        var z= x / y;
        return z;
    }
}
