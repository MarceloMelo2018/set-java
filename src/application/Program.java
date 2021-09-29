package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.StudentLog;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<StudentLog> set = new HashSet<>();

		System.out.print("Enter the number of classes taught for you: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {

			System.out.print("> Enter file " + i + " full path: ");
			String path = sc.nextLine();

			try (BufferedReader br = new BufferedReader(new FileReader(path))) {

				String line = br.readLine();

				while (line != null) {

					String[] fields = line.split(" ");
					String studentId = fields[0];
					String name = fields[1];

					set.add(new StudentLog(studentId, name));

					line = br.readLine();
				}

			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("\nTotal Students: " + set.size());

		sc.close();

	}

}
