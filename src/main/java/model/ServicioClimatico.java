public interface ServicioClimatico{

    public Clima getClima(String ciudad);
    

    public List<String> getAlertas(String ciudad);
}