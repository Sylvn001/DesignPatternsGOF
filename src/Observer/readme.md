# Observer

<strong>PT-BR</strong> <br/>
O padrão de projeto observer é um padrão comportamental na qual nos permite definir um relacionamento um para muitos entre um observador(Observer, Subscriber) e um observado(Subject, Publisher), assim podemos notificar multiplos objetos que estão observando, esperando uma ação de acordo com um determinado evento do objeto observado. No exemplo a seguir criamos duas interfaces, a Subscriber e a Subject (Observer, Observable), o observador vai observar o observado. Isto é Queremos que o nosso observador espere uma ação do observado, para que então possamos saber sobre sua mudança de estado.

Neste exemplo, usamos um canal no youtube e seus inscritos, note que um canal possui muitos inscritos, toda vez que um canal faz um upload de um video, os respectivos inscritos que estão observando o canal, são notificados de acordo com essa atualização.

O observado, contem uma lista de observadores (Channel -> Subscribers) e o seu devido metodo notifSubscribers() na qual uma estrutura de repetição realiza o controle de cada subscription e os notificar que um novo video foi lançado a partir da realização de uma instrução de upload.

<strong>EN</strong> <br/>
The observer design pattern is a behavioral pattern which allows us to define a one-to-many relationship between an observer(Observer, Subscriber) and an observed(Subject, Publisher), so we can notify multiple objects that are observing, expecting an action accordingly. with a certain event of the observed object. In the following example we created two interfaces, the Subscriber and the Subject (Observer, Observable), the observer will observe the observed. This is We want our observer to expect an action from the observed, so that we can then know about its change of state.

In this example, we use a youtube channel and its subscribers, note that a channel has many subscribers, every time a channel uploads a video, the respective subscribers who are watching the channel are notified according to this update.

The observed contains a list of observers (Channel -> Subscribers) and its due method notifSubscribers() in which a repetition structure controls each subscription and notifies them that a new video has been launched after the execution of an upload instruction.



### Caso de uso (USE CASE)
![image](https://user-images.githubusercontent.com/50564121/159396382-8f95d717-c362-4608-bf3a-bf4ebfee34ad.png)


WIKI~
https://refactoring.guru/design-patterns/observer
https://www.youtube.com/watch?v=98DiwRp-KZk
