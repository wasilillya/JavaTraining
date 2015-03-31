package interface_exzampl;

public interface Series {
	
	int getNext();
	void reset();
	void setStart(int i);

}


class ByTwos implements Series{

	private int start;
	private int val;
	
	public ByTwos(int s,int v) {
		start=s;
		val=v;
	}
	
	public ByTwos() {
		start=0;
		val=0;
	}
	
	@Override
	public int getNext() {
		val+=2;
		return val ;
	}

	@Override
	public void reset() {
		start=0;
		val=0;
	}

	@Override
	public void setStart(int i) {
		start=val=i;
		
	}
	
}