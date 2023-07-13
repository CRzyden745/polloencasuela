
package agencia1;

import javax.swing.JOptionPane;


public class Agencia1 {
 public void menu(){
        
        byte opc =1;
        
        VentaVehiculo obj = new VentaVehiculo();
        Vehiculo matCarros[][] = new Vehiculo[1][3];
        
        while (opc>=1 && opc<4) {
            opc = Byte.parseByte(JOptionPane.showInputDialog("1. Realizar Ventas \n2. Impresion \n3.Cantidad de vehiculos con extras\n4.Vehiculos mayores a 25 millones\nDigite su opcion"));
            switch(opc) {
                case 1:  obj.Venta(matCarros);
                break;
                case 2: obj.imprimeVenta(matCarros);
                break;
                case 3 : obj.ListaExtras(matCarros);
                case 4: obj.PrecioMayor(matCarros);
                default: System.out.println("Saliendo del sistema...");
            }
            
        }//cierra while
        
    }//cierra metodo menu
    
    
    public static void main(String[] args) {
        Agencia1 objAgencia = new Agencia1();
        objAgencia.menu();
        
        


}
  
      
}
