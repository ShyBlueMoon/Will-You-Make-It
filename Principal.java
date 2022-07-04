import java.util.Scanner;
/*
You were camping with your friends far away from home, but when it's time to go back, you realize that your fuel
is running out and the nearest pump is 50 miles away! You know that on average, your car runs on about 25
miles per gallon. There are 2 gallons left.

Considering these factors, write a function that tells you if it is possible to get to the pump or not.

Function should return true if it is possible and false if not.
 */
public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distancia ate o proximo posto:");
        double distancia = scanner.nextDouble();
        System.out.println("Digite quantos galoes seu veiculho gasta por milha:");
        double galaoPorMilha = scanner.nextDouble();
        System.out.println("Digite a quantidade de combustivel restante no tanque:");
        double combustivelRestante = scanner.nextDouble();

        System.out.println("Voce conseguira chegar ate o posto...");
        System.out.println(zeroFuel(distancia, galaoPorMilha, combustivelRestante));

    }

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {

        boolean willYouMakeIt = false;

        if ((fuelLeft * mpg) >= distanceToPump) {
            willYouMakeIt = true;

        }
        return willYouMakeIt;
    }
}
