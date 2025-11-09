// src/main/java/Tarefa.java
public class Tarefa {
    private int id;
    private String titulo;
    private String descricao;
    private boolean concluida;
    private String prioridade; // <-- NOVA LINHA

    // Construtor ATUALIZADO
    public Tarefa(int id, String titulo, String descricao, String prioridade) { // <-- MUDANÇA AQUI
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = false;
        this.prioridade = prioridade; // <-- NOVA LINHA
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    // Getter e Setter para Prioridade (NOVOS)
    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }


    @Override
    public String toString() {
        // ATUALIZADO para incluir prioridade
        return "Tarefa [id=" + id + ", titulo=" + titulo + ", prioridade=" + prioridade + ", concluida=" + concluida + "]";
    }
}
