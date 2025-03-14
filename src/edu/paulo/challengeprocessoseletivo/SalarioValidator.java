package edu.paulo.challengeprocessoseletivo;


class SalarioValidator {
    double salario = 2000.0;

    public void ValidarSalario(double  salarioPretendido){

        if(salarioPretendido < this.salario){
            System.out.println("ligar para candidato");
        } else if (salarioPretendido == this.salario){
            System.out.println("Ligar para os demais candidatos");
        } else if (salarioPretendido > this.salario){
            System.out.println("Aguardar o resultado dos demais candidatos");
        }
    }
}
