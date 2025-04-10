//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /* una empresa desea registrar la informacion de cada empleado
        para ello cada empleado debe ingresar con su usuario y contraseña
        * una vez ingresado el empleado debe registrar la siguiente informacion
        1 nombre completo
        2 documento de identidad
        3 valor hora
        4 cantidad horas
        5 seleccionar un dia de descanso a la semana (l-v)
        * el sistema debe de mostrar al empleado:
        * su salario neto, salario bruto, deduccion por pension, deduccion
        * por salud, auxilio de transporte (si aplica)  y bonificacion del 10%
        * si no supera 2 smmvl (sin incluir auxilio de transporte)
        *toda la informacion del empleado se debe mostrar en un mensaje descriptivo
         */
        /* definicion y asignacion de variables */
        Scanner sc = new Scanner(System.in);
        String nombreEmpleado = "";
        String documentoIdentidad = "";
        String diaDescanso = "";
        String usuarioEmpleado = "";
        String contraseñaUsuario = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double retencionSalud = 0;
        double retencionPension = 0;
        double valorHora = 0;
        double cantidadHoras = 0;
        double valorSalarioMinino = 0;
        double bonificacionEmpleado = 0;
        int auxilioTransporte = 200000;

        System.out.println("Ingrese su usuario: ");
        usuarioEmpleado = sc.nextLine();
        System.out.println("Ingrese la contraseña: ");
        contraseñaUsuario = sc.nextLine();
        if (usuarioEmpleado.equals("admin") && contraseñaUsuario.equals("admin")) {
            System.out.println("Ha ingresado de forma correcta");
            System.out.println("ingrese el nombre del empleado: ");
            nombreEmpleado = sc.nextLine();
            System.out.println("Ingrese su documento de identidad: ");
            documentoIdentidad = sc.nextLine();
            System.out.println("Ingrese el dia de descanso (de lunes a viernes): ");
            diaDescanso = sc.nextLine();
            System.out.println("Ingrese el valor de la hora: ");
            valorHora = sc.nextDouble();
            System.out.println("Ingrese la cantidad de horas trabajadas: ");
            salarioBruto = valorHora * cantidadHoras;
            System.out.println("Ingrese el salario minimo para este año");
            valorSalarioMinino = sc.nextDouble();
            if (salarioBruto > (valorSalarioMinino*2)){
                bonificacionEmpleado = 0;
            } else {
                bonificacionEmpleado = salarioBruto*0.1;
                auxilioTransporte = 200000;
            }
            retencionSalud = salarioBruto * 0.04;
            retencionPension = salarioBruto * 0.04;
            salarioNeto = salarioBruto - retencionPension - retencionSalud + bonificacionEmpleado + auxilioTransporte;
            System.out.println("detalle de nomina empleado");
            System.out.println("el empleado " + nombreEmpleado + "con documento" + documentoIdentidad + "tiene el siguiente detalle :\nsalario bruto: " + salarioNeto + "\nsalario neto:" + salarioNeto + "\ndeduccion por pensión: " + retencionPension + "\nauxiolio transporte: " + auxilioTransporte + "\nbonificacion " + bonificacionEmpleado );





        }else{
                System.out.println("Error de credenciales");
            }

        }
        /*if (suarioEmpleado.equals("admin")){
        if(contraseñaUsuario.equals("admin")){
        system.out.println
        * */





    }
