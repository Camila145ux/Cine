 package control;

public class LoginControler {

    //Datos del usuario
    String[][] credenciales ={
        {"user01", "pass01"}, {"maria22", "qwerty"},
        {"admin", "1234"}, {"juanito", "abcd"},
    {"lola", "0000"},{"prueba", "test"},
    {"ana12", "4321"},{"pepe7", "xyz"},
    {"carlosx", "1a2b3c"},
    {"demo", "demo"}, {"dataguite", "gatitos123"}
    };

    public boolean validacionDatos(String EntradaUsuario, String EntradaContrasenna) {
        boolean res = false;
    
        for (int i = 0; i < credenciales.length; i++) {
            if (credenciales[i][0].equals(EntradaUsuario) && credenciales[i][1].equals(EntradaContrasenna)) {
                res = true;
            }
        }
    
        return res; 
    }
}    

