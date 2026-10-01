import java.util.Scanner;
public class Main{
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite largura da parade em metros: ");
        double largura = sc.nextDouble();
        System.out.println("Digite a altura em metros: ");
        double altura = sc.nextDouble();
        double area = largura * altura;
        double tinta = area /2;
        System.out.println("Area = " + area);

        System.out.printf("Para uma parede de %.2fm , é necessario %.2f litros de tinta.%n" ,area , tinta );

;
    }
}