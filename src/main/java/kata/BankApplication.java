package kata;

public class BankApplication {

    private final BankRepository bankRepository;

    public BankApplication(final BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    public void deposit(final int amount) {
        bankRepository.addTransaction(amount);
    }

    public void withdraw(final int amount) {
        bankRepository.addTransaction(-amount);
    }
}
