package Homework9;

//Создать класс, в котором будет статический метод. (почитать и понять, чем статический метод отличается от нестатического - обсудить на занятии по необходимости)
//Этот метод принимает на вход три параметра: Login, Password, confirmPassword.
//Все поля имеют тип данных String.
//Длина login должна быть меньше 20 символов и не должен содержать пробелы.
//Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
//Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен содержать хотя бы одну цифру.
//Также password и confirmPassword должны быть равны.
//Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.

public class Registration {

    public static void register(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (login.length() > 19)
            throw new WrongLoginException("Login can't exceed 19 symbols");

        if (login.contains(" "))
            throw new WrongLoginException("Login can't contain spaces");

        if (password.length() > 19)
            throw new WrongPasswordException("Password can't exceed 19 symbols");

        if( password.contains(" "))
            throw new WrongPasswordException("Password can't contain spaces");

        for (int i = 0; i < password.length(); ++i) {
            if (Character.isDigit(password.charAt(i))) {
                throw new WrongPasswordException("Password should contain numbers");
            }
        }

        if (!password.equals(confirmPassword))
            throw new WrongPasswordException("Passwords don't match");
    }
}
