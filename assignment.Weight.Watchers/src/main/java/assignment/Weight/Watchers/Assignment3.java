package assignment.Weight.Watchers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import org.openqa.selenium.WebDriver;

import utility.TestData;

public class Assignment3 {
	protected WebDriver driver = null;

	public Assignment3(WebDriver driver) {
		this.driver = driver;
	}

	public void doesFileExist(String path) {
		try {
			File file = new File(path);
			if (file.exists()) {
				System.out.println("File Exists");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void assigmment3B() {
		String fileName = TestData.dictionary_Path;
		String line = null;

		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				String[] words = line.split(" – ");
				String[] meanings = {};

				//System.out.println(words[0]);
				for (String word : words) {
					if (word.contains(",")) {
						meanings = word.split(",");
						for (String meaning : meanings) {
							//System.out.println(meaning);
						}
					}else{
						System.out.println(word);
					}
					for (String meaning : meanings) {
						System.out.println(" "+ meaning);
					}
				}
			}

			// Always close files.
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}
	}

}
