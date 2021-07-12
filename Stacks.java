import java.util.*;

public class Stacks {

	public static void main(String[] args) {
		
		Stack<String> stack =  new Stack<String>();	
		
		stack.push("Minecraft");
		stack.push("Skyrim");
		stack.push("DOOM");
		stack.push("Borderlands");
		stack.push("FFVII");
		
		// avc
//		String myFavGame = stack.pop();
//		System.out.println(stack.peek());
//		System.out.println(stack);
		
		//uses of stacks?
		// 1. undo/redo feature in text editors
		// 2. moving back/ forward through brower history
		// 3. backtracking algorithms (maze, file directories)
		// 4. calling functions (call stack)
	}

}
