## Como rodar?

### Rodar o projeto por meio do arquivo JAR que nós geramos
Entre na pasta t1 <br>
Entre na pasta la-lexico

Insira no arquivo **entrada.txt** o conteúdo que o analisador léxico vai ler.

(Opcional) Você pode escolher compilar o projeto do zero ou não (Nós já compilamos e deixamos o arquivo JAR do projeto pronto aqui no GitHub)
```
mvn clean
mvn generate-sources
mvn package
```

No terminal, execute:
```
java -jar ./target/la-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar entrada.txt saida.txt
```
Pronto, o resultado gerado pelo analisador léxico estará no arquivo saida.txt dentro da pasta la-lexico.


## Rodando o corretor automático
Com terminal aberto na pasta correcaoAutomatica insira no terminal: <br>
```
java -jar compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar "java -jar ../la-lexico/target/la-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar" gcc temp casos-de-teste "colocar os ra's dos participantes aqui" t1
```







