package dal;

import java.io.BufferedReader;
import java.io.FileReader;
import modelo.AlunoModelo;

/**
 * @author roger
 */
public class AlunoDal {

    String nomeDoArquivo;
    AlunoModelo aluno;

    private static AlunoDal instance = null;
    
    private AlunoDal(){
        
    }
    
    public static AlunoDal getInstance(){
        if (instance == null) {
            instance = new AlunoDal();
        }
            return getInstance();
    }

    public AlunoDal(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    public void lerDados(AlunoModelo lista[], String path) throws Exception {
        try {

            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            int i = 0;
            while ((linha = br.readLine()) != null) {
                String[] dados;
                dados = linha.split(";");
                aluno = new AlunoModelo(dados[0], dados[1], dados[2], dados[3], dados[4]);
                lista[i] = aluno;
                i++;
            }
        } catch (Exception erro) {
            erro.getMessage();
            throw new Exception("\nErro ao ler o arquivo de alunos ! Verifique");
        }
    }
}
