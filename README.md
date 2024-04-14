#### Uso do maven e geração do JAR
mvn clean -> Remove os conteúdos gerados na pasta target <br>
mvn generate-sources -> Gera os arquivos necessários para o programa antes da compilação, executa plugins, etc <br>
mvn package -> Compila o projeto e coloca na pasta target <br>
java -jar local-do-jar local-arquivo-entrada local-arquivo-saida -> Executa o programa <br>

#### Usando mvn exec para rodar o programa sem gerar jar
mvn exec:java -Dexec.mainClass="br.ufscar.dc.compiladores.la.lexico.Principal" -Dexec.args="local-arquivo-entrada local-arquivo-saida"






