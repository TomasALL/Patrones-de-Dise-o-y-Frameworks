package com.mycompany.connectbd;


public class Client {
        public static void main(String []args){
        DBoperation mysql=factory.getDBoperation("mysql");
        System.out.println(mysql.getconect());
        System.out.println(mysql.getdisconect());
        System.out.println();
        
                
        DBoperation oracle=factory.getDBoperation("oracle");
        System.out.println(oracle.getconect());
        System.out.println(oracle.getdisconect());
               System.out.println();


    }
    
}
