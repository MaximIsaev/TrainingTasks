import binary.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestBinaryTree {

	@Test
	public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements(){
		BinaryTree bt = new BinaryTree();
		bt.add(5);
		bt.add(13);
		bt.add(2);
		bt.add(8);
		bt.add(10);
		bt.add(1);

		assertTrue(bt.containsElement(13));
		assertTrue(bt.containsElement(2));
		assertTrue(bt.containsElement(8));
		assertTrue(bt.containsElement(1));
	}
}
