package verify.exam04;

public class Util {
	public static <T extends Pair<K, V>,V, K> V getValue(T pair, K key){
		if(pair.getKey().equals(key)) return pair.getValue();
		else return null;
	}

}
