package utils.enums;

public enum Role {
    OPERADOR("Operador"),
    COORDENADOR("Coordenador"),
    DIRETOR("Diretor"),
    RECEPCIONISTA("Recepcionista"),
    CONTADOR("Contador"),
    GERENTE("Gerente"),
    ELETRICISTA("Eletricista");

    private final String valor;

    Role(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
