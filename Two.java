import java.util.Scanner;

public class Two {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continueChoice;

        do {
            System.out.println("Enter name: ");
            String name = sc.nextLine();

            System.out.println("Enter city: ");
            String city = sc.nextLine();

            System.out.println("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine(); 

            System.out.println("Enter gender : ");
            String gender = sc.nextLine();

            switch (gender.toLowerCase()) {
                case "male":
                    String maleNameKey = "";
                    int ageDiff = 0;
                    String cityMaleKey = "";

                    if (name.length() >= 3) {
                        maleNameKey = name.substring(0, 3);
                    } else {
                        maleNameKey = name;
                    }

                    if (city.length() >= 3) {
                        cityMaleKey = city.substring(city.length() - 3);
                    } else {
                        cityMaleKey = city;
                    }

                    int firstDigitMale = age / 10;
                    int secondDigitMale = age % 10;
                    ageDiff = Math.abs(firstDigitMale - secondDigitMale);
                    String maleKey = maleNameKey + ageDiff + cityMaleKey;
                    System.out.println("WiFi key is: " + maleKey);
                    break;

                case "female":
                    String femaleNameKey = "";
                    int ageSum = 0;
                    String cityFemaleKey = "";

                    if (name.length() >= 3) {
                        femaleNameKey = name.substring(name.length() - 3);
                    } else {
                        femaleNameKey = name;
                    }

                    if (city.length() >= 3) {
                        cityFemaleKey = city.substring(0, 3);
                    } else {
                        cityFemaleKey = city;
                    }

                    int firstDigitFemale = age / 10;
                    int secondDigitFemale = age % 10;
                    ageSum = firstDigitFemale + secondDigitFemale;
                    String femaleKey = femaleNameKey + ageSum + cityFemaleKey;
                    System.out.println("WiFi key is: " + femaleKey);
                    break;

                default:
                    System.out.println(" enter Male or Female.");
                    break;
            }

            System.out.println("Do you want to continue?");
            continueChoice = sc.nextLine();
        } while (continueChoice.equalsIgnoreCase("yes"));

        
    }
}
