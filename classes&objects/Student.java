
public class Student {
    private int marks[] = {88, 90, 98, 79, 89};

    public int[] getMarks() {
        return marks;
    }

    public void printMarks(int marks[]) {
        for (int subject: marks) 
            System.out.println(subject);
    }

    public static void main(String args[]) {
        Student tom = new Student();
        int result[] = tom.getMarks();
        tom.printMarks(result);
    }
}
