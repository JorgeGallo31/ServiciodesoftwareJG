public class Main {
    public static void main(String[] args) {
        Servicio miServicio = new Servicio();

        miServicio.setNombre("");
        miServicio.setPuerto(-80);
        miServicio.setCantidadPeticiones(-5);


        miServicio.setNombre("API de Autenticacion");
        miServicio.setPuerto(8080);
        miServicio.setCantidadPeticiones(0);

        miServicio.iniciar();
        miServicio.registrarPeticion();
        miServicio.registrarPeticion();

        miServicio.detener();
        miServicio.registrarPeticion();
    }
}