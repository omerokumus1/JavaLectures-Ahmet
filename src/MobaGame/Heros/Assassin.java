package MobaGame.Heros;

import MobaGame.Arcanas.Arcana;
import MobaGame.Arcanas.PhysicalAttackArcana;
import MobaGame.Equipments.AttackEquipment;
import MobaGame.Equipments.Equipment;
import MobaGame.Equipments.PhysicalAttackEquipment;
import MobaGame.Skills.Skill;

public class Assassin extends PhysicalAttackHero {


    public Assassin(String heroName, int baseHp, int baseSp, int baseSkillDamage, int baseRange, int basePhysicalDefence, int baseMagicalDefence, int baseSpeed, int baseAttackSpeed, Skill[] skills, int basePhysicalAttack) {
        super(heroName, baseHp, baseSp, baseSkillDamage, baseRange, basePhysicalDefence, baseMagicalDefence, baseSpeed, baseAttackSpeed, skills, basePhysicalAttack);
    }



}
