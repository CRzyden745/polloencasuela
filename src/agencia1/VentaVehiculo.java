package agencia1;

import javax.swing.JOptionPane;


public class VentaVehiculo {
    public void Venta (Vehiculo matCarros[][]){
    
        for (int fila = 0; fila <matCarros.length; fila++) {
            for (int col = 0; col <matCarros[fila].length; col++) {
                matCarros [fila][col]=new Vehiculo();
                   matCarros[fila][col].setPlaca(JOptionPane.showInputDialog("Digite la placa"));
                matCarros[fila][col].setModelo(JOptionPane.showInputDialog("Digite el modelo"));
                matCarros[fila][col].setColor(JOptionPane.showInputDialog("Digite el color"));
                matCarros[fila][col].setPrecioVehiculo(Float.parseFloat(JOptionPane.showInputDialog("Digite el precio")));
                byte extra =Byte.parseByte(JOptionPane.showInputDialog("1.Extra\n2.Sin extra\nDigite su opción"));
                if(extra ==1)
                    matCarros[fila][col].setExtras(true);
                else
                    matCarros[fila][col].setExtras(false);
            }
            
        }
    
    }
    
    public void imprimeVenta(Vehiculo matCarros[][]){
        System.out.println("Autos vendidos");
        
        
     for (int fila = 0; fila <matCarros.length; fila++) {
            for (int col = 0; col <matCarros[fila].length; col++) {
       
        System.out.println("Placa " + matCarros[fila][col].getPlaca());
        System.out.println("Modelo " + matCarros[fila][col].getModelo());
        System.out.println("Precio " + matCarros[fila][col].getPrecioVehiculo());
        System.out.println("Color " + matCarros[fila][col].getColor());
               if (matCarros[fila][col].isExtras()==true)
             System.out.println("tiene extra");
             else 
             System.out.println("no tiene extras");
               
               
                System.out.println("____________________________________________________________");
            }
     }
    }//cierra imprime venta 
    
    
    public void ListaExtras (Vehiculo matCarros[][]){
        
        System.out.println("Todos los vehiculos con extras");
        
      for (int fila = 0; fila <matCarros.length; fila++) {
            for (int col = 0; col <matCarros[fila].length; col++) {
                 if (matCarros[fila][col].isExtras()==true)
                  System.out.println("Placa " + matCarros[fila][col].getPlaca());
        System.out.println("Modelo " + matCarros[fila][col].getModelo());
        System.out.println("Precio " + matCarros[fila][col].getPrecioVehiculo());
        System.out.println("Color " + matCarros[fila][col].getColor());
            }
    }
    
    }
    
     public void PrecioMayor (Vehiculo matCarros[][]){
        
        System.out.println("Todos los vehiculos mayores a 25 millones");
       
      for (int fila = 0; fila <matCarros.length; fila++) {
            for (int col = 0; col <matCarros[fila].length; col++) {
                 if (matCarros[fila][col].getPrecioVehiculo()>25000000)
                  System.out.println("Placa" + matCarros[fila][col].getPlaca());
            }
      }
     }
     public void carroCaro(Vehiculo matCarros[][]){
        System.out.println("Carro más caro");
        float precio = matCarros[0][0].getPrecioVehiculo();
        int i=0, j=0;
        for(int fila=0; fila<matCarros.length; fila++){
            for(int col=0; col<matCarros[fila].length; col++){
                if(matCarros[fila][col].getPrecioVehiculo()>precio){
                    precio=matCarros[fila][col].getPrecioVehiculo();
                    i=fila;
                    j=col;
                }//cierra if
            }//for 2
        }//fpr 1
        System.out.println("Placa "+matCarros[i][j].getPlaca());
        System.out.println("Modelo "+matCarros[i][j].getModelo());
        System.out.println("Precio "+matCarros[i][j].getPrecioVehiculo());
        System.out.println("Color "+matCarros[i][j].getColor());
    }
}//cierra clase 
