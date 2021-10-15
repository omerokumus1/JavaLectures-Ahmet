package MobaGame.Heros;

import MobaGame.Arcanas.Arcana;
import MobaGame.Arcanas.PhysicalAttackArcana;
import MobaGame.Equipments.AttackEquipment;
import MobaGame.Equipments.Equipment;
import MobaGame.Equipments.PhysicalAttackEquipment;
import MobaGame.Skills.Skill;

public class Assassin extends PhysicalAttackHero {


    public Assassin(String heroName, int baseHp, int baseSp, int basePhysicalDefence, int baseMagicalDefence, Skill[] skills, int basePhysicalAttack) {
        super(heroName, baseHp, baseSp, basePhysicalDefence, baseMagicalDefence, skills, basePhysicalAttack);
    }



}
