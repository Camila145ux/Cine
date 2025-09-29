 package control;

 import database.UsuariosData;

public class LoginControler {

    public boolean validacionDatos(String EntradaUsuario, String EntradaContrasenna) {
    boolean res = false;

    for (int i = 0; i < UsuariosData.credenciales.length; i++) {
        if (UsuariosData.credenciales[i][0].equals(EntradaUsuario) &&
            UsuariosData.credenciales[i][1].equals(EntradaContrasenna)) {
            res = true;
            break;
        }
    }

    return res;
}

}    

