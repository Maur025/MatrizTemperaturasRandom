/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mauro
 */
public class Operaciones {
    public static int[][] llenarMatriz(int matriz[][], int f,int c)
    {
        for(int i=0;i<f;i++){
            for(int j = 0; j < c;j++){
                //mz[i][j] = (int)(Math.random()*40+1);
                matriz[i][j] = (int)(Math.random()*(40-(-10)+1)+(-10));
            }
        }
        return matriz;
    }
    public static void mostrar(int mat[][],int f, int c){
        if(f > 4){
            int romper = 4;
            int hora = 24;
            for(int i = 0;i < f; i++)
            {
                if(i == 0 || i == romper){
                    System.out.println("Matriz de " +hora+ " hrs =======================================");
                    hora = hora + 24;
                }
                for(int j = 0;j < c; j++){
                    System.out.print("\t" + mat[i][j]);
                }
                System.out.println();
                if(i == romper){
                    romper = romper + 4;
                }
            }
        }else{
            System.out.println("Matriz de 24 hrs ==============================");
            for(int i = 0;i < f; i++)
            {
                for(int j = 0;j < c; j++){
                    System.out.print("\t" + mat[i][j]);
                }
                System.out.println();
            }
        }
    }
    
}
