import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
public class CodeOne {
public static void main(String []args)throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	ArrayList<String>al=new ArrayList<String>();
	HashSet<String>ht=new HashSet<String>();
	String s=br.readLine().trim();
	perm(al,"",s);
	for(String ss:al){
		for(int i=0;i<ss.length();i++){
			for(int j=i+1;j<=ss.length();j++){
				//System.out.println(ss.substring(i,j));
				ht.add(ss.substring(i,j));
				
			}
			
		}
		String g="abcdef";
		System.out.println(g.substring(5,6));
		
		
	}
	for(String ss:ht)
		System.out.println(ss);	
}
public static ArrayList<String>perm(ArrayList<String>al,String prefix,String s){
	int n=s.length();
	if(n==0)
		al.add(prefix);
	else{
		for(int i=0;i<n;i++)
		perm(al,prefix+s.charAt(i),s.substring(0, i)+s.substring(i+1, n));		
	}	
	return al;	
}
}
