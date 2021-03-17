
package modelo;

/**
 * @author roger
 */
public class AlunoModelo {
    
    private String matricula;
    private String nome;
    private String turno;
    private String matriz;
    private String ano;

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public AlunoModelo() {
    }

    public AlunoModelo(String matricula, String nome, String turno, String matriz, String ano) {
        this.matricula = matricula;
        this.nome = nome;
        this.turno = turno;
        this.matriz = matriz;
        this.ano = ano;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getMatriz() {
        return matriz;
    }

    public void setMatriz(String matriz) {
        this.matriz = matriz;
    }

    @Override
    public String toString() {
        return "AlunoModelo{" + "matricula=" + matricula + ", nome=" + nome + ", turno=" + turno + ", matriz=" + matriz + ", ano=" + ano + '}';
    }

    
    
    

    
    
    
    
}
