package in.startfive.services;

public class Calculator {
	
	private CalcAPI calcAPI;
	
	public Calculator(CalcAPI calcAPI) {
				this.calcAPI = calcAPI;
	}

	public int add (int a,int b) {
		return calcAPI.add(a, b);
	}

}
