
public class Hero {

	public enum Role{
		Warrior,Theif,King,Queen
	}
	
	public enum HairColor{
		White, Blond, Black, Brown, Red
	}
	
	public enum Armor{
		Clothes, Leather, Chain_mail, Plate_mail
	}
	
	public enum Weapon{
		Dagger, Sword, Axe, Hammer, Bow
	}
	
	private Role Role;
	private HairColor Haircolor;
	private Armor Armor;
	private Weapon Weapon;
	private String HeroType;
	
	public Hero(String HeroType) {
		// TODO Auto-generated constructor stub
		this.setHeroType(HeroType);
	}
	public Role getRole() {
		return Role;
	}
	public void setRole(Role role) {
		this.Role = role;
	}
	public HairColor getHaircolor() {
		return Haircolor;
	}
	public void setHaircolor(HairColor haircolor) {
		Haircolor = haircolor;
	}
	public Armor getArmor() {
		return Armor;
	}
	public void setArmor(Armor armor) {
		Armor = armor;
	}
	public Weapon getWeapon() {
		return Weapon;
	}
	public void setWeapon(Weapon weapon) {
		Weapon = weapon;
	}
	
	
	

	public String toString()
	{
		StringBuilder sbld = new StringBuilder();
		sbld.append("\nType of Hero:");
		sbld.append("\nRole:");
		sbld.append(Role);
		sbld.append("\nHairColor:");
		sbld.append(Haircolor);
		sbld.append("\nArmor:");
		sbld.append(Armor);
		sbld.append("\nWeapon:");
		sbld.append(Weapon);
		
		return sbld.toString();
	}
	public String getHeroType() {
		return HeroType;
	}
	public void setHeroType(String heroType) {
		HeroType = heroType;
	}
	
	
}
