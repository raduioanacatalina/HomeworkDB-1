package com.raducatalina.tema1.account;

import com.raducatalina.tema1.exceptions.InvalidNationalIdException;
import com.raducatalina.tema1.exceptions.NotEnoughMoneyException;

import java.util.Random;

public class Account
{
    private int accountNo, amount, nationalId;

    public Account()
    {

    }

    public Account(int nationalId)
    {
        Random generator = new Random();
        this.nationalId = nationalId;
        accountNo = generator.nextInt(100);
        amount = 0;
        System.out.println("Contul dumneavoastra a fost creat cu succes!\n" +
                "Id-ul contului este " + accountNo + "\n");
    }

    public void deposit(int amount)
    {
        this.amount += amount;
        System.out.println("Ati depozitat " + amount + "$\n");
    }

    public void withdraw(int amount) throws NotEnoughMoneyException
    {
        if (this.amount < amount)
            throw new NotEnoughMoneyException();
        else
        {
            this.amount -= amount;
            System.out.println("Ati retras " + amount + "$\n");
        }
    }

    public void linkToNationalId(int nationalId) throws InvalidNationalIdException
    {
        if (this.nationalId != nationalId)
            throw new InvalidNationalIdException();
        System.out.println("CNP-urile coincid.\n");
    }

}
