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
public class InverterString {
    
    public static void main(String[] args) {
        String original = "Target Sistemas"; // String pré-definida
        String invertida = "";

        // Percorre a string do final para o início
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }

        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }
}

/*
1. String original = "OpenAI";
Aqui estamos definindo a string original que queremos inverter.

2. String invertida = "";
Criamos uma string vazia chamada invertida, onde vamos construir a string ao contrário.

3. for (int i = original.length() - 1; i >= 0; i--)
Este for percorre a string original de trás para frente, ou seja:

original.length() - 1 pega o último caractere.

i >= 0 garante que vamos até o primeiro caractere.

i-- faz com que o índice vá diminuindo a cada passo.

4. invertida += original.charAt(i);
Aqui estamos dizendo:

Pegue o caractere da posição i da string original e adicione no final da string invertida.

Por exemplo:

original = "OpenAI"

Iterações:

i=5 → I → invertida = "I"

i=4 → A → invertida = "IA"

i=3 → n → invertida = "IAn"

i=2 → e → invertida = "IAne"

i=1 → p → invertida = "IAnep"

i=0 → O → invertida = "IAnepO"

5. System.out.println(...)
Apenas imprime os resultados na tela.


*/