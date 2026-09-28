package Ejercicio9_planHosting;

public class PlanHosting {
    private String nombreDominio;
    private int capacidadMaximaGB;
    private double espacioOcupadoGB;

    public PlanHosting(String nombreDominio, int capacidadMaximaGB, double espacioOcupadoGB) {
        if (capacidadMaximaGB <= 0) {
            throw new IllegalArgumentException("La capacidad máxima debe ser mayor a cero.");
        }
        if (espacioOcupadoGB < 0 || espacioOcupadoGB > capacidadMaximaGB) {
            throw new IllegalArgumentException("El espacio ocupado debe estar entre 0 y la capacidad máxima.");
        }
        this.nombreDominio = nombreDominio;
        this.capacidadMaximaGB = capacidadMaximaGB;
        this.espacioOcupadoGB = espacioOcupadoGB;
    }

    public void subirArchivos(double pesoGB) {
        if (pesoGB <= 0) {
            System.out.println("El peso a subir debe ser mayor a cero.");
        } else if (espacioOcupadoGB + pesoGB > capacidadMaximaGB) {
            System.out.println("ALERTA: no se pueden subir " + pesoGB + " GB a " + nombreDominio
                    + ", se superaría la capacidad máxima de " + capacidadMaximaGB + " GB.");
        } else {
            espacioOcupadoGB += pesoGB;
            System.out.println("Se subieron " + pesoGB + " GB. Espacio ocupado: "
                    + espacioOcupadoGB + "/" + capacidadMaximaGB + " GB.");
        }
    }
}
