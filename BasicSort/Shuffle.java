import java.util.*;

public class Shuffle{

public static void shuffle(int[] data){
    Random rand = new Random();
    int len = data.length - 1;
    for (int i = len ; i >= 0 ; i--) {
        int tmp = rand.nextInt(len)%(i+1);
        Utils.exc(data, tmp, i);
    }
}

	public static void main(String[] args) {
        int[] data = {1,2,3,4,5};
        shuffle(data);
        String uu = "";
        for (int j = 0; j < data.length ; j++) {
            uu = uu + data[j] + ", ";
        }
		System.out.println("result: " + uu);
	}

}