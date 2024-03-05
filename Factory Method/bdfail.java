package com.mycompany.connectbd;

public class bdfail extends DBoperation {
     public bdfail(){

    }
    @Override
    public String getconect(){
        return "Sin Conexión ....";
    }
    @Override
    public String getdisconect(){
        return "no existe .. .. .";
    }
    

    
}
