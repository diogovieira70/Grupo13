package pt.upt.equipa13.portalestagios.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

/** Entidade Empresa: oferece estágios (OfertaEstagio). */
@Entity
@Table(name = "empresas", uniqueConstraints = @UniqueConstraint(columnNames = "nif"))
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)             private String nome;
    @Column(nullable=false, length=9)   private String nif;     // 9 dígitos
    @Column(nullable=false)             private String email;
                                       private String website;

    /** Uma Empresa tem várias Ofertas de Estágio. */
    @OneToMany(mappedBy = "empresa",
               cascade = CascadeType.ALL,
               orphanRemoval = true,
               fetch = FetchType.LAZY)
    private List<OfertaEstagio> ofertas = new ArrayList<>();

    public Empresa() {}

    // Helpers de associação (mantêm os dois lados coerentes)
    public void addOferta(OfertaEstagio oferta) {
        ofertas.add(oferta);
        oferta.setEmpresa(this);
    }
    public void removeOferta(OfertaEstagio oferta) {
        ofertas.remove(oferta);
        oferta.setEmpresa(null);
    }

    // Getters/Setters
    public Long getId() { return id; }
    public String getNome() { return nome; }           public void setNome(String nome) { this.nome = nome; }
    public String getNif() { return nif; }             public void setNif(String nif) { this.nif = nif; }
    public String getEmail() { return email; }         public void setEmail(String email) { this.email = email; }
    public String getWebsite() { return website; }     public void setWebsite(String website) { this.website = website; }
    public List<OfertaEstagio> getOfertas() { return ofertas; }

    @Override public String toString() {
        return "Empresa#" + id + " " + nome + " (" + nif + ")";
    }
}
