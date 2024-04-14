/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.ufscar.dc.compiladores.la.lexico;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author vinij
 */
public class Principal {

    public static void main(String[] args) {
        
        try {
            String inputFile = args[0];
            String outputFile = args[1];

            CharStream cs = CharStreams.fromFileName(inputFile);
            LaLexer lexer = new LaLexer(cs);

            Token token = null;
            StringBuilder sb = new StringBuilder();

            // Lê conteúdo do arquivo de entrada enquanto não chegar no fim
            while ((token = lexer.nextToken()).getType() != Token.EOF) {
                String tokenString = "<"+"'"+token.getText()+"'"+","+lexer.VOCABULARY
                        .getDisplayName(token.getType())+">";
                sb.append(tokenString);
                sb.append(System.lineSeparator());    
            }

            // Escreve resultado dos tokens no arquivo de saída
            byte[] bytes = sb.toString().getBytes();
            FileOutputStream fo = new FileOutputStream(outputFile);
            fo.write(bytes);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }                
    }
}
