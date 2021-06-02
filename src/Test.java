import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		// Autor(es): Gonzalo Urrutia, 
		//Auxiliar que me ayudara a entrar al menu por primera vez
		int ver = 1;
		//Creamos las estructuras de datos que utilizaremos en el programa
		TDAList <Personal> personal_linked = new ListLinked<Personal>();
		
		// Se muestra el menú que se mostrará al usuario
		System.out.println("-------BIENVENIDO AL GESTOR UNIVERSAL DE HISTORIAS CLINICAS ---------");
		System.out.println("----INGRESE SU CONTRASEÑA DE ADMINISTRADOR O DE PERSONAL---------");
		Scanner entrada = new Scanner(System.in);
		int log = entrada.nextInt();
		if (log == 0000 )	//Pendiente de solucionar, or 
		{
			while (ver != 0)
			{
				System.out.println("------------SELECCIONE UNA OPCION---------------");
				System.out.println("1.-----INGRESO DE DATOS------");
				System.out.println("2.-----CONSULTA/BUSQUEDA DE PACIENTES------");
				System.out.println("3.-----CONSULTA/BUSQUEDA DE DOCTORES------");
				System.out.println("4.-----ELIMINACION DE DATOS------");
				System.out.println("5.-----MODIFICAR DATOS------");
				System.out.println("6.-----MOSTRAR DATOS------");
				System.out.println("7.-----TERMINAR EL PROGRAMA------");
				Scanner entrada_dos = new Scanner(System.in);
				int log_dos = entrada.nextInt();
				switch(log_dos){
				case 1:
					System.out.println("Caso 1");
					break;
				case 2:
					System.out.println("Caso 2");
					break;
				case 3:
					System.out.println("Caso 3");
					break;
				case 4:
					System.out.println("Caso 4");
					break;
				case 5:
					System.out.println("Caso 5");
					break;
				case 6:
					System.out.println("Que datos desea ver?");
					System.out.println("1.-----DATOS DE PACIENTE------");
					System.out.println("2.-----DATOS DE DOCTOR------");
					System.out.println("3.-----DATOS DE PERSONAL------");
					Scanner entrada_mostrar = new Scanner(System.in);
					int log_mostrar = entrada.nextInt();
					switch(log_mostrar){
					case 1:
						System.out.println("Mostrar datos de paciente");
						break;
					case 2:
						System.out.println("Mostrar datos de doctor");
						break;
					case 3:
						System.out.println("Mostrar datos de personal");
						break;
					}
					
					break;
				case 7:
					System.out.println("Programa finalizado");
					break;
				default:
					System.out.println("Ingrese una opcion valida?");
					break;
					
				}
				
			}
		}
	}
}
