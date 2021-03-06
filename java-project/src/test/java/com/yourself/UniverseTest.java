package com.yourself;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class UniverseTest {

	@Test
	public void test() throws FileNotFoundException {
		try {
			System.out.println(DataCapture.getDataCaptureJson());
			Assert.assertEquals("Testing fixed json output : ", "{}", DataCapture.getDataCaptureJson());
			success(true);

			// if (existsInFile("Arrays.stream(galaxies).sum()", new File("./src/main/java/com/yourself/Universe.java"))) {
			// 	msg("My personal Yoda, you are. π", "* β ΒΈ .γΒΈ. :Β° βΎ Β° γΒΈ. β ΒΈ .γγΒΈ.γ:. β’ ");
			// 	msg("My personal Yoda, you are. π", "           γβ Β°  β ΒΈ. ΒΈ γβγ :.γ .   ");
			// 	msg("My personal Yoda, you are. π", "__.-._     Β° . .γγγγ.γβΎ Β° γ. *   ΒΈ .");
			// 	msg("My personal Yoda, you are. π", "'-._\\7'      .γγΒ° βΎ  Β° γΒΈ.β  β .γγγ");
			// 	msg("My personal Yoda, you are. π", " /'.-c    γ   * β  ΒΈ.γγΒ°     Β° γΒΈ.    ");
			// 	msg("My personal Yoda, you are. π", " |  /T      γγΒ°     Β° γΒΈ.     ΒΈ .γγ  ");
			// 	msg("My personal Yoda, you are. π", "_)_/LI");
			// } else {
			// 	msg("Kudos π", "Did you know that since Java8 is out you can use streams? Try it!");
			// 	msg("Kudos π", "");
			// 	msg("Kudos π", "int[] galaxies = {37, 3, 2};");
			// 	msg("Kudos π", "int totalStars = Arrays.stream(galaxies).sum(); // 42");
			// }
		} catch (AssertionError ae) {
			success(false);
			msg("Oops! π", ae.getMessage());
		}
	}

	private static void msg(String channel, String msg) {
		System.out.println(String.format("TECHIO> message --channel \"%s\" \"%s\"", channel, msg));
	}

	private static void success(boolean success) {
		System.out.println(String.format("TECHIO> success %s", success));
	}

	// check if a string exists in a text file
	private static boolean existsInFile(String str, File file) throws FileNotFoundException {
		Scanner scanner = new Scanner(file);
		try {
			while (scanner.hasNextLine()) {
				if (scanner.nextLine().contains(str))
					return true;
			}
			return false;
		} finally {
			scanner.close();
		}
	}
}