# Sistema Locadora de Fitas - RetroFlix

## Persistência de Dados com Nitrite

Este projeto implementa um sistema de locadora de fitas (VHS, DVD e Streaming) com persistência de dados utilizando o banco de dados Nitrite.

## Dependências

O projeto utiliza Maven com as seguintes dependências:

- **Nitrite Database 3.4.4**: Banco de dados NoSQL embutido
- **SLF4J Simple 1.7.32**: Logger para o Nitrite

## Estrutura do Banco de Dados

O arquivo `locadora.db` é criado automaticamente e armazena:

- **Clientes**: Informações de cadastro dos clientes
- **Mídias**: DVDs, Fitas VHS e Streaming
- **Locações**: Histórico completo de locações

## Como Executar

### Opção 1: Usando Maven (via WSL)

1. Compile o projeto:
```bash
wsl bash -c "cd '/mnt/c/Users/Windows/OneDrive/Documentos/GitHub/Atividade-28-10' && mvn clean compile"
```

2. Execute a aplicação:
```bash
wsl bash -c "cd '/mnt/c/Users/Windows/OneDrive/Documentos/GitHub/Atividade-28-10' && mvn exec:java -Dexec.mainClass='Main'"
```

### Opção 2: Executar direto do target

Após compilar, você também pode executar o JAR gerado:
```bash
java -cp "target/classes;target/dependency/*" Main
```

**Observação**: O arquivo `locadora.db` será criado automaticamente na primeira execução e conterá todos os dados persistidos.

## Funcionalidades

- ✅ Cadastro de mídias (VHS, DVD, Streaming)
- ✅ Cadastro de clientes
- ✅ Locação de mídias
- ✅ Devolução de mídias
- ✅ Histórico de locações
- ✅ Total arrecadado
- ✅ **Persistência automática de todos os dados**

## Arquitetura

- `DatabaseManager.java`: Gerencia a conexão e os repositórios do Nitrite
- `GerenciadorLocadora.java`: Lógica de negócio com persistência integrada
- Classes de modelo: Cliente, Midia, DVD, FitaVHS, Streaming, Locacao

Todos os dados são salvos automaticamente no banco e carregados na inicialização do sistema.
