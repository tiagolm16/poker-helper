
# Poker Helper

**Aplicação em Java para suporte à decisão no poker, baseada em lógica estruturada e conceitos de teoria dos jogos (GTO).**

---

## Sobre o projeto

Poker Helper é uma aplicação desktop desenvolvida em Java para auxiliar jogadores a tomarem decisões mais consistentes durante uma mão de poker. O sistema recebe o estado atual da jogada e retorna uma ação recomendada com base em regras estratégicas estruturadas.

O projeto surgiu da combinação de dois interesses: programação orientada a objetos e análise de decisão sob incerteza, área que tem paralelos com teoria dos jogos e mercado financeiro.

---

## Status do projeto

🚧 Em desenvolvimento ativo

---

## Funcionalidades

- Entrada de dados da mão: hole cards, board, posição, stack e situação da aposta
- Motor de decisão baseado em regras que sugere ações como **Fold**, **Call** ou **Raise**
- Análise da força da mão combinada com contexto de posição e pote
- Arquitetura modular e extensível para evolução do algoritmo

---

## Tecnologias

| Tecnologia | Uso |
|---|---|
| Java 17+ | Linguagem principal |
| Maven | Gerenciamento de dependências e build |
| IntelliJ IDEA | Ambiente de desenvolvimento |

---

## Estrutura do projeto

```text
src/
└── main/
    └── java/
        └── br/
            └── tiago/
                └── pokerhelper/
                    ├── app/      # Ponto de entrada da aplicação
                    ├── domain/   # Entidades e modelos do jogo
                    └── service/  # Regras e lógica de decisão
````

---

## Exemplo de uso

**Entrada:**

```text
Hole cards : A♠ K♦
Board      : Q♠ J♥ 2♣
Posição    : BTN (Button)
Stack      : 100bb
Pot        : 12bb | Bet a pagar: 6bb
```

**Saída:**

```text
Ação recomendada : RAISE
Motivo           : Mão com potencial de melhora, posição favorável e decisão positiva dentro do contexto da jogada
```

---

## Como executar

```bash
# 1. Clone o repositório
git clone https://github.com/tiagolm16/poker-helper.git

# 2. Acesse o diretório
cd poker-helper

# 3. Compile o projeto
mvn compile

# 4. Execute a aplicação
mvn exec:java -Dexec.mainClass="br.tiago.pokerhelper.app.Main"
```

> Requisito: Java 17+ e Maven instalados.

---

## Roadmap

* [x] Estrutura inicial do projeto com Maven
* [x] Organização modular em pacotes
* [x] Modelagem inicial das entidades principais
* [x] Serviço inicial de decisão
* [ ] Implementar avaliação de mãos
* [ ] Refinar motor de decisão com heurísticas inspiradas em GTO
* [ ] Adicionar interface gráfica
* [ ] Simular múltiplos cenários de jogo
* [ ] Evoluir a recomendação com base em estratégias mais robustas

---

## Motivação

Este projeto aplica na prática conceitos de:

* Programação orientada a objetos e modelagem de domínio
* Estruturação de sistemas modulares
* Lógica de decisão baseada em múltiplas variáveis
* Análise de risco e retorno em cenários de incerteza

Além do estudo técnico em Java, o objetivo do projeto é construir uma aplicação que também seja relevante como portfólio de desenvolvimento.

---

## Autor

**Tiago Lara Melo**
Estudante de Engenharia de Software — IDP
[LinkedIn](https://linkedin.com/in/tiagolara16) · [GitHub](https://github.com/tiagolm16)

---

Contribuições, sugestões e issues são bem-vindos.

````




