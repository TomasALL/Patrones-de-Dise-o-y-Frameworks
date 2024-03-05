package com.mycompany.connectbd;

public class mysql extends DBoperation {
    public mysql(){

    }
    @Override
    public String getconect(){
        return "Conexión a MySQL ....";
    }
    @Override
    public String getdisconect(){
        return "Cerrando MySQL .. .. .";
    }
    
}
