package edu.paulo.challengeprocessoseletivo;
import java.util.ArrayList;
import java.util.Random;

class candidatoValidator {
    double salario = 2000.0;
    ArrayList<String> nomes= new ArrayList<>(); 

    public void ValidarSalario(double[] salarioPretendido, String[] listaCandidato){

        if(salarioPretendido.length != listaCandidato.length){
            System.out.println("Listas com tamanhos diferentes");
            return;
        }

        for(int i=0; i < salarioPretendido.length; i++){
            if (this.nomes.size() ==5) {
                System.out.println("Máximo de candidatos aceitos fim da seleção");
                return;
            }

            if(salarioPretendido[i] < this.salario){
                System.out.println("ligar para candidato: "+ listaCandidato[i]);
                nomes.add(listaCandidato[i]);

            } else if (salarioPretendido[i] == this.salario && listaCandidato.length != 5){
                System.out.println("Ligar para os demais, candidato: "+listaCandidato[i]);
                nomes.add(listaCandidato[i]);
            
            } else if (salarioPretendido[i] > this.salario){
                System.out.println("Aguardar o resultado dos demais, candidato: "+ listaCandidato[i]);
            }}
    }

    public void candidatosAprovados(){
        if(!this.nomes.isEmpty()){
            System.out.println("\nCanditos aprovados:");

            for(String candidato: this.nomes){
                System.out.println(candidato);
            }
        }

    }

    static boolean atenderTelefone(){
        return new Random().nextInt(3)==1;
    } 

    public void ligarCandidato(String candidato){
        int tentativa = 1;
        Boolean atendeu= false;
        boolean ligarNovamente;

        do{
            atendeu = atenderTelefone();
            ligarNovamente = !atendeu;

            if (ligarNovamente){
                tentativa++;
            } else{
                System.out.println("ligação concluída com sucesso: "+ candidato);
            }
        } while(atendeu && tentativa < 3);


        if (atendeu){
            System.out.println("O candidato atendeu");
        }else{
            System.out.println();
            System.out.println("O candidato não atendeu");
        }
    }

}
