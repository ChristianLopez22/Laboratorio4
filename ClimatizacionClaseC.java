public class ClimatizacionClaseC extends SistemaClimatizacion implements VentilacionBase, CalefaccionBase, DesempañadorBase, ControlHumedadBase {
      @Override
      public void ajustarIntensidad(int nivel) {
      }
  
      @Override
      public void cambiarDireccion(String direccion) {
      }
  
      @Override
      public void activarModoSilencioso() {
          System.out.println("Modo silencioso activado para Clase C");
      }
  
      @Override
      public void ajustarCalefaccionAsientos(int nivel) {
      }
  
      @Override
      public void ajustarCalefaccionVolante(int nivel) {
      }
  
      @Override
      public void calefaccionRapida() {
      }
  
      @Override
      public void activarDesempañador(String area) {
      }
  
      @Override
      public void desactivarDesempañador() {
      }
  
      @Override
      public void ajustarHumedad(int nivel) {
      }
  
      @Override
      public int obtenerHumedadActual() {
          // Retorna un valor simulado de humedad
          int humedadActual = 50;
          return humedadActual;
      }
  }
  