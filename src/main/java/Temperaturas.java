/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mauro
 */
public class Temperaturas {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int fila = 1;
        while(!(fila % 4 == 0)){
            fila = (int)(Math.random()*12+1);
        }
        System.out.println("Numero de filas : " + fila);
        Operaciones proceso =new Operaciones();
        int mz[][] = new int[fila][6];
        mz = proceso.llenarMatriz(mz,fila,6);
        proceso.mostrar(mz,fila,6);
        
        //mostrar(mz,fila,6);
        // TODO code application logic here
    }
    
}
