
package bo.edu.ucb.est;


import java.util.List;
import java.util.Scanner;

public class Cajero {
    
   /*  public static void ConectionAndMenu(Cliente cli){
          Scanner input = new Scanner(System.in);
          int n;
          int x,i,y;
          List<Cuenta> cuentas1;
          double monto;
          boolean usuario=true;
          while(usuario==true){ //usuario
                      
          do{
              System.out.println("*********************************** ");
              System.out.println("  BANCO BISA ");
              System.out.println("Men� de opciones, elija una por favor: ");
              System.out.println("1. Ver saldo. ");
              System.out.println("2. Retirar dinero. ");
              System.out.println("3. Depositar dinero. ");
              System.out.println("4. Salir. ");
              System.out.println("Ingrese opci�n correcta= ");
              n = input.nextInt();
              System.out.println("*********************************** \n ");
          }while( n >= 5 || n <= 0 );
          
          cuentas1 = cli.getCuentas();
          y = cuentas1.size();
          
          switch(n){ //////
              case 1:
                  System.out.println("*********************************** ");
                  System.out.println("Ingrese de cual cuenta requiere ver su informaci�n ");
                  do{
                      System.out.println("Usted tienen  "+y+" cuentas, escoja una=");
                      x = input.nextInt();
                  }while(x>y || x<=0);
                  x=x-1;
                  System.out.println("El saldo de la cuenta es "+cuentas1.get(x).MostrarSaldo()+" en "+cuentas1.get(x).getMoneda()+" de tipo "+cuentas1.get(x).getTipo()+"\n");
                  System.out.println("***********************************\n");
                  break;
              case 2:
                  System.out.println("*********************************** ");
                  System.out.println("Sus cuentas son:");
                  for(i=0;i<y;i++){
                      System.out.print((i+1)+". Tipo "+cuentas1.get(i).getTipo()+" con saldo de "+cuentas1.get(i).MostrarSaldo()+" moneda "+cuentas1.get(i).getMoneda()+"\n");
                  }
                  System.out.println("\nIngrese de cual cuenta quiere retirar(Si quiere volver al menu digite -1): ");
                  x = input.nextInt();
                  if(x==-1){
                      break;
                  }else{
                     if(x>y || x<-1){
                         System.out.println("Usted seleccion� una cuenta que no existe \n \n");
                         break;
                     }else{
                           x=x-1;
                           System.out.println("Ingrese el monto: ");
                           monto = input.nextDouble();
                            if((cuentas1.get(x).retirar(monto)) == false){
                                    System.out.println("El valor ingrsado fue err�neo, no se hizo ninguna operaci�\n");
                                    System.out.println("***********************************\n ");
                            }else{
                                System.out.println(cuentas1.get(x).retirar(monto)+"\n");
                                System.out.println("*********************************** \n ");
                             }
                            break;
                         
                        } 
                    }
                case 3:
                  System.out.println("*********************************** ");
                  System.out.println("Sus cuentas son:");
                  for(i=0;i<y;i++){
                      System.out.print((i+1)+". Tipo "+cuentas1.get(i).getTipo()+" con saldo de "+cuentas1.get(i).MostrarSaldo()+" moneda "+cuentas1.get(i).getMoneda()+"\n");
                  }
                  System.out.println("\nIngrese a cual cuenta quiere abonar(Si quiere volver al menu digite -1): ");
                  x = input.nextInt();
                  if(x==-1){
                      break;
                  }else{
                      if(x>y || x<-1){
                         System.out.println("Usted seleccion� una cuenta que no existe \n\n");
                         break;
                      }else{
                            x=x-1;
                            System.out.println("Ingrese el monto: ");
                            monto = input.nextDouble();
                            if((cuentas1.get(x).depositar(monto)) == false){
                            System.out.println("El valor ingrsado fue err�neo, no se hizo ninguna operaci�\n");
                            System.out.println("***********************************  \n");
                            }else{
                                System.out.println(cuentas1.get(x).depositar(monto)+"\n");
                                System.out.println("********************************** * \n ");
                            }
                        break;   
                     }
                  }
               case 4:
                  System.out.println("------/////////------//////------- ");
                  System.out.println("   GRACIAS POR SU PREFERENCIA ;)  !!!!! ");
                  usuario=false;
                  break;
          } //////
                    
          }  ///SUARio
      }    
    


      */
    
}
