package factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *  Louvado seja o Senhor Jesus Cristo, salvador e consolador de nossas almas!
 *  Classe de construção da conexão com o banco de dados MYSQL.
 *  @author Fabiano Aparecido Mariano de Oliveira.
 *  @since 24/01/2026
 *  @version 0.0.1
 */
public class MySqlFactory {
    
    private static final String URL = "jdbc:mysql://localhost:3306/cronograma_projetos";
    private static final String USER = "root";
    private static final String PASS = "root";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    /**
     *  Método de obtenção de conexão.
     * @return Gerenciador do driver do gerenciador de conexão.
     */
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch(SQLException ex) {
            System.out.println("Error:\n\n" + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error:\n\n" + ex.getMessage());
        }
        return null;
    }
    /**
     *  Método de fechamento de conexão.
     * @param conn Manipulador da conexão.
     */
    public static void closeConnection(ResultSet rs) {
        try {
            if(rs != null) {
                rs.close();
            }
        } catch(SQLException ex) {
            System.out.println("Error:\n\n" + ex.getMessage());
        }
    }
    /**
     * Método de fechamento de conexão.
     * @param conn Manipulador de conexão.
     * @param stm  Manipulador de conteúdo de conexão.
     */
    public static void closeConnection(ResultSet rs, PreparedStatement stm) {
        closeConnection(rs);
        try {
            if(stm != null) {
                stm.close();
            }
        } catch(SQLException ex) {
            System.out.println("Error:\n\n" + ex.getMessage());
        }
    }
    /**
     *  Método de fechamento de conexão.
     * @param conn Manipulador de conexão.
     * @param stm Manipulador de conteúdo de conexão.
     * @param rs Manipulador de resultados de consultas.
     */
    public static void closeConnection(ResultSet rs, PreparedStatement stm, Connection conn) {
        closeConnection(rs, stm);
        try {
            if(conn != null) {
                conn.close();
            }
        } catch(SQLException ex) {
            System.out.println("Error:\n\n" + ex.getMessage());
        }
    }
}
