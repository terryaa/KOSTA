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
public class ChinaCook extends RandomValue implements ServiceCook{
    
    //���̳���� ���������� �θ�� ��� �������� �������̽��� ��´�.
    
    
    	public String Food() {
            
            if(intValue == 1){
                return "�̱�";
            }
            else if(intValue == 2){
                return "������";
            }
            else if(intValue == 3){
                return "�Ⱥ�ä";
            }
                return null;
	}
}
