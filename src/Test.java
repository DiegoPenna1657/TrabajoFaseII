import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try {
			// Autor(es): Gonzalo Urrutia, 
			//Auxiliar que me ayudara a entrar al menu por primera vez
			int ver=1;
			OrderListLinked <Paciente> paciente_linked = new OrderListLinked<Paciente>();
			BSTree<Medico> medico_bstree= new BSTree<Medico>();
			System.out.println("----BIENVENIDO, CUANTOS EMPLEADOS MANEJARAN SU CONTRASE—A DE ADMINISTRADOR O DE PERSONAL---------");
            Scanner entrada = new Scanner(System.in);
            int pre_log = entrada.nextInt();
            ListArray<Personal> personal_arrylist = new ListArray<Personal>(pre_log);
            for( int i = 0; i < pre_log ; i++){
                Personal pr1 = new Personal();
                do {
                pr1.ingresar();
                }while(personal_arrylist.serchlog(pr1));
                personal_arrylist.insertFirst(pr1);
                	
            }
            Scanner entrada_pre = new Scanner(System.in);

            System.out.println("-------BIENVENIDO AL GESTOR UNIVERSAL DE HISTORIAS CLINICAS ---------");
            System.out.println("----INGRESE SU CONTRASE—A DE ADMINISTRADOR O DE PERSONAL---------");
            int cod_pre = entrada.nextInt();
            Personal pr1_search = new Personal(" ", 0, 0, " ", cod_pre, " ");
            if (cod_pre == 0000 || personal_arrylist.serchlog(pr1_search))
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
						System.out.println("4.-----RETROCEDER------");
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
							medico_bstree.insert(m1);
							break;
						case 3:
							System.out.println("Ingresar datos de personal");
							Personal pl1=new Personal();
							pl1.ingresar();
							personal_arrylist.insertLastT(pl1);
							break;
						case 4:
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
						medico_bstree.search(m1);
						break;
					case 4:
						//autor: Diego P. Aranibar
						System.out.println("Caso 4");
						//autor:
						System.out.println("Que datos desea eliminar?");
						System.out.println("1.-----DATOS DE PACIENTE------");
						System.out.println("2.-----DATOS DE DOCTOR------");
						System.out.println("3.-----DATOS DE PERSONAL------");
						System.out.println("4.-----RETROCEDER------");
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
							medico_bstree.remove(m2);
							break;
						case 3:
							System.out.println("Ingresar codigo del personal a eliminar");
							Personal pl1=new Personal();
							pl1.setCodigo(entrada_eliminar.nextInt());
							personal_arrylist.remove(pl1);
							break;
						case 4:
							break;
						}
						break;
					case 5:
						System.out.println("Caso 5");
						System.out.println("Que datos desea modificar?");
						System.out.println("1.-----DATOS DE PACIENTE------");
						System.out.println("2.-----DATOS DE DOCTOR------");
						System.out.println("3.-----RETROCEDER------");
						Scanner entrada_modificar = new Scanner(System.in);
						int log_modificar = entrada_modificar.nextInt();
						switch(log_modificar){
						case 1:
							System.out.println("Ingresar dni del paciente a modificar");
							Paciente p2= new Paciente();
							p2.setDni(entrada_modificar.nextInt());
							Node<Paciente> pa1=paciente_linked.modi(p2);
							pa1.getData().modificar();
							break;
						case 2:
							System.out.println("Ingresar ruc y codigo del doctor a modificar");
							Medico m2= new Medico();
							m2.setCodigo(entrada_modificar.nextInt());
							m2.setRuc(entrada_modificar.nextInt());
							BSTree<Medico>.Node me1=medico_bstree.modi(m2);
							me1.data.modificar();
							break;
						case 3:
							break;
						}
						break;
					case 6:
						//autor: Josue Butron, Mathias Miranda
						System.out.println("Que datos desea ver?");
						System.out.println("1.-----DATOS DE PACIENTE------");
						System.out.println("2.-----DATOS DE DOCTOR------");
						System.out.println("3.-----DATOS DE PERSONAL------");
						System.out.println("4.-----RETROCEDER------");
						Scanner entrada_mostrar = new Scanner(System.in);
						int log_mostrar = entrada_mostrar.nextInt();
						switch(log_mostrar){
						case 1:
							System.out.println("Mostrar datos de paciente");
							System.out.println(paciente_linked);
							break;
						case 2:
							System.out.println("Mostrar datos de doctor");
							medico_bstree.inOrden();
							break;
						case 3:
							System.out.println("Mostrar datos de personal");
							System.out.println(personal_arrylist);
							break;
						case 4:
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
