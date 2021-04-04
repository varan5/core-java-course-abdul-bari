class StudentMarks {
    private String name;
    private int marks[];
    private String hobby[];

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }
    public String[] getHobby() {
        return hobby;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public int[] getMarks() {
        return marks;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void printName(String name) {
        System.out.println("Welcome "+ name);
    }
    public void printMarks(int marks[]) {
        for (int subject: marks) {
            System.out.println(subject);
        }
    }
    public void printHobby(String hobby[]) {
        for (String data: hobby) {
            System.out.println(data);
        }
    }

}

public class Test {

    public static void main(String args[]) {
        StudentMarks rob = new StudentMarks();
        int recievedData[] = {77, 78, 89, 88, 95};
        String recievedHobbies[] = {"Cricket", "Chess"};
        rob.setName("Rob");
        rob.setMarks(recievedData);
        rob.setHobby(recievedHobbies);
        rob.printName(rob.getName());
        rob.printMarks(rob.getMarks());
        rob.printHobby(rob.getHobby());
    
    }    
}






