# Curso Java - Exercícios & Aprendizado

Este repositório reúne os códigos e exercícios desenvolvidos ao longo do aprendizado em Java, cobrindo desde a lógica de programação e fundamentos até os conceitos de Programação Orientada a Objetos (POO).

---

## Estrutura do Repositório

O repositório é composto por cinco projetos independentes:

```text
curso-java/
├── employee-project/           # Projeto prático de POO para salário e aumento salarial
│   └── src/
│       ├── application/
│       │   └── Program.java    # Entrada do funcionário e cálculo do aumento
│       └── entities/
│           └── Employee.java   # Entidade com dados do funcionário e regra do aumento
│
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
├── rectangle-project/          # Projeto prático de POO para cálculo de retângulo
│   └── src/
│       ├── application/
│       │   └── Program.java    # Leitura de dados e exibição de resultados
│       └── entities/
│           └── Rectangle.java  # Entidade com métodos (área, perímetro, diagonal)
│
├── student-project/            # Projeto prático de POO para avaliação de aluno
│   └── src/
│       ├── application/
│       │   └── Program.java    # Leitura e validação das notas
│       └── entities/
│           └── Student.java    # Entidade com verificação de aprovação/reprovação
│
└── triangulo-project/          # Projeto prático comparativo de POO vs Estruturado
    └── src/
        ├── application/
        │   ├── SemPOO.java              # Resolução usando apenas lógica estruturada
        │   └── TringuloApplication.java # Resolução orientada a objetos
        └── entities/
            └── Triangulo.java           # Entidade representando a classe Triângulo
```

---

## Conteúdo dos Projetos

**1. `employee-project` (Gestão de Salário de Funcionário)**
* **`entities/Employee.java`:** Modelo de domínio contendo `name`, `grossSalary` e `tax`, além de métodos para salário líquido e reajuste percentual.
* **`application/Program.java`:** Interação com o usuário para registro de funcionário e reajuste salarial.

**2. `lista-project` (Fundamentos de Java)**
* **`Lista01.java` (Estrutura Sequencial):** Operações matemáticas básicas, área, salário e saída formatada.
* **`Lista02.java` (Estrutura Condicional):** Tomadas de decisão com `if / else` e `switch-case`.
* **`Lista03_1.java`, `Lista03_2.java` e `Lista03_3.java` (Estrutura Repetitiva - While):** Laços com teste no início.
* **`Lista04.java` (Estrutura Repetitiva - For):** Laços com contagem definida, médias ponderadas, fatorial e divisões.

**3. `rectangle-project` (Cálculo de Retângulo com POO)**
* **`entities/Rectangle.java`:** Atributos (`width`, `height`) e métodos para cálculo de área, perímetro e diagonal.
* **`application/Program.java`:** Leitura de dimensões e exibição dos resultados formatados.

**4. `student-project` (Validação de Notas e Aprovação)**
* **`entities/Student.java`:** Armazena as três notas do aluno, calcula o total e verifica se atingiu a média mínima de 60 pontos.
* **`application/Program.java`:** Leitura com validação via `do-while` garantindo os limites estabelecidos para cada nota.

**5. `triangulo-project` (Introdução à POO)**
* **Programação Estruturada (`SemPOO.java`):** Resolução usando apenas o método principal.
* **Programação Orientada a Objetos (`entities/Triangulo.java` & `application/TringuloApplication.java`):** Encapsulamento da regra com a fórmula de Heron na entidade.

---

## Tecnologias

* **Linguagem:** Java
* **IDE Recomendada:** Eclipse / VS Code / IntelliJ IDEA
