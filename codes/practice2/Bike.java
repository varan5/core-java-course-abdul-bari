import codes.practice2.UserInput;

public class Bike {
    public static void main(String args[]) {
        UserInput user1 = new UserInput();
        String bikeName = user1.getUserInputedBikeName();
        System.out.println(bikeName);
    }    
}
