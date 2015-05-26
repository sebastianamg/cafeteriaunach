/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import bean.ProductoBean;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
public class ProductoDAOFileImpl implements ProductoDAO{
    private final File archivo;
    private final HashMap<Integer,ProductoBean> productos;

    public ProductoDAOFileImpl(String nombreArchivo){
        this.archivo = new File(nombreArchivo);
        this.productos = new HashMap<>();
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
            FileInputStream fis = new FileInputStream(archivo);
            DataInputStream dis = new DataInputStream(fis);
            
            int código,stock,precio;
            String nombre;
            
            while(dis.available()>0){
                código = dis.readInt();
                nombre = dis.readUTF();
                stock = dis.readInt();
                precio = dis.readInt();
                
                ProductoBean bean = new ProductoBean();
                bean.setCódigo(código);
                bean.setNombre(nombre);
                bean.setStock(stock);
                bean.setPrecio(precio);
                
                productos.put(código, bean);
            }
            
            dis.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProductoDAOFileImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ProductoDAOFileImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void save(){
        try {
            FileOutputStream fos = new FileOutputStream(archivo);
            DataOutputStream dos = new DataOutputStream(fos);
            
            for (Map.Entry<Integer, ProductoBean> entrySet : productos.entrySet()) {
                ProductoBean value = entrySet.getValue();
                dos.writeInt(value.getCódigo());
                dos.writeUTF(value.getNombre());
                dos.writeInt(value.getStock());
                dos.writeInt(value.getPrecio());
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
    public boolean agregarProducto(ProductoBean producto) {
        if(!this.productos.containsKey(producto.getCódigo())){
            this.productos.put(producto.getCódigo(), producto);
            this.save();
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public boolean removerProducto(ProductoBean producto) {
        if(this.productos.containsKey(producto.getCódigo())){
            this.productos.remove(producto.getCódigo());
            this.save();
            return true;
        }
        return false;
    }

    @Override
    public void modificarProducto(ProductoBean producto) {
        if(this.productos.containsKey(producto.getCódigo())){
            this.productos.remove(producto.getCódigo());
            this.productos.put(producto.getCódigo(), producto);
            this.save();
        }
    }

    @Override
    public List<ProductoBean> listarProductos() {
        List<ProductoBean> ans = new LinkedList<>();
        for (Map.Entry<Integer, ProductoBean> entrySet : productos.entrySet()) {
            ProductoBean value = entrySet.getValue();
            ans.add(value);
        }
        return ans;
    }

    @Override
    public ProductoBean obtenerProducto(int código) {
        if(this.productos.containsKey(código)){
            return this.productos.get(código);
        }
        return null;
    }

    @Override
    public int obtenerCódigoMásAltoDeProducto() {
        int valorMáximo = 0;
        for (Map.Entry<Integer, ProductoBean> entrySet : productos.entrySet()) {
            Integer key = entrySet.getKey();
            if(key > valorMáximo){
                valorMáximo = key;
            }
        }
        return valorMáximo;
    }
    
}
