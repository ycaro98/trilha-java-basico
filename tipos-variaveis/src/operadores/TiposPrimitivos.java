package operadores;
import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        /*int idade = 24;
        //int idade = (int) 3; //typecast
        //Integer idade = new Integer (3) //Aqui é um objeto - Wrapper class
        float sal = 1825.54f;
        //float sal = (float) 1825.54; //typecast
        //Float sal = new Float(1825.54); //Wrapper Class
        char letra = 'G';
        //char letra = (char) 'G';
        //Character letra = new Character('G');
        boolean casado = false;
        //boolean casado = (boolean) false;
        //Boolean casado = new Boolean(false);*/
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
            //System.out.println("Sua nota:" + nota);
            //System.out.print("Sua nota:" + nota);
            //System.out.printf("A nota de %s é %.2f \n", nome, nota);
            System.out.format("A nota de %s é %.2f \n", nome, nota); 
    }
    
}
