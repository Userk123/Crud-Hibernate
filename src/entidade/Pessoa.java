package entidade;

import com.sun.istack.internal.NotNull;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")

public class Pessoa implements Serializable{

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    @Column (name = "idpessoa")
    private Integer idpessoa;
    
    @NotNull
    @Column (name = "nome")
    private String nome;
    
    @NotNull
    @Column (name = "sobrenome")
    private String sobrenome;
    
    @NotNull
    @Column (name = "endereco")
    private String endereco;
    
    @NotNull   
    @Column (name = "numero")
    private Integer numero;
      
    @NotNull
    @Column (name = "cidade")
    private String cidade;
    
    @NotNull
    @Column (name = "telefone")
    private String telefone;
     
    @NotNull
    @Column (name = "celular")
    private String celular;
    
    @NotNull
    @Column (name = "cpf")
    private String cpf;
    
    
    

    public Pessoa() {
    }
    
    

    /**
     * @return the idpessoa
     */
    public Integer getIdpessoa() {
        return idpessoa;
    }

    /**
     * @param idpessoa the idpessoa to set
     */
    public void setIdpessoa(Integer idpessoa) {
        this.idpessoa = idpessoa;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }  
    
        /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    
    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the numero
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    
}
