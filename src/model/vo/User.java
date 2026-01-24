package model.vo;

/**
 *   Louvado seja o Senhor Jesus Cristo, salvador e consolador de nossas almas!
 *   Classe do objeto usuário.
 *   @author Fabiano Aparecido Mariano de Oliveira.
 *   @since 24/01/2026
 *   @version 0.0.1
 */
public class User {
    
    private String name;
    private String email;
    private String pass;
    private byte hierarchy;
    
    // Métodos setters e getters.
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getPass() {
        return this.pass;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }
    public void setHierarchy(byte hierarchy) {
        this.hierarchy = hierarchy;
    }
    public byte getHierarchy() {
        return this.hierarchy;
    }
}
