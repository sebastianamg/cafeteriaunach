/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import bean.VentaBean;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexis
 */
public class VentaDAOFileImpl implements VentaDAO{
    private final File archivo;
    private final HashMap<Timestamp,VentaBean> líneasDeDetalle;

    public VentaDAOFileImpl(String nombreArchivo){
        this.archivo = new File(nombreArchivo);
        this.líneasDeDetalle = new HashMap<>();
        this.load();
    }
    
    /**
     * Orden de lectura/escritura:
     * int código
     * String nombre
     * int stock
     * int precio
     */
    private void load(){
        try {
            ObjectInputStream dis = new ObjectInputStream(new FileInputStream(archivo));
            
            Timestamp timestamp;
            HashMap<Integer,Integer> detalle;
            
            while(dis.available()>0){
                timestamp = (Timestamp) dis.readObject();
                detalle = (HashMap<Integer, Integer>) dis.readObject();
                
                VentaBean bean = new VentaBean();
                bean.setTimestamp(timestamp);
                bean.setLíneasDeDetalle(detalle);
                
                this.líneasDeDetalle.put(timestamp, bean);
            }
            
            dis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProductoDAOFileImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ProductoDAOFileImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentaDAOFileImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void save(){
        try {
            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream dos = new ObjectOutputStream(fos);
            
            for (Map.Entry<Timestamp, VentaBean> entrySet : líneasDeDetalle.entrySet()) {
                VentaBean value = entrySet.getValue();
                dos.writeObject(value.getTimestamp());
                dos.writeObject(value.getLíneasDeDetalle());
            }
            
            dos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProductoDAOFileImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ProductoDAOFileImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    @Override
    public boolean agregarVenta(VentaBean venta) {
//         if(!this.líneasDeDetalle.containsKey(venta.getTimestamp())){
            this.líneasDeDetalle.put(venta.getTimestamp(), venta);
            this.save();
            return true;
//        }else{
//            return false;
//        }
    }

    @Override
    public boolean anularVenta(VentaBean venta) {
        if(this.líneasDeDetalle.containsKey(venta.getTimestamp())){
            this.líneasDeDetalle.remove(venta.getTimestamp());
            this.save();
            return true;
        }
        return false;
    }

    @Override
    public List<VentaBean> listarVentas() {
        List<VentaBean> ans = new LinkedList<>();
        for (Map.Entry<Timestamp, VentaBean> entrySet : this.líneasDeDetalle.entrySet()) {
            VentaBean value = entrySet.getValue();
            ans.add(value);
        }
        return ans;
    }

    @Override
    public List<VentaBean> listarVentas(Timestamp timestamp) {        
        Date fechaABuscar = new Date(timestamp.getTime());
        
        List<VentaBean> ans = new LinkedList<>();
        for (Map.Entry<Timestamp, VentaBean> entrySet : this.líneasDeDetalle.entrySet()) {
            VentaBean value = entrySet.getValue();
            Date tmp = new Date(value.getTimestamp().getTime());
            if(fechaABuscar.compareTo(tmp) == 0){
                ans.add(value);
            }
        }
        return ans;
    }
    
}
