import java.util.*;
//Autor(es):Gonzalo Urrutia
public abstract class Persona{
    private String nombre;
    private int annoNa;
    private int dni;
    private String sexo;

    public Persona(String nombre, int annoNa, int dni, String sexo) {
        super();
        this.nombre = nombre;
        this.annoNa = annoNa;
        this.dni = dni;
        this.sexo = sexo;
    }
    
    public Persona() {
		super();
	}


	public void ingresar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n------------     INGRESAR NOMBRE      ------------");
	       this.setNombre(sc.nextLine());
	    System.out.println("\n------------     INGRESAR AÑO NACIMIENTO        ------------");
	       this.setAnnoNa(sc.nextInt());
	    System.out.println("\n------------     INGRESAR DNI VALIDO         ------------");
	       this.setDni();
	    System.out.println("\n------------     INGRESAR SEXO        ------------");
	       this.setSexo(sc.next());
	}
	


    public int getDni() { return dni; }
    public void setDni(){
    	Scanner ss = new Scanner(System.in);
    	do {
    	this.dni = ss.nextInt();
    	}while(this.dni<10000000 || this.dni>99999999);
    }
    public void setDni(int dni){
    	this.dni = dni;
    }
    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo;}
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getAnnoNa() { return annoNa; }
    public void setAnnoNa(int edad) { this.annoNa = edad; }
	
    @Override
	public String toString() {
		return  "\n------------      NOMBRE      ------------\n"+
		        this.getNombre()
		        +"\n------------      AÑO NACIMIENTO        ------------\n"+
		        this.getAnnoNa()
		        +"\n------------      DNI         ------------\n"+
		        this.getDni()
		       + "\n------------      SEXO        ------------\n"+
		        this.getSexo();
	
	}
    

}