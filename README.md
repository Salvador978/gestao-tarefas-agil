# Projeto: Sistema de Gestão de Tarefas Ágil (TechFlow Solutions)

Este repositório é parte do projeto da disciplina de Engenharia de Software da UniFECAF, focado em construir um projeto ágil no GitHub, da gestão ao controle de qualidade.

## 1. Objetivo do Projeto

O projeto simula o desenvolvimento de um sistema de gerenciamento de tarefas para a **TechFlow Solutions**, uma empresa fictícia. O cliente é uma startup de logística que necessita de um sistema para:
* Acompanhar o fluxo de trabalho em tempo real.
* Priorizar tarefas críticas.
* Monitorar o desempenho da equipe.

## 2. Escopo Inicial

Nesta primeira fase, o projeto se concentrará na implementação da funcionalidade central do sistema: um **CRUD (Create, Read, Update, Delete) básico para o gerenciamento de tarefas**.

## 3. Metodologia Adotada

Para este projeto, utilizaremos a metodologia ágil **Kanban**. A gestão das tarefas será centralizada na aba "Projects" deste repositório no GitHub, organizada nas seguintes colunas:
* **A Fazer (Todo)**
* **Em Progresso (In Progress)**
* **Concluído (Done)**

---
*(Esta seção será atualizada posteriormente)*
---

## 4. Simulação de Mudança de Escopo

Durante o desenvolvimento (conforme Tarefa #8 do Kanban), o cliente (startup de logística) solicitou uma nova funcionalidade não prevista no escopo inicial: a capacidade de definir uma **Prioridade** (ex: Baixa, Média, Alta) para cada tarefa.

**Justificativa:** Esta mudança é crucial para que a equipe de logística possa focar primeiro nas "tarefas críticas", alinhando-se melhor ao objetivo do projeto de "priorizar tarefas críticas".

**Impacto:** A mudança foi implementada atualizando a classe `Tarefa` e os métodos `criarTarefa` e `atualizarTarefa` do `TarefaService`. A nova feature foi registrada, implementada e documentada.
