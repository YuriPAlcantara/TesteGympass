/*
Autor do script: Yuri F. Peleskei Alcantara 
Data inicio de criação 03/06/2019 
Hora de inicio de criação: 19:48hrs
Data final de criação: 07/06/2019
Hora de fim de criação: 17:22hrs
Versão 1.0
*/


package testegympass;

import java.util.Arrays;

public class Corrida {
    private String[][] logCorrida;    
    private String[][] gridChegada; 
    private String[][] voltaMassa;
    private String[][] voltaBarrichello;
    private String[][] voltaRaikkonen;
    private String[][] voltaWebber;
    private String[][] voltaAlonso;
    private String[][] voltaVettel;    
    
    public String qtdVoltasMassa = null;
    public String qtdVoltasBarrichello = null;
    public String qtdVoltasRaikkonen = null;
    public String qtdVoltasWebber = null;
    public String qtdVoltasAlonso = null;
    public String qtdVoltasVettel = null;
    public String minSegConc;
    public String codNomeMassa = null;
    public String codNomeBarrichello = null;
    public String codNomeRaikkonen = null;
    public String codNomeWebber = null;
    public String codNomeAlonso = null;
    public String codNomeVettel = null;

    public float tempTotalVoltasMassa = 0;
    public float tempTotalVoltasBarrichello = 0;
    public float tempTotalVoltasRaikkonen = 0;
    public float tempTotalVoltasWebber = 0;
    public float tempTotalVoltasAlonso = 0;
    public float tempTotalVoltasVettel = 0;
    public float tempVolta;    
    public float melhorVoltaMassa;
    

        

    public String[][] getLogCorrida() {return logCorrida;}

    public void setLogCorrida(String[][] logCorrida) {
        for (String[] logCorrida1 : logCorrida) {
        }
        this.logCorrida = logCorrida;
    }

    public String[][] getVoltaMassa() {return voltaMassa;}
    public void setVoltaMassa(String[][] voltaMassa) {
        voltaMassa = new String[logCorrida.length][logCorrida.length]; //Instanciando uma Matriz do mesmo tamanho da logCorrida
        
        //Verificando se a linha tem o nome do piloto se sim realiza a atribuição das linhas para a matriz do piloto
        for(int x = 0; x < logCorrida.length; x++){
            for(int y = 0; y < logCorrida[x].length; y++){ 
                if("038 – F.MASSA".equals(logCorrida[x][1])){ // Verificando se a array tem a informação "038 – F.MASSA" na 2ª casa
                    voltaMassa[x][y] = logCorrida[x][y]; //Se a linha tiver "038 – F.MASSA" então a matriz voltaMassa[][] recebe logCorrida
                }
            }
        }
        
        // As cassas do Array não null vai realizar a quebra de string, concatenar e transformar em float
        for (String[] voltaMassa1 : voltaMassa) {
            for (int y = 0; y < 1; y++) {
                if (voltaMassa1[y] != null) { //Vervificando casas não null                    
                    String convertString = voltaMassa1[3]; //Passando para uma String
                    String minSeg[] = convertString.split(":"); //Quebrando String
                    minSegConc = minSeg[0]+minSeg[1]; //Concatenando a String
                    tempVolta = Float.parseFloat(minSegConc); // Transformando em Float
                    tempTotalVoltasMassa += tempVolta; //Somando o Total de Tempo de Volta
                    qtdVoltasMassa = voltaMassa1[2]; //Recebendo a Quantidade de Voltas realizadas
                    codNomeMassa = voltaMassa1[1]; //Recebendo o código e nome do piloto
                }
            }
        }
        
    }

    public String[][] getVoltaBarrichello() {return voltaBarrichello;}
    
