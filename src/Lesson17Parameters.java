import java.util.Scanner;
import java.util.SortedMap;

public class Lesson17Parameters {

    public static void main(String[] args) {
        PersonW person1 = new PersonW();
        person1.setNameAndAge("Roma", 28);
        System.out.println("Name: "+person1.getName()+". Age: "+person1.getAge());



    }
}
class PersonW {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private int age;

    public void setNameAndAge (String userName, int userAge) {
        while (true) {
            System.out.println("Enter name");
            userName = scanner.nextLine();
            if (userName.isEmpty()) {
                continue;
            } else {
                name = userName;
            }
            break;
        }
        while (true) {
            System.out.println("Enter age");
            userAge = scanner.nextInt();
            if (userAge <= 0) {
                System.out.println("Ошибка. Возраст должен быть положительным.");
                continue;
            }
            else {
                age = userAge;
            }
        break;
            }
        }
    public String getName (){
        return name;
    }
    public int getAge(){
        return age;
    }
    }
