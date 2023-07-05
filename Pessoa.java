public abstract class Pessoa {
    /* Atributos */
    private String nome;
    private int idade;
    private String sexo;

    /* metodo principal */

    public static void main(String[] args) {

        /* instanciação/criação de objetos */

        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();

        /* Atribuição de valores aos metodos set e get */
        /* Visitante */
        v1.setNome("Juvenal");
        v1.setIdade(35);
        v1.setSexo("Masculino");
        v1.cadastraVisitante();

        /* Aluno */
        a1.setNome("Cauã");
        a1.setIdade(23);
        a1.setSexo("Masculino");
        a1.setCurso("Informática");
        a1.setMatricula(233456);
        a1.cadastrarAluno();
        a1.pagarMensalidade();

        /* bolsista */
        b1.setNome("Caike");
        b1.setIdade(14);
        b1.setSexo("Masc");
        b1.setCurso("Adm");
        b1.setBolsa(200);
        b1.setMatricula(11112);
        b1.cadastrarBolsista();
        b1.pagarMensalidade();

    }

    /* getters e setters */

    public void setNome(String n) {

        this.nome = n;
    }

    public String getNome() {

        return this.nome;
    }

    public void setIdade(int i) {

        this.idade = i;
    }

    public int getIdade() {

        return this.idade;
    }

    public void setSexo(String s) {

        this.sexo = s;
    }

    public String getSexo() {

        return this.sexo;
    }

    /* metodos */
    public int fazerAniversario(int idade) {

        this.idade = this.idade + 1;

        return this.idade;

    }

}