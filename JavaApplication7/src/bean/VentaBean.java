/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.Timestamp;
import java.util.HashMap;

/**
 *
 * @author Shuman
 */
public class VentaBean {
    
    private Timestamp Timestamp;
    private HashMap<Integer,Integer> líneasDeDetalle;

    public Timestamp getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(Timestamp Timestamp) {
        this.Timestamp = Timestamp;
    }

    public HashMap<Integer, Integer> getLíneasDeDetalle() {
        return líneasDeDetalle;
    }

    public void setLíneasDeDetalle(HashMap<Integer, Integer> líneasDeDetalle) {
        this.líneasDeDetalle = líneasDeDetalle;
    }
    
    
}
    