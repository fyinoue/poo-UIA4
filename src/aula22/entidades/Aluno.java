
package aula22.entidades;

public class Aluno {
    private int id;
    private String nome;
    private String email;
    private String dataNascimento;

    @Override
    public String toString() {
        return "Aluno{" + "id=" + id + ", nome=" + nome + ", email=" + email + ", dataNascimento=" + dataNascimento + '}';
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
}
