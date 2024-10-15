import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountService {
	public AccountService() {
	}
	
	public ArrayList<Account> getAll() {
		ArrayList<Account> account = new ArrayList<>();
		try (Scanner scanner = new Scanner(new FileInputStream("NewAccounts.txt"))) {
			while (scanner.hasNextLine()) {
				String accountLine = scanner.nextLine();
				String accountInfo[] = accountLine.split(", ");
				Account Account = new Account(accountInfo[0],accountInfo[1],accountInfo[2],accountInfo[3],accountInfo[4]);
				account.add(Account);
			}
		} catch (FileNotFoundException ex) {
			System.out.println("File Not Found");}
		return account;
		}
	
	public void create(Account Account) {
		try (PrintWriter pw = new PrintWriter(new FileOutputStream("NewAccount.txt", true))) {
			pw.println(Account.getName() + ", " + Account.getPhoneNo() + ", " + Account.getEmail()+ ", " + Account.getPassword()+ ", " + Account.getRetypePassword());
        } catch (FileNotFoundException ex) {
        	System.out.println("File Not Found");
        }
    }
}
