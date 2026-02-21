public class StringPallindrome {
        public static void main(String[] args) {
        String str="madam";
        boolean pallindrome=true;
        for(int i=0;i<str.length();i++){
           if(str.charAt(i)!=str.charAt(str.length()-1-i)){
            pallindrome =false;
            break;
           }
        }
        if(pallindrome){
            System.out.println("pallindrome");
        }
        else{
            System.out.println("not pallindrome");
        }
    }
}
