public class Reto2If {
    public static void main(String[] args) {
        String mensaje;

        byte calificacion = 10;

        if(calificacion == 10){
            mensaje = "¡Excelente!";
        } else if (calificacion == 9 || calificacion == 8){
            mensaje = "¡Muy bien!";
        } else if(calificacion == 7){
            mensaje = "Bien hecho";
        } else if (calificacion == 6){
            mensaje = "Pasaste";
        } else {
            mensaje = "Mejor vuelve a intentarlo";
        }
        System.out.println("Tu calificación es " + calificacion + ". " + mensaje);

    }
}
