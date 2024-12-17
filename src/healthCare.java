import java.util.*;
public class healthCare extends person{
    @Override
    public void setdata(String name, int age, String city, String state) {
        super.setdata(name, age, city, state);
    }
    public void firstAid(){
        System.out.println("what is the person have ?\n re1:high fever \n 2: slow heart beat  \n 3:fast heart beat \n 4:low blood pressure\n 5:high blood pressure");
        int select;
        Scanner sel=new Scanner(System.in);
        select=sel.nextInt();
        switch (select){
            case 1:
                System.out.println("1. High Fever\n" +
                        "Measure Temperature: Use a thermometer to check the temperature.\n" +
                        "\n" +
                        "Rest: Encourage the person to rest and avoid physical activity.\n" +
                        "\n" +
                        "Hydrate: Offer plenty of fluids to prevent dehydration.\n" +
                        "\n" +
                        "Medication: Administer over-the-counter fever reducers like acetaminophen or ibuprofen.\n" +
                        "\n" +
                        "Cool Bath: Give a lukewarm sponge bath to help lower the temperature.\n" +
                        "\n" +
                        "Seek Medical Help: If the fever is very high (above 103°F) or persists for more than 3 days, seek medical attention.");
                break;
            case 2:
                System.out.println("2. Slow Heartbeat (Bradycardia)\n" +
                        "Call Emergency Services: If the person is experiencing severe symptoms like dizziness, fainting, or shortness of breath, call emergency services immediately.\n" +
                        "\n" +
                        "Keep Calm: Help the person to lie down and keep them calm.\n" +
                        "\n" +
                        "Monitor: Keep an eye on their condition and be ready to perform CPR if they become unresponsive.");
                break;
            case 3:
                System.out.println("3. Fast Heartbeat (Tachycardia)\n" +
                        "Stay Calm: Encourage the person to sit down and try to stay calm.\n" +
                        "\n" +
                        "Deep Breaths: Have them take slow, deep breaths to help slow the heart rate.\n" +
                        "\n" +
                        "Hydrate: Offer water if they are dehydrated.\n" +
                        "\n" +
                        "Seek Medical Help: If the fast heartbeat continues or is accompanied by chest pain, seek medical attention.");
                break;
            case 4:
                System.out.println("4. Low Blood Pressure (Hypotension)\n" +
                        "Lay Down: Have the person lie down and elevate their legs to improve blood flow to the brain.\n" +
                        "\n" +
                        "Hydrate: Offer fluids to help increase blood volume.\n" +
                        "\n" +
                        "Monitor: Keep an eye on their condition and be ready to call emergency services if symptoms worsen.");
                break;
            case 5:
                System.out.println("5. High Blood Pressure (Hypertension)\n" +
                        "Stay Calm: Encourage the person to sit down and relax.\n" +
                        "\n" +
                        "Medication: If they have prescribed medication for high blood pressure, ensure they take it as directed.\n" +
                        "\n" +
                        "Monitor: Keep an eye on their condition and be ready to call emergency services if they experience severe symptoms like chest pain or difficulty breathing.");
                break;
            default:
                try {
                    if(select<0||select>5)
                        throw new IllegalArgumentException("if your problems is not here contact us!! you have to chose only 1-5 choice!! ");
                }
                catch (IllegalArgumentException e){
                    System.out.println("please contact us"+e.getMessage());
                }
        }
    }
    public void contactHealthCare(){
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to the contact service \n what is your problem?");
        System.out.println("for contact the teeth specialist press 1\n for eye specialist press 2");
        int choseForProblems;
        choseForProblems=input.nextInt();
        switch (choseForProblems){
            case 1:
                System.out.println("phone number +251978542312\n telegram account @Doctoryut");
                break;
            case 2:
                System.out.println("phone number is not available whatsapp account solomon3089 ");
                break;
            default:
                System.out.println("please enter valid input");
        }
    }
    public void manu(){
        System.out.println("what is your case place entre the proper choice \n 1:for first Aid  \n 2:contact health cares for advice");
        Scanner s=new Scanner(System.in);
        int chose;
        chose=s.nextInt();
        s.nextLine();
        switch (chose){
            case 1:
                firstAid();
                break;
            case 2:
                contactHealthCare();
                break;
        }
    }
}
