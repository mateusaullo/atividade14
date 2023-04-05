import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double peso,multa,excesso,limite,multa_quilo;

        Scanner teclado = new Scanner(System.in);

        System.out.print("\nColoque a quantidade de peso de peixes que voce pegou: ");
        peso = teclado.nextDouble();

        teclado.close();
        

        limite = 50;
        excesso = 0;
        multa_quilo = 4;

        excesso = peso - limite;
        multa = excesso * multa_quilo;
         
        if(peso > limite){
          
          System.out.printf("\nPeso acima do limite de %.0f quilos",limite);
          System.out.printf("\nMultado em R$ %.2f reais",multa);
          System.out.printf("\npelo excesso de %.2f quilos",excesso);
        } else if(peso == limite){
            System.out.printf("\nPeso igual ao limite permitido de %.0f quilos",limite);
            System.out.printf("\nEsta Liberado e nao ira pagar nenhuma taxa!!!",multa);
        }
        else{
            System.out.printf("\nPeso abaixo do limite de %.0f quilos, ",limite);
            System.out.printf("Esta Liberado e nao ira pagar nenhuma taxa!!!!",multa);
        }

    }
}
