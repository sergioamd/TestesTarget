/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Sergio
 */
public class LeituraJson {
    
    public static void main(String[] args) {
        try {
            // Lê o conteúdo do arquivo JSON
            String jsonContent = new String(Files.readAllBytes(Paths.get("dados.json")));
            JSONArray dados = new JSONArray(jsonContent);

            double menor = Double.MAX_VALUE;
            double maior = Double.MIN_VALUE;
            double soma = 0;
            int diasValidos = 0;

            // Primeiro laço: calcula menor, maior e soma
            for (int i = 0; i < dados.length(); i++) {
                JSONObject dia = dados.getJSONObject(i);
                double valor = dia.getDouble("valor");

                if (valor > 0) {
                    if (valor < menor){
                         menor = valor;
                    } 
                      
                    if (valor > maior){
                         maior = valor; 
                    } 
                      
                    soma += valor;
                    diasValidos++;
                }
            }

            double media = soma / diasValidos;

            // Segundo laço: conta dias com faturamento acima da média
            int acimaDaMedia = 0;
            for (int i = 0; i < dados.length(); i++) {
                double valor = dados.getJSONObject(i).getDouble("valor");
                if (valor > media) {
                    acimaDaMedia++;
                }
            }

            // Resultados
            System.out.printf("Menor faturamento: R$ %.2f\n", menor);
            System.out.printf("Maior faturamento: R$ %.2f\n", maior);
            System.out.printf("Dias acima da média %d\n", acimaDaMedia);
              //Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
