public class Professor {
    private String nomeProfessor;
    private String emailProfessor;
    private String formacao;

    public Professor (String nomeProfessor, String emailProfessor, String formacao){
        this.nomeProfessor = nomeProfessor;
        this.emailProfessor = emailProfessor;
        this.formacao = formacao;
    
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getEmailProfessor() {
        return emailProfessor;
    }

    public void setEmailProfessor(String emailProfessor) {
        this.emailProfessor = emailProfessor;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }  
}