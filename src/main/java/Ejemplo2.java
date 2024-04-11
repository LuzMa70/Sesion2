public class Ejemplo2 {
    public static void main(String[] args) {
        int calificacion = 10;

        switch (calificacion){
            case 10:
                System.out.println("Excelente!!");
                break;
            case 9:
                System.out.println("Muy Bien!!");
                break;
            case 8:
                System.out.println("Bien!");
                break;
            case 7:
                System.out.println("Bien!");
                break;
            case 6:
                System.out.println("Pasaste");
                break;
            default:
                System.out.println("No es una calificacion valida");
        }
    }
}
