## *Como Java Funciona*
o Java é uma linguagem de programação multiplataforma. Isso significa que ele pode ser escrito para um sistema 
operacional e executado em outro. Como isso é possível? O código Java é escrito primeiro em um Kit de Desenvolvimento 
Java, que está disponível para Windows, Linux e macOS. Os programadores escrevem na linguagem de programação Java, que
o kit traduz em código de computador que pode ser lido por qualquer dispositivo com o software certo. Isso é feito com
um software chamado compilador. Um compilador usa um código de computador de alto nível como Java e o converte em uma
linguagem que os sistemas operacionais entendem chamado código de bytes. O código de bites é então processado por um
interpretador chamado Máquina Virtual Java (JVM). As JVMs estão disponíveis para a maioria das plataformas de software
e hardware, e isso é o que permite que o código Java seja transferido de um dispositivo para outro. Para executar o
Java, os JVMs carregam o código, verificam-no e fornecem um ambiente de runtime.
>https://azure.microsoft.com/pt-br/resources/cloud-computing-dictionary/what-is-java-programming-language

## *Array*
Formas de iniciar um array:  
int[ ] numeros1 = new int[3];  
int[ ] numeros2 = {1,2,3,4,5};  
int[ ] numeros3 = new int [ ] {1,2,3,4,5};  


## *O que é um array em Java?*
Um array é uma estrutura de dados que armazena elementos de um mesmo tipo de forma contígua na memória. O índice do 
primeiro elemento é sempre 0, e o último elemento tem índice tamanho - 1.

### *Percorrendo um array com for*
for (int i = 0; i < numeros.length; i++) {
System.out.println(numeros[i]);  
}

### *Usando for-each para percorrer o array*
for (int num : numeros) {  
System.out.println(num);  
}

## *O que são Arrays Multidimensionais em Java?*
Arrays multidimensionais são estruturas de dados que permitem armazenar elementos organizados em mais de uma dimensão. 
Isso significa que, em vez de ter uma única sequência de elementos (como em um array comum), você pode ter arrays dentro
de arrays.  

A sintaxe para declarar um array bidimensional em Java é:

tipo[ ][ ] nomeDoArray = new tipo [linhas] [colunas];  
int [ ][ ] ArrayMultidimensionais = new int [3][3];

### Cada elemento da matriz pode ser acessado através de dois índices, representando linha e coluna:

matriz[0][0] = 5;  
matriz[2][1] = 10;

## Introdução a Classes e Objetos em Java

### O que são Classes e Objetos?
*Classe:* É um molde que define as características (atributos) e comportamentos (métodos) de um objeto.

*Objeto:* É uma instância de uma classe, ou seja, uma entidade criada a partir da definição de uma classe.

## Coesão entre Métodos e Variáveis
A coesão é um princípio importante em programação orientada a objetos. Em Java, ela significa que os métodos e variáveis de uma classe devem estar fortemente relacionados entre si e com a responsabilidade da classe. Isso ajuda a tornar o código mais organizado e fácil de manter.

### Boas Práticas para Coesão  
Métodos devem ser responsáveis por uma única tarefa
Cada método deve realizar apenas uma tarefa específica, que se reflete nas variáveis que ele manipula.

Evitar atributos ou métodos que não têm relação com a responsabilidade da classe  
A classe Carro, por exemplo, não deve ter métodos ou atributos relacionados a outra coisa que não seja o comportamento ou as características de um carro.


## Referências a Objetos em Java
Em Java, os objetos são manipulados por meio de referências. Uma referência é simplesmente um ponteiro para a memória onde o objeto está armazenado. Vamos explorar como as referências funcionam, como passá-las como parâmetros e como compará-las.

### Como Funcionam as Referências em Java
Quando você cria um objeto, você não está realmente criando o objeto em si, mas sim uma referência para esse objeto. A variável que armazena essa referência não contém o objeto, mas sim o endereço de memória onde ele está alocado.
![img.png](img.png)
Quando criamos carro1, ele referencia um objeto Carro com o modelo "Corolla".

Depois, carro2 é atribuído a carro1, o que significa que ambas as variáveis apontam para o mesmo objeto.

Ao alterar o modelo de carro2, o modelo de carro1 também muda, pois ambos estão se referindo ao mesmo objeto na memória.

### Passagem de Objetos como Parâmetros
Quando você passa um objeto como parâmetro para um método, está passando a referência para esse objeto, não uma cópia dele.
![img_1.png](img_1.png)

O método alterarModelo() recebe um objeto Carro como parâmetro. Ele altera o atributo modelo do objeto passado como argumento.

Como o objeto é passado por referência, a alteração é refletida no objeto original.

## Definição de Métodos em Java
Métodos em Java são funções que pertencem a uma classe e são usados para definir o comportamento dos objetos dessa classe. Vamos explorar como criar e utilizar métodos, incluindo conceitos como retorno de valores, métodos sem retorno (void), e a sobrecarga de métodos.

### Criando e Utilizando Métodos  
Métodos são definidos dentro de uma classe e podem ser chamados para realizar ações ou retornar valores. Vamos criar um exemplo simples com um método que retorna um valor e outro que não retorna nada.

![img_2.png](img_2.png)

O método ligar() não tem retorno (é do tipo void) e apenas exibe uma mensagem na tela.

O método obterInformacoes() retorna uma String contendo as informações do carro.

No main, chamamos ambos os métodos, sendo um para imprimir uma mensagem e o outro para capturar o retorno e exibir.

### Sobrecarga de Métodos (Overloading)
Sobrecarga de métodos ocorre quando você cria múltiplos métodos com o mesmo nome, mas com diferentes parâmetros (tipo, número ou ordem de parâmetros). Isso permite que você tenha métodos que realizam ações semelhantes, mas com diferentes entradas.

![img_3.png](img_3.png)

Criamos dois métodos exibirInfo(), um que exibe apenas a marca e modelo, e outro que exibe também o ano.

Ambos os métodos têm o mesmo nome, mas o parâmetro ano faz a diferença.

## Modificadores de Acesso e Encapsulamento em Java
Os modificadores de acesso em Java controlam a visibilidade de classes, métodos e atributos. Eles são fundamentais para garantir o encapsulamento, que é o princípio de ocultar o estado interno de um objeto e permitir que ele seja acessado e modificado apenas por meio de métodos específicos. Vamos explorar os modificadores de acesso: public, private, protected e o modificador default.

### 1. public  
   O modificador public torna a classe, o método ou o atributo acessível de qualquer lugar, ou seja, em qualquer outra classe, independente de onde ela esteja no código.

### 2. private  
   O modificador private torna o método ou o atributo acessível apenas dentro da própria classe. Nenhuma outra classe pode acessar diretamente esses membros. Isso ajuda a proteger o estado interno do objeto.

### 3. protected  
   O modificador protected permite que o acesso seja feito dentro da própria classe, por subclasses e por outras classes no mesmo pacote. Isso é útil quando você está criando uma hierarquia de classes e deseja permitir o acesso aos membros de uma classe base nas classes derivadas.

### 4. Modificador Default (sem modificador)
   Quando você não especifica nenhum modificador de acesso, o Java considera que o modificador é o default (ou package-private), o que significa que o acesso é permitido apenas dentro do mesmo pacote.  
