package br.com.pratica.classes;

public class Student {

	private String name;
	private double average;

	// construtor inicializa variáveis de instância
	public Student(String name, double average) {
		this.name = name;

		// valida que a media é > 0.0 e <= 100.0; caso contrario;
		// armazenar o valor padrão da media da variavel de instâcia (0.0)
		if (average > 0.0)
			if (average <= 100.0)
				this.average = average; // atribuir a variavel de instacia

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAverage(double studentAvarage) {
		// valida que a media é > 0.0 e <= 100.0; caso contrario;
		// armazenar o valor padrão da media da variavel de instâcia (0.0)
		if (average > 0.0)
			if (average <= 100.0)
				this.average = average; // atribuir a variavel de instacia

	}

	public double getAverage() {
		return average;

	}

	public String getLetterGrade() {
		String letterGrade = ""; // inicializando como uma String vazia
		if (average >= 90.0)
			letterGrade = "A";
		else if (average >= 80.0)
			letterGrade = "B";
		else if (average >= 70.0)
			letterGrade = "C";
		else if (average >= 60.0)
			letterGrade = "D";
		else
			letterGrade = "F";
		return letterGrade;
	}

}// finalizar a classe Student
