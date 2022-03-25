#Strategy Design Pattern (Behavioral)

<strong>PT-BR</strong>
O Padrão de projeto Strategy permite que tenha-mos estrategias diferentes para lidar com uma determinada situação variante, isso permite a nossa regra de negocio seja separada de acordo com as suas variações. Um caso bem utilizado é em por exemplo, carrinho de compras, ou fretes, imagine então que de acordo com uma determinada rota, tenhamos que aplicar um algoritimo de Grafos diferente de acordo com essa variante, assim, encapsulamos a regra de negocio a fim de ter uma estrategia diferente. O strategy é muito semelhante do State e do Bridge, mas ainda assim é o mais utilizado dentre os três, note que o diagrama de UML é quase identico ao de State e Bridge, ela também permite trocar o algoritimo em tempo de execução, mas note que a mudança não é no "comportamento" e sim na estrategia utilizada, portanto, tenha cuidado ao confundir o uso de um strategy com um state, o foco do strategy é o encapsulamente do seu algoritimo para a sua regra de negocio.

É importante mencionar que a aplicação do Strategy colabora fortemente para o SRP - Single Responsability Principle do SOLID.

<strong>EN</strong>
The Strategy Pattern allows us to have different strategic designs to deal with a given and varying situation, this allows our separate trading rule according to its variations. A good used is, for example, a shopping cart, or freight, imagine that according to a given route, we have to apply a different graph algorithm according to this variant, thus, we encapsulate the trading rule in order to have a different strategy. The strategy is very similar to State and Bridge, but it is still the most used of the three, note that the UML diagram is almost identical to State and Bridge, it can also switch or algorithm at runtime, but note that the change is not in any "behavior" but in the strategy used, so be careful when combining the use of a strategy with a state, the focus of the strategy is the encapsulation of your algorithm for your trading rule.

It is important to mention that the application of the strategy is mainly for the SRP - Single Responsibility Principle of SOLID.

### Caso de uso (USE CASE)
![image](https://user-images.githubusercontent.com/50564121/160024604-b2c2e38b-821b-4109-8ad5-c4b08d6889c5.png)


WIKI~ <br>
* https://www.youtube.com/watch?v=mUagTgSnriQ
* https://www.youtube.com/watch?v=rC296hM-S4g
* https://refactoring.guru/design-patterns/strategy