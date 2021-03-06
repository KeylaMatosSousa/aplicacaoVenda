/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ude.ifnmg.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author keyla
 */
@Entity
public class Venda implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datta;
    @ManyToOne
    private Pessoa clinte;
    @OneToMany
    private List<ItemVenda> itens;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoa getClinte() {
        return clinte;
    }

    public void setClinte(Pessoa clinte) {
        this.clinte = clinte;
    }

    public Date getDatta() {
        return datta;
    }

    public void setDatta(Date datta) {
        this.datta = datta;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venda)) {
            return false;
        }
        Venda other = (Venda) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.ude.ifnmg.entidade.Venda[ id=" + id + " ]";
    }
    
}
