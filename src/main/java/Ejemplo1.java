public class Ejemplo1 {
    public static void main(String[] args) {
        // numericos
        byte valorByte = 1;
        short valorShort = 1;
        int valorInt = 1;
        long valorLong = 1L;

        // numericos decimales
        float valorFloat = 1.5F;
        double valorDouble = 1.5;

        // Valores de verdad
        boolean valorBoolean = true;
        boolean valorBoolean2 = false;

        // Caracteres
        char valorChar = '-';

        System.out.println(valorInt + valorShort);

        System.out.println(valorLong + valorByte);

        System.out.print(valorDouble + valorFloat );

        // Casting
        float intAFloat = (float) valorInt;
        System.out.print(intAFloat);





    }
}
