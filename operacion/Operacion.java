
package com.mycompany.operacion;

import javax.swing.JOptionPane; //IMPORTO LA LIBRERIA


public class Operacion {
//ATRIBUTOS NECESARIOS PARA PODER HACER LA OPERACION QUE SE NECESITA
int numero1;
int numero2;
int suma; //ACCION O METODO
int resta; //ACCION O METODO
int multiplicacion; //ACCION O METODO
int division;//ACCION O METODO
  
//UNA VEZ TENGAMOS LOS ATRIBUTOS VAMOS A VER LA ACCION

//METODO PARA PEDIR LOS NUMEROS

public void leerNumeros(){
    numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
    numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
}

//METODO PARA SUMAR
public void sumar(){
    suma=numero1+numero2;
}

//METODO PARA RESTAR
public void restar(){
    resta=numero1-numero2;
}

//METODO PARA MULTIPLICAR
public void multiplicar(){
    multiplicacion=numero1*numero2;
}

//METODO PARA DIVIDIR
public void dividir(){
    division=numero1/numero2;
}

//METODO PARA MOSTRAR RESULTADO
public void mostrarResultado(){
    System.out.println("La suma es: "+suma);
    System.out.println("La resta es: "+resta);
    System.out.println("La multiplicacion es: "+multiplicacion);
    System.out.println("La division es: "+division);
}

}
