#Observer

<strong>PT-BR</strong>
O Padrão de projeto Template Method permite-nos a possibilidade de que as subclasses alterem seus algoritimos(comportamentos) sem mudar a sua estrutura. Isto é, a partir de uma estrutura base, podemos alterar nossos comportamentos através de uma herança entre as classes filhas, na qual possuem formas diferentes de se fazer algo mas caracteristicas semelhantes.
Esse padrão de projeto nos permite substituir condicionais por polimorfismo, fora a relação das subclasses terem a possibilidade de alterar um comportamento especifico, sem duplicação de codigo, possibilitando hooks entre metodos genericos que ambas heranças poderão utilizar. 
O Template Method é um excelente uso para algoritimos nas quais você possui comportamentos semelhantes mas é necessario alterar um trecho em especifico. Sendo assim podemos ter um Metodo que realiza as operacoes, quebrando esse metodo em varias outras pequenas operacoes que juntas, formam uma operacao ao todo, seja operacao1, operaca2, operacao3, e apenas modificar por herança e override, a operacao especifica do seu caso de uso. 

Um bom exemplo é imaginar que nós temos 


<strong>EN</strong>

### Caso de uso (USE CASE)
![image](https://user-images.githubusercontent.com/50564121/159396382-8f95d717-c362-4608-bf3a-bf4ebfee34ad.png)


WIKI~
https://refactoring.guru/design-patterns/template-method </br>
https://www.youtube.com/watch?v=-nSOKE4f2gA
