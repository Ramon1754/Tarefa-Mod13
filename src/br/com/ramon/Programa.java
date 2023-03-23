package br.com.ramon;

public class Programa {

    public static void main(String args[]) {
        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setCpf(String.valueOf(12));
        pessoa.setNome("Ramon");
        pessoa.setSobrenome("Silva");
        pessoa.setTamanho(1.7);
        System.out.println(pessoa.getNome() + " " + pessoa.getSobrenome() + " Tem " + pessoa.getTamanho() + "M");

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setCpf(String.valueOf(12));
        pessoaJuridica.setNome("Ricardo");
        pessoaJuridica.setSobrenome("Antonio");
        pessoaJuridica.setTamanho(1.56);
        System.out.println(pessoaJuridica.getNome() + " " + pessoaJuridica.getSobrenome() + " Tem " + pessoaJuridica.getTamanho() + " de altura.");


    }
}
