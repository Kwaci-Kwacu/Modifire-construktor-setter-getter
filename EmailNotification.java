
package com.mycompany.interfacenotifikasi;


public class EmailNotification implements InterfaceNotifikasi {
    
     public void sendMessage(String reciver, String content){
         System.out.println("Mengirim Email ke "+ reciver +"dengan isi: ");
         System.out.println(content);
     }
    
}
