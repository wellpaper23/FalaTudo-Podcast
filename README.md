# 🎧 FalaTudo Podcast API

API REST do **FalaTudo Podcast**, uma plataforma de streaming focada em podcasts, mas com suporte a playlists e conteúdos musicais.

## 🚀 Tecnologias
- **Java 21**
- **Spring Boot:** Para criação da aplicação web e gerenciamento de dependências.
- **Spring Data JPA:** Para mapeamento objeto-relacional (ORM)
- **Flyway:** Para gerenciamento de migrações do banco de dados. 
- **H2 Database:** Banco de dados em memória para desenvolvimento e testes.
- **Maven:** Para build e gerenciamento de dependências do projeto.
- **Docker:** Para build externo do banco de dados
- **Git:** Controle de versão para gerenciamento de mudanças no código.
- **GitHub:** Hospedagem do repositório para controle de versão.
- **SQL:** Manipulação do banco de dados
 

## 📌 Funcionalidades previstas
- **Usuários & Administradores**
  - Cadastro, listagem, atualização e exclusão
  - Controle de permissões
- **Podcasts & Episódios**
  - Cadastro e gerenciamento
  - Organização por categorias
- **Playlists**
  - Criação, edição e remoção
  - Adição e remoção de faixas
- **Busca & Descoberta**
  - Pesquisa por título, autor ou categoria
- **Streaming**
  - (Futuro) Endpoints para servir conteúdo de áudio

## ▶️ Como executar
    ```
    1. Clone o repositório: https://github.com/wellpaper23/FalaTudo-Podcast.git
    2. Navegue até o diretório do projeto: cd FalaTudo-Podcast
    Construa o projeto: mvn clean install
    Execute a aplicação: mvn spring-boot:run
    Acesse a aplicação em http://localhost:8080
    ```
## ❗Observações
Eu ainda estou aprendendo e pesquisando mais, espero descobrir novas tecnologias e técnicas no processo, tambem aceitarei sempre sugestões de melhorias, tanto em código quanto em apresentações, muito obrigado!
