package net.lvcy.card.eumn;

public enum CardType {

	ONE_ONE    (11, "地牌"),
	ONE_TWO    (12, "二四"),
	ONE_THREE  (13, "和牌"),
	ONE_FOUR   (14, "幺四"),
	ONE_FIVE   (15, "幺五"),
	ONE_SIX    (16, "幺六"),
	
	TWO_TWO    (22, "地牌"),
	TWO_THREE  (23, "拐子"),
	TWO_FOUR   (24, "二四"),
	TWO_FIVE   (25, "二五"),
	TWO_SIX    (26, "二六"),
	
	THREE_THREE(33, "长三"),
	THREE_FOUR (34, "三四"),
	THREE_FIVE (35, "三五"),
	THREE_SIX  (36, "黒九"),
	
	FOUR_FOUR  (44, "人牌"),
	FOUR_FIVE  (45, "红九"),
	FOUR_SIX   (46, "四六"),
	
	FIVE_FIVE  (55, "梅子"),
	FIVE_SIX   (56, "五六"),
	
	SIX_SIX    (66, "天牌");
	
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
