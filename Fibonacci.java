public class  Fibonacci{
	public int calcularFibonacci(int x){
        if(x>2){
            return calcularFibonacci(x-2) + calcularFibonacci(x-1); 
        }else if (x==2){
            return 1;
        }else{
            return 0;
        }
    }
}			