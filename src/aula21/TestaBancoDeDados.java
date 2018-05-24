/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author felipe
 */
public class TestaBancoDeDados {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/academico", "root", "1234");
            
            String sql = "INSERT INTO alunos(nome, email, data_nasc) VALUES ('Jose', 'jose@iesb.br', '01/01/2000')";
            Statement comando = conexao.createStatement();
            //comando.executeUpdate(sql);
            
            sql = "INSERT INTO alunos(nome, email, data_nasc) VALUES (?,?,?)";
            PreparedStatement insert = conexao.prepareStatement(sql);
            insert.setString(1, "Maria");
            insert.setString(2, "maria@iesb.br");
            insert.setString(3, "10/12/2002");
            //insert.execute();
            
            sql = "SELECT * FROM alunos";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next()) {
                System.out.println("Id:" + resultado.getInt(1));
                System.out.println("Nome:" + resultado.getString(2));
                System.out.println("E-mail:" + resultado.getString(3));
                System.out.println("DataNasc:" + resultado.getString(4));
            }
            
            conexao.close();
        } catch (ClassNotFoundException ex) {
            System.err.println("Erro JDBC. Motivo: " + ex.getMessage());
            System.exit(1);
        } catch (SQLException e) {
            System.err.println("Erro MySQL. Motivo: " + e.getMessage());
            System.exit(1);
        }
    }
}
