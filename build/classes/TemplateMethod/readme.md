#Observer

<strong>PT-BR</strong>
O Padrão de projeto Template Method permite-nos a possibilidade de que as subclasses alterem seus algoritimos(comportamentos) sem mudar a sua estrutura. Isto é, a partir de uma estrutura base, podemos alterar nossos comportamentos através de uma herança entre as classes filhas, na qual possuem formas diferentes de se fazer algo mas caracteristicas semelhantes.
Esse padrão de projeto nos permite substituir condicionais por polimorfismo, fora a relação das subclasses terem a possibilidade de alterar um comportamento especifico, sem duplicação de codigo, possibilitando hooks entre metodos genericos que ambas heranças poderão utilizar.
O Template Method é um excelente uso para algoritimos nas quais você possui comportamentos semelhantes mas é necessario alterar um trecho em especifico. Sendo assim podemos ter um Metodo que realiza as operacoes, quebrando esse metodo em varias outras pequenas operacoes que juntas, formam uma operacao ao todo, seja operacao1, operaca2, operacao3, e apenas modificar por herança e override, a operacao especifica do seu caso de uso.

Um bom exemplo é imaginar que nós temos um jogo, na qual podemos programar uma Inteligencia Artificial para cada monstro, neste caso usaremos um ORC e um Dragão como monstros. A IA (classe IAMonster) pode ser generica, tendo metodos e atributos nas quais podem ser reutilizadas sem necessariamente precisar copiar codigo. Para tornar generica e na forma que os passos especificos sejam alterados sem precisar utilizar novas condicionais ou reescrever todo o codigo


<strong>EN</strong>

### Caso de uso (USE CASE)
![image](https://user-images.githubusercontent.com/50564121/159568389-67ae1587-a4b9-44bc-aec9-08523c28508e.png)


WIKI~
https://refactoring.guru/design-patterns/template-method
https://www.youtube.com/watch?v=-nSOKE4f2gA