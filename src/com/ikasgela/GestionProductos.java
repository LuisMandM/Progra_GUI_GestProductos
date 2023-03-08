package com.ikasgela;

import java.util.ArrayList;
import java.util.List;

public class GestionProductos {

    List<Producto> productos = new ArrayList<>();

    public void nuevo(Producto producto) {
        this.productos.add(producto);
    }

    public String listado() {
        StringBuilder listado;

        if (this.productos.size() > 0) {
            double total = 0;
            listado = new StringBuilder(String.format("%-15s | %-25s | %-5s\n", "Referencia", "Nombre", "Precio"));
            for (Producto producto : productos) {
                listado.append(producto.toString());
                total += producto.getPrecio();
            }
            listado.append(String.format("\n TOTAL:  %-1.2f", total));
        } else {
            listado = new StringBuilder("No hay productos aun registrados");
        }


        return listado.toString();
    }

}
