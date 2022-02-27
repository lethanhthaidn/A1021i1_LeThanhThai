package ss19_String_Regex.Thuc_hanh.p2;

public class AccountExampleTest {
    static AccountExample accountExample;
    public static String[] validAccount= {"123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static String[] invalidAccount= {".@", "12345", "1234_", "abcde"};
    public static void main(String args[]) {
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
    }
}
