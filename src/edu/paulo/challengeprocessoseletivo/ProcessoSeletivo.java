package edu.paulo.challengeprocessoseletivo;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        double[] salarioCandidato = {2000,500.98,400.21,1236.90, 6000.21,900.90,299};
        String[] nomesCandidatos = {"Allan", "Will", "Joeo", "Rilson","Mickey", "Boston", "willys"};

        candidatoValidator validadorCandidato = new candidatoValidator();

        validadorCandidato.ValidarSalario(salarioCandidato,nomesCandidatos);

        validadorCandidato.candidatosAprovados();

        validadorCandidato.ligarCandidato("Allan");
    }
}