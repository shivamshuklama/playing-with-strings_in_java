import java.util.ArrayList;

class CodeTwo{
public static void main(String []args) { 
	ArrayList<String>al=new ArrayList<>();
	String str="abc";
permutation(al,"", str); 
 System.out.println(al);
}

public static ArrayList<String> permutation(ArrayList<String>al,String prefix, String str) {
	//ArrayList<String> al=new ArrayList<String>();
    int n = str.length();
    if (n == 0) al.add(prefix);
    else {
        for (int i = 0; i < n; i++)
            permutation(al,prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
    }
    return al;
}
}
