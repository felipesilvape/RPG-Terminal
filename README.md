\# ⚔️ RPG Terminal



Um jogo de RPG rodando inteiramente no terminal, desenvolvido em Java com foco em boas práticas de \*\*Orientação a Objetos\*\*. O projeto cobre herança, polimorfismo, abstração, encapsulamento, interfaces, generics, collections, exceptions, streams, records e persistência de dados.



\---



\## 🎮 Funcionalidades



\- Escolha de classe: \*\*Warrior\*\* ou \*\*Mage\*\*, cada uma com atributos e habilidade única

\- Sistema de combate por turnos com cálculo de dano e defesa

\- Sistema de XP e progressão de nível com aumento de atributos

\- Inventário de itens (armas, poções)

\- Mapa navegável por texto com inimigos, tesouros e NPCs

\- Sistema de quests com rastreamento de progresso

\- Boss final: \*\*Dragon\*\*

\- Salvar e carregar progresso em arquivo



\---



\## 🛠️ Tecnologias



\- Java 21

\- Maven

\- IntelliJ IDEA



\---



\## 📁 Estrutura do Projeto



```

rpg-terminal/

└── src/main/java/com/felipe/rpg/

&#x20;   ├── Main.java

&#x20;   ├── engine/

&#x20;   │   ├── GameEngine.java       ← loop principal do jogo

&#x20;   │   ├── MapEngine.java        ← navegação pelo mapa

&#x20;   │   └── CombatEngine.java     ← lógica de batalha por turnos

&#x20;   ├── entities/

&#x20;   │   ├── Entity.java           ← classe base abstrata

&#x20;   │   ├── player/

&#x20;   │   │   ├── Player.java       ← classe abstrata com XP e mana

&#x20;   │   │   ├── Warrior.java      ← habilidade: Golpe Brutal (dano duplo)

&#x20;   │   │   └── Mage.java         ← habilidade: Bola de Fogo (ignora defesa)

&#x20;   │   └── enemy/

&#x20;   │       ├── Enemy.java        ← inimigo base com XP reward e loot

&#x20;   │       ├── Goblin.java       ← inimigo comum, fraco

&#x20;   │       └── Dragon.java       ← boss final

&#x20;   ├── items/

&#x20;   │   ├── Item.java

&#x20;   │   ├── Weapon.java

&#x20;   │   └── Potion.java

&#x20;   ├── quest/

&#x20;   │   ├── Quest.java

&#x20;   │   └── QuestManager.java

&#x20;   └── ui/

&#x20;       └── Terminal.java         ← formatação e output no console

```



\---



\## 🚀 Como Rodar



\### Pré-requisitos



\- \[JDK 21](https://adoptium.net/)

\- \[Maven](https://maven.apache.org/)



\### Passos



```bash

\# Clone o repositório

git clone https://github.com/seu-usuario/rpg-terminal.git



\# Entre na pasta

cd rpg-terminal



\# Compile o projeto

mvn compile



\# Execute

mvn exec:java -Dexec.mainClass="com.felipe.rpg.Main"

```



\---



\## 🎲 Como Jogar



Ao iniciar, você escolhe sua classe:



```

Escolha sua classe:

\[1] Warrior — Alto HP e defesa, habilidade de dano duplo

\[2] Mage    — Alto ataque e mana, habilidade que ignora defesa

```



Navegue pelo mapa com comandos de texto:



```

> norte | sul | leste | oeste

```



Ao encontrar um inimigo, o combate inicia automaticamente:



```

\[BATALHA] Goblin selvagem apareceu!

─────────────────────────────────

❤ Aragorn:  120/120 HP | Mana: 50/50

💀 Goblin:   30/30  HP

─────────────────────────────────

> O que fazer?

&#x20; \[1] Atacar

&#x20; \[2] Usar habilidade (Golpe Brutal)

&#x20; \[3] Usar poção

&#x20; \[4] Fugir

```



\---



\## 🗺️ Legenda do Mapa



| Símbolo | Significado |

|---|---|

| `@` | Jogador |

| `.` | Campo livre |

| `#` | Parede / montanha |

| `E` | Inimigo |

| `T` | Tesouro |

| `Q` | NPC de quest |

| `B` | Boss |



\---



\## 📊 Classes de Personagem



| Atributo | Warrior | Mage |

|---|---|---|

| HP | 120 | 80 |

| Ataque | 15 | 20 |

| Defesa | 10 | 5 |

| Mana | 50 | 100 |

| Habilidade | Golpe Brutal (2x dano) | Bola de Fogo (ignora defesa) |



\---



\## 🧱 Conceitos OOP Aplicados



| Conceito | Onde aparece |

|---|---|

| Herança | `Warrior`/`Mage` → `Player` → `Entity` |

| Polimorfismo | `CombatEngine` recebe `Entity`, age diferente por tipo |

| Abstração | `Entity` e `Player` são classes abstratas |

| Encapsulamento | HP só é alterado via `takeDamage()` e `heal()` |

| Interfaces | `Attackable`, `Skillable` |

| Generics | `Inventory<T extends Item>` |

| Collections | `List`, `Map`, `Queue`, `Set` no inventário e quests |

| Exceptions | `InvalidMoveException`, `InsufficientManaException` |

| Streams + Lambda | Filtros de inventário, busca de quests |

| Optional | Drop de loot e busca de itens |

| Enums | `PlayerClass`, `QuestStatus`, `Direction`, `ItemType` |

| Records | `Position(x, y)`, `DamageResult`, `LootDrop` |

| IO / Files | Salvar e carregar progresso em arquivo |

| java.time | Timestamp do save e tempo de sessão |



\---



\## 🗺️ Roadmap



\- \[x] Classes base — `Entity`, `Player`, `Warrior`, `Mage`

\- \[x] Inimigos — `Enemy`, `Goblin`, `Dragon`

\- \[ ] Sistema de inventário e itens

\- \[ ] `CombatEngine` completo

\- \[ ] Mapa navegável

\- \[ ] Sistema de quests

\- \[ ] Persistência de dados (save/load)

\- \[ ] Boss final



