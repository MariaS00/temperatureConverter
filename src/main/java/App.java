import java.util.Scanner;

public class App {
        public static void main(String[] args) {
        System.out.println(menu);
        Scanner scanner1 = new Scanner(System.in);
        int option = scanner1.nextInt();
        char input = 0;
        char output = 0;
        if (option == 1) {
            input = 'C';
            output = 'F';
        }else if (option==2) {
            input = 'C';
            output = 'K';
        }else if (option==3) {
            input = 'K';
            output = 'C';
        }else if (option==4) {
            input = 'F';
            output = 'C';
        }else if (option==5) {
            input = 'F';
            output = 'K';
        }else if (option==6){
            input = 'K';
            output = 'F';
        }
        System.out.println("Enter temperature to convert.");
        Scanner scanner2 = new Scanner(System.in);
        float temp = scanner2.nextFloat();
        float result = TemperatureConvert.convertTemperature(input, output, temp);
        System.out.println(output + " = " + result);
    }

    public static String menu = "Please choose one of the following options: \n" +
            "1. Celsius to Fahrenheit.\n" +
            "2. Celsius to Kalvin.\n" +
            "3. Kalvin to Celsius.\n" +
            "4. Fahrenheit to Celsius.\n" +
            "5. Fahrenheit to Kalvin.\n" +
            "6. Kalvin to Fahrenheit. ";
}
