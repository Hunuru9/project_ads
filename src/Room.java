import java.util.List;

public class Room {

    private String name;
    private int capacidade;
    private int capacidade_exame;
    private int number_characteristics;
    private List<String> characteristics;
    
    public Room(String name, int capacidade, int capacidade_exame, int number_characteristics, List<String> characteristics) {
        this.name = name;
        this.capacidade = capacidade;
        this.capacidade_exame = capacidade_exame;
        this.number_characteristics = number_characteristics;
        this.characteristics = characteristics;
    }

	public String getName() {
		return name;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public int getCapacidade_exame() {
		return capacidade_exame;
	}

	public int getNumber_characteristics() {
		return number_characteristics;
	}

	public List<String> getCharacteristics() {
		return characteristics;
	}
    
    


    
    
}
