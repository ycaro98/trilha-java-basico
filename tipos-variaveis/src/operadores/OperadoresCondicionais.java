package operadores;
public class OperadoresCondicionais{
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 5;
        String resultado = a==b ?"verdadeiro" : "falso";

        //outra forma de fazer o mesmo código acima
        /*if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";*/
        
        System.out.println(resultado);
    }
}