package componentes.login;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class BannerPanel {
    private JPanel panelBanner;

    public BannerPanel() {
        this.panelBanner = new JPanel();
        panelBanner.setPreferredSize(new Dimension(500,800));
        panelBanner.setOpaque(true);
        panelBanner.setBackground(new Color(70,130,180));
        panelBanner.setLayout(new BorderLayout());

        //titulo
        JLabel tituloLogin = new JLabel("  📽️ Tu boleto al entretenimiento empieza aquí.");
        tituloLogin.setFont(new Font("Verdana", Font.BOLD, 20)); //FUENTE
        tituloLogin.setForeground(Color.WHITE); //color de texto


        panelBanner.add(tituloLogin, BorderLayout.CENTER);
        
    }
    public JPanel getBanner(){
        return panelBanner;
    }
}


