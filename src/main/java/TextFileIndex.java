import java.nio.file.Path;
import java.util.List;

/**
 * A special type of {@link ForwardIndex} that indexes the UNIQUE words that
 * were found in a text file (represented by {@link Path} objects).
 *
 * @author CS 272 Software Development (University of San Francisco)
 * @version Fall 2021
 */
public class TextFileIndex { // TODO Implement the ForwardIndex interface for Path objects

	// TODO Modify this class as necessary.

	/**
	 * TODO Remove this Javadoc comment once properly inheriting method. (Let the
	 * Javadoc be automatically inherited instead.)
	 *
	 * @param location the location the words were found
	 * @param words the words found at that location
	 */
	public void add(Path location, List<String> words) {
		// TODO Modify this to properly override add method in interface instead.
		throw new UnsupportedOperationException("Not yet implemented.");
	}

	/**
	 * Demonstrates this class.
	 *
	 * @param args unused
	 */
	public static void main(String[] args) {
		TextFileIndex index = new TextFileIndex();

		index.add(Path.of("hello.txt"), List.of("hello", "hola"));
		index.add(Path.of("letters.txt"), List.of("a", "b", "c", "c"));
		index.add(Path.of("letters.txt"), List.of("b", "e"));
		index.add(Path.of("planets.txt"), List.of("earth", "mars"));

		System.out.println(index);
	}
}
