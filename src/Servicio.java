public class Servicio {
    private String nombre;
    private int puerto;
    private boolean activo;
    private int cantidadPeticiones;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacio.");
        }
    }

    public int getPuerto() {
        return this.puerto;
    }

    public void setPuerto(int puerto) {
        if (puerto > 0) {
            this.puerto = puerto;
        } else {
            System.out.println("Error: El puerto debe ser mayor que 0.");
        }
    }

    public boolean isActivo() {
        return this.activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getCantidadPeticiones() {
        return this.cantidadPeticiones;
    }

    public void setCantidadPeticiones(int cantidadPeticiones) {
        if (cantidadPeticiones >= 0) {
            this.cantidadPeticiones = cantidadPeticiones;
        } else {
            System.out.println("Error: La cantidad de peticiones no puede ser negativa.");
        }
    }

    public void iniciar() {
        this.activo = true;
        System.out.println("Servicio " + this.nombre + " iniciado en el puerto: " + this.puerto);
    }

    public void detener() {
        this.activo = false;
        System.out.println("Servicio " + this.nombre + " detenido.");
    }

    public void registrarPeticion() {
        if (this.activo) {
            this.cantidadPeticiones++;
            System.out.println("Peticion registrada. Total de peticiones: " + this.cantidadPeticiones);
        } else {
            System.out.println("Error: No se pueden registrar peticiones porque el servicio esta detenido.");
        }
    }
}