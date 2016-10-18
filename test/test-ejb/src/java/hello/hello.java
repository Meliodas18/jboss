/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author huang
 */
@Stateless
@LocalBean
public class hello {

    public String Hello(String name){
        return "Hello" + name;
       
    }
    
    public Integer calcul(int a, int b, String sign){
        if (sign.equals("+"))
            return a + b; 
        else if (sign.equals("-"))
            return a - b; 
        return null;
    }
}
