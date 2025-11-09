// src/test/java/TarefaServiceTest.java

// Importações do JUnit 5
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class TarefaServiceTest {

    private TarefaService service;

    // Este método roda ANTES de cada teste
    @BeforeEach
    public void setUp() {
        // Garante que temos um service "limpo" para cada teste
        service = new TarefaService();
    }

    @Test
    public void testCriarTarefa() {
        // ATUALIZADO: Adiciona prioridade "Alta"
        Tarefa tarefa = service.criarTarefa("Título Teste", "Descrição Teste", "Alta");
        
        assertNotNull(tarefa); // Verifica se a tarefa não é nula
        assertEquals(1, tarefa.getId()); // Verifica se o ID é 1
        assertEquals("Título Teste", tarefa.getTitulo());
        assertEquals("Alta", tarefa.getPrioridade()); // NOVO TESTE: Verifica a prioridade
    }

    @Test
    public void testListarTarefas() {
        service.criarTarefa("Tarefa 1", "Desc 1", "Baixa");
        service.criarTarefa("Tarefa 2", "Desc 2", "Média");

        List<Tarefa> tarefas = service.listarTarefas();
        
        assertNotNull(tarefas);
        assertEquals(2, tarefas.size()); // Verifica se temos 2 tarefas na lista
    }

    @Test
    public void testObterTarefaPorId() {
        service.criarTarefa("Tarefa 1", "Desc 1", "Alta");
        Tarefa tarefa = service.obterTarefaPorId(1);

        assertNotNull(tarefa);
        assertEquals(1, tarefa.getId());
    }

    @Test
    public void testObterTarefaPorIdInexistente() {
        Tarefa tarefa = service.obterTarefaPorId(99); // ID que não existe
        assertNull(tarefa); // Esperamos que retorne nulo
    }

    @Test
    public void testAtualizarTarefa() {
        service.criarTarefa("Título Antigo", "Desc Antiga", "Baixa");
        
        // ATUALIZADO: Atualiza a tarefa de ID 1, incluindo a nova prioridade
        boolean sucesso = service.atualizarTarefa(1, "Título Novo", "Desc Nova", "Urgente", true);
        
        assertTrue(sucesso); // Verifica se a atualização retornou sucesso
        
        Tarefa tarefaAtualizada = service.obterTarefaPorId(1);
        assertEquals("Título Novo", tarefaAtualizada.getTitulo());
        assertEquals("Urgente", tarefaAtualizada.getPrioridade()); // NOVO TESTE: Verifica a prioridade
        assertTrue(tarefaAtualizada.isConcluida()); // Verifica se marcou como concluída
    }

    @Test
    public void testDeletarTarefa() {
        service.criarTarefa("Tarefa para deletar", "...", "Baixa");
        
        boolean sucesso = service.deletarTarefa(1);
        
        assertTrue(sucesso); // Verifica se a deleção retornou sucesso
        assertNull(service.obterTarefaPorId(1)); // Verifica se a tarefa não existe mais
    }
}
