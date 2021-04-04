public class ArrayTest1 {
    public static int[] otherArray = {2, 55, 55, 6};
    int someArray[] = new int[5];
    

    public static void main(String args[]) {
        for (int x: otherArray) {
            System.out.println("Hello " + x);
        }
    }
}