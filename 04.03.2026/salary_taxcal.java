class salary_taxcal{
	public static void main(String args[]){
		int salary=140000;
		double netsalary;
		double tax;
		System.out.println("basic_salary:"+salary);
		if (salary>=100000){
			tax=(salary*0.03);
		}else{
			tax=(salary*0.01);
		}
		netsalary=salary-tax;
		System.out.println("tax         :"+tax);
		System.out.println("netsalary   :"+netsalary);
	}	
}