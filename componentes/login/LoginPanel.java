package componentes.login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import views.VentanaCine;
import control.LoginControler;

public class LoginPanel {

    private JPanel panelLogin;

    public LoginPanel(){
        panelLogin = new JPanel();
        panelLogin.setSize(500, 800);
        panelLogin.setOpaque(true);
        panelLogin.setBackground(Color.WHITE);
        panelLogin.setLayout(new GridBagLayout());

        // Administrador de diseño
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 80, 10, 80);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        // Titulo
        JLabel titulo = new JLabel("Login");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setOpaque(true);
        titulo.setBackground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panelLogin.add(titulo, gbc); 
        
        // Entrada Correo
       JTextField entradaCorreo = new JTextField("");
       entradaCorreo.setSize(new Dimension(100,50));
       
       gbc.gridx = 1;
       gbc.gridy = 1;
       gbc.gridwidth = 2;
       panelLogin.add(entradaCorreo,gbc);

        // ENTRADA CONTRA
        JPasswordField entradaContra = new JPasswordField("");
        entradaContra.setSize(new Dimension(100,50));
        gbc.gridx = 1;
        gbc.gridy = 2;
        panelLogin.add(entradaContra,gbc);

        // BOTON
        JButton btnIngresar = new JButton("Ingresar");

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.NONE;
        panelLogin.add(btnIngresar, gbc);

        btnIngresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

                
    // Recuperar Datos

        String entradaUsuario = entradaCorreo.getText();
        String entradaContrasenna= entradaContra.getText();

        if (new LoginControler().validacionDatos(entradaUsuario, entradaContrasenna))  {

        new VentanaCine();
        JFrame ventanaPadre = (JFrame) SwingUtilities.getWindowAncestor(panelLogin);
        ventanaPadre.dispose();

}
}
});

}

public JPanel getJPanel(){
return panelLogin;
}
}

