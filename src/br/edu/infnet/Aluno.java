package br.edu.infnet;

// definição de aluno (escopo)

public class Aluno {

	// SEG quando n quiser que os dados sejam acessados = private

	private int matricula;
	private String nome;
	private Float[] notas = new Float[3];

	// criando o construtor da classe (definindo parâmetros)

	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;

	}

	public void cadastrarNota(Float nota) {
		
// valor inicial, final e o incrementador 
        for (int i = 0; i < 2; i++) {
			if (notas[i] == null) {
                 this.notas[i] = nota; 
			}

		}

	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float[] getNotas() {
		return notas;
	}

	public void setNotas(Float[] notas) {
		this.notas = notas;
	}

}
