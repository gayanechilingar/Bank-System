
import com.mycompany.javatest.Employee;

public class NewMain {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(1,5);
        MountainBike mountainBike = new MountainBike(1,5, 2);
        String a;
        a = mountainBike.toString();
        System.out.println(a);
        Employee employee = new Employee(147);
        Employee employee1 = new Employee(147);
        System.out.println("stex "+employee.equals(employee1));
        
    }
    
    
}
