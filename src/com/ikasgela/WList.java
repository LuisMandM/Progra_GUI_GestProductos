package com.ikasgela;

import javax.swing.*;

public class WList {
    private JPanel Listado;
    private JTextArea list_textArea;


    public JPanel getListado() {
        return Listado;
    }

    public WList(GestionProductos gestor) {
        Listar(gestor);
    }

    public void Listar(GestionProductos gestor) {
        list_textArea.setText(gestor.listado());
    }
}
