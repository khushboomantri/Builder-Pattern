
public class TestBuilderPattern {

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
	
	public static void main(String[] args) {
		
	HeroBuilder HeroBuilder = new HeroMale();
	HeroDirector dir = new HeroDirector(HeroBuilder);
	dir.Create(Hero.Role.King, Hero.HairColor.Black, Hero.Armor.Chain_mail, Hero.Weapon.Axe);
	Hero hero = HeroBuilder.getHero();
	System.out.println(hero);
	
	
	HeroBuilder  = new HeroFemale();
	dir = new HeroDirector(HeroBuilder);
	dir.Create(Hero.Role.Queen, Hero.HairColor.Brown, Hero.Armor.Plate_mail, Hero.Weapon.Bow);
	hero = HeroBuilder.getHero();
	System.out.println(hero);
	
	}

}
