# Contatos API

### O que é a aplicação?
  Uma api que mantém dados de Contatos (semelhante a uma agenda telefônica)
  - Tecnologias utilizadas:
    * MySQL
    * JDK 1.8
    * Maven 3
    * Spring Boot
    * JPA e Hibernate
    * Swagger

  - Funcionalidades da api:
    * Adicionar e Manter contato;
    * Adicionar e manter dados do contato;
    * Consultar Contatos
    * Cadastrar e manter telefone em um contato
    * Categorizar contatos
    * Permitir adicionar contatos em Grupos

### Instruções para executar o projeto
	Realize os passos a seguir:
	
	  1. No MySQL, crie o banco de dados "contatos_apirest" e, em seguida, execute o script "contatos_apirest.sql" para que 
	  sejam criadas e populadas as tabelas com dados iniciais;
      2. Verificar usuário e senha do banco de dados no arquivo "src/main/resources/application.properties" e alterar, 
      caso necessário;
      3. Importe o projeto para o Eclipse, através do caminho File->Import->Existing Maven Projects e aguarde o Maven 
      baixar as dependências;
      4. Abra o arquivo "ApiRestApplication.java" que está no package "com.contatos.apirest" em "src/main/java" e execute 
      como JavaApplication (por padrão, aplicação irá rodar na porta 8080, caso já esteja ocupada, adicionar uma nova linha 
      no arquivo "application.properties" com "server.port = xxxx", substituindo xxxx pelo número da porta disponível); 
      5. Acesse a documentação da api através da url: http://localhost:xxxx/swagger-ui.html (substituindo xxxx pelo número 
      da porta na qual a aplicação está rodando).
