package questao4;

public class atividade4 {
	public static void main(String[] args) {
		int par=0;
		int impar=0;
		int A[]= {0,1,2,3,4,5,6,7,8,9};
		for(int i=0;i<A.length;i++) {
			if(A[i] % 2==0) {
				par++;
				
			}
			else {
				impar++;
			}
		}
		System.out.println("Percentual de elementos pares:"+par*100/100+"0%.\nPercentual de elementos impares:"+impar*100/100+"0%.");

	}

}
