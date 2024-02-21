public class Banner {
    private String alumno;
    private int[] calificaciones = new int[5];
    private char calificacionFinal;
    private int promedio;
    public Banner() {}

    /**
     * Guarda la información del alumno de Banner
     * @param alumno su nombre completo
     * @param calificaciones un array de 5 calificaciones
     * <pre>
     * {@code
     * //Ejemplo de uso
     * var miBanner = new Banner();
     * miBanner.registrarAlumno("Kevin", new int[]{100,90,96,94,80});
     * }
     * </pre>
     * */
    public void registrarAlumno(String alumno, int[] calificaciones) {
        if(calificaciones.length != 5) {
            System.err.println("Pon todas las calificaciones");
            return;
        }

        setAlumno(alumno);
        setCalificaciones(calificaciones);
        this.promedio = calcularCalificaciones();
        this.calificacionFinal = calcularCalificacionFinal();

        System.out.printf("ALUMNO: %s REGISTRADO\n", alumno);
    }

    /**
     * Calcula la calificación del alumno (previamente registrado)
     * <pre>
     * {@code
     * // Ejemplo de uso
     * var miBanner = new Banner();
     * miBanner.registrarAlumno("Kevin", new int[]{100,90,96,94,80});
     * var x = miBanner.calcularCalificaciones();
     * }
     * </pre>
     * */
    int calcularCalificaciones() {
        int promedio = 0;
        for(int calificacion : calificaciones) promedio += calificacion;

        return promedio / 5;
    }

    /**
     * Calcula la calificación final del alumno (previamente registrado)
     * <pre>
     * {@code
     * // Ejemplo de uso
     * var miBanner = new Banner();
     * miBanner.registrarAlumno("Kevin", new int[]{100,90,96,94,80});
     * var x = miBanner.calcularCalificacionFinal();
     * }
     * </pre>
     * */
    char calcularCalificacionFinal() {
        if(promedio < 51) return 'F';
        if(promedio > 50 && promedio < 61) return 'E';
        if(promedio > 60 && promedio < 71) return 'D';
        if(promedio > 70 && promedio < 81) return 'C';
        if(promedio > 80 && promedio < 91) return 'B';
        return 'A';
    }

    /**
     * Imprime la información del alumno (previamente registrado)
     * <pre>
     * {@code
     * // Ejemplo de uso
     * var miBanner = new Banner();
     * miBanner.registrarAlumno("Kevin", new int[]{100,90,96,94,80});
     * miBanner.descripcionAlumno();
     * }
     * </pre>
     * */
    public void descripcionAlumno() {
        System.out.println("Alumno" + alumno);
        for(int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificacion " + i + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }

    // Getters y setters

    public void setCalificacionFinal(char calificacionFinal) {
        this.calificacionFinal = calificacionFinal;
    }

    public char getCalificacionFinal() {
        return calificacionFinal;
    }

    public int[] getCalificaciones() {
        return calificaciones;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public void setCalificaciones(int[] calificaciones) {
        this.calificaciones = calificaciones;
    }
}
