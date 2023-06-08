import com.sun.jdi.PathSearchingVirtualMachine;

public class PalindromeString {
    public static void main(String[] args) {
        StringReverse();
        display();
    }


    public static void StringReverse()

    {

        String str = "MADAM", reverseStr = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }

    public static void display()

    {
        int num = 121, reversedNum = 0, remainder;

        // store the number to originalNum
        int originalNum = num;

// get the reverse of originalNum
// store it in variable
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        // check if reversedNum and originalNum are equal
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome.");
        } else {
            System.out.println(originalNum + " is not Palindrome.");
        }
    }
}


