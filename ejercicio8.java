/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author ariel
 */
import java.util.Scanner;
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realizar programa que calcule los beneficios y prestaciones de los usuarios
        //del salvador, mostrar el salario devengado, descuento afp, cuanto se resta 
        //de la afp, descuento del isss, y recuento de renta, ultimo mostrar, salario
        //neto mensual y quincenal // AFP=7% Y ISS=3%(su maximo es 30)renta=10%
    int continuar;    
    do{    
        double salario,afp, iss, quincena, rentaResultado,salarioNeto;
        Scanner lector=new Scanner(System.in);
        final double salarioDescuentos;
        
        System.out.println("ingrese su salario");
        salario=lector.nextFloat();//salario base
        
        afp=salario*0.0725;//calculo descuento AFP
        iss=salario<1000?salario*0.03:30;//caluclo descuento del Iss
        salarioDescuentos=salario-afp-iss;//encontrar el salario de descuentos (sin aplicar renta)
        
        
        System.out.println("su salario base es de "+salario);
        System.out.println("el descuento de AFP a su salario es de (7%) "+String.format("%.2f",afp));
        System.out.println("el descuento de ISS es de (3%) "+String.format("%.2f",iss));
        
    switch(true){
        case salarioDescuentos<=472://tramo1
           System.out.println("esta exento, su salario neto es de "+String.format("%.2f",salarioDescuentos));
           quincena=salarioDescuentos/2;//sacar salario quincenal
           System.out.println("su salario quincenal es de "+String.format("%.2f",quincena));
        break;
        case salarioDescuentos>472 && salarioDescuentos<=895.24://tramo2
          final double TARIFA1=17.67;//valor de cuota fija 
          double calculo1=salarioDescuentos-472.01;//coste sobre el exceso
          double porcentajeAplicado1=calculo1*0.10;//calculo por el porcentaje de renta
          rentaResultado=porcentajeAplicado1+TARIFA1;//coste total de la renta 
          salarioNeto=salarioDescuentos-rentaResultado;//salario neto (aplicando todos los descuento)
          quincena=salarioNeto/2;//sacar salario quincenal
          System.out.println("el descuento de renta es de 10% "+String.format("%.2f",rentaResultado));
          System.out.println("su salario total es de "+String.format("%.2f",salarioNeto));
          System.out.println("su salario quincenal es de "+String.format("%.2f",quincena));
        break;
        case salarioDescuentos>895.24 && salarioDescuentos<=2038.10://tramo3
          final double TARIFA2=60.00; //valor de cuota fija 
          double calculo2=salarioDescuentos-895.25;//coste sobre el exceso
          double porcentajeAplicado2=calculo2*0.20; //calculo por el porcentaje de renta       
          rentaResultado=porcentajeAplicado2+TARIFA2;//coste total de la renta
          salarioNeto=salarioDescuentos-rentaResultado;//salario neto (aplicando todos los descuento)
          quincena=salarioNeto/2;//sacar salario quincenal
          System.out.println("el descuento de renta es de 20% "+String.format("%.2f",rentaResultado));
          System.out.println("su salario total es de "+String.format("%.2f",salarioNeto));
          System.out.println("su salario quincenal es de "+String.format("%.2f",quincena));
        break;
        case salarioDescuentos>2038.10://tramo4
          final double TARIFA3=288.57;//valor de cuota fija 
          double calculo3=salarioDescuentos-2038.11;//coste sobre el exceso
          double porcentajeAplicado3=calculo3*0.30;//calculo por el porcentaje de renta
          rentaResultado=porcentajeAplicado3+TARIFA3;//coste total de la renta
          salarioNeto=salarioDescuentos-rentaResultado;//salario neto (aplicando todos los descuento)
          quincena=salarioNeto/2;//sacar salario quincenal
          System.out.println("el descuento de renta es de 30% "+String.format("%.2f",rentaResultado));
          System.out.println("su salario total es de "+String.format("%.2f",salarioNeto));
          System.out.println("su salario quincenal es de "+String.format("%.2f",quincena));
        break;
    }    
        
        
        System.out.println("desea continuar 1=SI 2=NO ");
        continuar=lector.nextInt();
        
    }while(continuar==1);
        
       
    }
    
}
