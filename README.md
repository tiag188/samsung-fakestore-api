
# Samsung Fake Store

Projeto dividido em duas aplicações:

- **API Backend**: Aplicação Spring Boot que fornece dados de produtos, usuários e carrinhos.
- **UI Frontend**: Aplicação web feita com PrimeFaces que consome a API para exibir a loja.

---

## Requisitos

Antes de começar, instale:

- [Java 17+ JDK](https://adoptium.net/)
- [Maven](https://maven.apache.org/install.html)
- Um editor/IDE para Java (IntelliJ IDEA, Eclipse, VSCode, etc)
- Navegador web moderno

---

## Rodando o Backend (API)

1. Abra o terminal.
2. Navegue até a pasta do backend:
   ```bash
   cd samsung-fakestore-api
   ```
3. Compile e rode a aplicação:
   ```bash
   mvn clean spring-boot:run
   ```
4. A API estará disponível em:
   ```
   http://localhost:8081
   ```
5. Teste acessando, por exemplo:
   ```
   http://localhost:8081/api/products
   ```

---

## Observações

- Sempre rode o backend antes do frontend.
- Se a porta 8081 (backend) ou 8080 (frontend) estiverem ocupadas, altere no arquivo `application.properties`.
- Use `Ctrl + C` para parar as aplicações no terminal.
- Para problemas de dependência, execute:
  ```bash
  mvn clean install
  ```

---

## Estrutura do projeto

```
samsung-fakestore-api/     # Backend Spring Boot
samsung-fakestore-ui/      # Frontend PrimeFaces
```
