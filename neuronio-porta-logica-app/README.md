# Neurônio Porta Lógica

Implementação do neurônio de Minsky (1969) aplicado como porta lógica.

Vale ressaltar que o primeiro neurônio postulado é o Neurônio de McCulloch & Pitts (1943) que difere-se deste pela ausência dos pesos sinápticos. Outro detalhe importante, conforme Minsky (1969), este modelo resolve as portas OR e AND, mas não resolve a XOR pois esta última porta representa um problema de solução não linear.

![Plano Cartesiano](https://github.com/computeiro/inteligencia-artificial/blob/main/readme-files/plano_resolucao_neuronio.png)

Assuma que as entradas são as coordenadas dos pontos (x<sub>1</sub> = x, x<sub>2</sub> = y)

Repare que a tabela verdade de OR é refletida pelos pontos A, B e C. A reta "s" separa os pontos que representa a solução do ponto D que não faz parte.
Já a porta AND, só terá sinal ativo (valor 1) se ambas as entradas forem ativas (valor 1) é representada pela reta "t", que também consegue separar o ponto B que representa a solução dos demais A, C e D.

Considerando que o XOR teria como solução B e D, não é possível traçar uma reta em que de um lado fique B e D e doutro A e C. O que caracteriza um problema não linear. A solução de problemas não lineares requer uma rede com mais neurônios.

*Para Usar* você pode baixar o jar e clicar no arquivo, creio que já será inicializado pelo Java da sua máquina, se preferir use a linha de comando :

`java -jar neuronio-porta-logica-app-0.1.jar`

Você também pode efetuar checkout do projeto, ele não possui dependências e irá rodar sem nenhum problemas na sua IDE, o projeto inicial é para o Eclipse.

# Sobre a aplicação

![AppPortaLogica](https://github.com/computeiro/inteligencia-artificial/blob/main/readme-files/neuronio-porta-logica-app.png)

Ao executar aplicação, insira os valores da tabela verdade (na parte inferior) e clique em treinar rede, note que os pesos serão atualizados e será possível inserir x<sub>1</sub> e x<sub>2</sub> e avaliar a saída. A imagem \ref{AppPortaLogica} ilustra o estado da aplicação ao ter preenchido a tabela verdade com os valores da tabela OR e realizado o treino da rede.

*Observação:* É um exemplo simplista de um neurônio artificial e ponto didático para entender a evolução das técnicas de Rede Neurais Artificiais. Fausset (1994) explana muito bem esta trajetória, chegando aos Perceptron Multicamadas com aprendizado utilizando o algoritmo de Backpropagation.


## Referências

Fausett, L. (1994). "Fundamental of neural networks"

Marvin, Minsky, and A. Papert Seymour (1969). "Perceptrons."

McCulloch, W. S., & Pitts, W. (1943). "A logical calculus of the ideas immanent in nervous activity". The bulletin of mathematical biophysics, 5(4), 115-133.
