import java.util.*;
//Autor(es):Gonzalo Urrutia
public abstract class Persona{
    private String nombre;
    private int edad;
    private int dni;
    private String sexo;

    public Persona(String nombre, int edad, int dni, String sexo) {
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
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
	
    @Override
	public String toString() {
		return  "\n------------      NOMBRE      ------------\n"+
		        this.getNombre()
		        +"\n------------      EDAD        ------------\n"+
		        this.getEdad()
		        +"\n------------      DNI         ------------\n"+
		        this.getDni()
		       + "\n------------      SEXO        ------------\n"+
		        this.getSexo();
	
	}
    

}