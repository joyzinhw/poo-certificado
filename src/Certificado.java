public class Certificado{

    private String nomeAlu;
    private String nomeCur;
    private String nivel;
    private int ch;
    private Professor professor;



    /**
     * @param nomeAlu
     * @param nomeCur
     * @param nivel
     * @param ch
     * @param p1
     */
    public Certificado(String nomeAlu, String nomeCur, String nivel, int ch, Professor p1) {
        this.nomeAlu = nomeAlu;
        this.nomeCur = nomeCur;
        this.nivel = nivel;
        this.ch = ch;
        this.professor = p1;
    }

    public String getNomeAlu() {
        return nomeAlu;
    }

    public void setNomeAluno(String nomeAlu) {
        this.nomeAlu = nomeAlu;
    }

    public String getNomeCur() {
        return nomeCur;
    }
    public void setNomeCur(String nomeCur) {
        this.nomeCur = nomeCur;
    }
    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }   
}
