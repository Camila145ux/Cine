package views;

import javax.swing.JFrame;
import java.awt.BorderLayout;

import componentes.login.BannerPanel;
import componentes.login.LoginPanel;

public class LoginVentana {
         public LoginVentana() {
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
