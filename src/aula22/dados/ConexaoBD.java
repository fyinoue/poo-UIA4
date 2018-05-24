
package aula22.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    public static Connection getConexao() throws DadosException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost/academico",
                    "root",
                    "1234"
            );
        } catch (ClassNotFoundException ex) {
            throw new DadosException("Erro JDBC", ex);
        } catch (SQLException ex) {
            throw new DadosException("Erro MySQL", ex);
        }
    }
}
