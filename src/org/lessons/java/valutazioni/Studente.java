package org.lessons.java.valutazioni;

public class Studente {

	public int idStudent;
	public int percAbs;
	public float AvgVote;
	public boolean isFail = false;

	public Studente(int idStudent, int percAbs, float AvgVote) {
		this.idStudent = idStudent;
		this.percAbs = percAbs;
		this.AvgVote = AvgVote;
		this.isFail = checkVerdict();
	}

	public boolean checkVerdict() {
		if (this.percAbs > 50) {
			this.isFail = true;
		} else if ((this.percAbs > 25 && this.percAbs < 50) && (AvgVote > 2)) {
		} else if (this.percAbs < 25 && AvgVote >= 2) {
		} else {
			this.isFail = true;
		}
		
		return this.isFail;
	}

	public void isFailed() {

		if (this.percAbs > 50) {
			this.isFail = true;
			System.out.println("Si e' bocciato");
		} else if ((this.percAbs > 25 && this.percAbs < 50) && (AvgVote > 2)) {
			System.out.println("No, e' promosso");
		} else if (this.percAbs < 25 && AvgVote >= 2) {
			System.out.println("No, e' promosso");
		} else {
			this.isFail = true;
			System.out.println("Si e' bocciato");
		}

	}

	public void printStudentAndVerdict() {

		System.out.println("\nID stud: " + this.idStudent + "|| Assenze: " + this.percAbs + "%" + " || Media voto: "
				+ this.AvgVote);

		System.out.print("Lo studente e' stato bocciato? ");
		this.isFailed();
	}

}
