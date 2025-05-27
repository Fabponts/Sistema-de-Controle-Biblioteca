# 📚 Library Management System

Este é um sistema simples de controle de biblioteca desenvolvido em **Java** como parte de um projeto de estudo. Ele permite cadastrar livros, usuários e visualizar listas armazenadas em memória.

## 🚀 Funcionalidades

- Adicionar novos livros com título, autor e status
- Adicionar novos usuários
- Visualizar lista de livros
- Visualizar lista de usuários
- Sistema de menu interativo via console
- Remover livros e usuarios(Em desenvolvimento)
- Salvar os dados da lista
  
## 🛠 Tecnologias Utilizadas
### 💻 Linguagem:
- Java 8+

 ### 📂 Persistência de Dados:
- File I/O (Entrada e Saída com Arquivos)

### 🧱 Arquitetura / Organização:
-Separação em camadas (MVC simplificado)
src/ ├── entities/ │ ├── Book.java │ ├── BookStatus.java │ └── User.java ├── service/ │ └── Library.java └── program/ └── Main.java

### 📋 Boas práticas Java aplicadas:
- Exceptions personalizadas – UserException, BookException
- Validação de dados – através da classe LibraryRulesService, validando campos obrigatórios, formatos de strings, etc.
- Uso de enum – como BookStatus para representar estado do livro
- Uso de List<Book> e List<User> – coleção dinâmica de dados
- Try-catch com tratamento específico – para InputMismatchException, IllegalArgumentException, etc.
- Regular Expressions (String.matches()) – para validar nomes, autores, etc.

### 🔍 Outros conceitos Java aplicados:
- Encapsulamento com getters/setters
- Scanner – entrada de dados via console
- split(), trim(), toLowerCase() – manipulação de strings
- Controle de fluxo (for, switch, do-while)

✅ Status do Projeto
📌 Em desenvolvimento. Algumas funcionalidades ainda estão sendo implementadas e aprimoradas(A principal funçao do projeto é relembrar conceitos basicos).

👨‍💻 Autor
Desenvolvido por Fabricio Pontes.
