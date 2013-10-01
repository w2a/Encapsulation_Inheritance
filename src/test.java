
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Room r = new Room();
		r.setSpace(3);
		House h = new House(r);
		h.setColor("blue");
		h.getColor();
		System.out.println(h.r.getSpace());
		
										
	}

}
