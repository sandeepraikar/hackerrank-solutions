package algorithms.misc;

public class StairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=6;
        String result=null;
        String output =null;
        StringBuilder a = new StringBuilder();
        
            while(temp>0){
                result = String.format("%"+temp+"s"," ");        
                output=result+a.append("#");
                System.out.println(output.substring(1));
                temp--;
                result=null;
            }
	}

}
