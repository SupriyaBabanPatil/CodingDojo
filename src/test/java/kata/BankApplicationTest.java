package kata;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class BankApplicationTest {

    private BankApplication bankApplication;
    private BankRepository bankRepository;
    private int amount;

    @Before
    public void setUp() throws Exception {
        bankRepository = Mockito.mock(BankRepository.class);
        bankApplication = new BankApplication(bankRepository);
        amount = 500;
    }

    @Test
    public void shouldDepositGivenAmountOfMoney() {
        bankApplication.deposit(amount);

        Mockito.verify(bankRepository).addTransaction(amount);
    }

    @Test
    public void shouldWithdrawGivenAmount() {
        bankApplication.withdraw(amount);

        Mockito.verify(bankRepository).addTransaction(-amount);
    }


}
