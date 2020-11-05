import java.util.Date;

public class Account {   //定义Account类

	public static void main(String[] args) {
		
		Account account = new Account(1122, 20000);//初始化id和初始存款
		account.setAnnualInterestRate(4.5);//输入年利率
		account.withDraw(2500);//提取
		account.deposit(3000);//存储

		//打印余额，每月利息，以及该帐户创建的日期。
		System.out.println("Balance: "+account.getBalance()+"\n"
				+"Monthly Interest Rate: "+account.getMonthlyInterestRate()+"\n"
				+"Date Created: "+account.getDateCreated());
	}

	private int id = 0; //一个名为id的int类型私有数据域
	private double balance = 0;//一个名为balance的double类型数据域
	private double annualInterestRate = 0; //一个名为 annualInterestRate的double类型数据域
	private Date dateCreated;
	
	public Account() {
		dateCreated = new Date(); // 一个名为dateCreated 的data类型数据域
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {   //定义一个getMonthlyInterestRate的方法，返回月利率
		double monthlyInterestRate = annualInterestRate / 12;
		return balance * monthlyInterestRate / 100;
	}
	
	public void withDraw(double money) {     //定义一个withDraw方法，从账户中提取数额
		balance -= money;
	}
	
	public void deposit(double money) {      //定义一个deposit方法向账户储存特定数额
		balance += money;
	}
	
}