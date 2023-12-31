package go.party.tcs.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "evento")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "estado")
    private String estado;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "valor")
    private String valor;

    @Column(name = "horario")
    private String horario;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Usuario autor;

    @Lob
    @Column(name = "foto_evento", columnDefinition = "LONGBLOB")
    private byte[] fotoEvento;

    @ManyToOne
    @JoinColumn(name = "comentario_id")
    private Comentario comentario;

    @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL)
    private List<Comentario> comentarios = new ArrayList<>();

    @OneToMany(mappedBy = "evento")
    private List<Curtida> curtidas;

    @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ingresso> ingressos;

    
    // Construtor vazio
    public Evento() {
    }

    // Construtor com parâmetros
    public Evento(String titulo, String descricao, Usuario autor, String valor, String horario) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.autor = autor;
        this.valor = valor;
        this.horario = horario;
    }

    
    // Getters e setters para id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Getters e setters para titulo
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getters e setters para descricao
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Getters e setters para autor
    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public byte[] getFotoEvento() {
        return fotoEvento;
    }
    
    public void setFotoEvento(byte[] fotoEvento) {
        this.fotoEvento = fotoEvento;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }
    
    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public List<Ingresso> getIngressos(){
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public List<Curtida> getCurtidas() {
        return curtidas;
    }
    
    public void setCurtidas(List<Curtida> curtidas) {
        this.curtidas = curtidas;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getBairro(){
        return bairro;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public String getValor(){
        return valor;
    }

    public void setValor(String valor){
        this.valor = valor;
    }

    public String getHorario(){
        return horario;
    }

    public void setHorario(String horarior){
        this.horario = horario;
    }
    
}
