public class BankAccount {
    // 成员变量：账户编号和余额
    private String accountNumber;
    private double balance;

    // 构造方法
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // 存款方法
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("存入金额：" + amount + " 元，当前余额：" + balance + " 元");
        } else {
            System.out.println("存款金额必须大于0！");
        }
    }

    // 取款方法
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("取出金额：" + amount + " 元，当前余额：" + balance + " 元");
        } else if (amount > balance) {
            System.out.println("余额不足，无法取出 " + amount + " 元！");
        } else {
            System.out.println("取款金额必须大于0！");
        }
    }

    // 查询余额方法
    public double getBalance() {
        return balance;
    }
}