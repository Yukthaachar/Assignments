
package assignment1;

import java.util.Random;

public class assignment2 {
    public static String generate_otp(int len){
    Random rand = new Random();
        StringBuilder otp = new StringBuilder();
        for (int i = 0; i < len; i++) {
            otp.append(rand.nextInt(10));
        }
        return otp.toString();
    }
        
    public static void main(String[] args) {
        int len = 6;
        String otp = generate_otp(len);
        int len2=otp.length();
            System.out.println("Generated OTP: " + otp);
  
    }
    
}
