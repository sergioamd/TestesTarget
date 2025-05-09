/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

/**
 *
 * @author Sergio
 */
public class PercentualEstado {
    
    public static void main(String[] args) {
        // Faturamento por estado
        double SP = 67836.43;
        double RJ = 36678.66;
        double MG = 29229.88;
        double ES = 27165.48;
        double outros = 19849.53;

        // Cálculo do total
        double total = SP + RJ + MG + ES + outros;

        // Cálculo dos percentuais
        double porcSP = (SP / total) * 100;
        double porcRJ = (RJ / total) * 100;
        double porcMG = (MG / total) * 100;
        double porcES = (ES / total) * 100;
        double porcOutros = (outros / total) * 100;
        
        Double Total = porcSP + porcRJ + porcMG + porcES +porcOutros;

        // Exibição dos resultados
        System.out.println("Percentual de representação por estado:");
        System.out.printf("SP: ---------------- %.2f%%\n", porcSP);
        System.out.printf("RJ: ---------------- %.2f%%\n", porcRJ);
        System.out.printf("MG: ---------------- %.2f%%\n", porcMG);
        System.out.printf("ES: ---------------- %.2f%%\n", porcES);
        System.out.printf("Outros: ------------ %.2f%%\n", porcOutros);
        System.out.printf("Total : ------------ %.2f%%\n", Total);
        
    }
}
