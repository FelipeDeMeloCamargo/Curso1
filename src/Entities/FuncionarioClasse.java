package Entities;

public class FuncionarioClasse {
	
	private Integer id;
	private String name;
	private Double salario;
	
	public FuncionarioClasse() {	
	}
	
	public FuncionarioClasse(Integer id, String name, Double salario) { //construtor
		this.id = id;
		this.name = name;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalario() {
		return salario;
	}

	public void aumento(Double salario) {
		this.salario += salario * (1.0 + 0.10);
	}
	@Override				
	public String toString() {
		return name + ", " + String.format("%.2f", salario);
	}
	
	
	
	
}
