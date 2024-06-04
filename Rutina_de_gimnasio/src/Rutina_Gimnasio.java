import java.util.Scanner;

public class Rutina_Gimnasio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();
        scanner.nextLine();

        if (edad >= 65) {
            System.out.println("Ingrese el día de la semana:");
            String dia = scanner.nextLine().trim().toLowerCase();

            switch (dia) {
                case "lunes":
                    System.out.println("Día 1: Tren Superior");
                    System.out.println("Press de pecho en máquina (3 series de 10-12 repeticiones)");
                    System.out.println("Precauciones: Comenzar con un peso ligero. Aumentar gradualmente. Movimientos suaves y controlados.");
                    System.out.println("Remo sentado en máquina (3 series de 10-12 repeticiones)");
                    System.out.println("Precauciones: Iniciar con peso bajo. Aumentar progresivamente. Mantener postura recta.");
                    System.out.println("Press de hombros con mancuernas o máquina (3 series de 10-12 repeticiones)");
                    System.out.println("Precauciones: Empezar con mancuernas ligeras. No bajar los codos más allá del nivel de los hombros.");
                    System.out.println("Curl de bíceps con mancuernas (3 series de 10-12 repeticiones)");
                    System.out.println("Precauciones: Utilizar mancuernas ligeras. Movimientos lentos para evitar balanceo.");
                    System.out.println("Extensión de tríceps en polea (3 series de 10-12 repeticiones)");
                    System.out.println("Precauciones: Comenzar con peso bajo. Mantener los codos cerca del cuerpo.");
                    break;
                case "martes":
                    System.out.println("Día 2: Tren Inferior");
                    System.out.println("Prensa de piernas (3 series de 10-12 repeticiones)");
                    System.out.println("Precauciones: Iniciar con peso ligero. Mantener los pies bien apoyados. Evitar extender completamente las rodillas.");
                    System.out.println("Extensión de piernas en máquina (3 series de 10-12 repeticiones)");
                    System.out.println("Precauciones: Comenzar con menor peso disponible. Movimientos lentos. No hiperextender las rodillas.");
                    System.out.println("Curl de piernas en máquina (3 series de 10-12 repeticiones)");
                    System.out.println("Precauciones: Utilizar peso ligero. Controlar el movimiento para evitar tirones.");
                    System.out.println("Elevación de talones en máquina (3 series de 15 repeticiones)");
                    System.out.println("Precauciones: Empezar con peso bajo. Movimientos controlados. Evitar rebotar.");
                    System.out.println("Sentadillas asistidas (3 series de 10-12 repeticiones)");
                    System.out.println("Precauciones: Realizar sin peso adicional hasta dominar la técnica. Asegurarse de que la silla esté firmemente colocada.");
                    break;
                case "miercoles":
                    System.out.println("Día 3: Cardio y Estiramientos");
                    System.out.println("Bicicleta estática: 20-30 minutos a ritmo moderado.");
                    System.out.println("Estiramientos estáticos: Mantener cada estiramiento por 20-30 segundos sin rebotes.");
                    break;
                case "jueves":
                    System.out.println("Día 4: Tren Superior (Variación)");
                    System.out.println("Aperturas con mancuernas en banco plano (3 series de 10-12 repeticiones)");
                    System.out.println("Precauciones: Iniciar con mancuernas muy ligeras. Movimientos controlados para evitar tensión en el hombro.");
                    System.out.println("Pulldown en polea alta (3 series de 10-12 repeticiones)");
                    System.out.println("Precauciones: Utilizar peso ligero. Controlar el movimiento. No inclinarse demasiado hacia atrás.");
                    System.out.println("Elevaciones laterales con mancuernas (3 series de 10-12 repeticiones)");
                    System.out.println("Precauciones: Comenzar con mancuernas ligeras. Evitar subir los brazos más allá del nivel de los hombros.");
                    System.out.println("Curl de bíceps en predicador (3 series de 10-12 repeticiones)");
                    System.out.println("Precauciones: Utilizar peso ligero. Movimientos controlados para evitar presión en el codo.");
                    System.out.println("Extensión de tríceps sobre la cabeza con mancuerna (3 series de 10-12 repeticiones)");
                    System.out.println("Precauciones: Empezar con peso ligero. Mantener los codos cerca de la cabeza. Movimientos lentos.");
                    break;
                case "viernes":
                    System.out.println("Día 5: Tren Inferior (Variación)");
                    System.out.println("Sentadillas en máquina Smith (3 series de 10-12 repeticiones)");
                    System.out.println("Precauciones: Iniciar con la barra sola o con pesos muy ligeros. Mantener postura adecuada. Evitar bajar demasiado profundo.");
                    System.out.println("Peso muerto rumano con mancuernas (3 series de 10-12 repeticiones)");
                    System.out.println("Precauciones: Utilizar mancuernas ligeras. Mantener la espalda recta. Evitar forzar el movimiento.");
                    System.out.println("Zancadas asistidas (3 series de 10-12 repeticiones por pierna)");
                    System.out.println("Precauciones: Realizar sin peso adicional hasta dominar el movimiento. Asegurarse de que la rodilla delantera no pase la punta del pie.");
                    System.out.println("Abducción de cadera en máquina (3 series de 10-12 repeticiones)");
                    System.out.println("Precauciones: Empezar con menor peso disponible. Movimientos controlados. Evitar rebotar.");
                    System.out.println("Elevación de talones sentado (3 series de 15 repeticiones)");
                    System.out.println("Precauciones: Comenzar con peso ligero. Movimientos lentos y controlados.");
                    break;
                default:
                    System.out.println("Día no válido. Por favor, introduce un día entre lunes y viernes.");
                    break;
            }
        } else if (edad >= 12) {
            System.out.println("Ingrese el día de la semana:");
            String day = scanner.nextLine().trim().toLowerCase();

            switch (day) {
                case "lunes":
                    System.out.println("Rutina del Lunes:");
                    System.out.println("1. Pecho y Tríceps");
                    System.out.println("2. Press de banca - 4 sets de 12 repeticiones");
                    System.out.println("3. Fondos - 3 sets de 10 repeticiones");
                    System.out.println("4. Press militar - 4 sets de 12 repeticiones");
                    System.out.println("5. Flexiones de brazos - 3 sets de 15 repeticiones");
                    break;
                case "martes":
                    System.out.println("Rutina del Martes:");
                    System.out.println("1. Espalda y Bíceps");
                    System.out.println("2. Pecho - 4 sets de 10 repeticiones");
                    System.out.println("3. Remo con barra - 4 sets de 12 repeticiones");
                    System.out.println("4. Curl de bíceps con mancuernas - 4 sets de 12 repeticiones");
                    System.out.println("5. Peso muerto - 3 sets de 10 repeticiones");
                    break;
                case "miércoles":
                    System.out.println("Rutina del Miércoles:");
                    System.out.println("1. Piernas");
                    System.out.println("2. Sentadillas - 4 sets de 12 repeticiones");
                    System.out.println("3. Prensa de piernas - 4 sets de 12 repeticiones");
                    System.out.println("4. Elevación de talones - 4 sets de 15 repeticiones");
                    System.out.println("5. Curl de piernas - 3 sets de 12 repeticiones");
                    break;
                case "jueves":
                    System.out.println("Rutina del Jueves:");
                    System.out.println("1. Hombros y Abdominales");
                    System.out.println("2. Press militar con mancuernas - 4 sets de 12 repeticiones");
                    System.out.println("3. Elevaciones laterales - 4 sets de 15 repeticiones");
                    System.out.println("4. Elevaciones frontales - 4 sets de 15 repeticiones");
                    System.out.println("5. Crunches - 3 sets de 20 repeticiones");
                    System.out.println("6. Plancha - 3 sets de 1 minuto");
                    break;
                case "viernes":
                    System.out.println("Rutina del Viernes:");
                    System.out.println("1. Pecho y Tríceps");
                    System.out.println("2. Press inclinado con mancuernas - 4 sets de 12 repeticiones");
                    System.out.println("3. Aperturas con mancuernas - 4 sets de 15 repeticiones");
                    System.out.println("4. Fondos - 3 sets de 12 repeticiones");
                    System.out.println("5. Extensión de tríceps - 4 sets de 12 repeticiones");
                    break;
                default:
                    System.out.println("Día no válido. Por favor ingrese un día de la semana válido.");
            }
        } else {
            System.out.println("Error. Las rutinas del gimnasio estan habilitadas para personas mayores de 12 años.");
        }

        scanner.close();
    }
}