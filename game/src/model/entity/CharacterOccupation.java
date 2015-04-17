package model.entity;

import model.skill.BarginSkill;
import model.skill.BindWoundSkill;
import model.skill.ObservationSkill;

public abstract class CharacterOccupation extends Occupation {

	BarginSkill barginSkill;
	BindWoundSkill bindWoundSkill;
	ObservationSkill observationSkill;
	
	public CharacterOccupation() {
		barginSkill = new BarginSkill();
		bindWoundSkill = new BindWoundSkill();
		observationSkill = new ObservationSkill();
	}
	
	public void useBarginSkill() {
		barginSkill.useSkill();
	}
	
	public void useBindWoundSkill() {
		bindWoundSkill.useSkill();
	}
	
	public void useOvservationSkill() {
		observationSkill.useSkill();
	}
}