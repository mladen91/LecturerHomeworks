import java.util.Arrays;
import java.util.Scanner;

public class ASmallGame {

	public static int[] GetArrayGenerator() {

		//Method that generates our array with random numbers
		int[] numGenerator = new int[5];

		for (int i = 0; i < numGenerator.length; i++) {

			numGenerator[i] = (int) (Math.random() * 4 + 1);

		}
		return numGenerator;
	}

	public static boolean isNull() {
       //Here we check is our generated array 0 in every index
		for (int i = 0; i < GetArrayGenerator().length; i++) {
			if (GetArrayGenerator()[i] != 0) {
				return false;
			} else
				break;
		}
		return true;
	}

	public static void makingGame(int[] array, int idx) {

		//In this method we did most of job.
		Scanner in = new Scanner(System.in);
		int[] arrayWithIndex = new int[5];
		
		for (int i = 0; i < arrayWithIndex.length; i++) {

			arrayWithIndex[i] = GetArrayGenerator()[i];
		}//Here is our Array that we will use through game
		System.out.println(Arrays.toString(arrayWithIndex));

		//Our game will be played until isNull becomes true.
		while (isNull() == false) {
			long beginTime = System.currentTimeMillis();
			//try, catch method will catch wrong input index, and suggest new input
			try {
				System.out.println("Insert next index: ");
				idx = in.nextInt();
				//For even numbers, we will increase left and right element of inserted index
				if (arrayWithIndex[idx] % 2 == 0) {
                    //if index is 0, then we need to increase only right side.
					if (idx == 0) {
						arrayWithIndex[idx + 1] += arrayWithIndex[idx];
                        //If value is greater than 4, we just insert 4.
						if (arrayWithIndex[idx + 1] >= 4) {
							arrayWithIndex[idx + 1] = 4;
						}
                        //If value of index is 0, it stays 0, if not, it becomes --.
						if (arrayWithIndex[idx] == 0) {
							arrayWithIndex[idx] = 0;
						} else if (arrayWithIndex[idx] > 0) {
							arrayWithIndex[idx]--;
						}
						//If index is equal 4, we just increase left element.
					} else if (idx == 4) {
						arrayWithIndex[idx - 1] += arrayWithIndex[idx];
						//If value is greater than 4, we just insert 4.
						if (arrayWithIndex[idx - 1] >= 4) {
							arrayWithIndex[idx - 1] = 4;
						}
						//If value of index is 0, it stays 0, if not, it becomes --.
						if (arrayWithIndex[idx] == 0) {
							arrayWithIndex[idx] = 0;
						} else if (arrayWithIndex[idx] > 0) {
							arrayWithIndex[idx]--;
						}
						// If our index is not 0 or 4, we need to increase both sides.
					} else {
						arrayWithIndex[idx - 1] += arrayWithIndex[idx];
						arrayWithIndex[idx + 1] += arrayWithIndex[idx];
						if (arrayWithIndex[idx] == 0) {
							arrayWithIndex[idx] = 0;
						} else
							arrayWithIndex[idx]--;

						if (arrayWithIndex[idx + 1] >= 4) {
							arrayWithIndex[idx + 1] = 4;
						}
						if (arrayWithIndex[idx - 1] >= 4) {
							arrayWithIndex[idx - 1] = 4;
						}
					}
                 //I did the same for odd numbers, the difference is that
				// max value will never be 4, so we just need to make sure 
				// that our condition works with 0. If index was lower than 0, 
				// we need to write 0.
				} else if (arrayWithIndex[idx] % 2 == 1) {

					if (idx == 0) {
						arrayWithIndex[idx + 1] -= arrayWithIndex[idx];

						if (arrayWithIndex[idx + 1] <= 0) {
							arrayWithIndex[idx + 1] = 0;
						}

						if (arrayWithIndex[idx] == 0) {
							arrayWithIndex[idx] = 0;
						} else {
							arrayWithIndex[idx]--;
						}
					} else if (idx == 4) {
						arrayWithIndex[idx - 1] -= arrayWithIndex[idx];

						if (arrayWithIndex[idx - 1] <= 0) {
							arrayWithIndex[idx - 1] = 0;
						}

						if (arrayWithIndex[idx] == 0) {
							arrayWithIndex[idx] = 0;
						} else {
							arrayWithIndex[idx]--;
						}
					} else {
						arrayWithIndex[idx - 1] -= arrayWithIndex[idx];
						arrayWithIndex[idx + 1] -= arrayWithIndex[idx];
						if (arrayWithIndex[idx] == 0) {
							arrayWithIndex[idx] = 0;
						} else
							arrayWithIndex[idx]--;
						if (arrayWithIndex[idx + 1] <= 0) {
							arrayWithIndex[idx + 1] = 0;
						}
						if (arrayWithIndex[idx - 1] <= 0) {
							arrayWithIndex[idx - 1] = 0;
						}
					}
				}

				System.out.println(Arrays.toString(arrayWithIndex));
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Invalid index, insert index between 0-4!");
			}
            //Code that checks if game was finished.
			if (arrayWithIndex[0] == 0 && arrayWithIndex[1] == 0
					&& arrayWithIndex[2] == 0 && arrayWithIndex[3] == 0
					&& arrayWithIndex[4] == 0) {
				long endTime = System.currentTimeMillis();
				long difference = endTime - beginTime;
				double seconds = (double) difference / (double) 100;
				System.out
						.println("Congratulations! You finished your game in: "
								+ seconds + " seconds.");
				break;
			}
		}
	}
	
	
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Insert index: ");
		int idx = in.nextInt();
		makingGame(GetArrayGenerator(), idx);
		//Calling our game into main method.

		
	}

}
