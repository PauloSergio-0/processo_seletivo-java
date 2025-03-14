package edu.paulo.challengeprocessoseletivo;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        double salarioCandidato = 2000;

        SalarioValidator validadorCandidato = new SalarioValidator();

        validadorCandidato.ValidarSalario(salarioCandidato);
    }
}