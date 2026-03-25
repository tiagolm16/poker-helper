# Poker Helper

**Aplicação de suporte à decisão para poker em Java — baseada em análise lógica e conceitos de GTO (Game Theory Optimal).**

---

## Sobre o projeto

Poker Helper é uma aplicação desktop desenvolvida em Java que auxilia jogadores a tomarem decisões mais consistentes durante uma mão de poker. O sistema recebe o estado atual da jogada e retorna a ação recomendada com base em regras estratégicas estruturadas.

O projeto nasceu da combinação de dois interesses pessoais: programação orientada a objetos e análise de decisão sob incerteza — área com forte paralelo em teoria dos jogos e mercado financeiro.

---

## Funcionalidades

- Entrada de dados da mão: hole cards, board, posição, stack e situação da aposta
- Motor de decisão que sugere **Fold**, **Call** ou **Raise**
- Análise de força da mão combinada com contexto de posição e pote
- Arquitetura modular e extensível para evolução do algoritmo

---

## Tecnologias

| Tecnologia | Uso |
|---|---|
| Java 17+ | Linguagem principal — POO, encapsulamento, herança |
| Maven | Gerenciamento de dependências e build |
| IntelliJ IDEA | IDE de desenvolvimento |

---

## Estrutura do projeto

```
src/
├── model/       # Entidades: Card, Hand, Player, Board
├── service/     # Motor de decisão (DecisionEngine)
├── controller/  # Entrada de dados e fluxo da aplicação
└── util/        # Funções auxiliares e validações
```

---

## Exemplo de uso

**Entrada:**
```
Hole cards : A♠ K♦
Board      : Q♠ J♥ 2♣
Posição    : BTN (Button)
Stack      : 100bb
Pot        : 12bb  |  Bet a pagar: 6bb
```

**Saída:**
```
Ação recomendada : RAISE
Motivo           : Mão forte (gutshot + overcards) + posição favorável (BTN) + pot odds positivo
```

---

## Como executar

```bash
# 1. Clone o repositório
git clone https://github.com/tiagolm16/poker-helper.git

# 2. Acesse o diretório
cd poker-helper

# 3. Compile com Maven
mvn compile

# 4. Execute
mvn exec:java -Dexec.mainClass="com.pokerhelper.Main"
```

> Requisito: Java 17+ e Maven instalados. Recomendado abrir no IntelliJ IDEA.

---

## Roadmap

- [x] Modelagem das entidades (cartas, jogador, mão)
- [x] Estrutura modular em camadas
- [x] Motor de decisão inicial (Fold / Call / Raise)
- [ ] Aprimoramento do algoritmo GTO
- [ ] Interface gráfica (JavaFX)
- [ ] Simulação de múltiplos cenários
- [ ] Integração com base de estratégias reais

---

## Motivação

Este projeto aplica na prática conceitos de:

- Programação orientada a objetos e modelagem de domínio
- Lógica de decisão condicional sob múltiplas variáveis
- Estruturação de sistemas modulares e escaláveis
- Análise de risco/retorno — princípio central tanto em poker quanto em mercado financeiro

---

## Autor

**Tiago Lara Melo**  
Estudante de Engenharia de Software — IDP  
[linkedin.com/in/tiagolara16](https://linkedin.com/in/tiagolara16) · [github.com/tiagolm16](https://github.com/tiagolm16)

---

*Contribuições, sugestões e issues são bem-vindos.*
