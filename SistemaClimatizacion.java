public abstract class SistemaClimatizacion implements ClimatizacionBase {
    protected boolean estado;
    protected int temperaturaActual;
    protected int sensorTemperatura;

    @Override
    public void encender() {
        estado = true;
    }

    @Override
    public void apagar() {
        estado = false;
    }

    @Override
    public void ajustarTemperatura(int incremento) {
        if (estado) {
            temperaturaActual += incremento;
        }
    }

    @Override
    public void modoAutomatico(int temperaturaExterna) {
        if (estado) {
            // Lógica para ajustar automáticamente según la temperatura externa
        }
    }
}
