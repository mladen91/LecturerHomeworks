package School;

public class Main3 {

	public static void main(String[] args) {

		// Classes from school 1
		Classes c1s1 = new Classes("I-1", 30);
		Classes c2s1 = new Classes("I-2", 25);

		// Classes from school 2
		Classes c1s2 = new Classes("I-1", 20);
		Classes c2s2 = new Classes("I-2", 15);

		// Classes from school 3
		Classes c1s3 = new Classes("I-1", 25);
		Classes c2s3 = new Classes("I-2", 15);

		// First school classes array
		Classes[] classesSchool1 = new Classes[2];
		classesSchool1[0] = c1s1;
		classesSchool1[1] = c2s1;
		// Second school classes array
		Classes[] classesSchool2 = new Classes[2];
		classesSchool2[0] = c1s2;
		classesSchool2[1] = c2s2;
		// Third school classes array
		Classes[] classesSchool3 = new Classes[2];
		classesSchool3[0] = c1s3;
		classesSchool3[1] = c2s3;

		// Principals from all schools
		Principal p1 = new Principal("Gordan Masic", 1989);
		Principal p2 = new Principal("Mladen Teofilovic", 1991);
		Principal p3 = new Principal("Edvin Mulabdic", 1989);

		// Creating schools
		School s1 = new School("Prva Gimnazija", p1, classesSchool1);
		School s2 = new School("Druga Gimnazija", p2, classesSchool2);
		School s3 = new School("Treca Gimnazija", p3, classesSchool3);

		School[] schoolArray = new School[3];
		schoolArray[0] = s1;
		schoolArray[1] = s2;
		schoolArray[2] = s3;

		System.out.println("Class with most student is: "
				+ getNameOfClassWithTheMostStudents(s1));

		System.out.println(getSchoolWithYoungestDirector(schoolArray));
	}

	/**
	 * <h1>This method will return class with most students.</h1>
	 * <p>
	 * 
	 * @param a
	 *            - represents one school
	 * @return class with most students
	 */
	public static String getNameOfClassWithTheMostStudents(School a) {
		String mostStudentClass = a.classes[0].nameOfClass;
		for (int i = 0; i < a.classes.length - 1; i++) {
			if (a.classes[i].numOfStudents < a.classes[i + 1].numOfStudents) {
				mostStudentClass = a.classes[i + 1].nameOfClass;
			}
		}
		return mostStudentClass;

	}

	/**
	 * <h1>This method will return youngest principal</h1>
	 * <p>
	 * 
	 * @param schools
	 *            - represents our school array
	 * @return youngest principal
	 */

	public static School getSchoolWithYoungestDirector(School[] schools) {
		School youngestDirector = schools[0];
		for (int i = 0; i < schools.length - 1; i++) {
			if (schools[i].principal.yearOfBirth < schools[i + 1].principal.yearOfBirth) {
				youngestDirector = schools[i + 1];

			}
		}
		return youngestDirector;

	}

}
