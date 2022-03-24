#Observer Design Pattern

<strong>PT-BR</strong>
O Padrão de projeto Template Method permite-nos a possibilidade de que as subclasses alterem seus algoritimos(comportamentos) sem mudar a sua estrutura. Isto é, a partir de uma estrutura base, podemos alterar nossos comportamentos através de uma herança entre as classes filhas, na qual possuem formas diferentes de se fazer algo mas caracteristicas semelhantes.
Esse padrão de projeto nos permite substituir condicionais por polimorfismo, fora a relação das subclasses terem a possibilidade de alterar um comportamento especifico, sem duplicação de codigo, possibilitando hooks entre metodos genericos que ambas heranças poderão utilizar.
O Template Method é um excelente uso para algoritimos nas quais você possui comportamentos semelhantes mas é necessario alterar um trecho em especifico. Sendo assim podemos ter um Metodo que realiza as operacoes, quebrando esse metodo em varias outras pequenas operacoes que juntas, formam uma operacao ao todo, seja operacao1, operaca2, operacao3, e apenas modificar por herança e override, a operacao especifica do seu caso de uso.

Um bom exemplo é imaginar que nós temos um jogo de video-game, na qual devemos programar uma inteligencia artificial. Uma classe Base possui todos os metodos e ações de uma inteligencia artificial de um jogo, pois são extremamente genericos, mas, um monstro do tipo Orc e um monstro do tipo Dragão possuem skills e comportamentos um tanto diferente, portanto, neste caso faz sentido utilizar um padrão de projeto template method, com uma função start na qual carrega todos os modulos, funcoes, acoes necessarias, e atraves de herança, sobrescrever cada e tapa especifica.


<strong>EN</strong>

The Template Method Pattern allows us to design the subclasses to change their algorithms (behaviours) without changing their structure. That is, from a base of structure, we can change our behavior through an inheritance between the child classes, in which they have different ways of doing something with similar characteristics.
This pattern allows us to replace conditionals with polymorphism, a possibility of changing the subclasses of specific behavior, without code duplication, design of hooks that can be used between generic methods that both inheritances can use.
The Template Method is a great use where you have similar patterns but you need to change a specific snippet. Therefore, we can have a Method that performs the operations, breaking this method into several other small operations that together form an operation as a whole, be it operation1, operation2, operation3, and modify only by inheritance and override, the specific operation of your case of use.

A good example is to imagine that we have a video game, in which we must program an artificial intelligence. A Base class has all the methods and actions of a game's artificial intelligence, as they are extremely generic, but an Orc-type monster and a Dragon-type monster have somewhat different skills and behaviors, so in this case it makes sense to use a design pattern template method, with a start function which loads all necessary modules, functions, actions, and through inheritance, overrides each and specific tap.

### Caso de uso (USE CASE)
![image](https://user-images.githubusercontent.com/50564121/159396382-8f95d717-c362-4608-bf3a-bf4ebfee34ad.png)

WIKI~ <br>
https://refactoring.guru/design-patterns/template-method
https://www.youtube.com/watch?v=-nSOKE4f2gA
