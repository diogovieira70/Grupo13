package pt.upt.equipa13.portalestagios.model;

import jakarta.persistence.*;
import java.time.LocalDate;

/** Entidade Candidatura: ligação Aluno ↔ OfertaEstagio e o seu estado. */
@Entity
@Table(name = "candidaturas")
public class Candidatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Data de submissão (por omissão: hoje). */
    @Column(nullable=false)
    private LocalDate data = LocalDate.now();

    @Enumerated(EnumType.STRING)
    @Column(nullable=false)
    private EstadoCandidatura estado = EstadoCandidatura.SUBMETIDA;

    /** Muitas candidaturas pertencem a um Aluno. */
    @ManyToOne(optional=false, fetch=FetchType.LAZY)
    private Aluno aluno;

    /** Muitas candidaturas pertencem a uma OfertaEstagio. */
    @ManyToOne(optional=false, fetch=FetchType.LAZY)
    private OfertaEstagio oferta;

    public Candidatura() {}

    // Getters/Setters
    public Long getId() { return id; }
    public LocalDate getData() { return data; }
    public EstadoCandidatura getEstado() { return estado; }   public void setEstado(EstadoCandidatura estado) { this.estado = estado; }
    public Aluno getAluno() { return aluno; }                 public void setAluno(Aluno aluno) { this.aluno = aluno; }
    public OfertaEstagio getOferta() { return oferta; }       public void setOferta(OfertaEstagio oferta) { this.oferta = oferta; }

    @Override public String toString() {
        return "Candidatura#" + id + " " + estado + " (" + data + ")";
    }
}
