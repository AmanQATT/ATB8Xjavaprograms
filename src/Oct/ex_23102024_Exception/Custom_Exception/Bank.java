package Oct.ex_23102024_Exception.Custom_Exception;

import java.io.FileNotFoundException;

public class Bank {

    private String currency;
    private Integer amount;

    // Constructor
    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    //Getter and Setter
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    //Create function
    // Throws -> Announcing it can give you error.
    public Integer add(Bank bankName) throws FileNotFoundException,Exception {  // multiple throws are allowed

        if (!bankName.currency.equalsIgnoreCase("INR")) {

            // throw -> used with in the function.
            throw new Exception("Currency Mismatch, Can't give total");
           // throw new Exception("Currency Mismatch, Can't give total");  // multiple throw are not allowed

        }
            return bankName.amount + this.amount;
        }

    }

