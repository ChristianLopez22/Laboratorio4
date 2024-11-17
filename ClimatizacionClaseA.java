public class ClimatizacionClaseA extends SistemaClimatizacion implements VentilacionBase, CalefaccionBase, DesempañadorBase, IonizadorBase {
    @Override
    public void ajustarIntensidad(int nivel) {
    }

    @Override
    public void cambiarDireccion(String direccion) {
    }

    @Override
    public void activarModoSilencioso() {
        throw new UnsupportedOperationException("Modo silencioso no está disponible para Clase A");
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
    public void activarIonizador() {
    }

    @Override
    public void ajustarIntensidadIonizador(int nivel) {
    }

    @Override
    public void desactivarIonizador() {
    }
}