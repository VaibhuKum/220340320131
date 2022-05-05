import java.util.*;
class program3
{
	int[] arr;
	int size;
	int top1, top2;
	 
	 program3(int n)
	 {
		 size =n;
		 arr = new int[n];
		 top1 = n/2+1;
		 top2 = n/2;
		 
	 }
	 
	 void push1(int x)
	 {
		 if (top1 >0)
		 {
			 top1--;
			 arr[top1] = x;
			 
		 }
		 else
		 {
			 
				return;
		 }
		 
		 
	 }
	 void push2(int x)
	 {
		 if (top2 < size -1)
		 {
			 top2++;
			 arr[top2] = x;
			 
		 }
		 else{
			 
			 return;
		 }
		 
	 }
	 int pop1()
	 {
		 if(top1 <= size/2)
		 {
			 int x = arr[top1];
			 top1++;
			 return x;
		 }
		 else
		 {
			System.out.print("Stack underflow");
				System.exit(1);
		 }
		  
		  return 0;
		  
	 }
	 int pop2()
	 {
		 if(top2 >= size/3+1)
		 {
			 int x = arr[top2];
			 top2++;
			 return x;
		 }
		 else
		 {
			System.out.print("Stack underflow");
				System.exit(1);
		 }
		  
		  return 1;
		  
	 }
	 
	 
}
class Stack1
{
	public static void main(String[] args)
	{
		program3 S1 = new program3(6);
		S1.push1(5); 
        S1.push2(10); 
        S1.push2(15); 
        S1.push1(11);
		S1.push2(7); 
        S1.push2(40);
		System.out.print("Popped element from stack1 is"+" :"+S1.pop1()+"\n");
		
       
		System.out.print("Popped element from stack2 is"+" :"+S1.pop2()+"\n");

	}
}