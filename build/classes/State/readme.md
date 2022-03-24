#State Design Pattern (Behavioral)

<strong>PT-BR</strong>
O padrão de projeto State tem como objetivo alterar o comportamento de um objeto quando seu estado interno muda, em tempo de execução, como se mudasse de classe. É importante lembrar que as transições são finitas.
Um exemplo de caso de uso é os smartphones atuais. Nas quais possuem diversos botões que se comportam de acordo com o seu estado atual.

Um smartphone quando está desbloqueado, os seus respectivos botões podem diminuir o volume, aumentar, ou bloquear o celular.

Um Smartphone quando está bloqueado, pode realizar chamadas de emergencia para (superior) policia, inferior (bombeiros), desbloquear pela digital, neste caso podemos usar um state para alterar o seu comportamento de acordo com o seu estado. Bloqueado, desbloqueado.

<strong>EN</strong>
The State design pattern aims to change the behavior of an object when its internal state changes, at runtime, as if it changed its class. It is important to remember that transitions are finite.
An example of a use case is today's smartphones. In which they have several buttons that behave according to their current state.

A smartphone when it is unlocked, its respective buttons can decrease the volume, increase, or lock the cell phone.

When a Smartphone is locked, it can make emergency calls to (superior) police, inferior (firefighters), unlock by fingerprint, in this case we can use a state to change its behavior according to its state. Locked, unlocked.

### Caso de uso (USE CASE)

![image](https://user-images.githubusercontent.com/50564121/159825341-8aac4ea7-01b8-46c7-8fe7-567abc8667fc.png)


WIKI~
* https://refactoring.guru/design-patterns/state
* https://www.youtube.com/watch?v=abX4xzaAsoc



