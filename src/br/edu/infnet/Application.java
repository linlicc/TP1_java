package br.edu.infnet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		List<Aluno> turma = new ArrayList<Aluno>();

		boolean executando = true;
		while (executando) {

			Scanner sc = new Scanner(System.in);
			System.out.println(" ---------- CADASTRO ----------");
			System.out.println("1 - Registrar um novo aluno:");
			System.out.println("2 - Consultar Boletins de um aluno:");
			System.out.println("3 - Consultar notas da turma:");
			System.out.println("4 - Sair:");

			int opcaoSelecionada = sc.nextInt();

			switch (opcaoSelecionada) {

			case (1):

				// cadastrar aluno

				System.out.println("Informe o nome do aluno");
				String nome = sc.next();

				System.out.println("Informe a matrícula do aluno");
				int matricula = sc.nextInt();
				Aluno novoAluno = new Aluno(nome, matricula);

				System.out.println("Informe a nota 1");
				Float nota1 = sc.nextFloat();
				novoAluno.cadastrarNota(nota1);

				System.out.println("Informe a nota 2");
				Float nota2 = sc.nextFloat();
				novoAluno.cadastrarNota(nota2);

				turma.add(novoAluno);

				break;

			case (2):

				System.out.println("Insira a matrícula");

				int pesquisa = sc.nextInt();
				for (Aluno aluno : turma) {

					if (aluno.getMatricula() == pesquisa) {
						aluno.calcularMedia();

					}
				}
				break;

			case (3):
				for (Aluno aluno : turma) {
					aluno.calcularMedia();

				}

				break;

			case (4):
				executando = false;
				break;

			}

		}

	}
}
