import java.io.IOException;
import java.util.Scanner;

public class human {
    public static void main(String[] arg){
        System.out.println("enter the 2 numbers numenator then duminetor ");
        int num1,num2;
        Scanner s=new Scanner(System.in);
        num1=s.nextInt();
        num2=s.nextInt();
        try {
            int result = num1 / num2;
            System.out.println("num1/num2="+result);
        }catch (ArithmeticException e){
            System.out.println("denumenator cant be zero man");
        }
    }
}


/*
public class Person {
    public static void age(int newAge){
        if(newAge<0)
            throw new IllegalArgumentException("age can't be negative man");
            System.out.println("age:"+newAge);
    }
    public static void main(String[] arg){
        System.out.println("enter your age");
        Scanner s=new Scanner(System.in);
        int agee=s.nextInt();
        age(agee);
    }
}
 */
/*
public class Person {
    public static void filesCheck(String fileName) throws IOException {
        if(fileName==null || fileName.isEmpty())
            throw new IOException("first message that file is empty");
        System.out.println("first file name "+fileName);
    }
    public static void main(String[] arg){
        try {
            filesCheck("");
            System.out.println("second file name bookkkkk");
        }
        catch (IOException e){
            System.out.println("second message file is empty "+e.getMessage());
        }
    }

 */
