public interface ClimatizacionBase {
    void encender();
    void apagar();
    void ajustarTemperatura(int incremento);
    void modoAutomatico(int temperaturaExterna);
}