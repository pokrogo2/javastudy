package Quiz01;

class Solution {

//	public int[] numbers;
	//public Solution(int[] numbers){
		//this.numbers = numbers;
		
	//}
	public int[] solution(int[] numbers) {
    	
    	

    	int[] answer = {};
    	
    	
    	
    	
    	for(int i=0;i<numbers.length;i++) {
    		for(int j=0;j<numbers.length;i++) {
    			int plus = numbers[i]+numbers[j];
    			
    			boolean yn = false;
    			for(int k=0;k<answer.length;k++) {
    				if(answer[k]==plus) {
    					yn=true;
    					break;}}
    			if(yn==false) {
					
					answer[answer.length] = plus;
				}
    	}
    }
    	return answer;
}//
}