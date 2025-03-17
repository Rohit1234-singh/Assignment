import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    public static void main(String[] args) {
    List<EmployeeDetails> emlist=new ArrayList<>();

    emlist.add(new EmployeeDetails(100,"Rohit Singh",5000000));
    emlist.add(new EmployeeDetails(101,"Tushar Lohara",1500000));
    emlist.add(new EmployeeDetails(102,"Mikha Jena",100000));

        System.out.println("Employees Details");
        for(EmployeeDetails emp:emlist){
            emp.display();
        }
    }
}