#Singleton Design Pattern (Creational)

<strong>PT-BR</strong>
O Padrão de projeto Singleton é muito utilizado quando se tem a necessidade de criar uma variavel global e de instancia unica, sendo assim, um excelente uso para variaveis nas quais precisamos controllar o seu numero de instancias, mantendo-a de forma unica, e transformando-a em uma variavel global, em outras palavras, instancias de banco de dados, instancias de classes de configuracoes, logs, multiplas threads, um bom exemplo para uso cotidiano é que um padrão de projeto facade pode em muitos casos se tornar um singleton, pois na maioria das vezes teremos apenas uma unica instancia, uma classe Controller, também pode ser implementada com o uso do singleton. Por mais que pareça ter implementacoes limitadas, um bom uso do singleton é em um relacionamento muitos para muitos entre por exemplo produto, venda e produtos_venda, na qual através de um singleton podemos implementar de forma unica.

Para implementarmos, basta fechar a sua instancia (definindo seu construtor como privado) e criar um metodo estatico na qual retorna a instancia caso exista, ou crie uma nova, caso não tenha.

Bom.. os exemplos do mundo real são... os mencionados anteriormente, instancias de banco, classes de conexão, classe de log.

<strong>EN</strong>
Singleton's is widely used when there is a need to create a global variable and a single-instance project, thus, it is an excellent use for which you need to control the number of instances, keeping the unique form, and changing it into a singleton. global variable, in other words database instances, configuration class instances, logs, multiple threads, a good example for everyday use is that a facade design pattern can in many cases become a singleton, as in most sometimes we will only have a Controller instance, it can also be a Controller class, using the singleton. For example, through many products implemented and implemented through many implementations limited in a relationship of many products, sale of products_sale, in the quality only.

To implement it, just close your instance (setting your constructor as private) and create a static method in which Returns the instance if it exists, or calls a new one if it doesn't.

Well... the real world examples are... the ones mentioned before, database instances, connection classes, log class.

### Caso de uso (USE CASE)

![image](https://user-images.githubusercontent.com/50564121/159832431-adf0a366-98fb-4f6d-a942-1a9a692d7fd3.png)



WIKI~
* https://refactoring.guru/design-patterns/singleton



