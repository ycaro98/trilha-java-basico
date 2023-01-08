public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
            System.out.println(numero);
        numero = 10;
            System.out.println(numero);
        final int numero2 = 3;
            System.out.println(numero2);
        //numero2 = 4;
    }
}
