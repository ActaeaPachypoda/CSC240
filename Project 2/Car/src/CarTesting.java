import java.util.Scanner;

public class CarTesting{
    public static void main(String args[]){
        Scanner kb = new Scanner(System.in);
        Car a = new Car(2000, "Focus", 0);
        Car b = new Car(2018, "Mustang", 20);
        Car c = new Car(2015, "CRV", 6);
        Car [] test_field = {a, b, c};
        for(int i = 0; i<test_field.length; i++)
            System.out.println(test_field[i]);
        System.out.println("----current status----");
        System.out.println("Choose 1 for accelerating.");
        System.out.println("Choose 2 for slowing down.");
        System.out.println("Otherwise, to quit.");
        int key = kb.nextInt();
        while(key == 1||key==2){
            if(key==1){
                for(int i = 0; i<test_field.length; i++){
                    test_field[i].accelerate();
                }
            }
            else{
                for(int i = 0; i<test_field.length; i++){
                    test_field[i].brake();
                }
            }
            System.out.println("----current status----");
            for(int i = 0; i<test_field.length; i++)
                System.out.println(test_field[i]);
            System.out.println("");
            System.out.println("Choose 1 for accelerating.");
            System.out.println("Choose 2 for slowing down.");
            System.out.println("Otherwise, to quit.");
            key = kb.nextInt();
        }
    }
}
