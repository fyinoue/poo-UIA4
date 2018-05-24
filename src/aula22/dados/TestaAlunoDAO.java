
package aula22.dados;

import aula22.entidades.Aluno;
import java.util.List;

public class TestaAlunoDAO {
    public static void main(String[] args) throws DadosException {
        AlunoDAO dao = new AlunoDAO();
        
        //Aluno novoAluno = new Aluno();
        //novoAluno.setNome("Antonio");
        //novoAluno.setEmail("antonio@iesb.br");
        //novoAluno.setDataNascimento("05/05/1995");
        //dao.inserir(novoAluno);
        
        System.out.println("----------CONSULTAR----------");
        
        Aluno consulta = dao.consultar(2);
        System.out.println(consulta);
        
        System.out.println("----------LISTAR----------");
        
        List<Aluno> listaAlunos = dao.listar();
        
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }
    }
}
