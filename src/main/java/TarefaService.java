// src/main/java/TarefaService.java
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TarefaService {

    private List<Tarefa> tarefas;
    private int proximoId = 1;

    public TarefaService() {
        this.tarefas = new ArrayList<>();
    }

    /**
     * CREATE (Criar)
     * Adiciona uma nova tarefa à lista.
     */
    public Tarefa criarTarefa(String titulo, String descricao) {
        Tarefa novaTarefa = new Tarefa(proximoId, titulo, descricao);
        this.tarefas.add(novaTarefa);
        this.proximoId++; // Incrementa o ID para a próxima tarefa
        return novaTarefa;
    }

    /**
     * READ (Ler - Todas)
     * Retorna a lista de todas as tarefas.
     */
    public List<Tarefa> listarTarefas() {
        return new ArrayList<>(this.tarefas); // Retorna uma cópia da lista
    }

    /**
     * READ (Ler - Por ID)
     * Busca uma tarefa específica pelo seu ID.
     */
    public Tarefa obterTarefaPorId(int id) {
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getId() == id) {
                return tarefa;
            }
        }
        return null; // Retorna null se não encontrar
    }

    /**
     * UPDATE (Atualizar)
     * Atualiza os dados de uma tarefa existente.
     */
    public boolean atualizarTarefa(int id, String novoTitulo, String novaDescricao, boolean concluida) {
        Tarefa tarefa = obterTarefaPorId(id);
        if (tarefa != null) {
            tarefa.setTitulo(novoTitulo);
            tarefa.setDescricao(novaDescricao);
            tarefa.setConcluida(concluida);
            return true; // Sucesso
        }
        return false; // Tarefa não encontrada
    }

    /**
     * DELETE (Deletar)
     * Remove uma tarefa da lista pelo seu ID.
     */
    public boolean deletarTarefa(int id) {
        Tarefa tarefaParaRemover = obterTarefaPorId(id);
        if (tarefaParaRemover != null) {
            this.tarefas.remove(tarefaParaRemover);
            return true; // Sucesso
        }
        return false; // Tarefa não encontrada
    }
}
