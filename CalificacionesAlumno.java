public class CalificacionesAlumno {
    // Atributos
    private String nombre;
    private int[] calificaciones;

    // Constructor
    public CalificacionesAlumno(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Método para calcular el promedio de las calificaciones
    public double calcularPromedio() {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (double) suma / calificaciones.length;
    }

    // Método para obtener la calificación final según el promedio
    public char obtenerCalificacionFinal(double promedio) {
        if (promedio >= 90) {
            return 'A';
        } else if (promedio >= 80) {
            return 'B';
        } else if (promedio >= 70) {
            return 'C';
        } else if (promedio >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Método para mostrar información del alumno
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Calificaciones: " + Arrays.toString(calificaciones));
        double promedio = calcularPromedio();
        char calificacionFinal = obtenerCalificacionFinal(promedio);
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación Final: " + calificacionFinal);
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        String nombreAlumno = "Juan";
        int[] calificacionesAlumno = { 85, 90, 78, 92, 88 };

        CalificacionesAlumno alumno = new CalificacionesAlumno(nombreAlumno, calificacionesAlumno);
        alumno.mostrarInformacion();
    }
}
