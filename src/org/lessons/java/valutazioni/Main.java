package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {
	public static void main(String[] args) {

		Studente[] students = new Studente[20];
		Random rand = new Random();

		for (int i = 0; i < students.length; i++) {

			int randomPercAbs = rand.nextInt(0, 101);
			float randomAvgVote = rand.nextFloat(0, 5);

			students[i] = new Studente(i + 1, randomPercAbs, randomAvgVote);
			
			System.out.println("ID stud: " + students[i].idStudent + "|| Assenze: " + students[i].percAbs + "%"
					+ " || media voto: " + students[i].AvgVote);
			
			students[i].isFailed();
		}

	}
}
