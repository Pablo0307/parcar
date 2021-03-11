/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea.rombo;

/**
 *
 * @author Ramon Aguilar Rojo
 */

import java.util.Scanner;
public class Rombo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner t = new Scanner(System.in);
       
       System.out.print("Introduce la altura del rombo(se redondeara hacia arriba para que quede bien el rombo): ");
       int n = t.nextInt();
       n=(n/2)+1;
        
        int i,j,k,a,b,c,dibuja;
        
        for (i=1;i<=n;i++){
	
		for(k=1;k<=n-i;k++){
			
			System.out.print(" ");
//			
//		}
			
		for(j=1;j<=2*(i-1)+1;j++){
			
                                                    dibuja=(2*(i-1)+1);
			if(j==1|| j==dibuja){System.out.print("*");}
                                                    else{System.out.print(" ");}	
			
                                     }	
                
		System.out.println("");
					
		}
	n=n-1;
                 
                  
	for (a=n;a>=1;a--){
	
			for(b=n;b>=a;b--){
			
				System.out.print(" ");
			
			}
			
			for(c=1;c<=2*(a-1)+1;c++){
			
                                                      dibuja=(2*(a-1)+1);
			if(c==1|| c==dibuja){System.out.print("*");}
                                                      else{System.out.print(" ");}
				
				}
			
			System.out.println("");
		}
	
        // TODO code application logic here
    }
    }
}