    public void setVoltaBarrichello(String[][] voltaBarrichello) {
        voltaBarrichello = new String[logCorrida.length][logCorrida.length]; //Instanciando uma Matriz do mesmo tamanho da logCorrida
        
        //Verificando se a linha tem o nome do piloto se sim realiza a atribuição das linhas para a matriz do piloto
        for(int x = 0; x < logCorrida.length; x++){ 
            for(int y = 0; y < logCorrida[x].length; y++){ 
                if("033 – R.BARRICHELLO".equals(logCorrida[x][1])){ // Verificando se a array tem a informação "033 – R.BARRICHELLO" na 2ª casa
                    voltaBarrichello[x][y] = logCorrida[x][y]; //Se a linha tiver "033 – R.BARRICHELLO" então a matriz voltaBarrichello[][] recebe logCorrida
                }
            }
        }
        
        // As cassas da matriz não null vai realizar a quebra de string, concatenar e transformar em float        
        for (String[] voltaBarrichello1 : voltaBarrichello) {
            for (int y = 0; y < 1; y++) {
                if (voltaBarrichello1[y] != null) { //Vervificando casas não null
                    String convertString = voltaBarrichello1[3];
                    String minSeg[] = convertString.split(":");
                    String minSegConcat = minSeg[0]+minSeg[1];
                    tempVolta = Float.parseFloat(minSegConcat);
                    tempTotalVoltasBarrichello += tempVolta; //Tempo total de corrida do Rubinho
                    qtdVoltasBarrichello = voltaBarrichello1[2]; //Total de voltas do Rubinho
                    codNomeBarrichello = voltaBarrichello1[1]; //Codigo e nome do Rubinho
                }
            }
        }
    }
    
    public String[][] getVoltaRaikkonen() {return voltaRaikkonen;}

    public void setVoltaRaikkonen(String[][] voltaRaikkonen) {
        voltaRaikkonen = new String[logCorrida.length][logCorrida.length]; //Instanciando uma Matriz do mesmo tamanho da logCorrida
        
        //Verificando se a linha tem o nome do piloto se sim realiza a atribuição das linhas para a matriz do piloto
        for(int x = 0; x < logCorrida.length; x++){ 
            for(int y = 0; y < logCorrida[x].length; y++){ 
                if("002 – K.RAIKKONEN".equals(logCorrida[x][1])){         
                    voltaRaikkonen[x][y] = logCorrida[x][y];
                }
            }
        }
        
        // As cassas do Array não null vai realizar a quebra de string, concatenar e transformar em float        
        for (String[] voltaRaikkonen1 : voltaRaikkonen) {
            for (int y = 0; y < 1; y++) {
                if (voltaRaikkonen1[y] != null) {
                    String convertString = voltaRaikkonen1[3];
                    String minSeg[] = convertString.split(":");
                    String minSegConcat = minSeg[0]+minSeg[1];
                    tempVolta = Float.parseFloat(minSegConcat);
                    tempTotalVoltasRaikkonen += tempVolta;
                    qtdVoltasRaikkonen = voltaRaikkonen1[2];
                    codNomeRaikkonen = voltaRaikkonen1[1];
                }
            }
        }
   }

    public String[][] getVoltaWebber() {return voltaWebber;}

    public void setVoltaWebber(String[][] voltaWebber) {
        voltaWebber = new String[logCorrida.length][logCorrida.length]; //Instanciando uma Matriz do mesmo tamanho da logCorrida
        
        //Verificando se a linha tem o nome do piloto se sim realiza a atribuição das linhas para a matriz do piloto
        for(int x = 0; x < logCorrida.length; x++){
            for(int y = 0; y < logCorrida[x].length; y++){
                if("023 – M.WEBBER".equals(logCorrida[x][1])){         
                    voltaWebber[x][y] = logCorrida[x][y];
                }
            }
        }
        
        // As cassas do Array não null vai realizar a quebra de string, concatenar e transformar em float
        for (String[] voltaWebber1 : voltaWebber) {
            for (int y = 0; y < 1; y++) {
                if (voltaWebber1[y] != null) {
                    String convertString = voltaWebber1[3];
                    String minSeg[] = convertString.split(":");
                    String minSegConcat = minSeg[0]+minSeg[1];
                    tempVolta = Float.parseFloat(minSegConcat);
                    tempTotalVoltasWebber += tempVolta;
                    qtdVoltasWebber = voltaWebber1[2];
                    codNomeWebber = voltaWebber1[1];
                }
            }
        }
    }

    public String[][] getVoltaAlonso() {return voltaAlonso;}

