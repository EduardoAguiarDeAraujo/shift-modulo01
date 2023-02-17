package Colecoes;

import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Funcionario>{
    // metodo compare
    @Override
    public int compare(Funcionario funcionario, Funcionario outroFuncionario) {
        return funcionario.getIdade() - outroFuncionario.getIdade();
    }
}