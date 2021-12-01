package br.com.delllead.personagem;

public abstract class Personagem {

    public void andarParaFrente(){
        System.out.println("Andar para frente");
    }
    public void andarParaTras(){
        System.out.println("Andar para tras");
    }
    public void abaixar(){
        System.out.println("Abaixar-se");
    }
    public void pularParaCima(){
        System.out.println("Pular para cima");
    }
    public void pularParaFrente(){
        System.out.println("Pular para frente");
    }
    public void pularParaTras(){
        System.out.println("Pular para trás");
    }
    public void socar(){
        System.out.println("Socar");
    }
    public void chutar(){
        System.out.println("Chutar");
    }
    public abstract void soltarGolpeEspecial();
}
