# Intensivo de Java Spring
## Objetivo
Relembrar e adquirir novos conhecimentos importantes de Java, POO, Spring Boot e entre outros.

### O que estou aprendendo durante o curso
- **Construção de um projeto Java com Spring Boot**
- **Back end web e API Rest**
- **Padrão desenvolvimento em camadas**
- **ORM (Object Relational Mapping)**
  - Técnica que permite aos desenvolvedores de Java trabalhar com objetos e classes Java em vez de escrever consultas SQL manualmente. Ex:
   ```java
  @Entity  // Comando ORM para identificar uma entidade/coluna
  @Table(name = "tb_game")  // Altera o nome da classe no banco de dados
  public class Game {
    @Id  // Define um atributo identificador
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Gera valor de chave única
    private Long id;
    private String title;
  }
   ```
- **Implementar modelo de domínio**
- **Acessar banco de dados**
- **Implementar lógica de negócio**
- **Aplicação prática de estruturas de dados**
- **Boas práticas e padrões**
- **Preparar ambiente local com Docker e Docker Compose**
- **Configurando ambiente Maven**
- E muito mais
