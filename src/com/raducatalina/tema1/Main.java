package com.raducatalina.tema1;

import com.raducatalina.tema1.account.Account;
import com.raducatalina.tema1.exceptions.InvalidNationalIdException;
import com.raducatalina.tema1.exceptions.NotEnoughMoneyException;

public class Main
{
    public static void main(String[] args) throws NotEnoughMoneyException, InvalidNationalIdException
    {
        Account account = new Account(5010);
        account.linkToNationalId(5010);
        account.deposit(500);
        account.withdraw(350);

        try
        {
            account.withdraw(550);
        }
        catch (NotEnoughMoneyException exception)
        {
            System.out.println(exception.getMessage());
        }
        finally
        {
            try
            {
                account.linkToNationalId(5011);
            }
            catch (InvalidNationalIdException exception)
            {
                System.out.println(exception.getMessage());
            }
        }
    }

}
