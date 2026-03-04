class ifsalary{
	public static void main(String args[]){
		int salary=56320;
		double tax;
		double networth;
		System.out.println("Basic_Salary:"+salary);
		if (salary>100000){
			tax=salary*0.03;
		}else{
			tax=salary*0.01;
		}
		networth=salary-tax;
		System.out.println("Tax:"+tax);
		System.out.println("Networth:"+networth);
	}
}