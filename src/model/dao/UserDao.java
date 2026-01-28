package model.dao;

import factory.MySqlFactory;
import model.vo.User;

import java.sql.SQLException;

/**
 *   Louvado seja o Senhor Jesus Cristo, salvador e consolador de nossas almas!
 *   Classe de interação com a tabela de usuários.
 *   @author Fabiano Aparecido Mariano de Oliveira.
 *   @since 24/01/2026.
 *   @version 0.0.1
 */
public class UserDao extends DaoMaster{
    
    private User user;
    
    private final byte NAME_USER = 0;
    private final byte PASS_USER = 1;
    private final byte EMAIL = 2;
    private final byte HIERARCHY = 3;
    
    private final byte USED_COLUMNS = 2;
    
    private final String[] columnsName = {
        "name_user",
        "pass_user",
        "email",
        "hierarchy"
    };
    /**
     *  Contrutor da classe.
     */
    public UserDao() {
        user = new User();
    }
    /**
     *  Classe de consulta do usuário ao banco de dados.
     *  @param table Nome da Tabela.
     *  @param args Argumentos da consulta.
     *  @return Objeto do Usuário.
     */
    @Override
    public Object query(String table, String... args) {
        
        super.conn = MySqlFactory.getConnection();
        
        StringBuilder sqlSentence = new StringBuilder("SELECT * FROM " + table + " WHERE ");
        
        for(byte i = 0; i < columnsName.length; ++i) {
            if(i == EMAIL || i == HIERARCHY) {
                continue;
            }
            sqlSentence.append(columnsName[i] + " = ?");
            if(i != USED_COLUMNS - 1) {
                sqlSentence.append(" AND ");
            }
        }
        try {
            super.stm = super.conn.prepareStatement(sqlSentence.toString());
            for(byte i = 0; i < args.length; ++i) {
                super.stm.setString(i + 1, args[i]);
            }
            
            super.rs = super.stm.executeQuery();
            
            if(super.rs.next()) {
                user.setName(rs.getString(columnsName[NAME_USER]));
                user.setPass(rs.getString(columnsName[PASS_USER]));
                user.setEmail(rs.getString(columnsName[EMAIL]));
                user.setHierarchy((byte)rs.getInt(columnsName[HIERARCHY]));
            
                return user;
            }
        } catch (SQLException ex) {
            System.err.println("ERROR: " + ex.getMessage());
        } finally {
            MySqlFactory.closeConnection(super.rs, super.stm, super.conn);
        }
        return null;
    }
}
