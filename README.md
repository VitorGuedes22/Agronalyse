# Agronalyse

Agronalyse é um sistema desenvolvido para persistência e análise de dados de produção rural, idealizado como projeto da disciplina Técnicas de Programação 1 (UnB). O objetivo é oferecer uma ferramenta simples para gerenciamento de informações de fazendas, animais, plantações e estoques, facilitando o acompanhamento e a tomada de decisões no ambiente agrícola.

## Descrição Geral

O sistema foi projetado para uso em ambientes desktop Windows e Linux, utilizando **Java** como linguagem principal, e **Swing** para a interface gráfica. Não utiliza banco de dados relacional; os dados são persistidos em arquivos `.dat`, tornando a solução leve e fácil de executar sem dependências externas.

## Funcionalidades

- **Cadastro e visualização de fazendas, terrenos, plantações, animais (gado, galinha, porco), e estoques**
- **Análises gráficas** dos dados cadastrados para avaliações de rendimento.
- **Exportação de dados** visualizados em analises geradas pelo sistema.
- **Interface intuitiva** com telas de cadastro, edição e consulta dos dados como painel de controle.

## Estrutura do Projeto

- `src/Classes/`: Classes de domínio (Animal, Fazenda, Estoque, Plantacao, Terreno, Funcionario, etc.)
- `src/Telas/`: Interfaces graficas para interação com o usuario.
- `src/Imagens/`: Recursos visuais utilizados na interface
- Arquivo de relatório detalhado: `Relatório Final Projeto- TP1 - Agronalyze.pdf`

## Tecnologias Utilizadas

- **Java 8+**
- **Swing** (GUI)
- **Lib:** jfreechart
- **Apache Ant**
- **Persistência em arquivos `.dat`**
- **Organização orientada a objetos**

## Como Executar

1. Certifique-se de ter o Java instalado em sua máquina.
2. Compile os arquivos `.java` presentes em `src/`.
3. Execute a classe principal (`Index.java`) para iniciar o sistema.

## Público-Alvo

O Agronalyse é voltado para estudantes, professores e profissionais do setor agrícola que desejam uma solução simples para gerenciamento de dados rurais, sem necessidade de infraestrutura complexa.

## Observações

- O projeto é acadêmico e visa práticar conceitos de **POO** em **JAVA**. Portanto, ser expandido para uso profissional com integração a bancos de dados e melhorias na interface.
- Para detalhes técnicos e fluxos do sistema, consulte o relatório em PDF incluído no projeto.
- O projeto **UML** das classes implementadas podem ser encontradas em [link](https://drive.google.com/file/d/14qsWehHHLDfWuVDU5wzYcRMvv7haoHqN/view?usp=sharing)

---
