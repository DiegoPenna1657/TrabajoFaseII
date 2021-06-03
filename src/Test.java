import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try {
			// Autor(es): Gonzalo Urrutia, 
			//Auxiliar que me ayudara a entrar al menu por primera vez
			int ver = 1;
			//Creamos las estructuras de datos que utilizaremos en el programa
			OrderListLinked <Paciente> paciente_linked = new OrderListLinked<Paciente>();
			TDAList <Medico> medico_arraylist = new ListArray<Medico>(20);
			BSTree<Personal> personal_bstree= new BSTree<Personal>();
			
			// Se muestra el menú que se mostrará al usuario
			System.out.println("-------BIENVENIDO AL GESTOR UNIVERSAL DE HISTORIAS CLINICAS ---------");
			System.out.println("----INGRESE SU CONTRASEÑA DE ADMINISTRADOR O DE PERSONAL---------");
			Scanner entrada = new Scanner(System.in);
			int log = entrada.nextInt();
//			Personal personal1= new Personal();PENDIENTE
//			personal1.setCodigo(log);		PENDIENTE
//			
			if (log == 0000)	//Pendiente de solucionar, or 
			{
				while (ver != 0)
				{
					System.out.println("------------SELECCIONE UNA OPCION---------------");
					System.out.println("1.-----INGRESO DE DATOS------");
					System.out.println("2.-----CONSULTA/BUSQUEDA DE PACIENTES------");
					System.out.println("3.-----CONSULTA/BUSQUEDA DE DOCTORES------");
					System.out.println("4.-----ELIMINACION DE DATOS------");
					System.out.println("5.-----MODIFICAR DATOS------"); //Pendiente
					System.out.println("6.-----MOSTRAR DATOS------"); //
					System.out.println("7.-----TERMINAR EL PROGRAMA------");
					Scanner entrada_dos = new Scanner(System.in);
					int log_dos = entrada.nextInt();
					switch(log_dos){
					case 1:
						System.out.println("Caso 1");
						System.out.println("Que datos desea ingresar?");
						System.out.println("1.-----DATOS DE PACIENTE------");
						System.out.println("2.-----DATOS DE DOCTOR------");
						System.out.println("3.-----DATOS DE PERSONAL------");
						Scanner entrada_ingresar = new Scanner(System.in);
						int log_ingresar = entrada_ingresar.nextInt();
						switch(log_ingresar){
						//Autor: Gonzalo Urrutia, Diego P. Aranibar
						case 1:
							System.out.println("Ingresar datos de paciente");
							Paciente p1= new Paciente();
							p1.ingresar();
							paciente_linked.insert(p1);
							break;
						case 2:
							System.out.println("Ingresar datos de doctor");
							Medico m1= new Medico();
							m1.ingresar();
							medico_arraylist.insertFirst(m1);
							break;
						case 3:
							System.out.println("Ingresar datos de personal");
							Personal pl1=new Personal();
							pl1.ingresar();
							personal_bstree.insert(pl1);
							break;
						}
						
						break;
					case 2:
						//autor: Josue Butron
						System.out.println("Caso 2");
						System.out.println("Ingresar dni del paciente a buscar");
						Paciente p1= new Paciente();
						p1.setDni(entrada_dos.nextInt());
						paciente_linked.search(p1);
						break;
					case 3:
						//autor: Diego P. Aranibar, Ala samayani
						System.out.println("Caso 3");
						System.out.println("Ingresar codigo del doctor a buscar");
						Medico m1= new Medico();
						m1.setCodigo(entrada_dos.nextInt());
						medico_arraylist.search(m1);
						break;
					case 4:
						//autor: Diego P. Aranibar
						System.out.println("Caso 4");
						//autor:
						System.out.println("Que datos desea eliminar?");
						System.out.println("1.-----DATOS DE PACIENTE------");
						System.out.println("2.-----DATOS DE DOCTOR------");
						System.out.println("3.-----DATOS DE PERSONAL------");
						Scanner entrada_eliminar = new Scanner(System.in);
						int log_eliminar = entrada_eliminar.nextInt();
						switch(log_eliminar){
						case 1:
							System.out.println("Ingresar dni del paciente a eliminar");
							Paciente p2= new Paciente();
							p2.setDni(entrada_eliminar.nextInt());
							paciente_linked.remove(p2);
							break;
						case 2:
							System.out.println("Ingresar ruc y codigo del doctor a eliminar");
							Medico m2= new Medico();
							m2.setCodigo(entrada_eliminar.nextInt());
							m2.setRuc(entrada_eliminar.nextInt());
							medico_arraylist.remove(m2);
							break;
						case 3:
							System.out.println("Ingresar codigo del personal a eliminar");
							Personal pl1=new Personal();
							pl1.setCodigo(entrada_eliminar.nextInt());
							personal_bstree.remove(pl1);
							break;
						}
						break;
					case 5:
						System.out.println("Caso 5");
						
						break;
					case 6:
						//autor: Josue Butron, Mathias Miranda
						System.out.println("Que datos desea ver?");
						System.out.println("1.-----DATOS DE PACIENTE------");
						System.out.println("2.-----DATOS DE DOCTOR------");
						System.out.println("3.-----DATOS DE PERSONAL------");
						Scanner entrada_mostrar = new Scanner(System.in);
						int log_mostrar = entrada_mostrar.nextInt();
						switch(log_mostrar){
						case 1:
							System.out.println("Mostrar datos de paciente");
							System.out.println(paciente_linked);
							break;
						case 2:
							System.out.println("Mostrar datos de doctor");
							System.out.println(medico_arraylist);
							break;
						case 3:
							System.out.println("Mostrar datos de personal");
							personal_bstree.inOrden();
							break;
						}
						break;
					case 7:
						System.out.println("Programa finalizado");
						ver=0;
						break;
					default:
						System.out.println("Ingrese una opcion valida?");
						break;
						
					}
					
				}
			}
		}
		catch (Exception x) {
			System.out.println(x.getMessage());	
		} 
	}
}
