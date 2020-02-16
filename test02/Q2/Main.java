public class Main{
	public static void main(String[] args){
		int[] data=new int[]{3,5,7};
		int sum=0;
		for(int i=0;i<data.length;i++){
			data[i]-=3;
			sum+=data[i];
		}
		System.out.println(sum/4);
	}
}
