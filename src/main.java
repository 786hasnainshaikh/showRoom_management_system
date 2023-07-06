import com.showroom.showroom;
import com.employee.*;
import com.cars.*;
import java.util.Scanner;

public class main {

    public static void menu(){
        System.out.println("1. ADD SHOWROOM");
        System.out.println("2. SEE SHOWROOMS");
        System.out.println("3. ADD EMPLOYEE ");
        System.out.println("4. SEE EMPLOYEES");
        System.out.println("5. ADD CAR");
        System.out.println("6. SEE CARS");
        System.out.println("7. EXIT");

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        showroom showroom =new showroom();
        employee employee=new employee();
        cars cars =new cars();


        boolean flag=true;
        while (flag){
            main.menu();
            System.out.println("enter the choice");
            int choice;
            choice= sc.nextInt();
            switch (choice){
                case (1):
                    showroom.set_details();
                    break;
                case(2):
                    showroom.get_details();
                    break;
                case (3):
                    employee.set_details();
                    break;
                case (4):
                    employee.get_details();
                    break;
                case (5):
                    cars.set_details();
                    break;
                case (6):
                    cars.get_details();
                    break;
                case (7):
                    System.exit(0);
            }
        }

    }
}
