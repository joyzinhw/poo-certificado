import java.time.LocalDate;

public class Aluno {
    private String nomeAluno;
    private LocalDate dataDeNascismento;
    private String emailAluno;

    public Aluno(String nomeAluno, LocalDate dataDeNascismento, String emailAluno) {
        this.nomeAluno = nomeAluno;
        this.dataDeNascismento = dataDeNascismento;
        this.emailAluno = emailAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public LocalDate getDataDeNascismento() {
        return dataDeNascismento;
    }

    public void setDataDeNascismento(LocalDate dataDeNascismento) {
        this.dataDeNascismento = dataDeNascismento;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }

}