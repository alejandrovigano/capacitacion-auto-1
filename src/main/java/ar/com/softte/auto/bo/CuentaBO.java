package ar.com.softte.auto.bo;

import ar.com.softte.auto.model.Cuenta;

public class CuentaBO {

    public Cuenta obtenerCuentaPorId(long idCuenta){
        //esto iria a la base de datos en realidad, o aun servicio
        return new Cuenta(idCuenta);
    }

}
