package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {
	public static void main(String[] args) {

		Studente[] students = new Studente[20];
		Random rand = new Random();

		for (int i = 0; i < students.length; i++) {

			int randomPercAbs = rand.nextInt(101);
			float randomAvgVote = rand.nextFloat(5);

			students[i] = new Studente(i + 1, randomPercAbs, randomAvgVote);

			students[i].printStudentAndVerdict();
		}

	}
}
