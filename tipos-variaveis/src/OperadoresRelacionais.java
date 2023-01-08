public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nomeA = "Ycaro";
        String nomeB = new String("Ycaro");

        System.out.println(nomeA.equals(nomeB));
        
        /*String nomeA = "Ycaro";
        String nomeB = "Icaro";  //

        System.out.println(nomeA == nomeB);*/

       int numeroA = 2;
       int numeroB = 1;

       boolean simNao = numeroA == numeroB;

       if(numeroA < numeroB){
        System.out.println("A nossa condição é verdadeira");
       } else 
            System.out.println("A nossa condição é falsa");

       System.out.println("numeroA é igual a numeroB?" + simNao);

       simNao = numeroA != numeroB;

       System.out.println("numeroA é igual a numeroB?" + simNao);

       simNao = numeroA > numeroB;

       System.out.println("numeroA é maior que numeroB?" + simNao);
    }
}
