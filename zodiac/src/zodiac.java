import java.util.Scanner;

public class zodiac {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int kalan, year;

        System.out.print("Enter Your Birth Year: ");
        year= inp.nextInt();
        kalan= year % 12;

        switch (kalan){

            case 0:

            System.out.print("Your Zodiac is Monkey");

            break;

            case 1:

            System.out.print("Your Zodiac is Rooster");

            break;

            case 2:

            System.out.print("Your Zodiac is Dog");

            break;

            case 3:

            System.out.print("Your Zodiac is Pig");

            break;

            case 4:

            System.out.print("Your Zodiac is Mouse");

            break;

            case 5:

            System.out.print("Your Zodiac is Bull");

            break;

            case 6:

            System.out.print("Your Zodiac is Tiger");

            break;

            case 7:

            System.out.print("Your Zodiac is Rabbit");

            break;

            case 8:

            System.out.print("Your Zodiac is Dragon");

            break;

            case 9:

            System.out.print("Your Zodiac is Snake");

            break;

            case 10:

            System.out.print("Your Zodiac is Horse");

            break;

            case 11:

            System.out.print("Your Zodiac is Sheep");

            break;
        }
    }
}
