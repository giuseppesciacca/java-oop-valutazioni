package org.lessons.java.valutazioni;

public class Studente {

	public int idStudent;
	public int percAbs;
	public float AvgVote;

	public Studente(int idStudent, int percAbs, float AvgVote) {
		this.idStudent = idStudent;
		this.percAbs = percAbs;
		this.AvgVote = AvgVote;
	}

	public void isFailed() {

		if (this.percAbs > 50) {
			System.out.println("Si e' bocciato");
		} else if ((this.percAbs > 25 && this.percAbs < 50) && (AvgVote > 2)) {
			System.out.println("No, e' promosso");
		} else if (this.percAbs < 25 && AvgVote >= 2) {
			System.out.println("No, e' promosso");
		} else {
			System.out.println("Si e' bocciato");
		}

	}

	public void printStudentAndVerdict() {
		System.out.println(
				"\nID stud: " + this.idStudent + "|| Assenze: " + this.percAbs + "%" + " || Media voto: " + this.AvgVote);
		
		System.out.print("Lo studente e' stato bocciato? ");
		this.isFailed();
	}

}
