#Facade Design Pattern

<strong>PT-BR</strong>
O Facade é um padrão de projeto estrutural, seu principal objetivo é o fornecimento de uma interface simples e unificada na qual possui um conjunto de classes mais complexas que interagem entre-si, fazendo-se com que reduza o acoplamento entre as classes.

Supondo que se tenha um sistema na qual você precise realizar varias etapas, varias chamadas de funções, varias declarações de diferentes classes, podemos dizer que o facade é a sua classe "faz tudo", já que ela vai servir entre a ligação de outras classes para realizar um determinado tipo de processamento.

Um exemplo do dia-dia, imagine que tenha um sistema de papelaria/grafica, na qual, um cliente chega e realiza a solicitação de uma impressão de uma folha A4, o processo é simples, o cliente faz um pedido, e grafica recebe o pagamento, em seguida, faz a solicitação de um produto (impressao da folha), a impressora, imprime a folha, e após a impressao, envia o pedido para o cliente.

nota: é claro que o codigo em si poderia ter feito de uma maneira mais profissional, pensando claramente em todas as regras de negocios estabelecidas e necessarias, acoplando o pagamento com a propria grafica, mas minha intenção é criar um diagrama UML e um exemplo em java mais simples possivel para que fique claro o objetivo do facade.

<strong>EN</strong>
Facade is a design pattern, its main objective is to provide a simple and unified interface, which has a simple and unified interface, which allows integration with each other, making it reduce the set of classes between classes.

Assuming that you have a system in which you will perform several steps, several function calls, several declarations of different classes, we can say that the facade is your class everything you need, since it will serve between the connection of other classes to perform a particular type of processing.

A day-to-day example, imagine a stationery/graphics system, in which the customer arrives and requests a print of an A4 sheet, the process is simple, the customer places an order, and the printer receives payment , then requests a product (printing the sheet), the printer prints the sheet, and after printing, sends the order to the customer.

note: of course the code itself could have done it in a more professional way, thinking clearly about all the established and necessary business rules, coupling the payment with the graphics itself, but my intention is to create a UML diagram and an example in java as simple as possible so that the purpose of the facade is clear.

### Caso de uso (USE CASE)
![image](https://user-images.githubusercontent.com/50564121/160044489-93349708-2f1e-4cbf-b0e6-2848979cf61b.png)


WIKI~ <br>
* https://www.youtube.com/watch?v=A7mNiaBACYs
* https://refactoring.guru/pt-br/design-patterns/facade
