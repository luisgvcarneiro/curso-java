```markdown
# Curso Java - Exercícios & Aprendizado

Este repositório reúne os códigos e exercícios desenvolvidos ao longo do aprendizado em Java, cobrindo desde a lógica de programação e fundamentos até os conceitos de Programação Orientada a Objetos (POO).

---

## Estrutura do Repositório

O repositório é composto por dois projetos independentes:

```text
curso-java/
├── lista-project/              # Projeto com exercícios de Lógica e Fundamentos
│   └── src/
│       └── fundamentos/
│           ├── Lista01.java    # Estrutura Sequencial
│           ├── Lista02.java    # Estrutura Condicional (if/else, switch-case)
│           ├── Lista03_1.java  # Estrutura Repetitiva (while) - Validação de Senha
│           ├── Lista03_2.java  # Estrutura Repetitiva (while) - Coordenadas
│           ├── Lista03_3.java  # Estrutura Repetitiva (while) - Posto de Combustível
│           └── Lista04.java    # Estrutura Repetitiva (for)
│
└── triangulo-project/          # Projeto prático comparativo de POO vs Estruturado
    └── src/
        ├── application/
        │   ├── SemPOO.java              # Resolução usando apenas lógica estruturada na main
        │   └── TringuloApplication.java # Resolução orientada a objetos (main com instâncias)
        └── entities/
            └── Triangulo.java           # Entidade representando a classe Triângulo com o método area()

```

---

## Conteúdo dos Projetos

**1. `lista-project` (Fundamentos de Java)**

* **`Lista01.java` (Estrutura Sequencial):** Operações matemáticas básicas, cálculos de área, salários e formatação de saída utilizando `Scanner` e `Locale`.
* **`Lista02.java` (Estrutura Condicional):** Tomadas de decisão com `if / else` e `switch-case` (par/ímpar, múltiplos, duração de jogos, quadrantes e faixas do Imposto de Renda).
* **`Lista03_1.java`, `Lista03_2.java` e `Lista03_3.java` (Estrutura Repetitiva - While):** Laços de repetição com teste no início para validação contínua de dados.
* **`Lista04.java` (Estrutura Repetitiva - For):** Estruturas de repetição com contagem definida, cálculo de médias ponderadas, divisões, fatorial e potências.

**2. `triangulo-project` (Introdução à POO)**

* **Programação Estruturada (`SemPOO.java`):** Resolução do problema de calcular a área de dois triângulos declarando todas as variáveis diretamente no método principal.
* **Programação Orientada a Objetos (`entities/Triangulo.java` & `application/TringuloApplication.java`):** Encapsulamento da regra de negócio dentro da classe `Triangulo` com a fórmula de Heron no método `area()`, reduzindo a duplicação de código e melhorando a reutilização.

---

## Tecnologias

* **Linguagem:** Java
* **IDE Recomendada:** Eclipse / VS Code / IntelliJ IDEA

```

```