class Main {
    public static void main(String[] args) {
        var miBanner = new Banner();
        miBanner.registrarAlumno("Kevin", new int[]{100,90,96,94,80});
        miBanner.descripcionAlumno();

        // Otro caso de prueba

        var miOtroBanner = new Banner();
        miOtroBanner.registrarAlumno("Angel", new int[]{50,60,40,30,90});
        miOtroBanner.descripcionAlumno();
    }
}