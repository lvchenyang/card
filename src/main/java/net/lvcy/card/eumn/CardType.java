package net.lvcy.card.eumn;

public enum CardType {

	ONE_ONE    (11, "����"),
	ONE_TWO    (12, "����"),
	ONE_THREE  (13, "����"),
	ONE_FOUR   (14, "����"),
	ONE_FIVE   (15, "����"),
	ONE_SIX    (16, "����"),
	
	TWO_TWO    (22, "����"),
	TWO_THREE  (23, "����"),
	TWO_FOUR   (24, "����"),
	TWO_FIVE   (25, "����"),
	TWO_SIX    (26, "����"),
	
	THREE_THREE(33, "����"),
	THREE_FOUR (34, "����"),
	THREE_FIVE (35, "����"),
	THREE_SIX  (36, "�\��"),
	
	FOUR_FOUR  (44, "����"),
	FOUR_FIVE  (45, "���"),
	FOUR_SIX   (46, "����"),
	
	FIVE_FIVE  (55, "÷��"),
	FIVE_SIX   (56, "����"),
	
	SIX_SIX    (66, "����");
	
	private int code;
	private String name;
	private CardType(int code, String name) {
		this.code = code;
		this.name= name();
	}
	public int getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public static String getNameByCode(int code) {
		for(CardType type: CardType.values()) {
			if(type.getCode() == code) {
				return type.getName();
			}
		}
		return null;
	}
	
}
