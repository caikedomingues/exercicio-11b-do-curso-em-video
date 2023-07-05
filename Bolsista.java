public class Bolsista extends Aluno {

    /* Atributo */
    private float bolsa;

    /* getter e setters */

    public void setBolsa(float b) {

        this.bolsa = b;
    }

    public float getBolsa() {

        return this.bolsa;
    }

    /* metodo */

    public void renovarBolsa() {

        System.out.println("Renovando a bolsa de " + getNome());
    }

    /* Serve para sobrepor um método */
    @Override
    public void pagarMensalidade() {

        System.out.println(getNome() + " é bolsista, pagamento facilitado");
    }

    public void cadastrarBolsista() {

        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Bolsa: " + getBolsa());
        System.out.println("Matricula: " + getMatricula());
    }

}
