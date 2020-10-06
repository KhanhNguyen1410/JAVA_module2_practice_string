import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountSimple {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public AccountSimple() {
    }
    public  boolean validate(String regex){
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
      final   String[] ok = new String[] {"123acb","_abc123", "_______","123456"};
       final String[] notOk =new String[] {"123","_abc", "@_____","1_456"};
        AccountSimple accountSimple = new AccountSimple();
        for (String account: ok){
            boolean isValid = accountSimple.validate(account);
            System.out.println("account is "+ account + "is valid: "+ isValid);
        }
        for (String account: notOk){
            boolean isValid = accountSimple.validate(account);
            System.out.println("account is "+ account + "is valid: "+ isValid);
        }

    }
}
