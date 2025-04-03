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
        double bonificacionEmpleado = 0;
        int auxilioTransporte = 200000;

        System.out.println("Ingrese su usuario");
        usuarioEmpleado = sc.nextLine();
        System.out.println("Ingrese la contraseña");
        contraseñaUsuario = sc.nextLine();
        if (usuarioEmpleado.equals("admin") && contraseñaUsuario.equals("admin")) {
            System.out.println("Ha ingresado de forma correcta");
        }else{
                System.out.println("Error de credenciales");
            }

        }
        /*if (usuarioEmpleado.equals)*/





    }
