package javaBeans;

import java.sql.SQLException;

public class Cliente extends Conectar {
    public int pkcliente;
    public String nome;
    public String email;
    public String celular;
    public String senha;
    public int fkuser; // chave estrangeira da tabela usuarios

  public Cliente() {
        try {
           sql = "create table if not exists clientes ( "
                   + "pkcliente int AUTO_INCREMENT,"
                    + "nome varchar(40) not null,"
                    + "email varchar(40) not null,"
                    + "celular varchar(20) not null,"
                    + "senha varchar(10) not null,"
                    + "fkuser int not null,"
                    + "PRIMARY KEY ( pkcliente ) ) ";
            ps = con.prepareStatement(sql);
            ps.executeUpdate(); // Executa o comando SQL dentro do servidor 
  
            this.statusSQL = null;
        } catch (SQLException ex) {
            this.statusSQL = "Erro ao criar tabela clientes " + ex.getMessage();
        }
    }

    public void incluir() {}
    public void alterar() {}
    public void deletar() {}
    public void gravar() {}
    public void buscar() {}
}
