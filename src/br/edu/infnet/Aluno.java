package br.edu.infnet;

    // definição de aluno (escopo)

public class Aluno {

	// SEG quando n quiser que os dados sejam acessados = private
	
	private int matricula;
    private String nome;
    private float[] notas = new float [3];
    
    // criando o construtor da classe (definindo parâmetros)
    
    public Aluno(String nome, int matricula) {
    	this.nome = nome; 
        this.matricula = matricula;
        
    	
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
	public float[] getNotas() {
		return notas;
	}
	public void setNotas(float[] notas) {
		this.notas = notas;
	}
    
    
    
    
    
    
    

}
