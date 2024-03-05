package com.mycompany.connectbd;
import java.util.Objects;

public class factory 
{
    public static DBoperation getDBoperation(String name){
      if(Objects.equals(name,"mysql"))
        return new mysql();       
      else if (Objects.equals(name,"oracle"))
        return new oracle();
      else
        return new bdfail();
    }
}
       

