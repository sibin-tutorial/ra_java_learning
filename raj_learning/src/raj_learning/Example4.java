package raj_learning;

public class Example4 {
	public static void main(String[]args) {
		
		//In the example below, we use the + operator to add together two values:
		int sum = 4 + 5;
		System.out.println(sum);
		
		//Although the + operator is often used to add together two values, like in the example above, it can also be used to add together a variable and a value, or a variable and another variable:
         
		int n = 9;
		int q = 2;
		int s = n + q;
		System.out.println(s);
		
		
		
		//Arithematic operators example
		//+, is used for addition
		int a = 3;
		int c = 4;
		int r = a + c;
		System.out.println(r);
		
		//-, is used for subtraction
		int i = 5;
		int l = 4;
		int diff = i - l;
		System.out.println(diff);
		
		// *, is used for multiplication
		int d = 2;
		int z = 3;
		int m = d * z;
		System.out.println(m);
		
		// /, is used for division
		float h = 5;
		float k = 2;
		float result = h/k;
		System.out.println(result);
		
		//%, modulus operator returns remainder
		int x = 7;
		int v = 4;
		int j = x % v;
		System.out.println(j);
		
		//++, increment operator is used to add a value 1
		int num = 4;
		++num;
		++num;
		System.out.println(num);
		
		//--, decrement operator is used to subtract a value 1
		int age = 34;
		--age;
		System.out.println(age);
		
		
		
		
		//Java Assignment Operators
		//In the example below, we use the assignment operator (=) to assign the value 10 to a variable called xy:
		int xy = 4;
		System.out.println(xy);

		//+=
		int kl = 3;
		kl += 2; //kl = kl + 2;
		System.out.println(kl);
		
		//-=
		int jk = 9;
		jk-=5; //jk = jk - 5;
		System.out.println(jk);
		
		//*=
		int t = 4;
		t*= 2; // t = t * 2;
		System.out.println(t);
		
		///=
		float p = 5;
		p/=2; // p = p/2;
		System.out.println(p);
		
		// %=
		int ans = 7;
		ans%= 4; // ans = ans % 4;
		System.out.println(ans);
		
		
		
		
		//Comparison operator 
		//In the following example, we use the greater than operator (>) to find out if 5 is greater than 3:
        System.out.println(5>3);

        //==, Equal to operator
        int vb = 5;
        int bb = 5;
        System.out.println(vb == bb);
        
        //!=, No equal to operator
        int hh = 5;
        int gg = 5;
        System.out.println(hh!=gg);
        
        //<, Less than operator 
        // Check 5 less than 7
        int aa = 5;
        int ll = 7;
        System.out.println(aa<ll);
        
        //>=	Greater than or equal to
        int bn = 7;
        int fn = 5;
        System.out.println(bn>=fn);
        
        //<=	Less than or equal to
        int kk = 9;
        int jkk = 7;
        System.out.println(kk<=jkk);
        
        
        
        //Logical Operators
        //&&, 	Logical and
        
        int qa = 5;
        int qc = 4;
        int qh = 8;
        int ql = 9;
        System.out.println(qa>qc && ql>qh);
        
        //|| 	Logical or
        System.out.println(qa>qc || qh>ql);
        
        //!	Logical not
        System.out.println(!(qa>qc || qh>ql));
        
	}

}
