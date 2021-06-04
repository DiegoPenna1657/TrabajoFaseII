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
	
	
	

	public Paciente(String nombre, int edad, int dni, String sexo, String tipoSangre, double peso, double altura,
			String seguro, String practicas, String afecciones, String tratamiento, String ocupacion, Medico medico) {
		super(nombre, edad, dni, sexo);
		this.tipoSangre = tipoSangre;
		this.peso = peso;
		this.altura = altura;
		this.seguro = seguro;
		this.practicas = practicas;
		this.afecciones = afecciones;
		this.tratamiento = tratamiento;
		this.ocupacion = ocupacion;
		this.medico = medico;
	}

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
	 public void modificar() {
		 Scanner sc = new Scanner(System.in);
		 	System.out.println("------------MODIFICAR DATOS DE PACIENTE------------");
		 	
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
		"------------  DATOS DE PACIENTE ------------\n"
		+super.toString()
        +"\n------------   TIPO DE SANGRE ------------\n"+
        this.getTipoSangre()
        +"\n------------     SEGURO    	------------\n"+
        this.getSeguro()
        +"\n------------      PESO        ------------\n"+
        this.getPeso()
        +"\n------------      ALTURA      ------------\n"+
        this.getAltura()
        +"\n------------    AFECCIONES    ------------\n"+
        this.getAfecciones()
        +"\n------------   TRATAMIENTOS   ------------\n"+
        this.getTratamiento()
        +"\n------------     PRACTICAS    ------------\n"+
        this.getPracticas();
       
	}
	public boolean equals(Object o) {
		if (o instanceof Paciente) {
			Paciente m = (Paciente) o;
			return m.getDni()==this.getDni();
		}
		return false;
	}
	@Override
	public int compareTo(Paciente x) {
		if(this.getDni()>x.getDni()) return 1;
		if(this.getDni()<x.getDni()) return -1;
		return 0;
	}
	
}
