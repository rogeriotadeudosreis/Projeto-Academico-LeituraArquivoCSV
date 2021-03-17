
package principal;

import dal.AlunoDal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.AlunoModelo;

/**
 * @author roger
 */
public class Aluno {
    
    public static void main(String[] args) {
        try {
            AlunoDal dal = AlunoDal.getInstance();
            AlunoModelo []aluno = new AlunoModelo[50];
            String arquivo = "C:\\Users\\roger\\Documents\\NetBeansProjects\\Academico_LeituraArquivoCSV.csv";
            
            dal.lerDados(aluno, arquivo);
            imprimir(aluno);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Atenção !!!" +  ex.getMessage());
        }
    }
    
    public static void imprimir(AlunoModelo aluno[]) {
        for (int i = 0; i < aluno.length; i++) {
            System.out.println(aluno[i]);
        }
    }
}
