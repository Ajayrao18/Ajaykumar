
public class Manager extends Employee {
int teamsize;

public Manager(int id, String name, float salary, float hra) {
	super(id, name, salary, hra);
	teamsize=25;
}

@Override
public void computehra() {
	hra=salary*0.40f;
}
	
}
