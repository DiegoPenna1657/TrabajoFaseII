//Autor: Denilson Carlos Ala Samayani

import java.util.Scanner;

public class Medico extends Persona implements Comparable<Medico>{
	private String especialidad;
	private int ruc;
	private int codigo;
	
	public Medico(String nombre, int edad, int dni, String sexo, String especialidad, int ruc, int codigo) {
		super(nombre, edad, dni, sexo);
		this.especialidad = especialidad;
		this.ruc = ruc;
		this.codigo = codigo;
	}
	public Medico() {
		super();
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getRuc() {
		return ruc;
	}

	public void setRuc(int ruc) {
		this.ruc = ruc;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void ingresar() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------INGRESAR DATOS DE M?DICO------------");
		        super.ingresar();
		        System.out.println("------------     INGRESAR ESPECIALIDAD        ------------");
		        this.setEspecialidad(sc.nextLine());
		        System.out.println("------------     INGRESAR RUC        ------------");
		        this.setRuc(sc.nextInt());
		        System.out.println("------------     INGRESAR C?DIGO        ------------");
		        this.setCodigo(sc.nextInt());
	}
	public void modificar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------MODIFICAR DATOS DE M?DICO------------");
		        System.out.println("------------     INGRESAR ESPECIALIDAD        ------------");
		        this.setEspecialidad(sc.nextLine());
		        System.out.println("------------     INGRESAR RUC        ------------");
		        this.setRuc(sc.nextInt());
		        System.out.println("------------     INGRESAR C?DIGO        ------------");
		        this.setCodigo(sc.nextInt());
	}

	public int compareTo(Medico o) {
		if (o.getCodigo() == this.codigo) {
			return 0;
		}
		else if (o.getCodigo() > this.codigo) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	public boolean equals(Object o) {
		if (o instanceof Medico) {
			Medico m = (Medico) o;
			return m.getRuc() == this.ruc && m.getCodigo() == this.codigo;
		}
		return false;
	}
	@Override
	public String toString() {
		return  "------------  DATOS DE MEDICO ------------"+
				super.toString()
				+"\n------------      ESPECIALIDAD      ------------\n"+
                this.getEspecialidad()
                +"\n------------      RUC        ------------\n"+
                this.getRuc()
                +"\n------------      C?DIGO         ------------\n"+
                this.getCodigo();
	}
}