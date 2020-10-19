/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author Diego OSorio
 */
public class Inicio {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int opcion = 0;
        
        do {
            System.out.println("-------------------");
            System.out.println(" Aplicación de mensajes");
            System.out.println("    1. Crear un mensaje");
            System.out.println("    2. Listar mensajes");
            System.out.println("    3. Eliminar mensajes");
            System.out.println("    4. Editar mensaje");
            System.out.println("    5. Salir");
            System.out.println("");
            System.out.println("Opción: ");
            //Leer opicion del usuario
            opcion = sc.nextInt();
            switch(opcion){
                case 1: 
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensajes();
                    break;
                case 3: 
                    MensajesService.borrarMensaje();
                    break;
                case 4:
                    MensajesService.editarMensaje();
                    break;
                default: 
                    break;                    
            }
        }while(opcion != 5);
    }
}
