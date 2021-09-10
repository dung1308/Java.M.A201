/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.training.utils;

/**
 *
 * @author ASUS
 */
public class Validator {
    public boolean validId(String id){
        if(id.startsWith("FW") && Character.isDigit( id.charAt( 2 ))&& Character.isDigit( id.charAt( 3 ))&& Character.isDigit( id.charAt( 4 )) && id.length()==5){
            return true;
        }
        return false;
    }
    public boolean validStatus(String status){
        if(status.equals("active") || status.equals("in-active")){
            return true;
        }
        return false;
    }
    public boolean validFlag(String flag){
        if(flag.equals("optional") || flag.equals("mandatory") || flag.equals("N/A")){
            return true;
        }
        return false;
    }
    public static boolean isNumeric(String str) { 
        try {  
          Double.parseDouble(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
    }
}
