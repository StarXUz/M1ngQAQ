public class MainClass {
    public static void main(String[] args) {
        // 创建一个银行账户对象
        BankAccount ba = new BankAccount("123456", 500.0);

        // 向账户存入1000元
        ba.deposit(1000.0);

        // 取出800元
        ba.withdraw(800.0);

        // 再尝试取出2000元
        ba.withdraw(2000.0);

        // 查询余额
        System.out.println("最终余额：" + ba.getBalance() + " 元");

        System.out.println("学号：20232113206");
        System.out.println("姓名：许浚铭");
    }
}