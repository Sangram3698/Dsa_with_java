class Re{
    public void recursion(int num){
        if(num==1){
            System.out.print(num +" ");
        }else{
            System.out.print(num + " ");
            recursion(num-1);
        }
    }
}

class Fact{
    public int factorial(int num){
        if(num==0 || num==1){
            return 1;
        }else{}
        return num*factorial(num-1);
    }
}

class SumofNum{
    public int sumofnum(int n){
        if(n==0){
            return 0;
        }else{
            return n+sumofnum(n-1);
        }
    }
}
class Fibo{
    public void fibonacci(int a,int b,int n){
       if(n==0){
        return;
       }else{
        int c=a+b;
        System.out.print(c+",");
        fibonacci(b, c, n-1);
       }
    }
}
class RevString{
    public void reverseString(String s,int n){
      if(n==0){
        System.out.print(s.charAt(n)+" ");
      }else{
        System.out.print(s.charAt(n)+" ");
        reverseString(s, n-1);
      }

    }
}

class OccuranceOfString{
    public static int first=-1;
    public static int last=-1;
    public void occurance(String s,int indx,char element){
        if(indx==s.length()){
            System.out.println(element+" occured first time in "+first);
            System.out.println(element+" occured last time in "+last);
            return;
        }
        char currentChar=s.charAt(indx);
        if(currentChar==element){
            if(first==-1){
                first=indx;
            }else{
                last=indx;
            }
        }
        occurance(s, indx+1, element);
    }
}

class FindSorted{
    public static boolean isSorted=false;
    public void sorted(int num[],int index){
        if(index==num.length){
            if(isSorted){
                System.out.println("The array is sorted: ");
            }else{
                System.out.println("The array is not sorted: ");
            }
            return;
        }
        if(num[index-1]<num[index]){
            isSorted=true;
        }else{
            isSorted=false;
        }
        sorted(num, index+1);
    }
}
class PushChar{
    public static int count=0;
    public static String temp="";
    public void pushChar(String s,int index,char element){
        if(index==s.length()){
            for(int i=0;i<count;i++){
                temp+=element;
            }
            System.out.println(temp);
            return;
        }
        if(s.charAt(index)==element){
            count+=1;
        }else{
            temp+=s.charAt(index);
        }
        pushChar(s, index+1, element);
    }
}
class RemoveDuplicate{
    public static boolean map[]=new boolean[26];
    public void removeDuplicate(String s,int i,String newString){

        if(i==s.length()){
            System.out.println(newString);
            return;
        }

        char currentChar=s.charAt(i);
        if(map[currentChar-'a']){
            removeDuplicate(s, i+1, newString);
        }else{
            newString+=currentChar;
            map[currentChar-'a']=true;
            removeDuplicate(s, i+1, newString);
        }
    }
}
class SubString{
    public void subString(String s,int i,String nStr){
        //base case
        if(i==s.length()){
            System.out.println(nStr);
            return;
        }

        char currentChar=s.charAt(i);
        // a character wants to be a part of substring
        subString(s, i+1, nStr+currentChar);

        //a character doesnot want to be a part of substring
        subString(s, i+1, nStr);
    }
}
class KeypadCombo{
    public static String keyMap[]={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public void keypadCombinatin(String s,int i,String combination){
        if(i==s.length()){
            System.out.println(combination);
            return;
        }
        char currentChar=s.charAt(i);
        String mapping=keyMap[currentChar-'0'];
        for(int j=0;j<mapping.length();j++ ){
            keypadCombinatin(s, i+1, combination+mapping.charAt(j));
        }
    }
}
public class Recurs {
    public static void main(String args[]){
        Re r=new Re();
        r.recursion(5);
        SumofNum s=new SumofNum();
        System.out.println();
        System.out.println("The sum of first 10 numbers is: "+s.sumofnum(3));
        Fact f=new Fact();
        System.out.println(f.factorial(5));
        RevString re=new RevString();
        String s1="Raju";
        re.reverseString(s1, s1.length()-1);
        System.out.println();
        OccuranceOfString oc=new OccuranceOfString();
        oc.occurance("aabaacaadeaaaafgjuhjhua", 0, 'a');
       System.out.println();
       FindSorted fs=new FindSorted();
       int arrs[]={1,2,3,4,5,6,9,8};
       fs.sorted(arrs, 1);
       System.out.println();
       PushChar p=new PushChar();
       p.pushChar("abcxxdrfxxijkxxlmn", 0, 'x');
       RemoveDuplicate d=new RemoveDuplicate();
       d.removeDuplicate("aabbccddeafaghkaiai", 0, "");
       SubString ss=new SubString();
       ss.subString("abc", 0, "");
       KeypadCombo kc=new KeypadCombo();
       kc.keypadCombinatin("23", 0, "");
    }
}
