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
			System.out.println("Si è bocciato");
		} else if ((this.percAbs > 25 && this.percAbs < 50) && (AvgVote > 2)) {
			System.out.println("No, è promosso");
		} else if (this.percAbs < 25 && AvgVote >= 2) {
			System.out.println("No, è promosso");
		} else {
			System.out.println("Si è bocciato");
		}

	}

}
