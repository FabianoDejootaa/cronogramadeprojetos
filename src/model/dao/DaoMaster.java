package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *  Louvado seja o Senhor Jesus Cristo, salvador e consolador de nossas almas!
 *  Classe de implementação com métodos para controle de comunicação do MYSQL  
 *  @author Fabiano Aparecido Mariano de Oliveira.
 *  @version 0.0.1
 *  @since 25/01/2026
 * 
 */
public abstract class DaoMaster {
    
    protected Connection conn;
    protected PreparedStatement stm;
    protected ResultSet rs;
    
    /**
     *  Classe de consulta ao banco de dados.
     *  @param table Nome da tabela.
     *  @param args Argumentos de consulta.
     *  @return  Objeto que contém o resultado da consulta.
     */
    public abstract Object query(String table, String... args);
    
}
