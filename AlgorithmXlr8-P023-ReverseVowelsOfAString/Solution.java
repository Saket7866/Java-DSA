import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int i = 0 ;
        int j = n -1;
        char [] ch = s.toCharArray();
        char temp ;

       while(i<j)
       {
        if( ch[i] != 'a' && ch[i] != 'o' && ch[i] != 'u' && ch[i] != 'e' && ch[i] != 'i' )
        {
        i++;
        }
        else  if( ch[j] != 'a' && ch[j] != 'o' && ch[j] != 'u' && ch[j] != 'e' && ch[j] != 'i' )
        {
        j--;
        }
        else 
        {
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp ;
            i++;
            j--;

        }
       
       }
        String result = new String(ch);
        System.out.println(result);

        // Write your solution here.
        // Print s with only its vowels reversed in place.
    }
}
