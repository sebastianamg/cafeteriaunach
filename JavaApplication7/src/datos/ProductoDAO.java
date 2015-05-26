/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import bean.ProductoBean;
import java.util.List;

/**
 *
 * @author alexis
 */
public interface ProductoDAO {
    boolean agregarProducto(ProductoBean producto);
    boolean removerProducto(ProductoBean producto);
    void modificarProducto(ProductoBean producto);
    List<ProductoBean>listarProductos();
    ProductoBean obtenerProducto(int código);
    int obtenerCódigoMásAltoDeProducto();
    
}
