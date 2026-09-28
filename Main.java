package Ejercicio9_planHosting;

public class Main {
    public static void main(String[] args) {
        PlanHosting plan = new PlanHosting("mitienda.com.ar", 10, 2.0);
        plan.subirArchivos(3.5);
        plan.subirArchivos(4.0);
        plan.subirArchivos(2.0);
        plan.subirArchivos(0.4);
    }
}
