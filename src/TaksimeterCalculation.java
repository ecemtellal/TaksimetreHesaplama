import java.util.Scanner;
public class TaksimeterCalculation {
    public static void main(String[] args) {
        int distance,minPaymentSum=20, startFee=10;
        double totalSum, perKilometer=2.20;

        Scanner input=new Scanner (System.in);
        System.out.print("Toplam mesafeyi km cinsinden giriniz: ");
        distance=input.nextInt();

        totalSum = startFee +(perKilometer*distance);
        totalSum = totalSum< 20 ? minPaymentSum : totalSum;
        
        System.out.println("Taksi ücretiniz: " +totalSum);




    }
}
