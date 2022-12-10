package mediaEscolar;

import java.util.Objects;

public class Aluno {
	private String name;
	private int idade;
	private String curso;
	private double nota1;
	private double nota2;
	
	
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(curso, idade, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(curso, other.curso) && idade == other.idade && Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return "Aluno [name=" + name + ", idade=" + idade + ", curso=" + curso + ", nota1=" + nota1 + ", nota2=" + nota2
				+ "]";
	}
	
	
}
