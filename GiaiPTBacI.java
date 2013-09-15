
public class GiaiPTBacI {
	double TimNghiem(double a, double b) throws ArithmeticException{
		if (a == 0){
			throw new ArithmeticException("PT vo nghiem");
		}
		
		return (double)(-b/a);
		
	}
}
