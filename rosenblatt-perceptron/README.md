
O conceito de redes neurais como máquinas computacionais foi introduzido por McCulloch & Pitts (1943). Em 1949, Donald Hebb postula a primeira regra de treinamento para um neurônio e em 1958, com base nestes estudos, Frank Rosenblatt (ROSENBLATT, 1958) apresenta o primeiro modelo de neurônio com aprendizado supervisionado, conhecido como o perceptron de  Rosenblatt. (Haykin 2007)

Outro detalhe importante, conforme Minsky (1969), este modelo resolve as portas OR e AND, mas não resolve a XOR pois esta última porta representa um problema de solução não linear.

## Como executar a aplicação
O projeto está devidamente configurado para o Eclipse, mas você pode executar a aplicação através apenas do "rosenblatt-perceptron.jar", baixando e clicando duas vezes no arquivo ou através da linha de comando `java -jar rosenblatt-perceptron.jar`
Observação: Para executar o jar você precisa de um JVM instalada.


## Sobre a Aplicação
Este projeto implementa o Percetpron de Rosenblatt, sendo possível visulizar a matriz de pesos.

Para compreender o projeto e sua dídática, considere a imagem a seguir

![PerceptronRosenblatt](https://github.com/computeiro/inteligencia-artificial/blob/main/~readme-files/perceptron-rosenblatt.png)

Nela temos a Tabela verdade preenchida para reconhecer o caracter "A", note que os pesos já estão calibrdos pois após definir a tabela verdade o botão "Treinar" já foi apertado. Por fim, veja que a amostra selecionada para teste foi o "A" e note que a saída é "1", isso por que o botão "Calcular saída" já foi apertado.

É possível ativar/desativar os quadrados que forma a letra, desta maneira você consegue compreender até que ponto de distorção o neurônio é resiliente.


## Referências

HAYKIN, S (2007). "Redes neurais: princípios e prática". 2. ed. São Paulo: Bookman

MINSKY, M.; PAPERT, S (1969). "Perceptrons: An Introduction to Computational Geometry". M.I.T. Press.

MCCULLOCH, W. S.; PITTS, W (1943). "A logical calculus of the ideas immanent in nervous activity".The Bulletin of Mathematical Biophysics

ROSENBLATT, F. (1958) "The perceptron: a probabilistic model for information storage and organization in the brain".

