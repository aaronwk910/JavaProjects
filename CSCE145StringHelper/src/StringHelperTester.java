/*
 * Written by Aaron King
 */
public class StringHelperTester {

	public static void main(String[] args) {
		System.out.println("Welcome to the String Helper Tester!");
		System.out.println("\nTesting Has All Unique Characters with \"facetiously\"");
		System.out.println(StringHelper.hasAllUniqueCharacters("facetiously"));
		System.out.println("\nTesting Has All Unique Characters with \"banana\"");
		System.out.println(StringHelper.hasAllUniqueCharacters("banana"));
		System.out.println("\nTesting Mesh Strings with \"harp\" and \"fiddle\"");
		System.out.println(StringHelper.meshString("harp", "fiddle"));
		System.out.println("\nTesting Replace Vowels with oodle with \"burrito\"");
		System.out.println(StringHelper.replaceVowelsWithOodle("burrito"));
		System.out.println("\nTesting Weight with \"heavy\"");
		System.out.println(StringHelper.weight("heavy"));
		System.out.println("\nTesting Weight with \"light\"");
		System.out.println(StringHelper.weight("light"));
	}

}
