
public class HeroDirector {

	private HeroBuilder herobuilder;

	public HeroDirector(HeroBuilder herobuilder) {
		super();
		this.herobuilder = herobuilder;
	}

	
	public void Create(Hero.Role rol, Hero.HairColor hair, Hero.Armor arm, Hero.Weapon wap)
	{
		herobuilder.CreateRole(rol);
		herobuilder.CreateHairColor(hair);
		herobuilder.CreateArmor(arm);
		herobuilder.CreateWeapon(wap);
	}
}
