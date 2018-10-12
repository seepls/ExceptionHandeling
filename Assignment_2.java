1 .
import java.util.Scanner; 
class smriti
{public static void main(String args[])throws Exception{
	int n ;String name = new String(); 
try{
 Scanner in = new Scanner(System.in);
 name = in.nextLine();
  n = Integer.parseInt(name);
System.out.print(n*n);

}
catch(Exception t){System.out.print(100);}
}
}

2.
import java.util.Scanner; 
class smriti
{public static void main(String args[])throws Exception{
	int n ;String name = new String(); 
try{
 Scanner in = new Scanner(System.in);
 name = in.nextLine();
  n = Integer.parseInt(name);
System.out.print(n*n);

}
catch(Exception t){System.out.print(100);}
}
}

3.
import java.util.Scanner; 
class smriti
{public static void main(String args[])throws Exception{
	int n ;String name = new String(); 
try{
 Scanner in = new Scanner(System.in);
 name = in.nextLine();
  n = Integer.parseInt(name);
System.out.println(2*n);
System.out.println(n*n);
System.out.println(n*n);

}
catch(Exception t){System.out.print(name);}
}
}

import java.util.Scanner; 
class smriti
{public static void main(String args[])throws Exception{
	int n ;String name = new String(); 
try{
 Scanner in = new Scanner(System.in);
 name = in.nextLine();
  n = Integer.parseInt(name);

System.out.println(2*n);
System.out.println(n*n);

}
catch(Exception t){System.out.print("toy");}
}
}

 import java.util.Scanner; 
class smriti
{public static void main(String args[])throws Exception{
	int n ;String name = new String(); 
try{
 Scanner in = new Scanner(System.in);
 name = in.nextLine();
  n = Integer.parseInt(name);
System.out.println(
	n);
System.out.println(2*n);
System.out.println(n*n);

}
catch(Exception t){}
}
}

/*import java.util.Scanner; 
class smriti{
public static void main(String[] args) throws Exception{
    Scanner in = new Scanner(System.in); 
    while (in.hasNext()) {
        if (in.hasNextInt()){int n = in.nextInt();
            System.out.println(n*n);
        }
        else 
            in.next();
    }
}
}
*/

import java.util.Scanner; 
class smriti{
public static void main(String[] args) throws Exception{
	int n ; 
    Scanner in = new Scanner(System.in); 
    while (in.hasNext()) {
    	try{n = in.nextInt();
    		System.out.println(n*n);
}
catch(Exception t){System.out.print( " enter int ");}
}
        
	}
}


import java.util.Scanner; 
class smriti{
public static void main(String[] args) throws Exception{
	int n ; 
    Scanner in = new Scanner(System.in); 
    while (in.hasNext()) {
    	try{n = in.nextInt();
    		System.out.println(n*n);
}
catch(Exception t){System.out.print( " enter int ");}
}       
	}
}

import java.util.Scanner; 
class smriti
{public static void main(String args[])throws Exception{
	int n ;String name = new String(); 
try{
 Scanner in = new Scanner(System.in);
 name = in.nextLine();
  n = Integer.parseInt(name);
System.out.print("A");

}
finally{System.out.print("B");}
System.out.print("C");
}

}


// if number op : ABC else B 
// 




// non number : B 
// number less than 5 ADBC 
// number >= 5 then AB 

import java.util.Scanner; 
class smriti
{public static void main(String args[])throws Exception{
	int n = 0 , check ;String name = new String(); char t ;
	String endless = new String() ;
	endless = "abcd";

try{
 Scanner in = new Scanner(System.in);
 name = in.nextLine();
 n = Integer.parseInt(name);
System.out.print("A");
check = n -5 ;
t = endless.charAt(check);

}
catch(StringIndexOutOfBoundsException e){System.out.print("D");}
finally{System.out.print("B");}
System.out.print("C")

}
}


// Once exception then no statement after finally 





import java.util.Scanner; 
class smriti
{public static void main(String args[])throws Exception{
	int n = 0 , check ;String name = new String(); char t ;
	String endless = new String() ;
	endless = "gopal";

try{
 Scanner in = new Scanner(System.in);
 name = in.nextLine();
 n = Integer.parseInt(name);

check = n -5 ;
t = endless.charAt(check);

}
catch(StringIndexOutOfBoundsException e){System.out.print("A");}
finally{System.out.print("B");}


}
}



//if number output AB else CA  one try one catch , finally 

import java.util.Scanner; 
class smriti
{public static void main(String args[])throws Exception{
	int n ; int k ;
	try{
 Scanner in = new Scanner(System.in);
 name = in.nextLine();
 n = Integer.parseInt(name);
 k = n /4 ;
}
catch(Exception e ){System.out.print("C"); }
finally { System.out.print("A");}
}
}
