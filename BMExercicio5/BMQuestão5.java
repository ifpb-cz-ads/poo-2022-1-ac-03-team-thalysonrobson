import java.util.Scanner;

public class BMQuestão5{
        public static void main(String[] args){
            System.out.println("Digite um valor e veja seu respectivo dia da semana");
            Scanner sc = new Scanner(System.in);
            int numdigitado = sc.nextInt();
            switch (numdigitado){
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda-Feira");
                    break;
                case 3:
                    System.out.println("Terça-Feira");
                    break;
                case 4:
                    System.out.println("Quarta-Feira");
                    break;
                case 5:
                    System.out.println("Quinta-Feira");
                    break;
                case 6:
                    System.out.println("Sexta-Feira");
                    break;
                case 7:
                    System.out.println("Sábado");
                    break;
            }
            
            
            
            
        }

}