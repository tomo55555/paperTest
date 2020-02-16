static void arrSortDesc(int[] arr){
	for(int i=0;i<arr.length-1;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]<arr[j]){
				int tmp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=tmp;
			}
		}
	}
}
