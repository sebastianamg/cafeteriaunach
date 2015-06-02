/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author alexis
 */
public interface VentaDAO {
    boolean agregarVenta(VentaBean producto);
    boolean anularVenta(VentaBean producto);
    List<VentaBean>listarVentas();
    List<VentaBean>listarVentas(Timestamp timestamp);

}
