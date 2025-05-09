/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 *
 * @author Sergio
 */
public class LeituraXml {
    public static void main(String[] args) {
        try {
            File xmlFile = new File("dados.xml");

            // Preparar o parser
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            
            NodeList rows = doc.getElementsByTagName("row");

            double menor = Double.MAX_VALUE;
            double maior = Double.MIN_VALUE;
            double soma = 0;
            int diasValidos = 0;

            double[] valores = new double[rows.getLength()];

            // Primeiro laço: calcula menor, maior, soma
            for (int i = 0; i < rows.getLength(); i++) {
                Element row = (Element) rows.item(i);
                double valor = Double.parseDouble(row.getElementsByTagName("valor").item(0).getTextContent());

                valores[i] = valor;

                if (valor > 0) {
                    if (valor < menor) menor = valor;
                    if (valor > maior) maior = valor;
                    soma += valor;
                    diasValidos++;
                }
            }

            double media = soma / diasValidos;

            // Segundo laço: conta dias com faturamento acima da média
            int acimaDaMedia = 0;
            for (double valor : valores) {
                if (valor > media) {
                    acimaDaMedia++;
                }
            }

            // Resultados
            System.out.printf("Menor faturamento: R$%.2f\n", menor);
            System.out.printf("Maior faturamento: R$%.2f\n", maior);
            System.out.printf("Dias acima da média: %d\n", acimaDaMedia);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
