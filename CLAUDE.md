# RPG Terminal

Jogo de RPG rodando no terminal. Java 21 + Maven, sem dependências externas.

---

## Regra nº 1 — não escreva o código por mim

Este projeto existe para eu **aprender POO em Java**, não para ficar pronto rápido.
Um repositório pronto que eu não sei explicar em entrevista não vale nada.

- **Não implemente** métodos ou classes inteiras sem eu pedir explicitamente.
- Quando eu colar código, **revise**: aponte bugs, nomes imprecisos, responsabilidade vazando entre classes.
- Quando eu travar, dê a **direção e o conceito**, não a solução pronta.
- Se eu pedir "escreve isso pra mim", pergunte antes se é isso mesmo que eu quero.
- **Exceção:** boilerplate óbvio (getters, `pom.xml`, `.gitignore`, `toString`) pode escrever direto.

Se eu ficar mais de 40 minutos travado em algo, sugira a saída mais simples que funcione — feio e entregue vale mais que bonito e parado.

---

## Convenções

- Pacote base: `com.felipe.rpg`
- **Código em inglês** — classes, métodos, variáveis
- **Comentários e textos do jogo em português**
- Um único `Scanner(System.in)`, centralizado em `ui/Terminal`
- Atributos `private`; setters `protected` só quando subclasse precisa
- Commits: Conventional Commits — `feat:`, `fix:`, `chore:`, `docs:`
- Branches: `feature/`, `fix/`, `chore/`
- Git sempre por linha de comando

---

## Arquitetura

```
com.felipe.rpg
├── engine/     CombatEngine, GameEngine, MapEngine
├── entities/   Entity (abstract)
│   ├── player/ Player, Warrior, Mage
│   └── enemy/  Enemy, Goblin, Dragon
├── items/      Item (interface), Weapon, Potion
├── quest/      Quest, QuestManager
├── ui/         Terminal
└── Main
```

**Divisão de responsabilidade que deve ser respeitada:**

- `Entity` e subclasses guardam **estado**. Não calculam regra de combate.
- `CombatEngine` calcula dano, defesa e turnos. É onde a fórmula vive.
- `Terminal` é o único lugar que lê e imprime. Classes de domínio não dão `System.out.println`.

Se uma sugestão sua quebrar essa divisão, avise antes.

---

## Escopo travado até 03/08/2026

Não sugerir e não implementar:

- Interface gráfica ou biblioteca de cores no terminal
- Banco de dados para o save (é arquivo texto)
- Testes automatizados
- Padrões de projeto (Factory, Strategy, Observer)
- Multiplayer, loja, economia, árvore de habilidades

Se eu pedir algo dessa lista, me lembre que o escopo está travado e pergunte se eu quero mesmo reabrir.

---

## Plano do sprint

@docs/plano-rpg-terminal.md

O plano usa nomes em português (`Personagem`, `Inimigo`). **A nomenclatura real do repositório é em inglês e prevalece** — o plano vale pela sequência de dias e pelos conceitos, não pelos nomes.

---

## Estado atual

- [x] **Dia 1** — `Entity` abstrata, `Warrior`, `Mage`
- [ ] **Dia 2** — `Enemy`, `CombatEngine`, combate por turnos
- [ ] **Dia 3** — XP e progressão de nível
- [ ] **Dia 4** — `Item`, inventário, exceção customizada
- [ ] **Dia 5** — `MapEngine`, salas navegáveis
- [ ] **Dia 6** — `Quest`, `QuestManager`, boss Dragon
- [ ] **Dia 7** — save/load, README, entrega

Manter esta lista atualizada. É a primeira coisa que você deve conferir ao iniciar a sessão.

---

## Pendências conhecidas

- `Entity` ainda não tem método abstrato — falta declarar `specialAbility(Entity target)`
- README do GitHub promete funcionalidades que ainda não existem; corrigir no Dia 7
