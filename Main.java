import javax.swing.*;
import javax.swing.JFrame;

import componentes.header.Header;
import componentes.modulos.Pelicula;
import componentes.paneles.AsientosPanel;
import componentes.paneles.CarteleraPanel;
import componentes.paneles.ReservaPanel;
import componentes.login.LoginPanel;
import componentes.login.BannerPanel;

import java.awt.BorderLayout;
import java.util.List;



public class Main {

    public static void main(String[] args) {
        //ventana
        JFrame loginVentana = new JFrame();  //crear ventana vacia
        loginVentana.setTitle("Login Cine"); //titulo de la ventana
        loginVentana.setSize(2000, 1050); //tamanno de la ventana
        loginVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginVentana.setLayout(new BorderLayout());
        loginVentana.setLocationRelativeTo(null);
 

        //Login Panel
        LoginPanel loginPanel = new LoginPanel();
        loginVentana.add(loginPanel.getJPanel(), BorderLayout.CENTER);

        //BannerPanel
        BannerPanel bannerPanel = new BannerPanel();
        loginVentana.add(bannerPanel.getBanner(),BorderLayout.WEST);

        loginVentana.setVisible(true);

    }
}