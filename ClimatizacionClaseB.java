public class ClimatizacionClaseB extends SistemaClimatizacion implements VentilacionBase, CalefaccionBase, DesempañadorBase {
      @Override
      public void ajustarIntensidad(int nivel) {
      }
  
      @Override
      public void cambiarDireccion(String direccion) {
      }
  
      @Override
      public void activarModoSilencioso() {
          throw new UnsupportedOperationException("Modo silencioso no está disponible para Clase B");
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
  }