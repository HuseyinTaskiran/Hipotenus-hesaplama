import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b;
        double c;

        System.out.print("birinci kenarı girin ");
        Scanner birinci = new Scanner(System.in);
        a=birinci.nextInt();

        System.out.print("ikinci kenarı girin ");
        Scanner ikinci = new Scanner(System.in);
        b=ikinci.nextInt();

        a*=a;
        b*=b;
        c= Math.sqrt(a+b);
        System.out.print("Hipotenüs : " + c);


    }
}

