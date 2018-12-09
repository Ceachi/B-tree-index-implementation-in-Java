package bTree;

public class BTKeyValue<K extends Comparable, V>
{
    protected K mKey;
    protected V mValue;

    public BTKeyValue(K key, V value) {
        mKey = key;
        mValue = value;
    }

	@Override
	public String toString() {
		return "BTKeyValue [mKey=" + mKey + ", mValue=" + mValue + "]";
	}
    
    
}
