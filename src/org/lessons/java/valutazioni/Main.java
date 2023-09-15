package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {
	public static void main(String[] args) {

		Studente[] students = new Studente[20];
		Random rand = new Random();
		int numStudProm = 0;
		int numStudFail = 0;

		for (int i = 0; i < students.length; i++) {

			int randomPercAbs = rand.nextInt(101);
			float randomAvgVote = rand.nextFloat(5);

			students[i] = new Studente(i + 1, randomPercAbs, randomAvgVote);
			students[i].printStudentAndVerdict();

			if (!students[i].isFail) {
				numStudProm = numStudProm + 1;

			} else if (students[i].isFail) {
				numStudFail = numStudFail + 1;
			}
		}

		Studente[] studentsProm = new Studente[numStudProm];
		Studente[] studentsFail = new Studente[numStudFail];
		int promIndex = 0;
		int failIndex = 0;

		for (int i = 0; i < students.length; i++) {
			if (!students[i].isFail) {
				studentsProm[promIndex] = students[i];
				promIndex = promIndex + 1;

			} else if (students[i].isFail) {
				studentsFail[failIndex] = students[i];
				failIndex = failIndex + 1;
			}
		}

		System.out.println("\n*************");
		System.out.println("Tot promossi: " + studentsProm.length);
		System.out.println("Tot bocciati: " + studentsFail.length);

	}
}
