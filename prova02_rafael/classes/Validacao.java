package prova02_rafael.classes;

import java.util.List;

public class Validacao {
    public boolean validaSenha(String usuario, List<String> senhasAutorizadas) {
        return senhasAutorizadas.contains(usuario);
    }
}
