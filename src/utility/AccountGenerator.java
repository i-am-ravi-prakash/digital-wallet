/**
 * 
 */
package utility;

/**
 * @author raviprakash
 *
 */
public class AccountGenerator {
    private static long accountNumber = 464700;
    
    public static long generateAccountNumber() {
        return accountNumber++;
    }
}
