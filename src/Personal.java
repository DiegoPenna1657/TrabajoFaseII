//Autor(es): Mathías José Miranda Rivera

import java.util.Scanner;
public class Personal extends Persona implements Comparable<Personal> {
	
	private int codigo;
	private String especialidad;
	
	public Personal(String nombre, int edad, String dni, String sexo, int codigo, String especialidad) {
		super(nombre, edad, dni, sexo);
		this.codigo = codigo;
		this.especialidad = especialidad;
	
	}
	public Personal() {
		
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public void ingresar() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("------------INGRESAR DATOS DE PERSONAL------------");
		super.ingresar();
		System.out.println("------------     INGRESAR CÓDIGO      ------------");
		this.setCodigo(sc.nextInt());
		System.out.println("------------     INGRESAR ESPECIALIDAD   ---------");
		this.setEspecialidad(sc.next());
		
	}
	
	@Override
	public String toString() {
		return  "------------  DATOS DE PERSONAL ------------"+
		        super.toString()
		        +"\n------------      CODIGO      ------------\n"+
		        +this.getCodigo()
		        +"\n------------      ESPECIALIDAD   ---------\n"+
		        this.getEspecialidad();
	
	}
	public int compareTo(Personal x){
        if(this.codigo==x.getCodigo())return 0;
        if (this.codigo<=x.getCodigo())return -1;
        return 1;
    }
	
	
}
