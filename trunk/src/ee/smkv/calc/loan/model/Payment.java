package ee.smkv.calc.loan.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Andrei Samkov
 */
public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer nr;
    private BigDecimal balance;
    private BigDecimal principal;
    private BigDecimal interest;
    private BigDecimal amount;

    public Payment(Integer nr, BigDecimal balance, BigDecimal principal, BigDecimal interest, BigDecimal amount) {
        this.nr = nr;
        this.balance = balance;
        this.principal = principal;
        this.interest = interest;
        this.amount = amount;
    }

    public Payment() {
    }

    public Integer getNr() {
        return nr;
    }

    public void setNr(Integer nr) {
        this.nr = nr;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getPrincipal() {
        return principal;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "nr=" + nr +
                ", balance=" + balance +
                ", principal=" + principal +
                ", interest=" + interest +
                ", amount=" + amount +
                '}';
    }
}