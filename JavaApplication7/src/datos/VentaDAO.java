/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import bean.VentaBean;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author alexis
 */
public interface VentaDAO {
    boolean agregarVenta(VentaBean venta);
    boolean anularVenta(VentaBean venta);
    List<VentaBean>listarVentas();
    List<VentaBean>listarVentas(Timestamp timestamp);

}
