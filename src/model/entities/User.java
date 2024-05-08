package model.entities;

public class User {
    private Integer codigo;
    private String name;
    private Integer idade;

    public User() {

    }

    public User(Integer codigo, String name, Integer idade) {
        this.codigo = codigo;
        this.name = name;
        this.idade = idade;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "User [getCodigo()=" + getCodigo() + ", getName()=" + getName() + ", getIdade()=" + getIdade() + "]";
    }

}
