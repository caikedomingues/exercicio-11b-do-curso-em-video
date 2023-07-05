public class Visitante extends Pessoa {

    /*
     * vamos criar um método para impressão dos dados de visitante, sendo
     * assim, acredito que essa classe não possua mais herança pobre
     */

    public void cadastraVisitante() {

        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
    }

}