    public void setVoltaAlonso(String[][] voltaAlonso) {
        voltaAlonso = new String[logCorrida.length][logCorrida.length]; //Instanciando uma Matriz do mesmo tamanho da logCorrida
        
        //Verificando se a linha tem o nome do piloto se sim realiza a atribuição das linhas para a matriz do piloto
        for(int x = 0; x < logCorrida.length; x++){
            for(int y = 0; y < logCorrida[x].length; y++){
                if("015 – F.ALONSO".equals(logCorrida[x][1])){         
                    voltaAlonso[x][y] = logCorrida[x][y];
                }
            }
        }
        
        // As cassas do Array não null vai realizar a quebra de string, concatenar e transformar em float
        for (String[] voltaAlonso1 : voltaAlonso) {
            for (int y = 0; y < 1; y++) {
                if (voltaAlonso1[y] != null) {
                    String convertString = voltaAlonso1[3];
                    String minSeg[] = convertString.split(":");
                    String minSegConcat = minSeg[0]+minSeg[1];
                    tempVolta = Float.parseFloat(minSegConcat);
                    tempTotalVoltasAlonso += tempVolta;
                    qtdVoltasAlonso = voltaAlonso1[2];
                    codNomeAlonso = voltaAlonso1[1];
                }
            }
        }
    }

    public String[][] getVoltaVettel() {return voltaVettel;}

    public void setVoltaVettel(String[][] voltaVettel) {
        voltaVettel = new String[logCorrida.length][logCorrida.length]; //Instanciando uma Matriz do mesmo tamanho da logCorrida
        
        //Verificando se a linha tem o nome do piloto se sim realiza a atribuição das linhas para a matriz do piloto
        for(int x = 0; x < logCorrida.length; x++){
            for(int y = 0; y < logCorrida[x].length; y++){
                if("011 – S.VETTEL".equals(logCorrida[x][1])){         
                    voltaVettel[x][y] = logCorrida[x][y];
                }
            }
        }
        
        // As cassas do Array não null vai realizar a quebra de string, concatenar e transformar em float
        for (String[] voltaVettel1 : voltaVettel) {
            for (int y = 0; y < 1; y++) {
                if (voltaVettel1[y] != null) {
                    String convertString = voltaVettel1[3];
                    String minSeg[] = convertString.split(":");
                    String minSegConcat = minSeg[0]+minSeg[1];
                    tempVolta = Float.parseFloat(minSegConcat);
                    tempTotalVoltasVettel += tempVolta;
                    qtdVoltasVettel = voltaVettel1[2];
                    codNomeVettel = voltaVettel1[1];
                }
            }
        }
    }

    public String[][] getGridChegada() {return gridChegada;}

