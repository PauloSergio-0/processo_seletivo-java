package edu.paulo.challengeprocessoseletivo;
import java.util.ArrayList;

class SalarioValidator {
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
        if(this.nomes.size() >0){
            System.out.println("\nCanditos aprovados:");

            for(String candidato: this.nomes){
                System.out.println(candidato);
            }
        }
    }

}
