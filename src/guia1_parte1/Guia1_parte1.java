package guia1_parte1;

import java.io.IOException;
import java.util.Scanner;
        
public class Guia1_parte1 {
   

    public static void main(String[] args) throws IOException {
        
    int operacion;
    Guia1_calculadora objeto1= new Guia1_calculadora(); //instancia de la clase
      
         
      
            do{

            Scanner objeto2= new Scanner(System.in); 
            System.out.println("ingrese el primer valor");
            float n1=objeto2.nextFloat();
            System.out.println("ingrese el SEGUNDO valor");
            float n2=objeto2.nextFloat();
            objeto1.setNum1(n1);
            objeto1.num2=n2;
            objeto1.suma();

            System.out.println("elija la operacion: ");
            System.out.println("1: suma\n2:resta\n3:multiplicacion\n4:division\n5:IVA\n6:raiz\n7:potencia\n8:funcion trigonometricas\n0:Salir");

            operacion=(int) objeto2.nextFloat();

            switch(operacion){
                case 1: System.out.println("la suma es: "+objeto1.getResult()); break;
                case 2: System.out.println("la resta es: "+objeto1.resta(n1,n2)); break;
                case 3: System.out.println("la multiplicacion es: "+objeto1.multip(n1, n2)); break;
                case 4: System.out.println("la division es: "+objeto1.division(n1, n2)); break;
                case 5: System.out.println("el IVA de "+n1+" es: "+objeto1.IVA(n1)); break;
                case 6: System.out.println("la raiz "+n1+" de "+n2+" es: "+objeto1.raiz(n1,n2)); break;
                case 7: System.out.println("la potencia de "+n1+"^"+n2+" es: "+objeto1.potencia(n1,n2)); break;
                case 8: {
            System.out.println("elija la funcion: ");
            System.out.println("1:Seno\n2:Coseno\n3:Tangente\n4.arcseno\n5.arccoseno\n6.arctangente");
            int opc2;
            opc2=(int) objeto2.nextFloat();
            
            switch(opc2){
                case 1: System.out.println("el seno de "+n1+" es: "+objeto1.seno(n1)); break;
                case 2: System.out.println("el coseno de "+n1+" es: "+objeto1.coseno(n1)); break;
                case 3: System.out.println("la tangente de "+n1+" es: "+objeto1.tang(n1)); break;
                case 4: System.out.println("el arcseno de "+n1+" es: "+objeto1.arcsin(n1)); break;
                case 5: System.out.println("el arccoseno de "+n1+" es: "+objeto1.arccos(n1)); break;
                case 6: System.out.println("la arctangente de "+n1+" es: "+objeto1.arctan(n1)); break;
                    } break;
                           
                }
                default:  System.out.println("Syntax ERROR..."); break;
                
          }

                  System.out.println("Presiona enter para continuar...");
                new java.util.Scanner(System.in).nextLine();
            }while(operacion!=0);

      

    }
    
    
}