/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author blueashym
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int size = 100;
        double pi=getPi(getRandomInsideCount(size),size);
        double test=Math.abs(pi-Math.PI);
        double dif=0.001;
        while(test>dif){
            size++;
            pi=getPi(getRandomInsideCount(size),size);
            test=Math.abs(pi-Math.PI);            
        };
        System.out.println("el tamaño es :"+size);
        System.out.println("EL pi encontrado fue: "+pi);
        System.out.println("El pi de java: "+Math.PI);
        
    }
    
    public static double getRandomInsideCount(double size){
        int c=0;
        java.util.Random r = new java.util.Random();
        double[] a = r.doubles().limit((int)size).toArray();
        double[] b = r.doubles().limit((int)size).toArray();
        for (int i = 0; i < size; i++){ 
            c += (Math.sqrt(Math.pow(a[i], 2)+Math.pow(b[i], 2))>1) ? 0 : 1;
        }
        return c;
    }
    public static double getPi(double c,double size){
        return (4*(c / size));
    }
//    
}
