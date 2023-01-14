import java.util.*;

/*  Input an email from the user . You have to create userName from by deleting the part by deleting the part that comes @. */

public class String_Email{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String email = sc.next();
        String userName = " ";

        for(int i=0; i<email.length(); i++){
            if(email.charAt(i)=="@"){
                break;
            }else{
                userName +=email.charAt(i);
            }
        }
        System.out.println(userName);
    }
}