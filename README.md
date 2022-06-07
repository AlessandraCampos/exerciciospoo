# exerciciospoo
Exercicios resolvidos de POO - Java

EXERCÍCIO 01
Programa que executa métodos realizados por veículo como acelerar , abastecer ,
frear , pintar,ligar , desligar . Estes métodos são descritos na classe abstrata na Interface
e implementada na classe Veiculo.
Ao criar um novo veiculo alguns atributos são necessários como :
marca, modelo, placa, cor e preco.

Ao acelerar verifica se o veiculo está ligado , em caso negativo
é informado ao usúario para ligar o veiculo.
Em caso positivo é verificado o nível de combustível,
caso seja menor ou igual a zero, o usuário é informado que não é possível acelerar e o veiculo é desligado.
Caso o nível de combustivel seja maior que zero porem menor que 3 litros o motorista
é informado que é necessário abastecer .
A velocidade é elevado para mais 10km
A quilometragem total é adicionada
O litros de Combustivel é reduzida em menos 3 litros.
Caso não atenda às duas condições acima , a quilometragem total é acrescida em 10,
Os litros de Combustivel é reduzida em menos 2 litros
A velocidade nao pode ser maior que 200 km/hr

Ao abastecer , é necessário que o veiculo esteja desligado e velocidade 0.
È verificada a condição se os litros de combustivel total esteja menos que 60 litros
caso contrario nao é possivel abastecer.

Ao frear é verificado se o carro esta ligado ou a velocidade já está em 0 caso contrario
é informado ao motorista , em caso do veiculo estar em movimento a velocidade é reduzida para -20.

No metodo pintar a cor informada no construtor é alterada para a cor atual.

No método ligar é verificado se o carro está ligado em caso positivo é informado ao motorista caso contrario o atributo isLigado é alterado para true.

No método desligar da mesma forma é verificado se o veiculo já se encontra desligado e se o carro está em movimento.
=========   =========================       ===================
EXERCICIO 02
Foram criados 3 pacotes com Interface com o método CalcularImposto.
O model com as classes de Livro, Loja ,Video Game e Produto (classe abstrata)
=========   =========================       ===================
EXERCÍCIO 03
A classe-mãe Personagem é extendida para as classes Mago e Guerreiro onde alguns
atributos são incluidos no construtor e ao aprender habilidade e magia é adicionada á suas respectivas listas.
=========   =========================       ===================
EXERCÍCIOS 04
Neste exercício foi inserida a collection Map- HashMap  para identificar qual é a pessoa com mais idade da lista
e se o nome Jéssica está na lista de pessoas
=========   =========================       ===================
EXERCÍCIOS 05
A classe-mãe Funcionário foi extendida para as classes Gerente , Supervisor , Vendedor com atributos de nome , idade e salario além do método bonificação que são sobrescritas em cada classe de acordo com seus respectivos cargos.
