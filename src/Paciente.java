import java.util.*;
//Autor(es): Diego Peña, Josue Butron
public class Paciente extends Persona implements Comparable<Paciente> {
	
	private String tipoSangre;
	private double peso;
	private double altura;
	private String seguro;
	private String practicas;
	private String afecciones;
	private String tratamiento;
	private String ocupacion;
	private Medico medico;
	
	
	

	public Paciente() {
		super();
	}
	
	 public void ingresar() {
		 Scanner sc = new Scanner(System.in);
		 	System.out.println("------------INGRESAR DATOS DE PACIENTE------------");
		 	super.ingresar();
	        System.out.println("\n------------  INGRESAR TIPO DE SANGRE ------------");
	        this.setTipoSangre(sc.next());
	        
	        System.out.println("\n------------    INGRESAR SEGURO    ------------");
	        this.setSeguro(sc.next());
	        
	        System.out.println("\n------------     INGRESAR PESO        ------------");
	        this.setPeso(sc.nextDouble());
	        
	        System.out.println("\n------------     INGRESAR ALTURA      ------------");
	        this.setAltura(sc.nextDouble());
	        
	        System.out.println("\n------------   INGRESAR AFECCIONES    ------------");
	        this.setAfecciones(sc.next());
	        
	        System.out.println("\n------------  INGRESAR TRATAMIENTOS   ------------");
	        this.setTratamiento(sc.next());
	        
	        System.out.println("\n------------    INGRESAR PRACTICAS    ------------");
	        this.setPracticas(sc.next());
	        
		 
		 
		 
	}

	public String getTipoSangre() {
		return tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getSeguro() {
		return seguro;
	}

	public void setSeguro(String seguro) {
		this.seguro = seguro;
	}

	public String getAfecciones() {
		return afecciones;
	}

	public void setAfecciones(String afecciones) {
		this.afecciones = afecciones;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getPracticas() {
		return practicas;
	}

	public void setPracticas(String practicas) {
		this.practicas = practicas;
	}

	@Override
	public String toString() {
		
		return 
		"------------  DATOS DE PACIENTE ------------"
		+super.toString()
        +"\n------------   TIPO DE SANGRE ------------"+
        this.getTipoSangre()
        +"\n------------     SEGURO    	------------"+
        this.getSeguro()
        +"\n------------      PESO        ------------"+
        this.getPeso()
        +"\n------------      ALTURA      ------------"+
        this.getAltura()
        +"\n------------    AFECCIONES    ------------"+
        this.getAfecciones()
        +"\n------------   TRATAMIENTOS   ------------"+
        this.getTratamiento()
        +"\n------------     PRACTICAS    ------------"+
        this.getPracticas();
       
	}
	@Override
	public int compareTo(Paciente x) {
		if(this.getDni().compareTo(x.getDni())>0) return 1;
		if(this.getDni().compareTo(x.getDni())<0) return -1;
		return 0;
	}
	
}
