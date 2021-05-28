import java.util.*;
//Autor(es):Gonzalo Urrutia
public abstract class Persona{
    private String nombre;
    private int edad;
    private String dni;
    private String sexo;

    public Persona(String nombre, int edad, String dni, String sexo) {
        super();
        this.nombre = nombre;
        this.edad = edad;
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
	    System.out.println("\n------------     INGRESAR EDAD        ------------");
	       this.setEdad(sc.nextInt());
	    System.out.println("\n------------     INGRESAR DNI         ------------");
	       this.setDni(sc.next());
	    System.out.println("\n------------     INGRESAR SEXO        ------------");
	       this.setSexo(sc.next());
	}


    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni;}
    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo;}
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
	
    @Override
	public String toString() {
		return  "\n------------      NOMBRE      ------------"+
		        this.getNombre()
		        +"\n------------      EDAD        ------------"+
		        this.getEdad()
		        +"\n------------      DNI         ------------"+
		        this.getDni()
		       + "\n------------      SEXO        ------------"+
		        this.getSexo();
	
	}
    

}