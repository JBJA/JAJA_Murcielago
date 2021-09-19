/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Juárez Arevalo
 */
public abstract class codMurcielago {
    // ATRIBUTOS
    char[] murcielago = new char[10];
    char[] frase, conversion;
    String palabra;
    
    // METODO CONSTRUCTOR
    codMurcielago(){
        // INICIALIZACION DEL ARRAY MURCIELAGO EN EL METODO CONSTRUCTOR
        murcielago[0] = 'M';
        murcielago[1] = 'U';
        murcielago[2] = 'R';
        murcielago[3] = 'C';
        murcielago[4] = 'I';
        murcielago[5] = 'E';
        murcielago[6] = 'L';
        murcielago[7] = 'A';
        murcielago[8] = 'G';
        murcielago[9] = 'O';        
    }
    
    // METODOS ATRIBUTOS
    public abstract String palabra();
    public abstract void convertir();
    public abstract void traductor();
}
