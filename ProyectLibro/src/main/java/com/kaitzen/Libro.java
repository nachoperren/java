package com.kaitzen;

public class Libro {
    private String nombre;
    private String autor;
    private String editorial;
    private Ubicacion ubicacion;
    private String alumnoResponsable;

    Libro() {
        this.ubicacion = Ubicacion.BIBLIOTECA;
        this.alumnoResponsable = "";
    }

    Libro(String nombre, String autor, String editorial) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.ubicacion = Ubicacion.BIBLIOTECA;
        this.alumnoResponsable = "";
    }

    public void prestamo(String alumno) {
        this.alumnoResponsable = alumno;
        this.ubicacion = Ubicacion.ALUMNO;
    }

    public void devolucion() {
        this.ubicacion = Ubicacion.BIBLIOTECA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String toString() {
        StringBuffer strBuf = new StringBuffer();
        if (this.ubicacion == Ubicacion.BIBLIOTECA) {
            strBuf.append("El libro esta disponible en Biblioteca.");
            if (!this.alumnoResponsable.isEmpty()) {
                strBuf.append(" El último en retirarlo fue el alumno ");
                strBuf.append(this.alumnoResponsable);
            }
        } else {
            strBuf.append("El libro NO esta disponible en Biblioteca. Lo tiene actualmente el alumno ");
            strBuf.append(this.alumnoResponsable);
        }
        return strBuf.toString();
    }
}
