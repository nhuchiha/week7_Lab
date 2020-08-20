import java.util.Arrays;

public class Driver 
{

	public static void main(String[] args) 
	{
		ArrayStack arrayStack = new ArrayStack();
		arrayStack.push(1);
		arrayStack.push(7);
		arrayStack.push(3);
		arrayStack.push(4);
		arrayStack.push(9);
		arrayStack.push(2);
		
		System.out.println("Number being removed from the ArrayStack");
		for(int i = 0; i < 6; i++)
		{
			int arrayStackNumber = (int) arrayStack.pop();
			System.out.println(arrayStackNumber);
		}
		
		LinkedStack linkedStack = new LinkedStack();
		linkedStack.push(1);
		linkedStack.push(7);
		linkedStack.push(3);
		linkedStack.push(4);
		linkedStack.push(9);
		linkedStack.push(2);

		System.out.println("Number being removed from the linkedStack");
		for(int i = 0; i < 6; i++)
		{
			int linkedStackNumber = (int) linkedStack.pop();
			System.out.println(linkedStackNumber);
		}
		//Add value to the stack to test the exercise 2
		linkedStack.push(1);
		linkedStack.push(7);
		linkedStack.push(3);
		linkedStack.push(4);
		linkedStack.push(9);
		linkedStack.push(2);
		
		linkedStack.removeBottomHalf();
		System.out.println("After removed the elements in bottom half, here is the top half of the stack: ");
		System.out.println(linkedStack);
		
	}

}
