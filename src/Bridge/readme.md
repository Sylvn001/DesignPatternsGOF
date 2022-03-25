#Bridge Design Pattern

<strong>PT-BR</strong>
O Bridge é um padrão de projeto muito semelhante tanto ao Adapter tanto quanto o Strategy e State (em sua "estrutura", é semelhante, tirando a herança de dois lados), o Bridge é uma implementação muito mais complexa, usando abstração e herança entre as classes. O seu uso ocorre quando a abstração e implementação começam a crescer juntas, A INTENÇÃO do bBridge é desacoplar uma abstração de sua implementação, de modo que as duas possam variar e evoluir independentemente.

De acordo com o livro de GOF (pag 208) a diferença do Bridge para o Adapter é que o Adapter faz as classes funcionarem após elas terem sido projetadas, já o Bridge, faz funcionar antes que existam.

Quando se tem um codigo onde a abstração e a implementação podem crescer e variar de forma independente, use o padrão de projeto Bridge para deixar seu código organizavel, facil manutenção, etc..

Assim como Strategy e State, você pode trocar as implementações em tempo de execução.

Agora vamos para o exemplo real e o seu devido caso de uso -> Imagine que você precise criar um programa para renderizar diferentes formas pixeladas (um pincel, especificamente), pixelado, com vetor, borrado, e ainda precisamos definir a sua forma geometrica, se queremos de forma abstrata (linha), circulo, quadrado. Neste caso vamos ter a classe Renderer e a interface Shape, a "Line", "Circle", "Square" vão implementar a interface "Shape" e as classes especialistas do Renderer, irão herdar do mesmo. Assim, separamos a implementação da abstração,  de forma que possam crescer independentemente uma das outras.

<strong>EN</strong>


### Caso de uso (USE CASE)
![image](https://user-images.githubusercontent.com/50564121/160040119-fde36e1a-a434-4453-a237-ec92c85802cc.png)


WIKI~ <br>
* https://www.youtube.com/watch?v=eubM6uxnoUo
*