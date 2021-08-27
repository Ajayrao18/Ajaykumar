package com.mycom.collections.list;

public class Students implements Comparable {
	int id;
	String name;
	public Students(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Object obj) {
		int nxtid=((Students)obj).getId();
		if(this.id>nxtid) {
			return 1;
		}else {
			if(this.id<nxtid) {
				return -1;
			}else {
				return 0;
			}
		}
		
	}

	

	}


