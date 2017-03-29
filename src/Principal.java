public class Principal {

    public static void main (String []args) {

        System.out.println("Ejemplo de alumnos con clave única");

        Alumno a1 = new Alumno("Efrain");
        Alumno.reinicio();
        Alumno a2 = new Alumno("Emanuel");
        Alumno a3 = new Alumno("Schneider");

        System.out.println(a1.getNombre() + ": " + a1.getClave());
        System.out.println(a2.getNombre() + ": " + a2.getClave());
        System.out.println(a3.getNombre() + ": " + a3.getClave());

        System.out.println(Alumno.getContador());
    }
}