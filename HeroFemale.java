

public class HeroFemale implements HeroBuilder{

	static final Hero Hero = new Hero("Female");

	@Override
	public void CreateRole(Hero.Role rol) {
		// TODO Auto-generated method stub
		
		Hero.setRole(rol);
	}

	@Override
	public void CreateHairColor(Hero.HairColor hair) {
		// TODO Auto-generated method stub
		Hero.setHaircolor(hair);
	}

	@Override
	public void CreateArmor(Hero.Armor arm) {
		// TODO Auto-generated method stub
		Hero.setArmor(arm);
	}

	@Override
	public void CreateWeapon(Hero.Weapon wap) {
		// TODO Auto-generated method stub
		Hero.setWeapon(wap);
	}

	@Override
	public Hero getHero() {
		// TODO Auto-generated method stub
		return Hero;
	}

	
	

}
