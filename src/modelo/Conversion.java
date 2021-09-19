/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.Scanner;
/**
 *
 * @author Juárez Arevalo
 */
public  class Conversion extends codMurcielago{
    Scanner c = new Scanner(System.in);
    // ATRIBUTOS
    private int longitud;
    
    // FUNCION PARA INTRODUCIR LA MALABRA A TRADUCIR
    @Override
    public String palabra(){
        System.out.println("introduzca la frase completa en codigo murcielago: \n");
        /* se captura la palabra a frase en la variable y se aplican los dos metodos de la clase String */
        palabra = c.nextLine().toUpperCase().trim();
        // se retorna la variable
        return palabra;
    }
    
    // PROCEDIMIENTO PARA CONVERTI LA PALABRA QUE SE INTRODUJO
    @Override
    public void convertir(){
        // se cuenta cuantos caracteres trae dicha variable
        longitud = palabra.length();
        // se convierte la cadena a un array y se inicializa el array frase
        frase = palabra.toCharArray();
        // se inicializa la variable que contendra la palabra ya traducida
        conversion = new char[longitud];
        
        for (int i = 0; i<longitud; i++){
            /*un if anidado que se encaga de ir comparando los caracters e ir traduciendo si es necesario */
            if (frase[i] == '0'){
                conversion[i] = murcielago[0];
            } else if (frase[i] == '1'){
                conversion[i] = murcielago[1];
            } else if (frase[i] == '2'){
                conversion[i] = murcielago[2];
            } else if (frase[i] == '3'){
                conversion[i] = murcielago[3];
            } else if (frase[i] == '4'){
                conversion[i] = murcielago[4];
            } else if (frase[i] == '5'){
                conversion[i] = murcielago[5];
            } else if (frase[i] == '6'){
                conversion[i] = murcielago[6];
            } else if (frase[i] == '7'){
                conversion[i] = murcielago[7];
            }else if (frase[i] == '8'){
                conversion[i] = murcielago[8];
            } else if (frase[i] == '9'){
                conversion[i] = murcielago[9];
            } else if(frase[i] == murcielago[0]){
                conversion[i] = '0';
            } else if(frase[i] == murcielago[1]){
                conversion[i] = '1';
            } else if(frase[i] == murcielago[2]){
                conversion[i] = '2';
            } else if(frase[i] == murcielago[3]){
                conversion[i] = '3';
            } else if(frase[i] == murcielago[4]){
                conversion[i] = '4';
            } else if(frase[i] == murcielago[5]){
                conversion[i] = '5';
            } else if(frase[i] == murcielago[6]){
                conversion[i] = '6';
            } else if(frase[i] == murcielago[7]){
                conversion[i] = '7';
            } else if(frase[i] == murcielago[8]){
                conversion[i] = '8';
            } else if(frase[i] == murcielago[9]){
                conversion[i] = '9';
            } else{
                conversion[i] = frase[i];
            }
        }
    }
    //  PROCEDIMIENTO PARA MOSTRAR LO TRADUCIDO
    @Override
    public void traductor(){
        for (int i = 0; i<longitud; i++){
            System.out.println(conversion[i] + "");
        }
    }
}
