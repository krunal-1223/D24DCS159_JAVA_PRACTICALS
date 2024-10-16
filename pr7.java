class pr7{
	static void array_count(int[] a){
		int count=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==9){
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args){
		int[] arr={2,3,8,9,6,9,7,3};
		array_count(arr);
		
	}
}
