public class Aluno extends Pessoa {

    /* Atributos */
    private String curso;
    private int matricula;

    /* getters e setters */

    public void setCurso(String c) {

        this.curso = c;
    }

    public String getCurso() {

        return this.curso;
    }

    public void setMatricula(int m) {

        this.matricula = m;
    }

    public int getMatricula() {

        return this.matricula;
    }

    /* metodo */
    public void cadastrarAluno() {

        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Curso: " + getCurso());
        System.out.println("Matricula: " + getMatricula());
    }

    public void pagarMensalidade() {

        /* Mensagem informando o pagamento */
        System.out.println("Pagando mensalidade do aluno " + getNome());
    }

}
