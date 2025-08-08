# 📚 CRUD Simples com Quarkus

Este é um projeto simples desenvolvido para **estudo e prática** com o framework [Quarkus](https://quarkus.io/).  
O objetivo é conhecer a estrutura, configuração e funcionamento do Quarkus, explorando a criação de um **CRUD (Create, Read, Update, Delete)** básico.

---

## 🚀 Tecnologias utilizadas

- **Java 17**
- **Quarkus**
- **Hibernate ORM** com **Panache**
- **RESTEasy Reactive** (para criação da API REST)
- **MySQL** 
- **Maven**

---

## 📌 Funcionalidades

- Criar novo registro
- Listar todos os registros
- Buscar registro por ID
- Atualizar registro existente
- Deletar registro

---

## 📂 Estrutura do Projeto
```
src/
├── main/
│ ├── java/... # Código fonte da aplicação
│ ├── resources/
│ │ ├── application.properties # Configurações do Quarkus
│ │ └── META-INF/
│ │ └── import.sql # Dados iniciais (opcional)
└── test/
└── java/... # Testes automatizados
```

---

## ⚙️ Configuração e Execução

### 1️⃣ Pré-requisitos
- **Java 17+** instalado
- **Maven** instalado
- (Opcional) **Docker** se for usar banco externo

---

### 2️⃣ Clonar o repositório
```bash
git clone https://github.com/seu-usuario/seu-repo.git
cd seu-repo
```
```
./mvnw quarkus:dev
```
A aplicação ficará disponível em:
👉 http://localhost:8080

4️⃣ Testar os endpoints
Criar um novo registro
```
POST /users
Content-Type: application/json

{
  "name": "João Silva",
  "email": "joao@email.com"
}
```

Listar todos os registros
```bash
GET /users
```
Buscar por Id
```
GET /users/{id}
```
Atualizar registro
```
PUT /users/{id}
Content-Type: application/json

{
  "name": "João Santos",
  "email": "joaosantos@email.com"
}
```
Deletar registro
```
DELETE /users/{id}
```
🧪 Rodar os testes
```bash
./mvnw test
```
📄 Licença
Este projeto é apenas para fins de estudo e não possui licença específica.

💡 Observações
Este projeto foi criado como parte dos meus estudos em Quarkus, para conhecer sua estrutura e funcionamento, com foco no desenvolvimento de APIs REST simples.
