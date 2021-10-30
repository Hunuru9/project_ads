
public class Lecture {
	
	private String course;
	private String name;
	private String turn;
	private String group; //turma
	
	private int studentsSigned;
	
	private boolean turnBiggerRoom; 
	private boolean roomOverflow;
	
	private String dayOfWeek;
	
	private String startClass;	
	private String endClass;
	
	private String requestedCharacteristics;
	private String room;
	private int capacity;
	private String realCharacteristics;
	
	
	public Lecture(String course, String name, String turn, String group, int studentsSigned, boolean turnBiggerRoom, boolean roomOverflow, String dayOfWeek, String startClass, String endClass, String requestedCharacteristics, String room, int capacity, String realCharacteristics) {
		this.course = course;
		this.name = name;
		this.turn = turn;
		this.group = group;
		this.studentsSigned = studentsSigned;
		this.turnBiggerRoom = turnBiggerRoom;
		this.roomOverflow = roomOverflow;
		this.dayOfWeek = dayOfWeek;
		this.startClass = startClass;
		this.endClass = endClass;
		this.requestedCharacteristics = requestedCharacteristics;
		this.room = room;
		this.capacity = capacity;
		this.realCharacteristics = realCharacteristics;
	}
	
	
	public String getName() {
		return name;
	}
	public String getCourse() {
		return course;
	}
	public String getTurn() {
		return turn;
	}
	public String getGroup() {
		return group;
	}
	public int getStudentsSigned() {
		return studentsSigned;
	}
	public boolean isTurnBiggerRoom() {
		return turnBiggerRoom;
	}
	public boolean isRoomOverflow() {
		return roomOverflow;
	}
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	public String getStartClass() {
		return startClass;
	}
	public String getEndClass() {
		return endClass;
	}
	public String getRequestedCharacteristics() {
		return requestedCharacteristics;
	}
	public String getRoom() {
		return room;
	}
	public int getCapacity() {
		return capacity;
	}
	public String getRealCharacteristics() {
		return realCharacteristics;
	}
	
	
	
	
}
