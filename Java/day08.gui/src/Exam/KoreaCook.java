/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

/**
 *
 * @author KOSTA
 */
public class KoreaCook extends RandomValue implements ServiceCook {

    private String menu;
    
    
    	public String Food() {
            
            if(intValue == 1){
                return "µÈÀåÂî°³";
            }
            else if(intValue == 2){
                return "ºñºö¹ä";
            }
            else if(intValue == 3){
                return "±èÄ¡Âî°³";
            }
                return null;
             
}
        
}