    public void setGridChegada(String[][] gridChegada) {
        
        //Convertendo variaveis float em variaveis String
        String tempTotalVoltasMassaS = " " + tempTotalVoltasMassa;
        String tempTotalVoltasBarrichelloS = " " + tempTotalVoltasBarrichello;
        String tempTotalVoltasRaikkonenS = " " + tempTotalVoltasRaikkonen;
        String tempTotalVoltasWebberS = " " + tempTotalVoltasWebber;
        String tempTotalVoltasAlonsoS = " " + tempTotalVoltasAlonso;
        String tempTotalVoltasVettelS = " " + tempTotalVoltasVettel;
        
        //Pegando as variaveis convertidas para Strings e atribuindo a uma array
        String[] arrayTotalTempVolta = {tempTotalVoltasMassaS, tempTotalVoltasBarrichelloS, tempTotalVoltasRaikkonenS, tempTotalVoltasWebberS, tempTotalVoltasAlonsoS, tempTotalVoltasVettelS};

        //Organizando as arrays por ordem crescente 
        Arrays.sort(arrayTotalTempVolta);
        
        //Atribuindo as variaveis Codigo Nome do Piloto, Quantidades de Voltas Dadas pelo piloto e o Tempo Total de Voltas Dadas pelo Piloto para uma matriz
        String[][] matrizArrayTotalTempVolta = {{codNomeMassa, qtdVoltasMassa, tempTotalVoltasMassaS},
                                                {codNomeBarrichello, qtdVoltasBarrichello, tempTotalVoltasBarrichelloS}, 
                                                {codNomeRaikkonen, qtdVoltasRaikkonen, tempTotalVoltasRaikkonenS}, 
                                                {codNomeWebber, qtdVoltasWebber, tempTotalVoltasWebberS}, 
                                                {codNomeAlonso, qtdVoltasAlonso, tempTotalVoltasAlonsoS}, 
                                                {codNomeVettel, qtdVoltasVettel, tempTotalVoltasVettelS}};
        
        
        System.out.println("                    \"Grid de Chegada\"                    ");
        System.out.println();
        
        //Verificando se a variavel contida da array organizada por ordem crescente é igual a variavel contida na matriz acima e se ele completou a 3ª volta
        for(int i = 0; i<1; i++){
            for(int j = 0; j<6; j++){
                if(arrayTotalTempVolta[j].equals(matrizArrayTotalTempVolta[i][2]) && !"3".equals(matrizArrayTotalTempVolta[i][1])){
                    System.out.println("Posição do Piloto: " + (j+1) +  "º |   Cod.Piloto - Nome Piloto: " + matrizArrayTotalTempVolta[i][0] +  " |   Quantidade de Voltas completada: " + matrizArrayTotalTempVolta[i][1] + "  |   Tempo Final: " + matrizArrayTotalTempVolta[i][2]);
                }
                
                if(arrayTotalTempVolta[j].equals(matrizArrayTotalTempVolta[1][2]) && !"3".equals(matrizArrayTotalTempVolta[1][1])){
                    System.out.println("Posição do Piloto: " + (j+1) +  "º |   Cod.Piloto - Nome Piloto: " + matrizArrayTotalTempVolta[1][0] +  " |   Quantidade de Voltas completada: " + matrizArrayTotalTempVolta[1][1] + "  |   Tempo Final: " + matrizArrayTotalTempVolta[1][2]);
                }
                
                if(arrayTotalTempVolta[j].equals(matrizArrayTotalTempVolta[2][2]) && !"3".equals(matrizArrayTotalTempVolta[2][1])){
                    System.out.println("Posição do Piloto: " + (j+1) +  "º |   Cod.Piloto - Nome Piloto: " + matrizArrayTotalTempVolta[2][0] +  " |   Quantidade de Voltas completada: " + matrizArrayTotalTempVolta[2][1] + "  |   Tempo Final: " + matrizArrayTotalTempVolta[2][2]);
                }
                
                if(arrayTotalTempVolta[j].equals(matrizArrayTotalTempVolta[3][2]) && !"3".equals(matrizArrayTotalTempVolta[3][1])){
                    System.out.println("Posição do Piloto: " + (j+1) +  "º |   Cod.Piloto - Nome Piloto: " + matrizArrayTotalTempVolta[3][0] +  " |   Quantidade de Voltas completada: " + matrizArrayTotalTempVolta[3][1] + "  |   Tempo Final: " + matrizArrayTotalTempVolta[3][2]);
                }
                
                if(arrayTotalTempVolta[j].equals(matrizArrayTotalTempVolta[4][2]) && !"3".equals(matrizArrayTotalTempVolta[4][1])){
                    System.out.println("Posição do Piloto: " + (j+1) +  "º |   Cod.Piloto - Nome Piloto: " + matrizArrayTotalTempVolta[4][0] +  " |   Quantidade de Voltas completada: " + matrizArrayTotalTempVolta[4][1] + "  |   Tempo Final: " + matrizArrayTotalTempVolta[4][2]);
                }
                
                if(arrayTotalTempVolta[j].equals(matrizArrayTotalTempVolta[5][2]) && !"3".equals(matrizArrayTotalTempVolta[5][1])){
                    System.out.println("Posição do Piloto: " + (j+1) +  "º |   Cod.Piloto - Nome Piloto: " + matrizArrayTotalTempVolta[5][0] +  " |   Quantidade de Voltas completada: " + matrizArrayTotalTempVolta[5][1] + "  |   Tempo Final: " + matrizArrayTotalTempVolta[5][2]);
                }
            }
        }
          System.out.println();
          System.out.println("==================================================================================================");
          System.out.println();
          

        //Verificando se o piloto completou as 3 voltas e não quebrou
        for (String[] matrizArrayTotalTempVolta1 : matrizArrayTotalTempVolta) {
            for (int j = 0; j<1; j++) {
                if ("3".equals(matrizArrayTotalTempVolta1[1]) || "2".equals(matrizArrayTotalTempVolta1[1]) || "1".equals(matrizArrayTotalTempVolta1[1])) {
                    System.out.println("O piloto " + matrizArrayTotalTempVolta1[0] + " quebrou na " + matrizArrayTotalTempVolta1[1] + "ª volta");
                }
            }
        }
    }
}
