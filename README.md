# Projeto Java Spring API REST

Este projeto é uma API REST desenvolvida com **Java 17** e **Spring Boot**, que realiza operações CRUD de usuários e departamentos utilizando banco de dados H2 em memória.

---

## 📦 Tecnologias Utilizadas

- Java 17
- Spring Boot 3
- Spring Web
- Spring Data JPA
- H2 Database (console embutido)
- Maven

---

## 🔧 Como Executar o Projeto Localmente

### 1. Clonar o repositório

```bash
git clone https://github.com/Luizguni/Projeto_Java_Spring_API_REST.git
cd Projeto_Java_Spring_API_REST
```

### 2. Compilar e rodar o projeto

```bash
./mvnw spring-boot:run
```

### 3. Acessar endpoints e console

- API: http://localhost:8080/users
- H2 Console: http://localhost:8080/h2-console
  - JDBC URL: `jdbc:h2:mem:testdb`
  - User: `sa`
  - Senha: *(em branco)*

---

## 📌 Endpoints da API

### `GET /users`
Lista todos os usuários.

### `GET /users/{id}`
Busca um usuário pelo ID.

### `POST /users`
Cria um novo usuário. Exemplo de payload:

```json
{
  "name": "Guni",
  "email": "luizguny@gmail.com",
  "department": {
    "id": 2
  }
}
```

---

## 📁 Estrutura de Diretórios

```
com.devguni.userdept
├── controllers
│   └── UserController.java
├── entities
│   ├── Department.java
│   └── User.java
├── repositories
│   ├── DepartmentRepository.java
│   └── UserRepository.java
└── UserdeptApplication.java
```

---

## 📄 .gitignore

```gitignore
# Java
*.class

# Maven
/target/
!.mvn/wrapper/maven-wrapper.jar

# IDEs
.idea/
*.iml
.vscode/

# Sistema operacional
.DS_Store
Thumbs.db

# Banco H2
*.h2.db
*.mv.db
```

---

## 📘 Documentação OpenAPI (Swagger)

Você pode adicionar Swagger ao seu projeto com as seguintes dependências:

```xml
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.2.0</version>
</dependency>
```

E acessar via: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

---

## ⚙️ GitHub Actions (CI)

Você pode adicionar o seguinte workflow em `.github/workflows/build.yml`:

```yaml
name: Java CI

on: [push]

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
    - uses: actions/checkout@v3
    - name: Set up JDK 17
      uses: actions/setup-java@v3
      with:
        java-version: '17'
        distribution: 'temurin'

    - name: Build with Maven
      run: mvn clean install
```

---

## 📃 Licença

Este projeto está sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.

---

## ✍️ Autor

Desenvolvido por **Luiz Guni** – [LinkedIn](https://www.linkedin.com/in/luizguni/)  
Sinta-se livre para entrar em contato e contribuir!