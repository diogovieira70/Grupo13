package pt.upt.equipa13.portalestagios.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/** Entidade OfertaEstagio: proposta de estágio publicada por uma Empresa. */
@Entity
@Table(name = "ofertas_estagio")
public class OfertaEstagio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)               private String titulo;
    @Column(nullable=false, length=2000)  private String descricao;
    @Column(nullable=false)               private String area;

    @Enumerated(EnumType.STRING)
    @Column(nullable=false)
    private EstadoOferta estado = EstadoOferta.ABERTA;

    @Column(nullable=false, updatable=false)
    private LocalDateTime createdAt;

    /** Muitas ofertas pertencem a uma empresa. */
    @ManyToOne(optional=false, fetch=FetchType.LAZY)
    private Empresa empresa;

    /** Uma oferta pode ter várias candidaturas associadas. */
    @OneToMany(mappedBy = "oferta",
               cascade = CascadeType.ALL,
               orphanRemoval = true,
               fetch = FetchType.LAZY)
    private List<Candidatura> candidaturas = new ArrayList<>();

    public OfertaEstagio() {}

    // Define createdAt automaticamente na inserção
    @PrePersist
    private void onCreate() { this.createdAt = LocalDateTime.now(); }

    // Helpers de associação
    public void addCandidatura(Candidatura c) {
        candidaturas.add(c);
        c.setOferta(this);
    }
    public void removeCandidatura(Candidatura c) {
        candidaturas.remove(c);
        c.setOferta(null);
    }

    // Getters/Setters
    public Long getId() { return id; }
    public String getTitulo() { return titulo; }           public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescricao() { return descricao; }     public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getArea() { return area; }               public void setArea(String area) { this.area = area; }
    public EstadoOferta getEstado() { return estado; }     public void setEstado(EstadoOferta estado) { this.estado = estado; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public Empresa getEmpresa() { return empresa; }        public void setEmpresa(Empresa empresa) { this.empresa = empresa; }
    public List<Candidatura> getCandidaturas() { return candidaturas; }

    @Override public String toString() {
        return "OfertaEstagio#" + id + " " + titulo + " [" + area + "]";
    }
}
