import com.sun.tools.javac.Main;

import java.net.SocketOption;
import java.util.Scanner;

public class FirstProgram {
    String EmpName;
    String EmpId;
    String Desig;
    int salary;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Hello");
        FirstProgram ob = new FirstProgram();
        ob.EmpName="Shilpa";
        ob.EmpId="E123";
        System.out.println(ob.EmpName);
        System.out.println(ob.EmpId);
        System.out.println("designation");
        ob.Desig= input.next();
        System.out.println("salary");
        ob.salary= input.nextInt();
        System.out.println(ob.EmpName);
    }
}
