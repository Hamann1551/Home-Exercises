import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(confirmPassword("ts","pass","knedde"));
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean confirmPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if(validateLoginOrPassword(login)) {
            throw new WrongLoginException("Логин не соответствует положеному!");
        }

        if(validateLoginOrPassword(password)) {
            throw new WrongPasswordException("Пароль не соответвует положеному!");
        }
        return password.equals(confirmPassword);
    }

    private static boolean validateLoginOrPassword(String login) {
        return login.matches("\\w+") && login.length() < 20;
    }
}