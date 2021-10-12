package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.setAno(2021);
        carro1.setModelo("Com escada");
        carro1.setNome("Uno");

        carro2.setNome("Fusca");
        carro2.setModelo("Do carai");
        carro2.setAno(1972);

        //Apontam para o mesmo objeto
        //estudar quando posso fazer isso com polifomorfismo e em herença
        carro1 = carro2;

        System.out.println(carro1.getNome() + " " + carro1.getModelo() + " de " + carro1.getAno());
        System.out.println(carro2.getNome() + " " + carro2.getModelo() + " de " + carro2.getAno());
    }
}
