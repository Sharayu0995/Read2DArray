import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadTxt {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// all lines in file
//		ArrayList<String> lines = new ArrayList();

		// BufferedReader in = new BufferedReader(new FileReader("d:info.txt"));
		Scanner sc1 = new Scanner(new File("d:info.txt"));
		int column = 3;
		int row = 0;

		System.out.println("---------------------Elements form file-----------------------------");
		while (sc1.hasNextLine()) {

			String arr[] = sc1.nextLine().split(",");
			for (int i = 0; i < column; i++) {
				System.out.print(arr[i]);
				System.out.print(" ");
			}
			System.out.println("");

			row = row + 1;
		}

		System.out.println("number of rows from file  --" + row);
		System.out.println("number of columns--" + column);
		// create new 2d array

		int[][] map = new int[row][column];

		Scanner sc2 = new Scanner(new File("d:info.txt"));
		while (sc2.hasNextLine()) {

//			System.out.println("fetched array length with split --" + arr.length);
			for (int i = 0; i < row; i++) {
				String arr[] = sc2.nextLine().split(",");
				for (int j = 0; j < column; j++) {
//					System.out.print(i);
//					System.out.print(j);
//					System.out.print(" ");
					map[i][j] = Integer.parseInt(arr[j]);
				}
				System.out.println("");
			}

		}

		System.out.println("---------------------final answer-----------------------------");
		for (int ansi = 0; ansi < row; ansi++) {
			for (int ansj = 0; ansj < column; ansj++) {
				System.out.print(map[ansi][ansj]);
				System.out.print(" ");
			}
			System.out.println("");

		}


	}

}
