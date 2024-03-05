package com.mycompany.connectbd;

public class oracle extends DBoperation {
     public oracle(){

    }
    @Override
    public String getconect(){
        return "Conexión a oracle ....";
    }
    @Override
    public String getdisconect(){
        return "Cerrando oracle .. .. .";
    }

    
}
