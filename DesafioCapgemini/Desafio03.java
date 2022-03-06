/* Um texto precisa ser encriptado usando o seguinte esquema. Primeiro, os espaços são removidos do texto. Então, os caracteres são escritos em um grid, no qual as linhas e colunas tem as seguintes regras:
raiz quadrada do número de caracteres do texto. <=linha <=coluna <= raiz quadrada do número de caracteres do texto.
*Considere T, como o tamanho do texto.
*Se certifique de que linhas x colunas >= raiz quadrada de T
*Se multiplos grids satisfazem as condicoes, escolha aquele com menor area.  */
public class Desafio03 {
    public static void main(String[] args) {
	
		String s = "tenha um bom dia";

        String msgCriptografada = "";

        //remover espaços de uma string
        String stringSemEspaco = s.replaceAll("\\s+", "");

        int t = stringSemEspaco.length();

        //tamanho vertor 
        int linhaXColuna = (int) Math.sqrt(t);
		
        //matriz
        char[][] cripto = new char[linhaXColuna][linhaXColuna]; 

        int contador = 0;

        for (int i = 0; i < linhaXColuna; i++) {
            for (int j = 0; j < linhaXColuna; j++) {
                //limitar a posição dentro do intervalo
                if(contador >= t){
                    break;
                }
                cripto[i][j] = stringSemEspaco.charAt(contador);
                contador++;
            }
        }

        // montar mensagem criptografada
        for(int i = 0; i < linhaXColuna; i++) {
			for(int j = 0; j < linhaXColuna; j++) {
				if((j + 1) == linhaXColuna && (i + 1) == linhaXColuna) {
					break;
                    //validar espaço
				}else if(cripto[j][i] == '\u0000') {
					msgCriptografada += " ";
				}
				else {
					msgCriptografada += cripto[j][i]; 
				}
                // validar se é o ultimo item da lista
				if((j + 1) == linhaXColuna) {
					if(cripto[j][i] != '\u0000') {
						msgCriptografada += " ";
					}
				}
			}
		}
            System.out.println(msgCriptografada);
	}
    
}
