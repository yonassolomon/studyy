//Public Service Delivery:
//Problem: Inefficient public service delivery due to bureaucratic processes and lack of coordination.
//OOP Solution: Develop a system to manage public services using classes for different services
// (e.g., healthcare, education, transportation). Implement methods to streamline processes and improve coordination
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class services {
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
         String name;
         int age=0;
        String city;
        String state;
        person p=new person();
        System.out.println("welcome to the ETHIO SERVICES");
        System.out.println("name:");
        name=s.nextLine();
        while (true) {
        try {
            System.out.print("age: ");
            age = s.nextInt();
                if (age < 0) {
                    throw new IllegalArgumentException("Age can't be less than 0.");
                }
                else {
                    break;
                }
            }
        catch(IllegalArgumentException e){
                System.out.println("Age can't be less than 0, please notice!!");
            }
        }
        s.nextLine();
        System.out.println("city:");
        city=s.nextLine();
        System.out.println("state");
        state=s.nextLine();
        p.setdata(name,age,city,state);
        System.out.println("place what services would you like?");
        System.out.println("chose 1:for healthCare\n chose 2:for transport\n ");
        System.out.println("place patiently fill the form ");

        int chose;
        chose=s.nextInt();
        healthCare hc=new healthCare();
        TransportSystem ts = new TransportSystem();
        switch (chose){
            case 1:
                hc.manu();
                break;
            case 2:
                ts.main(new String[0]); //i wamt to call here the transport system class
        }
        System.out.println("user form");
        p.getData();
    }
}