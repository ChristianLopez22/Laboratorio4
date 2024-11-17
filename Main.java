public class Main {
    public static void main(String[] args) {
        ClimatizacionClaseA claseA = new ClimatizacionClaseA();
        ClimatizacionClaseB claseB = new ClimatizacionClaseB();
        ClimatizacionClaseC claseC = new ClimatizacionClaseC();

        // Simulación de operaciones con Clase A
        System.out.println("Simulación para Clase A:");
        claseA.encender();
        System.out.println("Sistema encendido.");
        claseA.ajustarTemperatura(5);
        System.out.println("Temperatura ajustada a 5 grados.");
        claseA.ajustarIntensidad(3);
        System.out.println("Intensidad de ventilación ajustada a nivel 3.");
        claseA.cambiarDireccion("frontal");
        System.out.println("Dirección del flujo de aire cambiada a frontal.");
        claseA.ajustarCalefaccionAsientos(2);
        System.out.println("Calefacción de asientos ajustada a nivel 2.");
        claseA.activarIonizador();
        System.out.println("Ionizador de aire activado.");
        claseA.desactivarIonizador();
        System.out.println("Ionizador de aire desactivado.");
        claseA.apagar();
        System.out.println("Sistema apagado.");

        // Simulación de operaciones con Clase B
        System.out.println("\nSimulación para Clase B:");
        claseB.encender();
        System.out.println("Sistema encendido.");
        claseB.ajustarTemperatura(3);
        System.out.println("Temperatura ajustada a 3 grados.");
        claseB.ajustarIntensidad(2);
        System.out.println("Intensidad de ventilación ajustada a nivel 2.");
        claseB.cambiarDireccion("pies");
        System.out.println("Dirección del flujo de aire cambiada a pies.");
        claseB.ajustarCalefaccionAsientos(1);
        System.out.println("Calefacción de asientos ajustada a nivel 1.");
        claseB.calefaccionRapida();
        System.out.println("Calefacción rápida activada.");
        claseB.apagar();
        System.out.println("Sistema apagado.");

        // Simulación de operaciones con Clase C
        System.out.println("\nSimulación para Clase C:");
        claseC.encender();
        System.out.println("Sistema encendido.");
        claseC.ajustarTemperatura(4);
        System.out.println("Temperatura ajustada a 4 grados.");
        claseC.ajustarIntensidad(1);
        System.out.println("Intensidad de ventilación ajustada a nivel 1.");
        claseC.cambiarDireccion("parabrisas");
        System.out.println("Dirección del flujo de aire cambiada a parabrisas.");
        claseC.ajustarHumedad(3);
        System.out.println("Humedad ajustada a nivel 3.");
        int humedad = claseC.obtenerHumedadActual();
        System.out.println("Humedad actual: " + humedad + "%");
        claseC.apagar();
        System.out.println("Sistema apagado.");
    }
}
