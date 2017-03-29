public class Alumno {

    private String nombre;
    private int clave;
    private static int contador = 0;

    public Alumno (String nombre) {
        this.nombre = nombre;
        this.clave = ++contador;
    }

    public String getNombre () {
        return nombre;
    }

    public int getClave () {
        return clave;
    }

    public static int getContador() {
        return contador;
    }

    public static void reinicio () {
        contador = 0;
    }
}