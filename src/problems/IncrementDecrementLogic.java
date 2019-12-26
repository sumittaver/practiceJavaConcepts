package problems;

public class IncrementDecrementLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sss=5;
		sss=(++sss)+sss;//6 + 6 = 12
		System.out.println("i value is: "+sss);
		sss=(++sss)+(sss--)+(sss++)+(--sss);//13 + 13 + 12 + 12 = 50
		System.out.println("i value is: "+sss);
	}

}
