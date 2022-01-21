
public class Room {
int roomNo;
String roomType;
float roomArea;
boolean ac_machine;

void setdata(int X,String Y,float Z,boolean a) {
	roomNo=X;
	roomType=Y;
	roomArea=Z;
	ac_machine=a;
	
	
}
void displaydata() {
	System.out.println("roomNO:-"+roomNo);
	System.out.println("roomType:-"+roomType);
	System.out.println("roomArea:-"+roomArea);
	String s= (ac_machine)?"yes":"no";
	System.out.println("ac machine needed. "+s);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room r=new Room();
		r.setdata(1,"t1",5.2f,true);
		r.displaydata();
	}
}
/*
roomNO:-1
roomType:-t1
roomArea:-5.2
ac machine needed. yes
 */