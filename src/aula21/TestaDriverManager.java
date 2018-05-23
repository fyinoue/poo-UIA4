/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula21;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author felipe
 */
public class TestaDriverManager {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.getConnection("jdbc:mysql://localhost", "root", "1234");
        } catch (ClassNotFoundException ex) {
            System.err.println("Erro ao carregar JDBC");
            System.exit(1);
        } catch (SQLException e) {
            System.err.println("Erro ao conectar MySQL");
            System.exit(1);
        }
    }
}
