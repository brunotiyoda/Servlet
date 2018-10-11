package banco;

import model.Empresa;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {

    private static List<Empresa> listaDeEmpresas = new ArrayList<Empresa>();

    public void adiciona(Empresa empresa) {
        BancoDeDados.listaDeEmpresas.add(empresa);
    }

    public List<Empresa> getEmpresas() {
        return BancoDeDados.listaDeEmpresas;
    }
}
