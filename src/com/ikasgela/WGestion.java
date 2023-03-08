package com.ikasgela;

import javax.swing.*;

public class WGestion {
    private JPanel Gestion_Producto;
    private JButton list_Button;
    private JTextField reference_Field;
    private JTextField name_Field;
    private JTextField precio_Field;
    private JButton clean_Button;
    private JButton save_Button;

    private final GestionProductos gestionador = new GestionProductos();


    public WGestion() {
        save_Button.addActionListener(e -> {
            String referencia_producto = reference_Field.getText();
            String nombre_producto = name_Field.getText();
            try {
                double precio_producto = Double.parseDouble(precio_Field.getText());

                Producto producto_actual = new Producto(referencia_producto, nombre_producto, precio_producto);
                gestionador.nuevo(producto_actual);
                JOptionPane.showMessageDialog(null, "Producto guardado correctamente",
                        "Nuevo Producto", JOptionPane.INFORMATION_MESSAGE);
                clean();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Tipo de dato en Precio Incorrecto",
                        "Precio Incorrecto", JOptionPane.ERROR_MESSAGE);
                clean();
            }

        });

        clean_Button.addActionListener(e -> clean());
        list_Button.addActionListener(e -> {
            JFrame frame = new JFrame("Listado de Productos");
            frame.setContentPane(new WList(gestionador).getListado());
            frame.pack();
            frame.setVisible(true);

        });
    }

    public static void main(String[] args) {
        try {
            // Set System L&F
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }


        JFrame frame = new JFrame("Gestion de Productos");
        frame.setContentPane(new WGestion().Gestion_Producto);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void clean() {
        reference_Field.setText("");
        name_Field.setText("");
        precio_Field.setText("");
    }
}
