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

	public boolean isFail() {
		boolean isFail = true;

		if (((this.percAbs > 25 && this.percAbs < 50) && (AvgVote > 2)) || (this.percAbs < 25 && AvgVote >= 2)) {
			isFail = false;
		}

		return isFail;
	}

	public void printStudentAndVerdict() {

		System.out.println("\nID stud: " + this.idStudent + "|| Assenze: " + this.percAbs + "%" + " || Media voto: "
				+ this.AvgVote);

		System.out.print("Lo studente e' stato bocciato? ");

		System.out.println(this.isFail() ? "Si e' stato bocciato" : "No, e' stato promosso");
	}

}
