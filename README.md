# projeto_calculadora_ui_ux

Calculadora Java com as quatro operações básicas (`+`, `-`, `*`, `/`), testes simples via `main` e documentação JavaDoc.

## Como rodar

```bash
javac -d out src/calculadora/*.java
java -cp out calculadora.TesteCalculadora
```

Para gerar o JavaDoc:

```bash
javadoc -d docs -sourcepath src -private calculadora
```

Depois, abra `docs/index.html` no navegador.

## Resultados

### Testes antes da refatoração

![Testes antes da refatoração](prints/testes-antes.png)

### Testes depois da refatoração

![Testes depois da refatoração](prints/testes-depois.png)

### JavaDoc

![JavaDoc](prints/javadoc.png)

## Branches

- [main](https://github.com/gabrielmarques23/projeto_calculadora_ui_ux/tree/main): calculadora e testes, sem a refatoração.
- [Refatoracao](https://github.com/gabrielmarques23/projeto_calculadora_ui_ux/tree/Refatoracao): inclui a extração do método `dividir()` e o JavaDoc gerado em `docs/`.
