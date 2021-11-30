package br.com.delllead.main;

import br.com.delllead.personagem.*;

import java.util.Scanner;

public class TestGame {

    private static  Boolean movimentoValido = false;

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        System.out.printf("1 - Bárbaro\n2 - Feiticeiro\n3 - Guerreiro\n4 - Mago\nEscolha seu personagem: ");
        int escolhaPersonagem = sc.nextInt();
        Personagem personagemEscolhido = escolherPersonagem(escolhaPersonagem);
        System.out.println("Personagem escolhido: " + personagemEscolhido.getClass().getSimpleName());

        sb.append("1 - Andar para\n2 - Andar para trás\n3 - Pular para cima\n4 - Pular para frente\n5 - Pular para trás\n");
        sb.append("6 - Socar\n7 - chutar\n8 - Soltar golpe especial\n");
        System.out.printf(sb.toString());
        Integer escolhaMovimento = null;

        do {
            System.out.print("Escolha o movimento: ");
            escolhaMovimento = sc.nextInt();
            jogada(personagemEscolhido, escolhaMovimento);
        }while (movimentoValido);

        System.out.println();
        System.out.println("Personagem escolhido: " + personagemEscolhido.getClass().getSimpleName());
        System.out.print("Movimento: ");

        if (escolhaMovimento != null) {
            jogada(personagemEscolhido, escolhaMovimento);
        }
        sc.close();
    }

    public static void jogada(Personagem personagem, int jogada) {
        movimentoValido = false;
        switch (jogada) {
            case 0:
                personagem.andarParaFrente();
                break;
            case 1:
                personagem.andarParaTras();
                break;
            case 2:
                personagem.abaixar();
                break;
            case 3:
                personagem.pularParaCima();
                break;
            case 4:
                personagem.pularParaFrente();
                break;
            case 5:
                personagem.pularParaTras();
                break;
            case 6:
                personagem.socar();
                break;
            case 7:
                personagem.chutar();
                break;
            case 8:
                personagem.soltarGolpeEspecial();
                break;
            default:
                System.out.println("Movimento inválido!");
                movimentoValido = true;
        }
    }

    public static Personagem escolherPersonagem(int escolha) {

        switch (escolha) {
            case 1:
                return new Barbaro();
            case 2:
                return new Feiticeiro();
            case 3:
                return new Guerreiro();
            case 4:
                return new Mago();
            default:
                System.out.println("Opção inválida!");
                return null;
        }
    }
}
