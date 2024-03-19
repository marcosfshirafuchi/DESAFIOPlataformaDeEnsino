# DESAFIO: Plataforma de ensino
Você foi contratada(o) para criar um sistema de plataforma de ensino. Para isto você deve criar um
programa para ler os dados das aulas de um curso, e em seguida mostrar a duração total do curso, que é
a soma das durações de cada aula.<br><br>
Cada aula pode ser um conteúdo em vídeo, ou então uma tarefa. Os dados de cada aula são:<br>
Vídeo: título, url e duração em segundos<br>
Tarefa: título, descrição e quantidade de questões<br>
<p>
<a href="https://imgbb.com/"><img src="https://i.ibb.co/b2FPK9d/image-2024-03-19-T15-24-24-313-Z.png" alt="image-2024-03-19-T15-24-24-313-Z" border="0" align="right"></a>
<br> 
</p>
A duração (em segundos) de uma aula vídeo é a
própria duração do vídeo, e a duração de uma aula
tarefa é de cinco minutos por questão (exemplo: se a
tarefa possui 3 questões, então a duração da tarefa é
15 minutos).<br><br>
Você deve representar os dados conforme modelo ao
lado. O método duration() na classe Lesson é um
método abstrato que retorna a duração da aula.<br><br>
Você deve criar uma única lista do tipo
List<Lesson> para armazenar todas aulas. A
chamada do método duration() deve ser polimórfica.
<br><br>

EXEMPLO:<br>
Quantas aulas tem o curso? 3<br><br>
Dados da 1a aula:<br>
Conteúdo ou tarefa (c/t)? c<br>
Título: Orientação a objetos<br>
URL do vídeo: https://youtu.be/aBh<br>
Duração em segundos: 310<br><br>
Dados da 2a aula:<br>
Conteúdo ou tarefa (c/t)? c<br>
Título: Listas em Java<br>
URL do vídeo: https://youtu.be/e5a<br>
Duração em segundos: 250<br><br>
Dados da 3a aula:<br>
Conteúdo ou tarefa (c/t)? t<br>
Título: Exercício de fixação<br>
Descrição: Faça um programa que imprima uma lista<br>
Quantidade de questões: 2<br><br>
DURAÇÃO TOTAL DO CURSO = 1160 segundos
<br><br>
CRITÉRIOS DE AVALIAÇÃO (TODOS DEVEM ESTAR CORRETOS):<br>
1) Nomes de classes, atributos, métodos e argumentos respeitando o projeto, bem como as convenções
de nome para Java (classe com primeira letra maiúscula, e padrão "camel case" para atributos, variáveis
e métodos.<br>
2) Implementação correta da classe abstrata e das heranças com sobreposição do método abstrato.<br>
3) Programa principal contento apenas uma lista do tipo List<Lesson> para armazenar todas aulas.<br>
4) Comportamento do programa e resultado dos cálculos corretos.<br>
