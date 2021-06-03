package com.lambdas.clases;

public class Alumno {
	
	private String nombre;
	private int edad;
	private String curso;
	private float nota;

	public Alumno(String nombre, int edad, String curso, float nota) {
		this.nombre=nombre;
		this.edad=edad;
		this.curso=curso;
		this.nota=nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
	
	public String infoAlum() {
		return "Nombre: "+nombre+" | Edad: "+edad+" | Curso: "+curso+" | Nota: "+nota;
	}

}
