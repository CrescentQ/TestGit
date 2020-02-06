package test;

public class ObjectCompare  implements Comparable<ObjectCompare> {
	
	private int Id;
	private String name;
			
	public ObjectCompare(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}

	

	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public int compareTo(ObjectCompare o) {
		// TODO Auto-generated method stub
		return 0;
	}



//	@Override
//	public int compareTo(ObjectCompare o) {
//		   return this.getName().compareTo(o.getName());
////		if(this.getId() > o.getId()) {
////			return 1;
////		} else if (this.getId() < o.getId()) {
////			return -1;
////		} else 
////			return 0;
//		
//		
//	}	
	

		
	

}
